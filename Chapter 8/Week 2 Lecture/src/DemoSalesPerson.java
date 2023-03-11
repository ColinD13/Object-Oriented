import java.util.Arrays;

public class DemoSalesPerson {

    public static void main(String[] args) {
        SalesPerson[] people = new SalesPerson[10];
        int startId = 111;
        double startSale = 25000;
        for (int i = 0; i < people.length; i++) {
            SalesPerson person = new SalesPerson();
            person.setIdNum(startId);
            person.setSales(startSale);
            people[i] = person;
            System.out.println(person.toString());
            startId++;
            startSale += 5000;
        }

        System.out.println(Arrays.toString(people));
    }
}
