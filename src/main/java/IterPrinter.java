public class IterPrinter {
    public static void RelaxCount(double eps) {
        int count = IterCalculator.RelaxCount(eps);
        System.out.println("Max iter count is: " + count);
    }

    public static void NewtonCount(double eps) {
        int count = IterCalculator.NewtonCount(eps);
        System.out.println("Max iter count is: " + count);
    }

    public static void SimpleIterCount(double eps) {
        int count = IterCalculator.SimpleIterCount(eps);
        System.out.println("Max iter count is: " + count);
    }
}
