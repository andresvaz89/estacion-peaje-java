package andresvaz.dev;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

public class EstacionPeajeTest {

    private EstacionPeaje estacionPeaje;
    private Vehiculo coche;
    private Vehiculo moto;
    private Vehiculo camion;

    @BeforeEach
    public void setUp() {
        coche = new Vehiculo("coche", "ABC123", 0);
        moto = new Vehiculo("moto", "XYZ789", 0);
        camion = new Vehiculo("camion", "LMN456", 4);
        
        estacionPeaje = new EstacionPeaje("Estación Central", "Ciudad A");
    }

    @Test
    public void testCalcularPeajeCoche() {
        int peaje = estacionPeaje.calcularPeaje(coche);
        assertEquals(100, peaje, "El peaje para un coche debe ser 100");
    }

    @Test
    public void testCalcularPeajeMoto() {
        int peaje = estacionPeaje.calcularPeaje(moto);
        assertEquals(50, peaje, "El peaje para una moto debe ser 50");
    }

    @Test
    public void testCalcularPeajeCamion() {
        int peaje = estacionPeaje.calcularPeaje(camion);
        assertEquals(200, peaje, "El peaje para un camión con 4 ejes debe ser 200");
    }

    @Test
    public void testCalcularTotalRecaudado() {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(coche);
        vehiculos.add(moto);
        vehiculos.add(camion);

        estacionPeaje.setVehiculos(vehiculos);

        int totalRecaudado = estacionPeaje.calcularTotalRecaudado();
        assertEquals(350, totalRecaudado, "El total recaudado debe ser 350");
    }

    @Test
    public void testImprimirInforme() {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(coche);
        vehiculos.add(moto);
        vehiculos.add(camion);

        estacionPeaje.setVehiculos(vehiculos);
        estacionPeaje.calcularTotalRecaudado();

        String informe = estacionPeaje.imprimirInforme();
        assertTrue(informe.contains("El total recaudado en la estación"), "El informe debe contener el total recaudado en la estación");
        assertTrue(informe.contains("350"), "El informe debe mostrar el total recaudado de 350");
    }

}
