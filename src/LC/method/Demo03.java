package LC.method;

public class Demo03 {
    public void max(double...i){
        if(i.length==0){
            System.out.println("NO num");
            return ;
        }
        double result=i[0];
        for(int j=0;j<i.length;j++){
            if(i[j]>result){
                result=i[j];
            }
        }
        System.out.println("The max num is "+result);
    }

    public static void main(String[] args) {
        Demo03 demo03=new Demo03();
        demo03.max(1,2,3,6);
        double[] nUm={5.498,18,168.4};
        demo03.max(nUm);
    }
}
