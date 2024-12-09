package edu.bu.met.cs665.DeliverySystem;

/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/11/2024
 * File Name: Observer.java
 * Description: The Observer interface defines methods for receiving and managing delivery requests.
 */
public interface Observer {

    /**
     * This method is called when the observer is notified of a new delivery request.
     *
     * @param deliveryRequest The delivery request message sent to the observer.
     */
    void receiveUpdatedMessage(DeliveryRequest deliveryRequest);

    /**
     * Removes a specific message from the observer's received list.
     *
     * @param message The delivery request message to be removed.
     * @return true if removal is successful, false otherwise.
     */
    boolean removeMessage(String message);
}
