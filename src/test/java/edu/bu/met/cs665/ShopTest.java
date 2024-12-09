package edu.bu.met.cs665;

import edu.bu.met.cs665.DeliverySystem.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ShopTest {

    @Test
    public void testAddAndRemoveDriver() {
        Shop shop = new Shop();
        Driver driver = new Driver("TestDriver");

        shop.addDriver(driver);
        List<Observer> drivers = shop.getDrivers();
        Assertions.assertTrue(drivers.contains(driver), "Driver should be added to the shop");

        shop.removeDriver(driver);
        Assertions.assertFalse(drivers.contains(driver), "Driver should be removed from the shop");
    }

    @Test
    public void testNotifyDrivers() {
        Shop shop = new Shop();
        Driver driver = new Driver("TestDriver");
        shop.addDriver(driver);

        shop.createAndSendRequest("Test Message");
        Assertions.assertTrue(driver.getReceivedRequests().contains("Test Message"),
                "Driver should have received 'Test Message'");
    }
}
