package bookcontent.basic01;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int p1=168;
        int p2=120;
        int p3=5;
        double money,y;

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入售出的白酒瓶数：（50-5000）");
        int Num1= sc.nextInt();
        System.out.println("请输入售出的红酒瓶数：（30-3000）");
        int Num2= sc.nextInt();
        System.out.println("请输入售出的啤酒瓶数：（300-30000）");
        int Num3= sc.nextInt();

        money=p1*Num1+p2* Num2+p3* Num3;

        if(money<=20000){
            y=money*4/100;
        }
        else if(money>20000&&money<45000){
            y=money*4.05/100;
        }
        else{
            y=money*4.1/100;
        }

        System.out.println("该销售员的佣金为："+y);
    }
}
