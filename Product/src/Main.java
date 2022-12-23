public class Main {
    public static void main (String[] args) {

        Chocolate chocolate = new Chocolate("Nestle", 100, 253596, 100);
        System.out.println(chocolate.getInfo());
        System.out.println("--------------------------------\n");
        Wine wine = new Wine("Merlot", 100, 578551, 750);
        System.out.println(wine.getInfo());
    }

}
