
jdk内部自带的三种注解：@SuppressWarnings(":deprecation")、@Deprecated、@Override

总结：注解(Annotation)相当于一种标记，在程序中加入注解就等于为程序打上某种标记，没有加，则等于没有任何标记，以后，javac编译器、开发工具和其他程序可以通过反射来了解你的类及各种元素上有无何种标记，看你的程序有什么标记，就去干相应的事，标记可以加在包、类，属性、方法，
方法的参数以及局部变量上。

### 注解就相当于一个你的源程序要调用一个类，在源程序中应用某个注解，得事先准备好这个注解类。就像你要调用某个类，得事先开发好这个类

@Retention
一个注解的生命周期有三个阶段：java源文件是一个阶段，class文件是一个阶段，内存中的字节码是一个阶段,javac把java源文件编译成.class文件时，有可能去掉里面的注解，
类加载器把.class文件加载到内存时也有可能去掉里面的注解，因此在自定义注解时就可以使用Retention注解指明自定义注解的生命周期，自定义注解的生命周期是在RetentionPolicy.SOURCE阶段(java源文件阶段)，还是在RetentionPolicy.CLASS阶段(class文件阶段)，或者是在RetentionPolicy.RUNTIME阶段(内存中的字节码运行时阶段)，根据JDK提供的API可以知道默认是在RetentionPolicy.CLASS阶段 (JDK的API写到：the retention policy defaults to RetentionPolicy.CLASS.)


@retention标示注解可以标示的成分
 @Target(value={TYPE,FIELD,METHOD,PARAMETER,CONSTRUCTOR,LOCAL_VARIABLE})
 @Retention(value=SOURCE)
 public @interface SuppressWarnings
 
 
 
 ##注解的主要用法
    注解可以看成是一种特殊的类，既然是类，那自然可以为类添加属性
    
    
`参考：https://www.cnblogs.com/xdp-gacl/p/3622275.html`