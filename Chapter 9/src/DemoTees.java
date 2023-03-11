public class DemoTees {
    public static void main(String[] args) {
        TeeShirt t1 = new TeeShirt("123","XXL","Blue");
        TeeShirt t2 = new TeeShirt();

        CustomTee c1 = new CustomTee("456","S","Green","We love java");
        CustomTee c2 = new CustomTee();

        t2.setOn("789");
        t2.setSize("M");
        t2.setColor("Red");

        c2.setOn("321");
        c2.setSize("XXXL");
        c2.setColor("Purple");
        c2.setSlogan("We hate java");

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
