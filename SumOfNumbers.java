import java.util.Scanner;
class SumOfNumbers{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter one number: ");
        String number = sc.nextLine();

        int sum = 0;
        for(char p: number.toCharArray()){
            sum += Character.getNumericValue(p);
        }
        System.out.println("Sum of numbers: " + sum);
        sc.close();

    }

}