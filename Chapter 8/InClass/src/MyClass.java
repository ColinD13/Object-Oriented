import java.util.ArrayList;

public class MyClass {
    public static void main(String[] args) {
        ArrayList<String> shapes = new ArrayList<String>();
        //Create an Array List object with a string database

        shapes.add("square");
        shapes.add("rectangle");
        shapes.add("hexagon");
        shapes.add("rhombus");
        shapes.add("octagon");
        shapes.add("triangle");
        shapes.add("pentagon");
        System.out.println(shapes);
        System.out.println(shapes.get(4));
        shapes.remove(2);
        shapes.remove(5);
        System.out.println(shapes);
        shapes.set(4,"circle");
        System.out.println(shapes);
        System.out.println(shapes.size());
        shapes.clear();
        System.out.println(shapes);


    }
}