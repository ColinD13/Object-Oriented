//import java.util.*;
//
//public class UseGeometric {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double width;
//        double height;
//        String ans;
//        GeometricFigure[] g = new GeometricFigure[5];
//
//        for(int x=0;x<5;x++)
//        {
//            System.out.println("Enter the width");
//            width = sc.nextDouble();
//            System.out.println("Enter the height");
//            height = sc.nextDouble();
//            sc.nextLine();
//
//            System.out.println("Square or Triangle <Square-Triangle>");
//            ans = sc.nextLine();
//
//            if(ans.equalsIgnoreCase("Square"))
//            {
//                Square s = new Square(width,height,ans);
//                g[x]=s;
//            }
//            else if(ans.equalsIgnoreCase("Triangle"))
//            {
//                Triangle t = new Triangle(width,height,ans);
//                g[x]=t;
//            }
//        }
//
//        System.out.println(Arrays.toString(g));
//
//    }
//}
