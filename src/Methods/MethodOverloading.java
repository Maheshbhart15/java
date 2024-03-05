package Methods;

class MethodOverloading{
     public static void main(String[] args) {
         //method overloadinf is defined as within same class
         // two or more method have same name with different singture or parameter's
         //method .. we write set of instruction to perfrom ceratin task
         //java: non-static method add(int,int) cannot be referenced from a static context
         // to call instance method we should fisrt must create and object of class

         MethodOverloading m=new MethodOverloading();
         System.out.println(m.add(10,20)); //look this by parameter value
         System.out.println(m.add(22.22,10.12));//look this by parameter value
     }
     int add(int num1,int num2)
     {
         return num1+num2;
     }
     double add(double num1,double num2)
     {
         return num1+num2;
     }

 }