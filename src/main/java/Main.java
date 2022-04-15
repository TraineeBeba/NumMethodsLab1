import java.util.Scanner;

public class Main {
    public static Double eps = 0.001;
    private static final String METHOD_CHOICE = """
            Which method example you want to run?
            1 relaxation method
            2 Newton's method
            3 simple iteration method
                        
            Let's try this one:""";
    private static final String E_CHOICE = """
            Now E = 0.001
            Do you want to change E ?
            1 YES
            0 NO""";

    public static void main(String[] args) {
        System.out.print(METHOD_CHOICE);
        Scanner input = new Scanner(System.in);
        int metChoice = input.nextInt();
        System.out.println("_____________________________");

        System.out.println(E_CHOICE);
        int eChoice = input.nextInt();
        if (eChoice == 1) {
            System.out.print("Enter E:");
            eps = input.nextDouble();
            System.out.println("_____________________________");
        }

        switch (metChoice) {
            case (1) -> {
                IterPrinter.RelaxCount(eps);
                Methods.runRelaxation(eps);
            }
            case (2) -> {
                IterPrinter.NewtonCount(eps);
                Methods.runNewton(eps);
            }
            case (3) -> {
                IterPrinter.SimpleIterCount(eps);
                Methods.runSimpleIter(eps);
            }
        }
    }
}
