package JavaMavenNetology.JavaMavenNetology_9.goodsManager;

public class Smartphone extends Product {
    private String name;
    private String manufacturer;

    public Smartphone(int ID, String name, int price, String manufacturer) {
        super(ID, name, price);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

}
