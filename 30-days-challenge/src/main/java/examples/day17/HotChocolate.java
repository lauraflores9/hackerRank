package examples.day17;

/*
    Example used in tutorial: https://youtu.be/9TuoE16Tlac
 */

import java.util.concurrent.TimeUnit;

public class HotChocolate {

    public static final double tooHot = 185;
    public static final double tooCold = 160;

    public static void drinkHotChocolate(double cocoaTemp) throws TemperatureException{
        if (cocoaTemp >= tooHot) throw new TooHotException();
        else if (cocoaTemp <= tooCold) throw new TooColdException();
    }

    public static void main(String args[]) throws TemperatureException, InterruptedException {
        double currentCocoaTemp = 100;
        try {
            drinkHotChocolate(currentCocoaTemp);
            System.out.println("That cocoa was good");
        } catch (TooHotException e1){
            System.out.println("That cocoa was too hot");
        } catch (TooColdException e2){
            System.out.println("That cocoa was too cold");
        }
        System.out.println("And it's gone");

        System.out.println("");
        double newCocoaTemp = 200;
        boolean wrongTemp = true;
        while (wrongTemp) {
            try {
                drinkHotChocolate(newCocoaTemp);
                System.out.println("That cocoa was good");
                wrongTemp = false;
            } catch (TooHotException e1){
                System.out.println("That cocoa was too hot");
                newCocoaTemp = newCocoaTemp - 5;
            } catch (TooColdException e2){
                System.out.println("That cocoa was too cold");
                newCocoaTemp = newCocoaTemp + 5;
            }
            TimeUnit.SECONDS.sleep(2);
        }
        System.out.println("And it's gone");
    }
}
