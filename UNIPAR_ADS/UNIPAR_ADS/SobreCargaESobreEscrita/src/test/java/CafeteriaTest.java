import SobreCargaCafeteria.Cafeteria;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CafeteriaTest {

    @Test
    public void testServirCafe() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Cafeteria cafeteria = new Cafeteria();
        cafeteria.servirCafe();
        assertEquals("Servindo café puro.\n", outContent.toString());

        outContent.reset();
        cafeteria.servirCafe("açúcar");
        assertEquals("Servindo café com açúcar.\n", outContent.toString());

        outContent.reset();
        cafeteria.servirCafe("açúcar", "leite");
        assertEquals("Servindo café com açúcar e leite.\n", outContent.toString());
    }
}
