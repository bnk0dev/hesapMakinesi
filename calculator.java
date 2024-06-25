package Calculator;
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int x, y, z, resInt;
            double a, b, resDouble;
            boolean exitloop = false;
    
            while (!exitloop) {
                String select = "****************\nWelcome to Calculator!\n****************\nSelect Action: \n1. Use 2 numbers\n2. Use 3 numbers \n3. Exit";
                System.out.println(select);
                int choice = scan.nextInt();
    
                switch (choice) {
                    case 1:
                        while (!exitloop) {
                            String process = "Select Operation:\n1 - Addition(+)\n2 - Subtraction(-)\n3 - Multiplication(*)\n4 - Division(/)\n5 - Exit";
                            System.out.println(process);
                            int sec = scan.nextInt();
                            switch (sec) {
    
                                case 1:
                                    System.out.println("Enter first number:");
                                    x = scan.nextInt();
                                    System.out.println("Enter second number:");
                                    y = scan.nextInt();
                                    resInt = additionOne(x, y);
                                    System.out.println("Result: " + resInt);
                                    break;
    
                                case 2:
                                    System.out.println("Enter first number:");
                                    x = scan.nextInt();
                                    System.out.println("Enter second number:");
                                    y = scan.nextInt();
                                    resInt = subtractionOne(x, y);
                                    System.out.println("Result: " + resInt);
                                    break;
    
                                case 3:
                                    System.out.println("Enter first number:");
                                    x = scan.nextInt();
                                    System.out.println("Enter first number:");
                                    y = scan.nextInt();
                                    resInt = multiplicationOne(x, y);
                                    System.out.println("Result: " + resInt);
                                    break;
    
                                case 4:
                                    System.out.println("Enter first number:");
                                    a = scan.nextDouble();
                                    System.out.println("Enter first number:");
                                    b = scan.nextDouble();
                                    resDouble = divisionOne(a, b);
                                    System.out.println("Result: " + resDouble);
                                    break;
    
                                case 5:
                                    System.out.println("Exiting...");
                                    exitloop = true;
                                    break;
    
                                default:
                                    System.out.println("enter numbers in the specified range!");
                                    break;
                            }
                        }
                        break;
    
                    case 2:
                        while (!exitloop) {
                            String process = "Select Operation:\n1 - Addition(+)\n2 - Subtraction(-)\n3 - Multiplication(*)\n4 - Division(/)\n5 - Exit";
                            System.out.println(process);
                            int sec = scan.nextInt();
                            switch (sec) {
                                case 1:
                                    System.out.println("Enter first number:");
                                    x = scan.nextInt();
                                    System.out.println("Enter second number:");
                                    y = scan.nextInt();
                                    System.out.println("Enter third number:");
                                    z = scan.nextInt();
                                    resInt = additionTwo(x, y, z);
                                    System.out.println("Result: " + resInt);
                                    break;
    
                                case 2:
                                    System.out.println("You can't subtract three numbers from each other!");
                                    break;
    
                                case 3:
                                    System.out.println("Enter first number:");
                                    x = scan.nextInt();
                                    System.out.println("Enter second number:");
                                    y = scan.nextInt();
                                    System.out.println("Enter third number:");
                                    z = scan.nextInt();
                                    resInt = multiplicationTwo(x, y, z);
                                    System.out.println("Result: " + resInt);
                                    break;
    
                                case 4:
                                    System.out.println("division is only valid for 2 numbers");
                                    break;
    
                                case 5:
                                    System.out.println("Exiting...");
                                    exitloop = true;
                                    break;
    
                                default:
                                    System.out.println("enter numbers in the specified range!");
                                    break;
                            }
                        }
                        break;
    
                    case 3:
                        exitloop = true;
                        break;
    
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                        break;
                }
            }
            scan.close();
        }
    
        public static int additionOne(int num1, int num2) {
            return num1 + num2;
        }
    
        public static int additionTwo(int num1, int num2, int num3) {
            return num1 + num2 + num3;
        }
    
        public static int subtractionOne(int num1, int num2) {
            return num1 - num2;
        }
    
        public static int multiplicationOne(int num1, int num2) {
            return num1 * num2;
        }
    
        public static int multiplicationTwo(int num1, int num2, int num3) {
            return num1 * num2 * num3;
        }
    
        public static double divisionOne(double num1, double num2) {
            return num1 / num2;
        }
    
    }