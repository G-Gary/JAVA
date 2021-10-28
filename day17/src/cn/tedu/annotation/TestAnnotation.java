package cn.tedu.annotation;

import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**本类用作注解的入门案例：尝试自定义一个注解*/
public class TestAnnotation {
}

//2.通过Target注解标记自定义注解Rice可以使用的位置
/*通过元注解@Target规定自定义注解可以使用在那些位置
* 我们使用"ElementType.静态常量"的方式来指定自定义注解具体的位置
* 而且，值可以写多个，格式：@Target({值1,值2,值3...})*/
//@Target(ElementType.TYPE)
@Target({ElementType.TYPE,ElementType.METHOD})
//3.通过@Retention注解标记自定义注解Rice的生命周期
/*4.同过原注解@Retention规定自定义注解的生命周期
* 我们使用“RetentionPolicy.静态常量的方式来指定自定义注解具体的存活时间
* 注意：这里的值只有能写一个：SOURCE CLASS RUNTIME”*/
    @Retention(RetentionPolicy.RUNTIME)//到运行时都有效
//1.定义自定义注解
/*1.首先注意：注解定义的语法与JAVA不同
* 2.定义自定义注解的格式：@interface 注解名{}*/
@interface Rice {
    //5.我们可以给注解进行功能增强--添加注解的属性
    /*6.注意：int age();不是方法的定义，而是给自定义注解添加了一个age属性*/
    //int age(); //给自定义注解添加了一个普通属性age，类型是int
    int age() default 0;//给自定义注解的普通属性赋予默认值0

    /*7.注解中还可以添加特殊属性value
     * 特殊属性的定义方式与普通属性一样，要求：名字必须是value，类型不做限制*/
    //String value();//定义一个特殊属性value，类型是String
    String value() default "lemon";//定义特殊属性，并给特殊属性赋予默认值


    //4.定义一个类来测试自定义注解
    /*5.注解使用时，在规定位置，格式：@注解名 即可*/
//@Rice
    class TestAnno {
        /*测试1：分别给TestAnno类 name属性 eat方法都添加了Rice注解
         * 结论：属性上的注解报错了，说明自定义注解可以加在什么位置，由@Target决定*/
        //@Rice
        String name;

        /*测试2：当我们给Rice注解添加了一个age属性以后，@Rice注解使用时直接报错
         * 结论：当注解没有定义属性时，可以直接使用
         *      当注解定义了属性以后，必须给属性赋值，格式：@Rice(age = 10)*/
        /*测试3：给age属性赋予默认值以后，可以直接使用@Rice注解
         * 不需要给age属性赋值，因为age属性已经有默认值0了*/
        /*测试4：给Rice注解添加了特殊属性value以后，也必须给属性赋值
         * 只不过特殊属性value赋值时可以简写成@Rice(“orange”)*/
        /*测试5：如果特殊属性也赋予了默认值，那么可以直接使用这个注解
        * 但是如果想给注解的所有属性赋值，每条赋值语句都不能简写，包括特殊属性*/
        //@Rice(age = 10)
        //@Rice("orange")
        //@Rice
        @Rice(age=10,value = "Apple")
        public void eat() {
            System.out.println("干饭不积极，思想有问题");
        }
    }
}







