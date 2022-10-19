package hello001;
/**
 学螺丝
 */
public class ViriableDemo3 {

    public class VariableDemo3 {
        public static void main(String[] args) {
            // 目标：掌握常用8种基本数据类型定义变量。
            // 1、byte 字节型
            byte age = 120;
            byte age2 = 127;    //-128~127
            // byte age3 = 128; //报错

            // 2、short 短整型
            short s1 = 32542;
            // short s2 = 42542;

            // 3、int 整型 (默认类型，如果不确定数据的范围会多大，就用int)
            int i = 1;
            int it = 243244244;

            // 4、long 长整型
            long l = 32332323;
            long l3 = 342432432432l;
            // 注意：随便写一个字面量34243243243245默认是当成int类型的，34243243243245虽然没有超过long的范围
            // 但是34243243243245它超过了int本身的范围，如果希望34243243243245这个数据是long类型的，需要在后面加L l
            long l2 = 34243243243245L;

            // 5、浮点型（小数）
            // float称为单精度小数：注意：随便写一个小数字面量默认是double类型的，如果希望随便写一个小数默认是float类型的需要加上F/f
            float f = 3.14F;
            //float score =98.5; 报错

            // 6、double 双精度
            double score = 99.5;

            // 7、字符型
            char ch = '徐';
            char ch1 = '黑';

            // 8、布尔类型
            boolean flag = true;
            boolean flag2 = false;

            System.out.println("--引用数据类型：String--");
            // String表示的是字符串类型，定义的变量可以存储一个字符串
            String name = "黑马程序员";
            System.out.println(name);

            int class1 = 21;
            int itheima = 23;
        }

    }
}
