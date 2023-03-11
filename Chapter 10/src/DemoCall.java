import java.util.*;

public class DemoCall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        boolean check=true;
        PhoneCall p;

        do{
            System.out.println("What type of call would you like to choose <I-O>");
            choice = sc.nextLine();

            if(choice.equalsIgnoreCase("i") || choice.equalsIgnoreCase("o"))
            {
                check=false;
            }
        }while(check);

        if(choice.equalsIgnoreCase("i")) {
            IncomingCall i = new IncomingCall("412-4124-1241");
            p= i;
        }
        else {
            OutgoingCall o = new OutgoingCall("412-4124-1241",2);
            p=o;
        }

        System.out.println(p.getInfo());


    }
}
