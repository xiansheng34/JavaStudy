package LC.choice;
import java.util.Scanner;
public class TestDemo01 {
    public static void main(String[] args) {
        int n;
        System.out.println("请输入三角形的高");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for(int j = 1;j <= i;j++){
                System.out.print("*");
            }
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
