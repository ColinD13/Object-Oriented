import java.util.*;
public class SalesPersonSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SalesPerson[] people = new SalesPerson[7];
        int id;
        double sales;

        for(int x=0;x<people.length;x++)
        {
            SalesPerson s = new SalesPerson();
            System.out.println("Enter the Id Number");
            id = sc.nextInt();
            s.setIdNum(id);
            System.out.println("Enter sales amount");
            sales = sc.nextDouble();
            s.setSales(sales);
            people[x]=s;
            System.out.println(s.toString());
        }

        System.out.println("Would you like to sort by ID number or Sales Amount ----> 1(ID) or 2(Sales Amount)");
        int answer = sc.nextInt();

        if(answer==1)
        {
            for (int i = 0; i < people.length - 1; i++) {
                for (int j = 1; j < people.length - i; j++) {
                    if (people[j - 1].getIdNum() > people[j].getIdNum()) {
                        int temp = people[j - 1].getIdNum();
                        people[j - 1].setIdNum(people[j].getIdNum());
                        people[j].setIdNum(temp);
                    }
                }
            }
            System.out.println(Arrays.toString(people));
        }
        else if(answer==2)
        {
            for (int i = 0; i < people.length - 1; i++) {
                for (int j = 1; j < people.length - i; j++) {
                    if (people[j - 1].getSales() > people[j].getSales()) {
                        double temp = people[j - 1].getSales();
                        people[j - 1].setSales(people[j].getSales());
                        people[j].setSales(temp);
                    }
                }
            }
            System.out.println(Arrays.toString(people));
        }
        else
        {
            System.out.println("Error");
        }

    }
}
