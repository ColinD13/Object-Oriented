public class Square2 extends GeometricFigure{

    public Square2(double width, double height, String type) {
        super(width, height, type);
    }

    @Override
    public double Area()
    {
        return this.height*this.width;
    }

    @Override
    public String toString() {
        return "{" + super.toString() + " Area: " + Area();
    }

    public void displaySides()
    {
        System.out.println("A square has 4 sides");
    }

}
