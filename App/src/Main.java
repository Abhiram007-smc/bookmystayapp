/**
 * CLASS - bookmystayapp
 * Main class to run UC3: Centralized Room Inventory
 */

public class Main {

    public static void main(String[] args) {

        // Create inventory object
        RoomInventory inventory = new RoomInventory();

        // Add room types
        inventory.addRoomType("Single", 10);
        inventory.addRoomType("Double", 5);
        inventory.addRoomType("Suite", 2);

        // Display inventory
        inventory.displayInventory();

        // Check availability
        System.out.println("\nAvailable Single Rooms: " +
                inventory.getAvailability("Single"));

        // Update availability
        inventory.updateAvailability("Double", 3);

        // Display updated inventory
        System.out.println("\nAfter Update:");
        inventory.displayInventory();
    }
}