package andresvaz.dev;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class AppTest {

    @Test
    public void testAppConstructor() {
        App app = new App();
        assertTrue(app instanceof App);
    }

    @Test
    public void testRunApp() {
        App app = new App();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        app.runApp();

        String output = outputStream.toString();
        assertTrue(output.contains("El total recaudado en la estación Estación 1 de Ciudad A es:"));
        
        System.setOut(System.out);
    }

    @Test
    public void testMain() {
        App app = Mockito.spy(new App());
        Mockito.doNothing().when(app).runApp();

        App.main(new String[]{});

    }
}
