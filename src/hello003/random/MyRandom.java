package hello003.random;
import java.util.Random;
public class MyRandom {
    public static void main(String[] args) {
        Random r =new Random();

        for (int i=0;i<20;i++) {
            int data =r.nextInt(10);
            System.out.println(data);
        }
        System.out.println("~~~~~~~~~~~");
        //3-17的数据
        for (int i=0;i<10;i++) {
            int data2 =r.nextInt(15)+3;
            System.out.println(data2);
        }
    }
}
