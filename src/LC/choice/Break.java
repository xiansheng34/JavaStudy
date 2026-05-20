package LC.choice;

public class Break {
    public static void main(String[] args) {
        int i=0;
        while(i<100){
            i++;
            System.out.println(i);
            if(i==50){
                break;
            }
        }
    }
}
