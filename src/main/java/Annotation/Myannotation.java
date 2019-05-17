package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.zip.Deflater;


/**
     * 这是一个自定义的注解(Annotation)类 在定义注解(Annotation)类时使用了另一个注解类Retention
     * 在注解类上使用另一个注解类，那么被使用的注解类就称为元注解
     *
   // @Retention(RetentionPolicy.RUNTIME)
  //Retention注解决定MyAnnotation注解的生命周期
     @Target( { ElementType.METHOD, ElementType.TYPE })
    //Target注解决定MyAnnotation注解可以加在哪些成分上，如加在类身上，或者属性身上，或者方法身上等成分
    /*


     @Retention(RetentionPolicy.SOURCE)
     * 这个注解的意思是让MyAnnotation注解只在java源文件中存在，编译成.class文件后注解就不存在了

     *@Retention(RetentionPolicy.CLASS)
     * 这个注解的意思是让MyAnnotation注解在java源文件(.java文件)中存在，编译成.class文件后注解也还存在，
     * 被MyAnnotation注解类标识的类被类加载器加载到内存中后MyAnnotation注解就不存在了
     */
    /*
     * 这里是在注解类MyAnnotation上使用另一个注解类，这里的Retention称为元注解。
     * Retention注解括号中的"RetentionPolicy.RUNTIME"意思是让MyAnnotation这个注解的生命周期一直程序运行时都存在
     */
    /*
        /*
    @Retention元注解
　　根据反射的测试的问题，引出@Retention元注解的讲解：
其三种取值：RetentionPolicy.SOURCE、RetentionPolicy.CLASS、
RetentionPolicy.RUNTIME分别对应：Java源文件(.java文件)---->.class文件---->内存中的字节码
     */

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD,ElementType.TYPE})
//Retention注解决定MyAnnotation注解的生命周期
    public @interface  Myannotation{

        /*
          定义基本属性   缺省值
         */
        String color() default  "blue";

        String value(); //定义一个基本属性

        //  数组类型
        int[] arrayAttr() default {1,2};

        //枚举类型
        EumTrafficLamp Lamp()   default   EumTrafficLamp.RED;

        //为其添加另一个注解类型的属性

        MetaAnnotation    meta()  default  @MetaAnnotation("abcd");


}





