import java.util.Scanner;

public class Lab01_Shihata {
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        // Name input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        // Age input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Welcome " + name + " to COSC1200 Class. ");
        // Messages based on age
        if (age < 25) {
            System.out.print("You are young and full of possibilities!");
        } else if (age >= 25 && age <= 45) {
            System.out.print(age + "s is the new 20s!");
        } else if (age > 45 && age <= 60) {
            System.out.print("You have a wealth of experience. Welcome!");
        } else {
            System.out.print("It is never too late to start!");
        }
        // Retirement Age of 65
        int retiringAge = 65;
        int yearsLeft = retiringAge - age;
        if (yearsLeft > 0) {
            System.out.print("You have " + yearsLeft + " years left until retirement. Plan wisely!");
        }
        scanner.close();
    }
}