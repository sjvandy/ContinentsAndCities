import java.util.Scanner;
import java.util.Arrays;

public class Continents {
// This program prints out a continent and its largest city based on input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] options = {"north america", "south america", "europe", "africa", "asia", "australia", "antarctica"};
        String continent;
        
        while (true) {
            System.out.print("Enter a continent to see the largest city in it!: ");
            continent = scanner.nextLine();
            if (Arrays.asList(options).contains(continent)) {
                break;
            } else {
                System.out.println("Invalid continent. Please try again.");
            }
        }
        switch (continent.toLowerCase()) {
            case "north america":
                System.out.println("North America: Mexico City, Mexico");
                break;
            case "south america":
                System.out.println("South America: Sao Paulo, Brazil");
                break;
            case "europe":
                System.out.println("Europe: Moscow, Russia");
                break;
            case "africa":
                System.out.println("Africa: Lagos, Nigeria");
                break;    
            case "asia":
                System.out.println("Asia: Shanghai, China");
                break;
            case "australia":
                System.out.println("Australia: Sydney, Australia");
                break;
            case "antarctica":
                System.out.println("Antarctica: McMurdo Station, US");
            default:
                System.out.println("Undefined continent!");
                break;
        }
        scanner.close();
    }
}