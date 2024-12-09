package edu.bu.met.cs665;

import edu.bu.met.cs665.DeliverySystem.DeliveryRequest;
import edu.bu.met.cs665.DeliverySystem.Driver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DriverTest {

    @Test
    public void testReceiveUpdatedMessage() {
        Driver driver = new Driver("TestDriver");
        DeliveryRequest request = new DeliveryRequest("Test Delivery");
        driver.receiveUpdatedMessage(request);

        Assertions.assertTrue(driver.getReceivedRequests().contains("Test Delivery"),
                "Driver should have received 'Test Delivery' message");
    }

    @Test
    public void testRemoveMessage() {
        Driver driver = new Driver("TestDriver");
        DeliveryRequest request = new DeliveryRequest("MessageToRemove");
        driver.receiveUpdatedMessage(request);

        boolean removed = driver.removeMessage("MessageToRemove");
        Assertions.assertTrue(removed, "Message should be removed");
        Assertions.assertFalse(driver.getReceivedRequests().contains("MessageToRemove"),
                "Removed message should no longer be in the list");
    }
}
