import java.util.Scanner;
public class divby{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
System.out.println("Enter the number:");
int a=obj.nextInt();
if(a%5 == 0){
System.out.println("The given number is divisible by 5");
}
else if(a%11==0){
System.out.println("The given number is divisible by 11");
}
else{
System.out.println("The given number is not divisible by 5 or 11");
}
}
}