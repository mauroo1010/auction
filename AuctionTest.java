

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class AuctionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AuctionTest
{
    private Auction auction1;
    private Person person1;
    private Person person2;

    /**
     * Default constructor for test class AuctionTest
     */
    public AuctionTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        
        auction1 = new Auction();
        auction1.enterLot("Zapatilla");
        auction1.enterLot("Perro");
        auction1.enterLot("Pc");
        auction1.enterLot("Coche");
        auction1.showLots();
        auction1.enterLot("Mesa");
        person1 = new Person("Mauro");
        person2 = new Person("Alex");
        auction1.makeABid(1, person1, 123);
        auction1.makeABid(2, person2, 12345);
        auction1.makeABid(3, person1, 987);
        auction1.makeABid(4, person1, 654);
        auction1.makeABid(5, person2, 891);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
