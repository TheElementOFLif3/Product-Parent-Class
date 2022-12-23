public class Chocolate extends Product {
    int Weight;

    public Chocolate(String name, double basePrice, int barcode,int weight){
        super(name, basePrice, barcode);
        this.Weight = weight;
    }

    @Override
    public String getInfo() {

        return  "Chocolate Weight: " + Weight + "g\n" +
                super.getInfo();

    }


}
