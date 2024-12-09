package edu.bu.met.cs665.DeliverySystem;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/11/2024
 * File Name: Shop.java
 * Description: The Shop class implements the DeliveryObservable interface.
 * It manages the list of drivers and notifies them about delivery requests.
 */
public class Shop implements DeliveryObservable {

    private static final Logger logger = Logger.getLogger(Shop.class.getName());

    // List to store the registered drivers
    private List<Observer> drivers;

    /**
     * Constructor that initializes the Shop with an empty list of drivers.
     */
    public Shop() {
        this.drivers = new ArrayList<>();
    }

    @Override
    public void addDriver(Observer driver) {
        if (!drivers.contains(driver)) {
            drivers.add(driver);
            if (driver instanceof Driver) {
                logger.info("Driver added: " + ((Driver) driver).getName());
            }
        } else {
            if (driver instanceof Driver) {
                logger.info("Driver already added: " + ((Driver) driver).getName());
            }
        }
    }

    @Override
    public void removeDriver(Observer driver) {
        if (drivers.remove(driver)) {
            if (driver instanceof Driver) {
                logger.info("Driver removed: " + ((Driver) driver).getName());
            }
        } else {
            logger.info("Driver not found.");
        }
    }

    @Override
    public void notifyDrivers(DeliveryRequest deliveryRequest) {
        for (Observer driver : drivers) {
            driver.receiveUpdatedMessage(deliveryRequest);
        }
    }

    /**
     * Create and send a delivery request message to all drivers.
     * This method acts as the business logic holder instead of being in the interface.
     *
     * @param deliveryRequestMessage The message of the delivery request.
     */
    public void createAndSendRequest(String deliveryRequestMessage) {
        DeliveryRequest deliveryRequest = new DeliveryRequest(deliveryRequestMessage);
        notifyDrivers(deliveryRequest);
    }

    /**
     * Gets the list of registered drivers.
     *
     * @return The list of observers (drivers).
     */
    public List<Observer> getDrivers() {
        return drivers;
    }
}
