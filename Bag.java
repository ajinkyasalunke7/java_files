import java.util.Scanner;

public class Bag {
   private String color;
   private int weight;
   private static int total_object;
   private static int total_weight;

   public Bag() {
      this.color = "Red";
      this.weight = 10;
      total_object = total_object + 1;
      total_weight = total_weight + this.weight;
   }

   public Bag(String color, int weight) {
      this.color = color;
      this.weight = weight;
      total_object = total_object + 1;
      total_weight = total_weight + this.weight;
   }

   public Bag(String color) {
      this.color = color;
      this.weight = 20; // Default weight
      total_object = total_object + 1;
      total_weight = total_weight + this.weight;
   }

   public Bag(int weight) {
      this.color = "Blue"; // Default color
      this.weight = weight;
      total_object = total_object + 1;
      total_weight = total_weight + this.weight;
   }

   public void displayData() {
      System.out.println("Color is: " + this.color + "\tWeight is: " + this.weight);
   }

   public static void getTotalObject() {
      System.out.println("Total number of objects in bags: " + total_object);
   }
   public static void getTotalWeight() {
      System.out.println("Total weight of balls in bags: " + total_weight);
   }
   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Bag[] b = new Bag[10];
      int current_add_count = 0;

      while (true) {

         System.out.println("________Menu_______");
         System.out.println("1. Add balls to the collection");
         System.out.println("2. Display all balls in the collection");
         System.out.println("3. Display all objects in bags: ");
         System.out.println("4. Display total ball weight in bags: ");
         System.out.println("5. Exit program");
         System.out.print("Enter your choice code: ");

         int option = sc.nextInt();
         sc.nextLine();

         switch (option) {
         case 1:
            if (current_add_count >= b.length) {
               clearScreen();
               System.out.println("Bag collection is full!");
               break;
            }
            clearScreen();

            System.out.println("Here are 4 types of bags: ");
            System.out.println("1. Default type");
            System.out.println("2. Specify color and weight");
            System.out.println("3. Specify color with default weight");
            System.out.println("4. Specify weight with default color");
            System.out.println("5. Back to main menu");
            System.out.print("Enter your choice code: ");

            int add_option = sc.nextInt();
            sc.nextLine();

            switch (add_option) {
            case 1:
               b[current_add_count++] = new Bag();
               break;
            case 2:
               System.out.print("Enter color: ");
               String color2 = sc.nextLine();
               System.out.print("Enter weight: ");
               int weight2 = sc.nextInt();
               sc.nextLine();
               b[current_add_count++] = new Bag(color2, weight2);
               break;
            case 3:
               System.out.print("Enter color: ");
               String color3 = sc.nextLine();
               b[current_add_count++] = new Bag(color3);
               break;
            case 4:
               System.out.print("Enter weight: ");
               int weight4 = sc.nextInt();
               sc.nextLine();
               b[current_add_count++] = new Bag(weight4);
               break;
            case 5:
               break;
            default:
               System.out.println("Invalid option! Please try again.");
               break;
            }
            break;
         case 2:
            if (current_add_count == 0) {
               System.out.println("No balls to display.");
            } else {
               clearScreen();
               for (int i = 0; i < current_add_count; i++) {
                  b[i].displayData();
               }
            }
            break;
         case 3:
            clearScreen();
            getTotalObject();
            break;
         case 4:
            clearScreen();
            getTotalWeight();
            break;
         case 5:
            System.out.println("Exiting program.");
            sc.close();
            System.exit(0);
            break;
         default:
            System.out.println("Invalid choice! Please try again.");
            break;
         }
      }
   }
}