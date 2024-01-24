public class AppleStore {
    public static void main(String[] args) {
        int apples = 0, customers = 0;
        apples += 500;

        double price = 0.4;
        double profit = 0.0;

        apples -= 4;
        profit += 4*price;
        customers++;

        apples -= 20;
        profit += 20*price;
        customers++;

        apples -= 200;
        profit += 200*price;
        customers++;


        System.out.println(" Wow! So far, you made: $" + profit);
        System.out.println(customers + " customers love your apples.");
        System.out.println("You have " + apples + " apples left. We'll sell more tomorrow!");


    }
}
