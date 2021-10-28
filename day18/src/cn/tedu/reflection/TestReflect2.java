package cn.tedu.reflection;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**本类用于测试暴力反射*/
public class TestReflect2 {
    /**1.通过暴力反射获取与操作*/
    @Test
    public void getFie2() throws Exception {
        Class<Person> clazz = Person.class;
        Field field = clazz.getDeclaredField("name");
        Field field1 = clazz.getDeclaredField("age");
        System.out.println(field);
        System.out.println(field.getType());
        System.out.println(field.getType().getName());

        //4.设置属性的值
        //4.1需要指定到底给那个对象name属性设置一个什么值
        Person p = clazz.newInstance();
        //Person p1 = clazz.newInstance();
        //4.2需要设置暴力资源可见的权限
        field.setAccessible(true);
        field1.setAccessible(true);
        //4.3通过刚刚获取到的属性对象，给刚刚创建好的p对象设置属性值，值是赵六
        //field就是我们刚刚获取的name属性
        //set(m,n)--m是给那个对象的name属性设置值，n是设置的具体值

        field.set(p,"赵六");
        field1.set(p,189);
        //4.4打印查看刚刚的属性值是否设置成功
        //field.get(m),m代表的就是查看那个对象的这个name属性的值
        System.out.println(field.get(p));
        System.out.println(field1.get(p));


    }
    /**巩固练习：通过暴力反射获取与操作属性*/
    @Test
    public void getFie3() throws Exception {
        Class<Person> clazz = Person.class;
        Field field = clazz.getDeclaredField("addr");
        field.setAccessible(true);
        Person p3 = clazz.newInstance();
        field.set(p3,"北京");
        System.out.println(field.get(p3));


    }
    /**2.通过暴力反射获取与操作私有方法*/
    @Test
    public void getFunction2() throws Exception {
        Class<?> clazz = new Person().getClass();
        /**getDeclanredMethod(m,y,z....)
         * m:要获取方法的名字
         * x,y,z...可变参数，指的是目标方法的参数个数可以根据实际情况改变，0/1/2...个参数
         * x,y,z传入的参数对应的类型，而且这个类型也必须是字节码对象
         * */
        Method save = clazz.getDeclaredMethod("save", int.class, String.class);

        Object p1 = clazz.newInstance();

        save.setAccessible(true);

        /**invoke(o,z,y,z...)表示通过反射技术执行方法
         * o：要给那个对象执行此方法
         * x,y,z...可变参数，之前获取的方法参数类型是什么，此处就传对应个数与类型的值*/
        save.invoke(p1,666,"哈哈哈");

    }
    @Test
    public void getFunction3() throws Exception{
        Class<?> clazz = new Person().getClass();
        Method updat = clazz. getDeclaredMethod("update");
        Object p2 = clazz.newInstance();
        updat.setAccessible(true);
        updat.invoke(p2);
    }
}