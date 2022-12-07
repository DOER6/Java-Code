package bookcontent.basic01.ExampleText;
import java.util.*;

public class Example8_13 {
        public static void main(String args[]) {
            String cost = "市话76.8元,长途:167.38元,短信12.68元";
            double priceSum = GetPrice.givePriceSum(cost);
            System.out.printf("%s\n总价:%.2f圆\n", cost, priceSum);
            cost = "牛奶:8.5圆,香蕉3.6圆，酱油:2.8圆";
            priceSum = GetPrice.givePriceSum(cost);
            System.out.printf("%s\n总价:%.2f圆\n", cost, priceSum);
        }

}
class GetPrice {
    public static double givePriceSum(String cost) {
        Scanner scanner = new Scanner(cost);
        scanner.useDelimiter("[^0123456789.]+"); //scanner设置分隔标记
        double sum=0;
        while(scanner.hasNext()){
            try{  double price = scanner.nextDouble();
                sum = sum+price;
            }
            catch(InputMismatchException exp){
                String t = scanner.next();
            }
        }
        return sum;
    }
}