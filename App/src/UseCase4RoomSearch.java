import java.util.*;

/**
 * UC4: Room Search & Availability Check
 */

public class UseCase4RoomSearch {

    public static void main(String[] args) {

        // Inventory setup (UC3)
        RoomInventory inventory = new RoomInventory();
        inventory.addRoomType("Single", 10);
        inventory.addRoomType("Double", 0);
        inventory.addRoomType("Suite", 2);

        // Room details
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room("Single", 2000));
        rooms.add(new Room("Double", 3500));
        rooms.add(new Room("Suite", 5000));

        // Search
        RoomSearch search = new RoomSearch(inventory, rooms);
        search.searchAvailableRooms();
    }
}

// Room class
class Room {
    private String type;
    private double price;

    public Room(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void displayRoom() {
        System.out.println(type + " | Price: " + price);
    }
}

// RoomInventory class
class RoomInventory {
    private Map<String, Integer> inventory;

    public RoomInventory() {
        inventory = new HashMap<>();
    }

    public void addRoomType(String roomType, int count) {
        inventory.put(roomType, count);
    }

    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }
}

// RoomSearch class
class RoomSearch {
    private RoomInventory inventory;
    private List<Room> rooms;

    public RoomSearch(RoomInventory inventory, List<Room> rooms) {
        this.inventory = inventory;
        this.rooms = rooms;
    }

    public void searchAvailableRooms() {
        System.out.println("\nAvailable Rooms:");

        for (Room room : rooms) {
            int available = inventory.getAvailability(room.getType());

            if (available > 0) {
                room.displayRoom();
                System.out.println("Available: " + available);
                System.out.println("-------------------");
            }
        }
    }
}