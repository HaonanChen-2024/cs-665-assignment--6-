package edu.bu.met.cs665.DeliverySystem;

import edu.bu.met.cs665.DeliverySystem.*;

import java.util.logging.Logger;

/**
 * Main entry point to test the Delivery System.
 */
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        // Create a shop
        Shop shop = new Shop();

        // Create drivers
        Driver driver1 = new Driver("Alice");
        Driver driver2 = new Driver("Bob");
        Driver driver3 = new Driver("Charlie");
        Driver driver4 = new Driver("David");
        Driver driver5 = new Driver("Eve");

        // Add drivers to the shop
        shop.addDriver(driver1);
        shop.addDriver(driver2);
        shop.addDriver(driver3);
        shop.addDriver(driver4);
        shop.addDriver(driver5);

        // Send a delivery request
        shop.createAndSendRequest("Deliver to 123 Main St.");

        // Print received messages for each driver
        driver1.printRequests();
        driver2.printRequests();
        driver3.printRequests();
        driver4.printRequests();
        driver5.printRequests();

        // Remove a driver and send another request
        shop.removeDriver(driver3);
        shop.createAndSendRequest("Deliver to 456 Oak St.");

        // Print received messages again
        driver1.printRequests();
        driver2.printRequests();
        driver4.printRequests();
        driver5.printRequests();
    }
}
