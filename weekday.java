import java.util.Scanner;
public class weekdays{
pub lic static void main(String[] args) {
        Scanner days= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int dayNumber = days.nextInt();
     String day;

        switch (dayNumber) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day number";
        }

        System.out.println("Day: " + day);
    }
}
