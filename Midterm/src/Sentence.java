public class Sentence {
    public static void main(String[] args) {
        String s = "A dog has a tail";
        s=s.toLowerCase();

        System.out.println(s.indexOf("a"));

        s=s.replaceAll("a","4");

        System.out.println(s);

        String s2= s.substring(0,s.length()/2);
        System.out.println(s2);

    }
}
