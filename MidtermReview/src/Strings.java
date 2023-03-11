public class Strings {
    public static void main(String[] args) {
        String p = "Hello there this is Colin Downing";
        StringBuilder easier = new StringBuilder(p);
        int vow =0;


        for(int x=0;x<10;x++)
        {
            System.out.print(p.charAt(x));
        }

        System.out.println();

        for(int y=p.length()-11;y<p.length()-1;y++)
        {
            System.out.print(p.charAt(y));
        }

        for(int x =0; x<p.length();x++)
        {
            if(p.charAt(x)=='A'||p.charAt(x)=='a'|| p.charAt(x)=='E' || p.charAt(x)=='e' || p.charAt(x)=='I' || p.charAt(x)=='i' || p.charAt(x)=='O' || p.charAt(x)=='o' || p.charAt(x)=='U' || p.charAt(x)=='u')
            {
                vow++;
            }
        }

        System.out.println(vow + " vowels");


        for(int x=0; x<easier.length();x++)
        {
            if(easier.charAt(x)=='E' || easier.charAt(x)=='e')
            {
                easier.replace(x,x+1,"3");
            }
        }

        System.out.println(easier);



    }
}
