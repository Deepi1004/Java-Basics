import java.util.Scanner;
public class leapyear{
public static void main(String[] args){
Scanner obj=new Scanner(System.in);
System.out.println( "Enter the year:" );
int year = obj.nextInt();
if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
System.out.println(year + " is leapYear");
}
else{
System.out.println(year + " is not a leapYear");
}
}
}
