package bookcontent.it03;
//问题：设计一个动物声音“模拟器”，希望模拟器可以模拟许多动物的叫声。
//要求如下：
//
//编写抽象类Animal
//Animal抽象类有2个抽象方法cry()和getAnimaName()，即要求各种具体的动物给出自己的叫声和种类名称。
//
//编写模拟器类Simulator
//该类有一个playSound(Animal animal)方法，该方法的参数是Animal类型。即参数animal可以调用Animal的子类重写的cry()方法播放具体动物的声音、调用子类重写的getAnimalName()方法显示动物种类的名称。
//
//编写Animal类的子类：Dog，Cat类
public class Application {

        public static void main(String[] args) {

            Simulator simulator=new Simulator();
            simulator.playSound(new Dog());
            simulator.playSound(new Cat());
        }

    }


