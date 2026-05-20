package LC.method;
import java.util.Scanner;
public class easyClaculate {
    public static double add(double a,double b){
        return a+b;
    }
    public static double sub(double a,double b){
        return a-b;
    }
    public static double mul(double a,double b){
        return a*b;
    }
    public static double div(double a,double b){
        if(b==0){
            System.out.println("0不能作为除数");
            return 0;
        }else{
            return a/b;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("欢迎来到简易计算器");
        System.out.println("===========================");
        while (true){
            System.out.println("请选择你要进行的运算符号1.+2.-；3.*；4./; 0.退出");
            int n=scanner.nextInt();
            if(n==0){
                System.out.println("再见！");
                return;
            }
            if(n>4||n<1){
                System.out.println("请输入正确的运算符的数字编号!!!");
                continue;
            }

            System.out.println("请输入第一个数字：");
            double num1=scanner.nextDouble();
            System.out.println("请输入第二个数字：");
            double num2 =scanner.nextDouble();
            switch(n){
                case 1:{

                    double result=add(num1,num2);
                    System.out.println(num1 +"+"+num2+"="+result);
                    System.out.println("======================");
                    break;
                }
                case 2:{
                    double result_1=sub(num1,num2);
                    System.out.println(num1 +"-"+num2+"="+result_1);
                    System.out.println("======================");
                    break;
                }
                case 3:{
                    double result_2=mul(num1,num2);
                    System.out.println(num1 +"*"+num2+"="+result_2);
                    System.out.println("======================");
                    break;
                }
                case 4:{
                    double result_3=div(num1,num2);
                    System.out.println(num1 +"/"+num2+"="+result_3);
                    System.out.println("======================");
                    break;
                }
            }
        }
    }
}
