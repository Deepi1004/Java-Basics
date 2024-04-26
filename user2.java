import java.util.Scanner;
public class user2{
public static void main(String[] args){
Scanner obj=new Scanner(System.in);
System.out.println("Enter the name:");
String fullname=obj.next();
System.out.println(fullname);

System.out.println("Enter the Mark:");
int a=obj.nextInt();
if (a < 0 || a > 100) {
            System.out.println("Invalid input. Marks should be between 0 and 100.");
        } else {
            if (a > 90) {
                System.out.println("Grade: O");
            } else if (a > 80) {
                System.out.println("Grade: A+");
            } else if (a > 70) {
                System.out.println("Grade: A");
            } else if (a > 60) {
                System.out.println("Grade: B+");
            } else if (a > 50) {
                System.out.println("Grade: B");
            } else {
                System.out.println("Grade: Fail");
            }
        }
}
}

