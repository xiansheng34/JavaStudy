package LC.Scanner;
import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("从键盘接受数据");
        System.out.println("请输入整型数据");
        int i = 0;
        float f = 0.0F;
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            System.out.println("i=" + i);
        } else {
            System.out.println("输入的不是整形数据");
        }
        System.out.println("请输入小数数据");
        if (scanner.hasNextFloat()) {
            f  = scanner.nextFloat();
            System.out.println("i=" + f);
            scanner.close();
        } else {
            System.out.println("输入的不是小数数据");
        }
    }
}

