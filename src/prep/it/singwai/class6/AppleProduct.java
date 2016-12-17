package prep.it.singwai.class6;

public class AppleProduct {

    String name;
    int releaseYear;
    double price;
    String category;
    int storage;
    double screenSize;

    public AppleProduct(String name, int releaseYear, double price, String category, int storage, double screenSize) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.price = price;
        this.category = category;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "AppleProduct{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", storage=" + storage +
                ", screenSize=" + screenSize +
                '}';
    }
}
