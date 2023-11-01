import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        double c;
        double f;
        boolean done = false;
        String stop;

        do {
            System.out.println("Enter temperatures in celsius. Enter N to stop: ");
            if (scan.hasNextDouble()) {
                c = scan.nextDouble();
                scan.nextLine();
                f = (c*9/5) + 32;
                System.out.println(c + " degrees in celsius is " + f + " degrees in fahrenheit.");
            } else {
                stop = scan.nextLine();
                if (stop.equalsIgnoreCase("N")) {
                    done = true;
                } else {
                    System.out.println("Try again pal");
                }
            }
        } while (!done);
    }
}
