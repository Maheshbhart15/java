package Methods;

public class InstanceMethod {

    // instance method is method written without static keyword
    // instance method is used to store object specific data
    // ex - Acc num , Acc bal ,Acc withdraw

    public static void main(String[] args) {
        InstanceMethod im=new InstanceMethod();
        System.out.println(im.NoisDisible(12));
    }
    int NoisDisible(int num) {
        {
            int sum=0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    System.out.println("Num is divissible by given num " + i);
                    sum=sum+i;
                }
            }
            return sum;
        }
    }
}
