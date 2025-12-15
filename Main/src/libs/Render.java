package libs;

public class Render {
    lookupDistance looker = new lookupDistance(1);


    private int screenX;
    private int screenY;



    // Constructor
    public Render(int screenX1, int screenY1)
    {
        screenX = screenX1;
        screenY = screenY1;
    }

    // Set the Render multiplier
    public void setMultiplier(double multiplier)
    {
        looker.setMultiplier(multiplier);

    }
    // return the render multiplier
    public double getMultiplier()
    {
        return looker.getMultiplier();

    }


    public void clearScreen()
    {
        // Clear the console for IntelliJ IDEA
        System.out.print("\033[H\033[2J");
    }

    // Render a frame via {@screenX} and {@screenY}
    public void renderFrame() {

    }



}
