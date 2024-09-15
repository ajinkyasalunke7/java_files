import java.util.Scanner;

public class Bag {
   private String color;
   private int weight;

   public Bag() {
      this.color = "Red";
      this.weight = 10;
   }

   public Bag(String color, int weight) {
      this.color = color;
      this.weight = weight;
   }

   public Bag(String color) {
      this.color = color;
      this.weight = 20; // Default
   }

   public Bag(int weight) {
      this.color = "Blue"; // Defult
      this.weight = weight;
   }

   public void displayData() {
      System.out.println("Color is: " + this.color + "\tWeight is: " + this.weight);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // int number_of_balls;
      // System.out.print("Enter no. of balls to take: ");
      // number_of_balls = Integer.parseInt(sc.nextLine());

      Bag[] b = new Bag[10];
      while (true) {
         System.out.println("________Menu_______");
         System.out.println("1. Add balls in a bag: ");
         System.out.println("2. Display all balls in a bag: ");
         System.out.println("3. Exit program");
         System.out.print("Enter your choice code: ");

         int option = sc.nextInt();
         switch (option) {
         case 1:
            System.out.println("Here are 4 types of balls: ");
            System.out.println("1. Default type: ");
            System.out.println("2. Take parameter: ");
            System.out.println("3. Take color and weight default: ");
            System.out.println("4. Take weight and color default: ");
            System.out.println("5. Got to back menu: ");
            System.out.print("Enter your choice code: ");
            int add_option = sc.nextInt();
            int current_add_count = 1;
            do{

            switch (add_option) {
            case 1:
               b[current_add_count] = new Bag();
               current_add_count++;
               break;

            case 2:
            String color_2;   
            int weight_2;
            System.out.print("Enter color: ");
            color_2 = sc.nextLine();
            System.out.print("Enter weight: ");
            weight_2= sc.nextInt();
               b[current_add_count] = new Bag(color_2, weight_2);
               current_add_count++;
               break;
            case 3:
               String color_3;

               System.out.print("Enter only color: ");
               color_3 = sc.nextLine();
               b[current_add_count] = new Bag(color_3);
               current_add_count++;
               break;
            case 4:
               System.out.print("Enter only weight: ");
               int weight_4 = sc.nextInt();

               b[current_add_count] = new Bag(weight_4);
               current_add_count++;
               break;
            case 5:

            default:
            System.out.println("Invalid case!!");
               break;
            }
   }while(add_option == 5);


        case 2:
        for(int i = 0; i<10; i++){
            b[i].displayData();
        }
        break;

        case 3:
        System.exit(0); 

         default:
         System.out.println("Invalid choice!!");
            break;
         }

      }

      // b[0] = new Bag();
      // b[1] = new Bag("Pink", 30);
      // b[2] = new Bag("Green");
      // b[3] = new Bag(30);
    //   int count = 1;
    //   for (int i = 0; i < 4; i++) {
    //      System.out.print(count + ". ");
    //      b[i].displayData();
    //      count++;
    //   }

      // Bag b1 = new Bag();
      // Bag b2 = new Bag("Pink", 30);
      // Bag b3 = new Bag("Green");
      // Bag b4 = new Bag(30);

      // b1.displayData();
      // b2.displayData();
      // b3.displayData();
      // b4.displayData();

   }
}