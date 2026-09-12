import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Celsius Number:");
        double c = sc.nextInt();
        double f = (c * 9.0 / 5.0) +32;
        System.out.println("Fahrebheit Number is:" + f);
    }
}
