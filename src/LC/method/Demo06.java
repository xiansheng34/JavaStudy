package LC.method;

public class Demo06 {
    public static void main(String[] args) {
        int n=33;
        System.out.println(f(n));
    }
    public static int f(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*f(n-1);
        }

    }
}
