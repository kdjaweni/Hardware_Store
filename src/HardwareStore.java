import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.Scanner;

public class HardwareStore {
    public static void main(String[] args) {

        double width, length, perimeter, cost, totalCost;
        int woodenCost = 25;
        int chainCost = 15;
        int gateCost = 150;
        int buildingPermit = 50;




        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the width of your fence in foot");
        width = keyboard.nextDouble();
        System.out.println("What is the length of your fence in foot");
        length = keyboard.nextDouble();
        System.out.println("Do you want a wooden fence y/n ");
        char wooden = keyboard.next().charAt(0);

        perimeter = (width + length) * 2;

        if (wooden == 'y') {
            cost = ((perimeter * 25) + 150);
            totalCost = (cost + (cost * 0.06)) + 50;
            System.out.println(" The total price is  :" + "$" +totalCost);
        } else if (wooden == 'n') {
            cost = ((perimeter * 15) + 150);
            totalCost = (cost + (cost * 0.06)) + 50;
            System.out.println(" The total price is :" + totalCost);

        }
    }
}
