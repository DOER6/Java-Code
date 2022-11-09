package bookcontent.basic01;

interface SpeakHello {
    void speakHello();
}
class Chinese implements SpeakHello {
    public  void speakHello() {
        System.out.println("中国人习惯问候语：你好,吃饭了吗? ");
    }
}
class English implements SpeakHello {
    public  void speakHello() {
        System.out.println("英国人习惯问候语:你好,天气不错 ");
    }
}
class KindHello {
    public void lookHello(SpeakHello hello) { //接口类型参数   hello为形参
        hello.speakHello();                    //接口回调
    }
}
public class Example6_6 {
    public static void main(String args[]) {
        KindHello a = new KindHello();
        Chinese  ccc  = new Chinese();//Chinese是实现了接口的类    ccc为实参
        a.lookHello(ccc );
        a.lookHello(new English());//English也是实现了接口的类
        a.lookHello( ()->{
            System.out.println("码农习惯问候语：no bug");} );//向参数传递Lambda表达式的值
    }
}
//abstract类与接口的比较

// abstract类可以有抽象类和非抽象类
// abstract类和接口都可以有abstract方法
//接口中只可以有常量，不能有变量（final）；而abstract类中即可拥有常量也可以有非抽象方法，接口不可以
//
//需要使用继承才能更好的解决（需要从父类继承一些变量或一些重要的非abstract方法）→使用abstract类
// 不需要继承，只需要若干类给出某些重要的abstract方法的实现细节→使用接口
//
//
//


