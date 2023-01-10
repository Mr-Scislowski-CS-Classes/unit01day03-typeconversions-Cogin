public class TrigIdentity {
    public static void main(String[] args) {

        double i = 
        Math.pow(Math.sin(Double.parseDouble(args[0])),2) + 
        Math.pow(Math.cos(Double.parseDouble(args[0])),2);

        System.out.println("The value is: " + i);
    }
}
