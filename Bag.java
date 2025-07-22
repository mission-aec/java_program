import java.util.ArrayList;

public class Bag {
    // Inner class to represent an item with a name and quantity
    private class Item {
        String name;
        int quantity;

        // Constructor for Item
        Item(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }
    }

    // ArrayList to store the items
    private ArrayList<Item> items;

    // Constructor for Bag
    public Bag() {
        items = new ArrayList<>();
    }


    // Method to add an item to the bag
    public void add(String itemName) {
        // Check if the item already exists in the bag
        for (Item item : items) {
            if (item.name.equals(itemName)) {
                // If it exists, increment the quantity
                item.quantity++;
                return;
            }
        }
        // If it doesn't exist, add a new item with quantity 1
        items.add(new Item(itemName, 1));
    }

    // Method to count how many times an item has been added
    public int count(String itemName) {
        for (Item item : items) {
            if (item.name.equals(itemName)) {
                // Return the quantity if the item is found
                return item.quantity;
            }
        }
        // Return 0 if the item is not found
        return 0;
    }


    // Main method for testing
    public static void main(String[] args) {
        Bag bag = new Bag();
        bag.add("apple");
        bag.add("banana");
        bag.add("apple");
        bag.add("orange");
        bag.add("banana");
        bag.add("apple");

        System.out.println("Count of apple: " + bag.count("apple"));
    }

}