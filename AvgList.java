import java.util.Scanner;

public class AvgList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System. in );
        int count = 0;
        int sum = 0;
        String answer = "";
        do {
            System.out.print("Enter any number : ");
            int num = scan.nextInt();
            
            sum += num;

            System.out.println("do you want to continue?");
            answer = scan.next();
            count++;
        } while (answer.toLowerCase().equals("y"));

        System.out.println("Average: " + (sum/count));
    }
}
