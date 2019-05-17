package Annotation;


@Myannotation(
        color = "red",
        value = "robert",
        arrayAttr={1,2,3,4,5},
        Lamp=EumTrafficLamp.GREEN,
        meta=@MetaAnnotation("gacl")
)
public class AnnotationTest {

/*
  test jdk本身内部提供的三种注解
  @SuppressWarnings(":deprecation")、@Deprecated、@Override
 */

  @SuppressWarnings(":deprecation")
  @Myannotation("注解在test类上")
    public static void main(String[] args) {

            if (AnnotationTest.class.isAnnotationPresent(Myannotation.class))
            {
              Myannotation  myannotation=AnnotationTest.class.getAnnotation(Myannotation.class);
              System.out.println(myannotation.color());
              System.out.println(myannotation.value());
              System.out.println(myannotation.arrayAttr());
              System.out.println(myannotation.Lamp());
              System.out.println(myannotation.meta().value());


            }



  }
    //The method runFinalizersOnExit(boolean) from the type System is deprecated(过时的，废弃的)
    //这里的runFinalizersOnExit()方法画了一条横线表示此方法已经过时了，不建议使用了
    @Deprecated
    //这也是JDK内部自带的一个注解，意思就是说这个方法已经废弃了，不建议使用了
    public static void sayHello(){
        System.out.println("hi");
    }

    @Override //这也是JDK1.5之后内部提供的一个注解，意思就是要重写(覆盖)JDK内部的toString()方法
    public String toString(){
        return "";
    }
}

