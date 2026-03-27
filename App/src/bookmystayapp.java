/**
 * CLASS - AddOnService
 * Represents an optional service that can be added to a reservation.
 */

public class bookmystayapp {

    // Name of the service
    private String serviceName;

    // Cost of the service
    private double cost;

    // Constructor
    public bookmystayapp(String serviceName, double cost) {
        this.serviceName = serviceName;
        this.cost = cost;
    }

    // Getter for service name
    public String getServiceName() {
        return serviceName;
    }

    // Getter for cost
    public double getCost() {
        return cost;
    }

    // Display method (optional but useful)
    public void displayService() {
        System.out.println("Service: " + serviceName + ", Cost: ₹" + cost);
    }
}