import java.util.ArrayList;

public class ProductReview extends Product{
    private ArrayList<String> reviews = new ArrayList<String>();

    public ProductReview(String name, double price, ArrayList<String> reviews) {
        super(name, price);
        this.reviews = reviews;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<String> reviews) {
        this.reviews = reviews;
    }

    public void addReview(String r)
    {
        this.reviews.add(r);
    }


    @Override
    public String toString() {
        return super.toString() +
                "reviews=" + reviews +
                '}';
    }
}
