package CallByValue;

public class CallByValue {
    //in the call by value insted of passing actual varibale we pass the value of varibale to the method
    public static void main(String[] args) {

      int num1=01,num2=02;
        System.out.println(add(num1,num2));
        System.out.println("1st bloack "+num1+"\t"+num2);
    }
    public static int add(int num1,int num2)
    {
        num1=111;
        num2=222;
        return num1+num2;
    }
}