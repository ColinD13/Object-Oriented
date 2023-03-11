public class Horse {

    private String name;
    private String color;
    private String year;

    public Horse(String name, String color, String year) {
        this.name = name;
        this.color = color;
        this.year = year;
    }

    public Horse() {
        this.name = "";
        this.color = "";
        this.year = "";
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}