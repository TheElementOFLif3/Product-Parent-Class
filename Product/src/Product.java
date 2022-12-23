public class Product {

    public String name;
    public int barcode;
    public double basePrice;
    private static final double productTax = 1.2;

    public Product (){ }

    public Product(String name, double basePrice, int barcode) {
        this.name = name;
        this.barcode = barcode;
        this.basePrice = basePrice;
    }

    public double countPrice() {
        return basePrice * productTax;
    }

    public String getInfo(){
        return "Product Name: "  + name + "\n" +
                "Product Base Price: " + basePrice + "\n" +
                "Product BarCode: " + barcode + "\n" +
				"Total Price: "  + + this.countPrice();


    }


}
