package lab.template;


import java.util.logging.Logger;

/**
 * @author mihai.hulea
 */
public class Example {

    public static Logger LOG = Logger.getLogger(Example.class.getName());

    /**
     * Add x and y.
     *
     * @param x
     * @param y
     * @return result of the sum.
     */
    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static float divide(float x, float y) {
        return x / y;
    }

    public static void main(String[] args) {
        System.out.println("It works!");
        LOG.info("It works!");
        System.out.println("Number of arguments received: " + args.length + " ");

        for (String arg : args) {
            System.out.println("Argument: " + arg);
        }

        System.out.printf("Result of adding %d with %d is: %d\n\n", 10, 23, Example.add(10, 23));
        System.out.printf("Result of subtracting %d with %d is: %d\n\n", 10, 23, Example.subtract(10, 23));
        System.out.printf("Result of multiplying %d with %d is: %d\n\n", 10, 23, Example.multiply(10, 23));
        System.out.printf("Result of dividing %f with %f is: %f\n\n", 10.0, 23.0, Example.divide(10, 23));
    }
}
