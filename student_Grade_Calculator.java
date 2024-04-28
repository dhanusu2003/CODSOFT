import java.util.Scanner;
public class student_Grade_Calculator {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Number of Subject");
        int n = s.nextInt();
        int[] a = new int[n];
        int sum = 0, count = 1;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the subject " + count + " Mark");
            a[i] = s.nextInt();
            if (a[i] <= 100) {
                sum = sum + a[i];
                count += 1;
            } else {
                System.out.println("Enter the Correct Value The Mark must be 0<=Mark<=100");
                i--;
            }
        }
        System.out.println("Your Total is " + sum);
        float avg = sum / (float) n;
        System.out.println("Your Average is " + avg);
        if (avg >= 91 && avg <= 100) {
            System.out.println("Your overall Grade is O");
        }
        if (avg >= 81 && avg <= 90) {
            System.out.println("Your overall Grade is A+");
        }
        if (avg >= 71 && avg <= 80) {
            System.out.println("Your overall Grade is A");
        }
        if (avg >= 61 && avg <= 70) {
            System.out.println("Your overall Grade is B+");
        }
        if (avg >= 51 && avg <= 60) {
            System.out.println("Your overall Grade is B");
        }
        if (avg == 50) {
            System.out.println("Your overall Grade is C");
        }
        if (avg < 50) {
            System.out.println("Your overall Grade is U \n*********** You wants to Focus on Your Study **********");
        }
    }
}