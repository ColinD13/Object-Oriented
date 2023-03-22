import java.util.Scanner;
public class VeeRecursive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int before=0;

        System.out.println("Enter the amount of lines that you would like to display");
        int amountLines = sc.nextInt();

        display(0,amountLines,before,amountLines);
    }

    public static String display(int currentLine,int amountLines,int spaceBefore, int spaceBetween)
    {
        String before="";
        String between="";

        for(int x=0;x<spaceBefore;x++)
        {
            before+=" ";
        }

        for(int x=0;x<spaceBetween*2;x++)
        {
            between+=" ";
        }

        if(amountLines>currentLine)
        {
            System.out.println(before + "V" + between + "V");
            return display(currentLine+1,amountLines,spaceBefore+1,spaceBetween-1);
        }
        else
            return "";
    }
}
