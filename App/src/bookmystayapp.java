import java.util.ArrayList;
import java.util.List;

/**
 * CLASS - AddOnServiceManager
 * Manages optional services for a reservation.
 */

public class bookmystayapp {

    // List to store services
    private List<AddOnService> services;

    // Constructor
    public bookmystayapp() {
        services = new ArrayList<>();
    }

    // Add a service
    public void addService(AddOnService service) {
        services.add(service);
        System.out.println(service.getServiceName() + " added.");
    }

    // Remove a service
    public void removeService(String serviceName) {
        services.removeIf(service -> service.getServiceName().equalsIgnoreCase(serviceName));
        System.out.println(serviceName + " removed.");
    }

    // Calculate total cost
    public double calculateTotalCost() {
        double total = 0;
        for (AddOnService service : services) {
            total += service.getCost();
        }
        return total;
    }

    // Display all services
    public void displayAllServices() {
        if (services.isEmpty()) {
            System.out.println("No services added.");
            return;
        }

        for (AddOnService service : services) {
            service.displayService();
        }
    }
}