public class Quadratic {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        if (Double.isNaN(x1) || Double.isNaN(x2)) {
            System.out.println("No answers found to the quadratic equation.");
            System.exit(0);
        }

        System.out.println(String.format("The Answers to the quadratic equation with a=%s, b=%s, c=%s are: ", args[0],args[1],args[2])+ x1 + " and " + x2);
    }
}
