import static java.lang.Math.log;

public class IterCalculator {
    public static int RelaxCount(double eps) {
        double z0 = 1;
        double q = 0.782608696;
        return (int)(log(z0/eps)/log(1/q)) + 1;
    }

    public static int NewtonCount(double eps) {
        double dist = 0.25;
        double q = 0.325269854;
        return (log2(log(dist / eps) / (log(1 / q))) + 1) + 1;
    }

    public static int SimpleIterCount(double eps) {
        double differ = 0.5;
        double q = 0.042;
        return (int) (log(differ/(eps*(1-q)))/log(1/q)) + 1;
    }

    private static int log2(double N) {
        return (int)(Math.log(N) / Math.log(2));
    }
}
