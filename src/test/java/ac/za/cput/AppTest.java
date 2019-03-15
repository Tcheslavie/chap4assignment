package ac.za.cput;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    TransportInterface a;
    TransportInterface b;

    @Before
    public void start()
    {
        a = new Bus();
        b = new Car();
    }

    @Test
    public void testInheritance()
    {
        assertEquals("Bus", a.showType());
        assertEquals("Car", b.showType());
        assertEquals(120, a.maxSpeed());
        assertEquals(240, b.maxSpeed());
        assertEquals(20, a.capacity());
        assertEquals(5, b.capacity());
        assertEquals(6, a.numWheels());
        assertEquals(4, b.numWheels());

        TransportInterface c = a;

        assertEquals(a, c);
    }

    @Test
    public void testComposition()
    {
        Employee jack = new Employee("Tailer");
        Employee henry = new Employee("Painter");

        assertEquals(8000, jack.getSalary());
        assertEquals(5000, henry.getSalary());

        assertEquals("Painter", henry.getJob().getName());
    }
}
