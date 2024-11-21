package andresvaz.dev;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehiculoTest {

    private Vehiculo vehiculo;

    @BeforeEach
    public void setUp() {
        vehiculo = new Vehiculo("coche", "1234ABC", 2);
    }

    @Test
    public void testConstructor() {
        assertEquals("coche", vehiculo.getTipo());
        assertEquals("1234ABC", vehiculo.getMatricula());
        assertEquals(2, vehiculo.getNumeroEjesDelVehiculo());
    }

    @Test
    public void testSetTipo() {
        vehiculo.setTipo("moto");
        assertEquals("moto", vehiculo.getTipo());
    }

    @Test
    public void testSetMatricula() {
        vehiculo.setMatricula("5678XYZ");
        assertEquals("5678XYZ", vehiculo.getMatricula());
    }

    @Test
    public void testSetNumeroEjes() {
        vehiculo.setNumeroEjesDelVehiculo(4);
        assertEquals(4, vehiculo.getNumeroEjesDelVehiculo());
    }
}
