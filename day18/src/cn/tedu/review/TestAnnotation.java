package cn.tedu.review;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**本类用于复写注解案例*/
public class TestAnnotation {
    public static void main(String[] args) {

    }
}
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@interface Apple{
    int sum() default  0;
    String value()default "pp";
}
@Apple(sum = 6,value = "11")
class TestAnno{
//    @Apple()
    String name;
   @Apple()
    public void eat(){
        System.out.println("eat方法");
    }
}