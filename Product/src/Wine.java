public class Wine extends Product  {

    int Volume;
    public static final  double alcoholtax = 1.1;

    public Wine(String name, double basePrice, int barcode,int Volume){
        super(name, basePrice, barcode);
        this.Volume = Volume;
    }

    @Override
    public String getInfo() {
        return  "Wine Volume: " + Volume + "mL\n" +
                super.getInfo();
                


    }

    @Override
    public double countPrice() {
        return super.countPrice() * alcoholtax;

    }

}