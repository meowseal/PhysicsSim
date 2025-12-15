import libs.lookupDistance;
import libs.Objects.*;
import libs.Render;





public class Main {
    // Objects and Lookers
    static lookupDistance looker = new lookupDistance(5);
    static Circle shape = new Circle(3,5,0,0);
    static Render loader = new Render(10,10);



    // Main
    public static void main(String[] args)
        {
            loader.setMultiplier(looker.getMultiplier());

            // Set Distance Multiplier to 3
            looker.setMultiplier(3.0);

            loader.clearScreen();
            System.out.println(looker.getChar(30));
            System.out.println(looker.getChar(3));
            loader.clearScreen();

            System.out.println(loader.getMultiplier());



        }
}