package vaccinationdrive;

import java.util.Scanner;

public class Driver {
    static String todayDate = "30";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        mainWhile: while(true) {
            System.out.println("Enter your choice: \n 1. New Account Creation \n 2. Vaccination Details \n 3. Exit");
            choice = input.nextInt();
            switch(choice) {
                case 1:
                    new Beneficiary();
                    break;
                case 2:
                    new Vaccination();
                    break;
                case 3:
                    break mainWhile;
                default:
                    System.out.println("please enter a proper choice number");
            }
        }
    }
}
