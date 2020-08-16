public class Book { // DTO : Data Transfer Object
    String name,origin,type;
    int price, numberOfPage;

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public Book(String name, String origin, String type, int price, int numberOfPage) {
        this.name = name;
        this.origin = origin;
        this.type = type;
        this.price = price;
        this.numberOfPage = numberOfPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", numberOfPage=" + numberOfPage +
                '}';
    }
}
