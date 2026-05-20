package LC.scanner;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        System.out.println("请输入一串字 用Scanner的方法输入");
        Scanner scanner=new Scanner(System.in);
        System.out.println("用next方式接受");

        //判断用户有没有输入
        if(scanner.hasNext()){
            String str=scanner.next();
            System.out.println(str);

            scanner.close();
        }
    }
}
