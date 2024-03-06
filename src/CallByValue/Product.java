package CallByValue;

public class Product {
    //
    int ProductId;
    String ProductName;
    int ProductPrize;

    public Product(int ProductId, String productName, int ProductPrize) {
        this.ProductId=ProductId;
        this.ProductName=ProductName;
        this.ProductPrize=ProductPrize;
        System.out.println("inside the Product class");
    }

}