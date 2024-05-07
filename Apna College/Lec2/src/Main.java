import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Make a program that takes the radius of a circle as input,
        // calculates its radius and area and prints it as output to the user.
        System.out.println("Enter the radius of circle:");
        double radius= sc.nextDouble();
        double area = 3.14*radius*radius;
        System.out.println("Area of circle:"+area);

        //Make a program that prints the table of a number that is input by the user.
        System.out.println("Enter no:");
        int n = sc.nextInt();
        for(int i=0;i<=10;i++)
            System.out.println(i*n);
    }
}