import static java.lang.Math.*;

public class Methods {
    private static final String header = """
                     n\txn""";

    public static void runRelaxation(double eps) {
        double x0 = -2, x1 = 0;
        int n = 0;
        System.out.println(header);
        System.out.println(n + "\t" + x0);
        while (abs(x0 - x1) > eps) {
            n++;
            x1 = x0;
            x0 = it(x0);
            System.out.println(n + "\t" + x0);

        }
    }

    private static double it(double x0) {
        return x0 - 0.0555555555555556 * (pow(x0, 3) - 6 * pow(x0, 2) + 5 * x0 + 12);
    }

    public static void runNewton(double eps) {
        //x^3 + 3x^2 - x - 3 = 0
        double x1 = 1.25, x0 = 1.25;
        int n = 0;
        System.out.println(header);
        System.out.println(n + "\t" + x1);
        while (true) {
            n++;
            double f = fx(x0) / dfx(x0);
            x1 = x0 - f;
            System.out.println(n + "\t" + x1);
            if (abs(x1 - x0) < eps) break;
            x0 = x1;
        }
    }

    private static double fx(double x) {
        //x^3 + 3x^2 - x - 3
        return (pow(x, 3) + 3 * pow(x, 2) - x - 3);
    }

    private static double dfx(double x) {
        //3x^2 + 6x - 1
        return (3 * pow(x, 2) + 6 * x - 1);
    }

    public static void runSimpleIter(double eps) {
        //x^3 + x^2 - 4x - 4 = 0
        double x0 = 2.25, x1;
        int n = 0;
        System.out.println(header);
        System.out.println(n + "\t" + x0);
        while (true) {
            n++;
            x1 = pow((-pow(x0,2) + 4*x0 + 4), 1.0/3);
            System.out.println(n + "\t" + x1);
            if (abs(x1 - x0) < eps) break;
            x0= x1;
        }
    }
}
