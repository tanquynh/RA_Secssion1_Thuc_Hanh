package RA_Secssion1_TH3;
import java.util.Scanner;
public class Th3 {
    public static void main(String[] args) {
        float height;
        float weight;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height:");
        height = scanner.nextFloat();
        System.out.println("Enter the weight:");
        weight = scanner.nextFloat();
        float area = height * weight;
        System.out.println("The area is "+ area);

    }


}
