import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartPhoneTest {
    @Test
    public void SmartPhoneConstructorRelease(){
        String message ="the constructor for release date is as expected";
        SmartPhone newPurchase = new SmartPhone("Mac","Erica", "I-Phone",2024,60,5454);
        assertEquals(2024, newPurchase.getReleaseDate(), message);

    }
    @Test
    public void SmartPhoneConstructorModel(){
        String message ="the constructor for model is as expected";
        SmartPhone newPurchase = new SmartPhone("Mac","Erica", "I-Phone",2024,60,5454);
        assertEquals("I-Phone", newPurchase.getModel(), message);

    }
    @Test
    public void SmartPhoneConstructorMemory(){
        String message ="the constructor for memory is as expected";
        SmartPhone newPurchase = new SmartPhone("Mac","Erica", "I-Phone",2024,60,5454);
        assertEquals(60, newPurchase.getMemory(), message);

    }
}
