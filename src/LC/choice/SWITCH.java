package LC.choice;
import java.util.Scanner;
public class SWITCH {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str="";
        str=scanner.nextLine();
        switch (str){
            case("A"):
                System.out.println("A");
                break;
            case("B"):
                System.out.println("B");
                break;
            case("C"):
                System.out.println("C");
                break;
            case("D"):
                System.out.println("D");
                break;
        }
    }
}
