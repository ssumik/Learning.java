import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();
		Product product = new Product("TV", 200.00, 1);
		products.add(product);
		Product product1 = new Product("PC", 2000.00, 2);
		products.add(product1);
		Product product2 = new Product("CAR", 20000.00, 10);
		products.add(product2);
		FileManeger file = new FileManeger();

		file.setFileName("test4");
		file.addFile();
		for(Product items : products) {
			file.addContent(items.toString());
			
		}
		
	}
}
