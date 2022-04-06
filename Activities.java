/*Program asks user for day of the week and
outputs the activities that take place
on the inputted day of the week.
 */
import java.util.Scanner;
public class Activities {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        //Asks user for day of the week
        System.out.print("Enter the day of the week: ");
        String day = kb.next();

        //Prints activity for inputted day
        if (day.equalsIgnoreCase("Monday")) {
            System.out.println("Monday's activity is Golfing.");
            System.out.println("Team mini golf activity!");
        } else if (day.equalsIgnoreCase("Tuesday")) {
            System.out.println("Tuesday's activity is Painting.");
            System.out.println("Learn different painting techniques!");
        } else if (day.equalsIgnoreCase("Wednesday")) {
            System.out.println("Wednesday's activity is Swimming");
            System.out.println("Full-body compound exercise!");
        } else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("Thursday's activity is Baseball.");
            System.out.println("Fun team-building activity!");
        } else if (day.equalsIgnoreCase("Friday")) {
            System.out.println("Friday's activity is Dancing.");
            System.out.println("Be sure to find a partner!");
        } else if (day.equalsIgnoreCase("Saturday")) {
            System.out.println("Saturday's activity is Movie Night.");
            System.out.println("Tonight's movie: Austin Powers");
        } else if (day.equalsIgnoreCase("Sunday")) {
            System.out.println("Sunday's activity is Football.");
            System.out.println("Winning team chooses next Sunday's activity!");
        } else {
            System.out.println("Error! Check spelling (Monday, Tuesday...)");
        }
    }
}