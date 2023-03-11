public class Triangle2 extends GeometricFigure{

    public Triangle2(double width, double height, String type) {
        super(width, height, type);
    }

    @Override
    public double Area()
    {
        return this.height*this.width*.5;
    }

    @Override
    public String toString() {
        return "{" + super.toString() + " Area: " + Area() +"}";
    }

    public void displaySides()
    {
        System.out.println("A triangle has 3 sides");
    }
}