public abstract class GeometricFigure implements SidedObject{
    protected double width;
    protected double height;
    protected String type;

    public GeometricFigure(double width, double height, String type) {
        this.width = width;
        this.height = height;
        this.type = type;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString()
    {
        return "Type: "+ this.type + " Height: "+ this.height + " Width: "+ this.width;
    }


    public abstract double Area();
}
