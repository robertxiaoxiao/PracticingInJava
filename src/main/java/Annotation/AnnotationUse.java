package Annotation;

//@Myannotation(color = "red")
/*
　如果一个注解中有一个名称为value的属性，且你只想设置value属性
(即其他属性都采用默认值或者你只有一个value属性)，
那么可以省略掉“value=”部分。
 */
@Myannotation("robert")
public class AnnotationUse {

    /*
     ctrl j  快速键入   psvm   main()
                        sout   system.out.println()
     */
    public static void main(String[] args) {

        //检查annotationuse是否有注解
        if(AnnotationUse.class.isAnnotationPresent(Myannotation.class))
        {
            Myannotation myannotation=(Myannotation) AnnotationUse.class.getAnnotation(Myannotation.class);
            System.out.println(myannotation.color()+myannotation.value());
        }

    }




}
