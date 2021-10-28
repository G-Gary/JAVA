package cn.tedu.reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**本类用于反射测试*/
public class TestReflect {
    /**单元测试方法：是java中最小的测试单位，使用灵活，推荐指数：5颗星
     * 语法要求：@Test + public + void + 没有参数
     * 执行方式：选中当前要测试方法名前绿色小三角，成功执行会有绿色小对勾*/
    @Test
    public void getClazz() throws ClassNotFoundException {
        Class<?> clazz1 = Class.forName("cn.tedu.reflection.Student");
        Class<?> clazz2 = Student.class;
        Class<?> clazz3 = new Student().getClass();
        //打印的是Student类对应的字节码对象
        System.out.println(clazz1);
        //通过字节码对象，获取它的名字
        System.out.println(clazz1.getName());
        //通过字节码对象，获取目标类Student类名
        System.out.println(clazz1.getSimpleName());
        //通过字节码对象，获取包对象
        System.out.println(clazz1.getPackage());
        //通过字节码对象，先获取包对象，再通过包对象获取包对象的名字
        System.out.println(clazz1.getPackage().getName());
    }
    /**通过单元测试方法，获取Student目标类中成员变量Field*/
    @Test
    public void getFie() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("cn.tedu.reflection.Student");
        Field[] fs = clazz.getFields();
        /**注意！目前要获取的成员变量的修饰符必须是public才能获取到，不然，像默认修饰符的成员变量也是获取不到的*/
        for (Field f:fs) {
            System.out.println(f.getName());
            System.out.println(f.getType());
        }
    }
    @Test
    public void getStu(){
        Student s1 = new Student("张三", 3);
        Student s2 = new Student("李四", 4);
        Student s3 = new Student("王麻子", 5);
        Student[] s = {s1,s2,s3};
        for (Student stu:s) {
            System.out.println(stu.name);
            stu.play();
            stu.eat(9999);
        }
    }
    /**通过单元测试方法，获取Student目标类中的成员方法*/
    @Test
    public void getFunction(){
        //1.获取字节码对象
        Class<Student> clazz = Student.class;
        //2.通过字节码对象获取目标类对应的所有成员方法
        Method[] ms = clazz.getMethods();
        //3.通过高效for循环遍历数组，每轮循环拿到一个方法对象
        for (Method m:ms) {
            System.out.println("遍历啦");
            System.out.println(m.getName());
            //获取到的方法对象 进一步获取这个方法的参数类型
            Class<?>[] pt = m.getParameterTypes();
            System.out.println(Arrays.toString(pt));
        }

    }
    /**通过单元测试方法，获取Student目标类中的构造方法*/
    @Test
    public void getCons(){
        Class<? > clazz = new Student().getClass();
        Constructor<?>[] cs = clazz.getConstructors();
        for (Constructor c:cs) {
            System.out.println("又要遍历了");
            System.out.println("构造方法名"+c.getName());
            Class[] pt = c.getParameterTypes();
            System.out.println("构造方法参数类型"+Arrays.toString(pt));
        }
    }

    /**通过单元测试方法，利用反射创建目标类对象*/
    @Test
    public void getObject() throws Exception, Exception {
        Class<Student> clazz = Student.class;
        /**反射创建对象的方案1：通过触发目标类的无参构造创建对象*/
        Object o = clazz.newInstance();
        System.out.println(o);
        /**反射创建对象方案2：先获取指定的全参构造对象，再通过构造对象创建student对象*/
        //获取指定的构造函数对象，注意要获取构造方法，需要指定参数类型，而是字节码对象
        Constructor<Student> c = clazz.getConstructor(String.class, int.class);
        //利用获取到的全参构造对象，创建目标类Student的对象
        Student o2 = c.newInstance("赵六", 6);
        //打印创建好的学生类对象，可以看到属性也被赋值了
        System.out.println(o2);

    }


}
