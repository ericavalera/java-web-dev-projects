import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LaptopTest {
    @Test
    public void LaptopConstructorProcessor(){
        String message ="the constructor for processor is as expected";
        Laptop newPurchase = new Laptop("Intel", "Erica", "MacBook Pro", 2023,200, 5555);
        assertEquals("Intel", newPurchase.getProcessor(), message);

    }
    @Test
    public void LaptopConstructorRelease(){
        String message ="the constructor for release date is as expected";
        Laptop newPurchase = new Laptop("Intel", "Erica", "MacBook Pro", 2023,200, 5555);
        assertEquals(2023, newPurchase.getReleaseDate(), message);

    }

    @Test
    public void LaptopConstructorSerial(){
        String message ="the constructor for serial number is as expected";
        Laptop newPurchase = new Laptop("Intel", "Erica", "MacBook Pro", 2023,200, 5555);
        assertEquals(5555, newPurchase.getSerialNum(), message);

    }


}
