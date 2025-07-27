import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class App {
    // DecimalFormat to format floating-point numbers to 10 decimal places
    static DecimalFormat df = new DecimalFormat("0.0000000000");

    public static void main(String[] args) throws Exception {
        // Scanner to read input from the console
        Scanner scanner = new Scanner(System.in);

        //Variable declaration
        ArrayList<Double> x = new ArrayList<Double>();
        ArrayList<Double> y = new ArrayList<Double>();
        String invalidInput;
        double k, t, result, a, b;
        int option, choice, i, n, voltar;
        boolean continueProgram = true;

        System.out.println("Initializing the program...");
        
        while(continueProgram) {
            System.out.println("Please choose an option: ");
            System.out.println("1 - Find the lagrange polynomial");
            System.out.println("2 - Solve an integral using the trapezoid method");
            System.out.println("3 - Solve an integral using the simpson method");
            System.out.println("4 - Leave");

            try {
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                    do {
                        x.clear();
                        y.clear();

                        System.out.println("Please enter the values of x. Type 'e' to exit.");

                        while(true) {
                            try {
                                x.add(scanner.nextDouble());
                            } catch (InputMismatchException e){
                                invalidInput = scanner.next();

                                if (invalidInput.equalsIgnoreCase("e")) {
                                    break;
                                } else {
                                    System.out.println("Invalid input. Please enter an float or 'q'.");
                                }
                            }
                        }

                        System.out.println("Now enter the values of f(x). type 'e' to exit.");

                        while (true) {
                            try {
                                y.add(scanner.nextDouble());
                            } catch (InputMismatchException e){
                                invalidInput = scanner.next();

                                if (invalidInput.equalsIgnoreCase("e")) {
                                    break;
                                } else {
                                    System.out.println("Invalid input. Please enter a float or 'q'.");
                                }
                            }
                        }

                        if (x.size() != y.size()) {
                            System.out.println("Error! x and f(x) does not have the same quantity. Try again.");
                        }
                    } while (x.size() != y.size());

                    do {
                        System.out.print("Pleaser enter the value of t to calculate the lagrange polynomial :");
                        t = scanner.nextDouble();

                        if(t < x.getFirst() || t > x.getLast()) {
                            System.out.println("Error! t must be inside the interval of x given. Try again.");
                        }
                    } while(t < x.getFirst() || t > x.getLast());

                    break;

                    case 4:
                    System.out.println("Exiting...");
                    continueProgram = false;
                    break;
                
                    default:
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid option.");
                scanner.nextInt(); // Clear the invalid input
                // Loop back to the menu
            }
        }

        scanner.close();
    }

    public static double lagrange(ArrayList<Double> x, ArrayList<Double> y, double t){
        //To implement...
        return 0;
    }
}
