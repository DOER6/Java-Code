package bookcontent.it02;
import java.util.Scanner;


//第一步，把各个类的框架实现起来。首先是测试类Main类；然后是主要的Company类（和基类关联）；以及抽象基类Employee类；最后是三种子类WeekWorker、MonthWorker、YearWorker。
//第二步，理清各个类之间的关系。可以把公司Company类当作一个实现功能的地方，放置员工们Employee（建个数组）能做的事儿，而员工类Employee类作为抽象类，具体员工属性的实现放到不同的子类，周、月、年员工类WeekWorker、MonthWorker、YearWorker中实现。
//第三步，在主函数中做最后的测试，实现小员工们的上转型公司。
//关于计算总工资，可以当作是有3种拿工资的方法，有个人在该公司工作1年，每种工资都拿了一遍，最后所得的工资。

public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("请输入基本星期工资：");
            double basicWeekEarnings = scan.nextDouble();
            System.out.print("请输入基本月工资：");
            double basicMonthEarnings = scan.nextDouble();
            System.out.print("请输入基本年工资：");
            double basicYearEarnings = scan.nextDouble();
            Employee[] employee = new Employee[9];
            for (int i = 0; i < 9; i++) {
                if (i < 3) {
                    employee[i] = new WeekWorker();
                    employee[i].basicWage = basicWeekEarnings;
                } else if (i < 6) {
                    employee[i] = new MonthWorker();
                    employee[i].basicWage = basicMonthEarnings;
                } else {
                    employee[i] = new YearWorker();
                    employee[i].basicWage = basicYearEarnings;
                }
            }
            Company company = new Company(employee);
            System.out.println("公司薪水总额：" + company.salaryPlay());
        }
    }

