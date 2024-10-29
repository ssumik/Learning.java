package entities;

import java.util.Date;
import java.text.SimpleDateFormat;

public class UsedProduct extends Product{
    private Date manufactureDate;
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    
    @Override
    public String priceTag(){
        return super.getName() + " (used) $ " + String.format("%.2f ", super.getPrice()) + "(Manufacture date: " + sdf.format(manufactureDate).toString() + ")";
    }
}
