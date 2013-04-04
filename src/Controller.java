
public class Controller {
    ProductrController prodController;

    public Controller() {
        prodController = new ProductrController();
    }
    public void addProduct(Product product){
        prodController.addProduct(product);
    }
    public int getProductListsize() {
        return prodController.getProductListsize();
    }
    public int getPackagetListsize() {
        return prodController.getPackagetListsize();
    }
    public Product showProducts(int index) {
        return prodController.showProducts(index);
    }
    public boolean getAllProducts() {
        return prodController.getAllProducts();
    }
}