class DoubleOps {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        

        System.out.println("\n\n\nThe Absolute Value of the first number is: " + Math.abs(i));
        System.out.println("The Absolute Value of the second number is: " + Math.abs(j));
        System.out.println("The first number raised to the power of the second number is: " + Math.pow(i, j));
        System.out.println("The square root of the first number is: " + Math.sqrt(i));
        System.out.println("A random number for fun: " + (int)((Math.random()) * 10));
        System.out.println("\n\n");
    }
}