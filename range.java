import java.util.Scanner;
public class range{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
System.out.println("Enter the number:");
int a=obj.nextInt();
if(a<1|| a<100){
System.out.println("The given number is within the given range");
}
else{
System.out.println("The number is not within the range");
}
}
}