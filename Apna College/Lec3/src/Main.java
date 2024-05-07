import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        //Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows :
//        System.out.print("Enter 1st no:");
//        int a = sc.nextInt();
//        System.out.print("Enter 2nd no:");
//        int b =sc.nextInt();
//        System.out.println("Enter Operator");
//        char operator=sc.next().charAt(0);
//        switch (operator){
//            case '+':
//                System.out.println(a+b);
//                break;
//            case '-':
//                System.out.println(a-b);
//                break;
//            case '*':
//                System.out.println(a*b);
//                break;
//            case '/':
//                System.out.println(a/b);
//                break;
//            default:
//                System.out.println("Please enter proper operator");
//        }
        //Ask the user to enter the number of the month &
        //print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.
        System.out.println("Enter the month no:");
        int no = sc.nextInt();
        switch (no){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Feburay");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Augest");
                break;
            case 9:
                System.out.println("Sepetember");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Enter correct month no:");
        }
    }
}