package CallByValue;

public class Test {
    public static void main(String[] args) {
        Product P1=new Product(1,"Phone",22);
        System.out.println("1st block"+P1.ProductId+"\t"+P1.ProductName+"\t"+P1.ProductPrize);
     print(P1); //calling
    }
    public  static void print(Product P2)
    {
        P2.ProductId=111;
        P2.ProductName="Laptop";
        P2.ProductPrize=555;

        System.out.println("2nd block"+P2.ProductId+"\t"+P2.ProductName+"\t"+P2.ProductPrize);

    }
}
