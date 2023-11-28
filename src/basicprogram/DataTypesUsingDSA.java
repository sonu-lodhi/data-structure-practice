package basicprogram;

import java.util.Scanner;

public class DataTypesUsingDSA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any value in ltr : ");
        float ltr = sc.nextFloat();
        float unitCal = unitCalculator(ltr);
        System.out.println("Value in gram is : "+unitCal +" gram");

    }

    private static float unitCalculator(float ltr) {
        float weight = ltr*1000;

        return weight;
    }
}
