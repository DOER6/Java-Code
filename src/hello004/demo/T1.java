package hello004.demo;

//import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        //数组求和
       // Scanner sc=new Scanner(System.in);
        int[] array={16,32,8,100,78};//静态初始化数组
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+= array[i];
        }
        System.out.println("数组元素和"+sum);
    }
}
