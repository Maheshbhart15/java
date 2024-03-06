package Constructor;

public class AddNum {
    public static void main(String[] args) {
        AddNum A1=new AddNum(12,10);

    }
    // what is constructor ?
    // its special method which have same name as of class name and based ob singnture or paramter
    // its of type defalut , zero , paramterzied constructor
    // its does no have access modifier ie static final abstarct
    // we construct the constructor to bulid or ctreate constructor object
    //  we use the constrctor to intilize instace varibale o objects
    AddNum()
    {

    }
     AddNum(int num1 , int num2 )
    {
        System.out.println(num1+num2);
    }

}
