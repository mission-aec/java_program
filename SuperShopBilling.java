import java.util.ArrayList;
import java.util.Scanner;

class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}

class Bill {
    private ArrayList<Item> items;
    private double totalAmount;

    public Bill() {
        this.items = new ArrayList<>();
        this.totalAmount = 0;
    }

    public void addItem(Item item) {
        items.add(item);
        totalAmount += item.getTotalPrice();
    }

    public void printBill() {
        System.out.println("--------------------");
        System.out.println("SuperShop Billing");
        System.out.println("--------------------");
        for (Item item : items) {
            System.out.println(item.getName() + " x " + item.getQuantity() + " = " + item.getTotalPrice());
        }
        System.out.println("--------------------");
        System.out.println("Total Amount: " + totalAmount);
    }
}

public class SuperShopBilling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bill bill = new Bill();

        // Create some sample items
        Item item1 = new Item("Rice", 10.0);
        Item item2 = new Item("Sugar", 5.0);
        Item item3 = new Item("Milk", 3.0);

        // Add items to the bill
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Rice");
            System.out.println("2. Add Sugar");
            System.out.println("3. Add Milk");
            System.out.println("4. View Bill");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter quantity of Rice: ");
                int quantity = scanner.nextInt();
                item1.setQuantity(quantity);
                bill.addItem(item1);
            } else if (choice == 2) {
                System.out.print("Enter quantity of Sugar: ");
                int quantity = scanner.nextInt();
                item2.setQuantity(quantity);
                bill.addItem(item2);
            } else if (choice == 3) {
                System.out.print("Enter quantity of Milk: ");
                int quantity = scanner.nextInt();
                item3.setQuantity(quantity);
                bill.addItem(item3);
            } else if (choice == 4) {
                bill.printBill();
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }
}