import java.util.Scanner;

public class Disk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks");
        int disks = sc.nextInt();
        move(disks, 1, 3, 2);
    }

    public static void move(int disks, int start, int end, int middle) {
        if (disks == 1) {
            System.out.println("Move " + start + " to " + end);
        } else {
            move(disks - 1, start, middle, end);
            System.out.println("Move " + start + " to " + end);
            move(disks - 1, middle, end, start);
        }
    }
}
