public class DemoHorse {
    public static void main(String[] args) {
        Horse h = new Horse("Sparky","Brown","2015");
        RaceHorse rh = new RaceHorse("Bolt","White","2015","14");

        System.out.println(h.toString());
        System.out.println(rh.toString());
    }
}
