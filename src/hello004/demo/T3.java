package hello004.demo;

import javax.crypto.spec.PSource;
import java.util.Scanner;
import java.util.Random;

public class T3 {
    public static void main(String[] args) {
        Random r =new Random();
        int[] array=new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i]=r.nextInt(1,21);
        }
        Scanner sc =new Scanner(System.in);
        OUT:
        while (true){
            System.out.println("请您输入一个1-20中的数猜测:");
            System.out.print("偷偷告诉你，幸运数有这几个哦：");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+"\t");
            }
            System.out.println(" ");
            int n=sc.nextInt();

            //遍历数组中的数据
            for (int i = 0; i < array.length; i++) {
                if (array[i]==n) {
                    System.out.println("您猜中了数据~~~，数据索引为："+i);
                    break OUT;//结束整个死循环
                }
            }
            System.out.println("您没有猜中哦，请继续游戏！！！");
        }
        System.out.println("所有的幸运数字如下：");
        for (int i = 0; i < array.length; i++) {
            System.out.println("第"+(i+1)+"个数字:"+array[i]);
        }
    }
}
