import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ageCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birth date (YYYY-MM-DD): ");
        String birthDateInput = sc.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateInput);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);
        System.out.println("You are " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days old.");

        sc.close();
    }
}