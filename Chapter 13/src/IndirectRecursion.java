import java.util.Scanner;

public class IndirectRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num");
        int num =sc.nextInt();

        method1(num);
    }

    public static int method1(int num)
    {
        if(num>0) {
            System.out.println(num);
            return method2(num - 1);
        }
        else
            return num;
    }

    public static int method2(int num) {
        if(num>0) {
            System.out.println(num);
            return method1(num);
        }
        else
            return num;
    }
}
