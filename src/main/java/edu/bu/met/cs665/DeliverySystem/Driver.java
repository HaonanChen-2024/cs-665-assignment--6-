package edu.bu.met.cs665.DeliverySystem;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/11/2024
 * File Name: Driver.java
 * Description: Represents a driver (Observer) who receives and manages delivery requests.
 */
public class Driver implements Observer {

    private static final Logger logger = Logger.getLogger(Driver.class.getName());

    private String name;
    // Store received delivery request messages
    private List<String> receivedRequests;
    // Track if the driver has been notified
    private boolean isNotified;

    /**
     * Constructor that initializes a Driver with a name.
     *
     * @param name The name of the driver.
     */
    public Driver(String name) {
        this.name = name;
        this.receivedRequests = new ArrayList<>();
        this.isNotified = false;
    }

    @Override
    public void receiveUpdatedMessage(DeliveryRequest deliveryRequest) {
        receivedRequests.add(deliveryRequest.getDeliveryRequestMessage());
        isNotified = true;
        logger.info("Driver " + name + " received a new delivery request: " + deliveryRequest.getDeliveryRequestMessage());
    }

    @Override
    public boolean removeMessage(String message) {
        if (receivedRequests.remove(message)) {
            logger.info("Driver " + name + " has removed the message: " + message);
            return true;
        } else {
            logger.info("Message not found: " + message);
            return false;
        }
    }

    /**
     * Prints all received requests for the driver.
     */
    public void printRequests() {
        logger.info("Driver " + name + " has the following requests: " + receivedRequests);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNotified() {
        return isNotified;
    }

    public void setNotified(boolean notified) {
        isNotified = notified;
    }

    public List<String> getReceivedRequests() {
        return receivedRequests;
    }
}
