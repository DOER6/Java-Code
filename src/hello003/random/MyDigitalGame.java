package hello003.random;

import java.util.Random;
import java.util.Scanner;

public class MyDigitalGame {
    public static void main(String[] args) {
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        int LuckyData =r.nextInt(100)+1;
        //System.out.println(LuckyData);
        System.out.println("猜一猜我手中的数（1-100）:");
        while(true){
            int GuessNumber = sc.nextInt();
            if(GuessNumber<LuckyData) {
                System.out.println("猜小了，往大里猜~~~");
            }
            else if(GuessNumber>LuckyData) {
                System.out.println("猜大了，往小猜~~~~");
            }
            else{
                System.out.println("猜对啦~~~去买单吧~~");
                break;
            }
        }
    }
}
