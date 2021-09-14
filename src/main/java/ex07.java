import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String length;
        System.out.print(" What is the length of the room? ");

        length = input.next();

        Integer i = Integer.parseInt(length);

        String width;
        System.out.print(" What is the width of the room?");

        width = input.next();

        Integer j = Integer.parseInt(width);

        int area = i * j;
        double meters = area * 0.09290304;

        System.out.print("You entered the dimensions of " + i+ " feet by " + j+"feet" + System.lineSeparator());
        System.out.print("The area is " + area +" square feet. "+ System.lineSeparator() + meters +" square meters.");
    }
}
