import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Product p1 = new Product("TV",300.00);
        Product p2 = new ImportedProduct("Note", 200.00, 20.00);
        Product p3 = new UsedProduct("Iphone", 400.00, sdf.parse("15/03/2017"));

        System.out.println(p1.priceTag()+"\n"+p2.priceTag()+"\n"+p3.priceTag());
    }
}
