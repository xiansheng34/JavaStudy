package LC.Scanner;
import java.util.Scanner;
public class Demo04 {
    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);

         double sum=0;
         int m=0;
         while(scanner.hasNextDouble()){
             double x=scanner.nextDouble();
             m+=1;
             sum+=x;
         }
         System.out.println(m+"个数字的总和为："+sum);
         System.out.println("平均数为："+(sum/m));
         scanner.close();
    }
}
