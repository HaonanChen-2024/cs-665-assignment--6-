package edu.bu.met.cs665.DeliverySystem;

/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/11/2024
 * File Name: DeliveryObservable.java
 * Description: This interface defines the methods for managing observers (drivers)
 * and notifying them about delivery requests.
 */
public interface DeliveryObservable {

    /**
     * Adds a driver (observer) to the observable's list.
     *
     * @param driver The observer to be added.
     */
    void addDriver(Observer driver);

    /**
     * Removes a driver (observer) from the observable's list.
     *
     * @param driver The observer to be removed.
     */
    void removeDriver(Observer driver);

    /**
     * Sends a delivery request to all registered observers.
     *
     * @param deliveryRequest The delivery request to be sent.
     */
    void notifyDrivers(DeliveryRequest deliveryRequest);
}
