import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerTest {
    @Test
    public void computerConstructorName(){
        String message ="the constructor to name is as expected";
        Computer newPurchase = new Computer("Erica's","MacBook Pro", "Mac OSX");
            assertEquals("Erica's", newPurchase.getName(), message);

    }
    @Test
    public void computerConstructorModel(){
        String message ="the constructor to model is as expected";
        Computer newPurchase = new Computer("Erica's","MacBook Pro", "Mac OSX");
        assertEquals("MacBook Pro", newPurchase.getModel(), message);

    }
    @Test
    public void computerConstructorOperatingSystem(){
        String message ="the constructor to operating system is as expected";
        Computer newPurchase = new Computer("Erica's","MacBook Pro", "Mac OSX");
        assertEquals("Mac OSX", newPurchase.getOperatingSystem(), message);

    }
}
