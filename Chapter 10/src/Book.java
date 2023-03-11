public abstract class Book {

    protected String title;
    protected double price;

    public Book() {
        this.title = "";
        this.price = 0;
    }

    public Book(String title) {
        this.title = title;
        this.price =0;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public abstract void setPrice();
}