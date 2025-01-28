import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ageCalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter their birth date in the format YYYY-MM-DD
        System.out.println("Enter your birth date (YYYY-MM-DD): ");
        String birthDateInput = scanner.nextLine();

        // Parsing the input string to a LocalDate object
        LocalDate birthDate = LocalDate.parse(birthDateInput);

        // Getting the current date
        LocalDate today = LocalDate.now();

        // Calculating the difference between current date and birth date
        Period age = Period.between(birthDate, today);

        // Displaying the calculated age in years, months, and days
        System.out.println("You are " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days old.");

        scanner.close();
    }
}
