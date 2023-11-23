import com.workintech.store.models.*;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("CHOCOLATE", 2.5, "Premium dark chocolate", ChocolateType.DARKCHOCOLATE);
        products[1] = new Coke("Soda", 1.0, "Refreshing soda", 500);
        products[2] = new Bread("Whole Wheat Bread", 3.0, "Healthy whole wheat bread", true);
        listProducts(products);

    }

    public static void listProducts(ProductForSale[] products) {
    for (ProductForSale product: products){
          product.showDetails();
}
    }
}