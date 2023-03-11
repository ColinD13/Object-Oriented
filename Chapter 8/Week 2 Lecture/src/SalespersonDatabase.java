import java.util.*;

public class SalespersonDatabase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SalesPerson> people = new ArrayList<SalesPerson>();
        int id;
        double sales;

        System.out.println("If at any time you would like to stop entering student info enter 99999 foor the id");

        for(int x =0;x<people.size();x++)
        {
            SalesPerson s = new SalesPerson();
            System.out.println("Enter the id num");
            id = sc.nextInt();
            System.out.println("Enter the sales");
            sales = sc.nextDouble();
            if(id==99999) {
                break;
            }
            s.setIdNum(id);
            s.setSales(sales);
            people.add(s);
        }


        System.out.println("Choose one of the following 1)Add a record to the array 2)Delete a Record from the array 3)Change a record in the array 4)Exit");
        int answer = sc.nextInt();

        if(answer==1)
        {

            System.out.println("Enter the new id num");
            int newNum = sc.nextInt();
            boolean check = true;

            for(int x=0;x<people.size();x++)
            {
                if(people.get(x).getIdNum()==newNum)
                {
                    System.out.println("Error");
                    check = false;
                    break;
                }
            }

            if(check)
            {
                System.out.println("Enter a new sales value");
                int newSales = sc.nextInt();

                SalesPerson sp = new SalesPerson(newNum,newSales);
                people.add(sp);
            }

        }
        else if(answer==2)
        {

        }
        else if(answer==3)
        {

        }
        else if(answer==4)
        {

        }
        else
        {
            System.out.println("Error");
        }

    }
}
