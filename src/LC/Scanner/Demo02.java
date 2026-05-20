package LC.Scanner;
import java.util.Scanner;
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("用nextLine方式接受");
        if(scanner.hasNextLine()){
            String str=scanner.nextLine();

            System.out.println(str);

            scanner.close();
        }
    }
}
