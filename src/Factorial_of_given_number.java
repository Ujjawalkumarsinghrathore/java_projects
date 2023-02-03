import java.util.*;
public class Factorial_of_given_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        long a=sc.nextLong();
        long i=1;
        long fact=1;
        while(i<=a){
            fact=fact*i;
            i++;


        }
        System.out.println("The factorial of given number is: "+fact);
    }
}
