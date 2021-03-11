import java.util.Scanner;

class calculator {
    public static void main(String[] args) {
        System.out.println("This is a calculator test");
        menu();
    }

    // method overload 
    public static double add(double x, double y) {
        double results = x + y;
        return results;
    }

    // method that minus two digits
    public static double subtract(double x, double y) {
        double results = x - y;
        return results;
    }

    // function that multiplies two digits
    public static double multiply(double x, double y)
    {
        double results = x * y;
        return results;
    }

    // function that divides two digits
    public static double divide(double x, double y)
    {
        double results = x / y;
        return results;
    }

    public static void displayResult(double result)
    {
        System.out.println("Result:" + result);
        System.out.println();
    }

    public static void menu()
    {
        Scanner sc = new Scanner(System.in);
        double result = 0.0;
        boolean exit = false;
        while(!exit)
        {
            System.out.println("----------");
            System.out.println("Calculator");
            System.out.println("----------");
            System.out.println("Please enter the first digit");
            double first = sc.nextDouble();
            System.out.println("Please enter the second digit");
            double second = sc.nextDouble(); 
            System.out.println("Please select a function");
            System.out.println("1.\tAddition\n2.\tSubtraction\n3.\tMultiplication\n4.\tDivision\nE.\tExit");
            String input = sc.next();
            System.out.println();
            switch(input)
            {
                case("1"):
                    result = add(first,second);
                    displayResult (result);
                    break;
                case("2"):
                    result = subtract(first,second);
                    displayResult (result);
                    break;
                case("3"):
                    result = multiply(first,second);
                    displayResult (result);
                    break;
                case("4"):
                    result = divide(first,second);
                    displayResult (result);
                    break;
                case("E"):
                    System.out.println("GoodBye"); 
                    exit = true;
                    break;
                default:
                    System.out.println("Please enter a valid input");
                    break;
            }
        }
        sc.close();
    }
}
