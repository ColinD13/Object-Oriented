import java.util.*;

public class ThrowCourseException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] courses = new Course[6];
        String[] departments = new String[6];
        int[] courseNums = new int[6];
        double[] credits = new double[6];

        for(int x=0;x<courses.length;x++)
        {
            System.out.println("Enter the department name for course #" + (x+1));
            departments[x]=sc.nextLine();

            do{
                System.out.println("Enter a course num");
                try {
                    courseNums[x] = Integer.parseInt(sc.nextLine());
                    break;
                }
                catch(Exception e)
                {
                    continue;
                }
            }while(true);

            do{
                System.out.println("Enter the credits");
                try {
                    credits[x] = Double.parseDouble(sc.nextLine());
                    break;
                }
                catch(Exception e)
                {
                    continue;
                }
            }while(true);
        }

        for(int x=0;x<courses.length;x++)
        {
            try{
                courses[x] = new Course(departments[x],courseNums[x],credits[x]);
            }
            catch(Exception c)
            {
                System.out.println("Exception caught");
                courses[x]=new Course();
            }
        }

        for(int x=0;x<courses.length;x++)
        {
            System.out.println(courses[x].toString());
        }


    }
}
