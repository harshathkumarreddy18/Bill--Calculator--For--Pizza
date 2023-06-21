import java.util.Scanner;

public class pizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display Pizza Options
        System.out.println("Pizza Options");
        System.out.println("1. Normal\nClassic hand tossed thin crust Pizzas");
        System.out.println("Vegetarian:\n\tTomatoes, Capsicum, Onlions and Corns.");
        System.out.println("Non-Vegetarian:\n\tGrilled Chicken Rashers, Peri-Peri Chicken, Onion, Capsicum");
        System.out.println("2. Delux\nClassic hand tossed Cheese Bust Pizzas");
        System.out.println("Vegetarian:\n\tCrunchy onions, crispy capsicum, succulent mushrooms, juicy tomatoes, liberal sprinkling of exotic Mexican herbs and golden corn to top it all.");
        System.out.println("Non-Vegetarian:\n\tThe wholesome flavour of tandoori masala with Chicken tikka I onion I red paprika I mint mayo\n");
        
        // Get Pizza Choice
        System.out.print("Your Choice [normal/delux]: ");
        String pizzaChoice = scanner.nextLine();
        
        // Get Pizza Type (Vegetarian/Non-Vegetarian)
        System.out.println("\nSelect:\na. Vegetarian\nb. Non Vegetarian");
        System.out.print("Your Choice [a or b]: ");
        String pizzaType = scanner.nextLine();
        
        
        System.out.println("\nLet us select the extras now - ");
        System.out.print("Do you want Extra Cheese? [true/false]: ");
        boolean extraCheese = scanner.nextBoolean();
        System.out.print("Do you want Extra Toppings? [true/false]: ");
        boolean extraToppings = scanner.nextBoolean();
        System.out.print("Do you want WaterBottle? [true/false]: ");
        boolean waterBottle = scanner.nextBoolean();
        int waterBottleQuantity = 0;
        if (waterBottle) {
            System.out.print("How many bottles?: ");
            waterBottleQuantity = scanner.nextInt();
        }
        System.out.print("Do you want Ketchup? [true/false]: ");
        boolean ketchup = scanner.nextBoolean();
        int ketchupQuantity = 0;
        if (ketchup) {
            System.out.print("How many Packets?: ");
            ketchupQuantity = scanner.nextInt();
        }
        System.out.print("Do you want SoftDrinks? [true/false]: ");
        boolean softDrinks = scanner.nextBoolean();
        int softDrinksQuantity = 0;
        if (softDrinks) {
            System.out.print("How many Cans?: ");
            softDrinksQuantity = scanner.nextInt();
        }
        System.out.print("Do you want Take Away? [true/false]: ");
        boolean takeAway = scanner.nextBoolean();
        
        // Calculate Bill Amount
        double basePrice = 0;
        if (pizzaChoice.equals("normal")) {
            if (pizzaType.equals("a")) {
                basePrice = 600;
            } else {
                basePrice = 400;
            }
        } else {
            if (pizzaType.equals("a")) {
                basePrice = 500;
            } else {
                basePrice = 600;
            }
        }
        double extraCheesePrice = 0;
        if (extraCheese) {
            extraCheesePrice = 100;
        }
        double extraToppingsPrice = 0;
        if (extraToppings) {
            extraToppingsPrice = 100;
        }
        double waterBottlePrice = 0;
        if (waterBottle) {
            waterBottlePrice = 20;
            waterBottlePrice= waterBottleQuantity*waterBottlePrice;

        }
        double ketchupPrice = 0;
        if (ketchup) {
            ketchupPrice = 5;
            ketchupPrice = ketchupQuantity*ketchupPrice;
        }
        double softDrinksPrice = 0;
        if (softDrinks) {
            softDrinksPrice = 75;
            softDrinksPrice =softDrinksQuantity*softDrinksPrice;
        }
        double takeAwayPrice = 0;
        if (takeAway) {
            takeAwayPrice = 20;
        }
        double total = basePrice+extraCheesePrice+extraToppingsPrice+waterBottlePrice+ketchupPrice+softDrinksPrice+takeAwayPrice;
        double tax=total*0.18;
        int x =(int)tax;
        double temp=total+x;
        System.out.println("*********** ********** BILL COPY ********** **********");
        System.out.println("               Base Pizza Price: 		      "+basePrice);
        System.out.println("           Extra Cheese Charges: 	              "+extraCheesePrice);
        System.out.println("         Extra Toppings Charges: 		      "+extraToppingsPrice);
        System.out.println("      Extra WaterBottle Charges: 	              "+waterBottlePrice);
        System.out.println("          Extra Ketchup Charges: 		      "+ketchupPrice);
        System.out.println("       Extra SoftDrinks Charges:		      "+softDrinksPrice );
        System.out.println("Extra Bag Charges for take away: 	              "+takeAwayPrice);
        System.out.println("*********** ********** ********** ********** **********");
        System.out.println("        Bill Amount has come to: 		      "+total);
        System.out.println("          Adding the Tax Amount: 		      "+x);
        System.out.println("*********** ********** ********** ********** **********");
        System.out.println("             Net Amount Payable: 		      "+temp);
        System.out.println("*********** ********** ********** ********** **********");

}
}

        
        
