package LC.method;

public class Demo02 {
    public static int max(int a,int b){
        int result=0;
        if(a>b){
            result=a;
        }
        else if(a<b){
            result=b;
        }
        else if(a==b){
            System.out.println("a=b");
        }
        return result;
    }
    public static void main(String[] args) {
        int a=4;
        int b=2;
        System.out.println(max(a,b));
    }
}
