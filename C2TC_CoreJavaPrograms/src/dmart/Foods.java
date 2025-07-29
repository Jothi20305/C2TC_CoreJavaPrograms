package dmart;

public class Foods implements Dmart{
	@Override
    public void displayItems() {
        System.out.println("Welcome to the Food Section!");
        System.out.println("Available items: Rice, Fruits, Vegetables, Snacks");
    }
}
