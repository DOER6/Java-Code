package hello001;

public class ViriableDemo1 {
    public static void main(String[] args) {
        // 目标：让同学们学会定义并使用变量。
        // 数据类型 变量名称 = 初始值;
        // 注意：从右往左边看的（赋值）
        int age = 21;
        System.out.println(age);

        age = 25;
        System.out.println(age);

        System.out.println("-------------实际操作------------");
        double money = 6.0;
        System.out.println(money);

        // 收红包4元
        money = money + 4.0;
        System.out.println(money);
    }
}