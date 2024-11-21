package andresvaz.dev;

import java.util.ArrayList;
import java.util.List;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        new App().runApp();
    }

    public void runApp() {
        Vehiculo coche = new Vehiculo("coche", "ABC123", 0);
        Vehiculo moto = new Vehiculo("moto", "XYZ789", 0);
        Vehiculo camion = new Vehiculo("camion", "LMN456", 4);

        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(coche);
        vehiculos.add(moto);
        vehiculos.add(camion);

        EstacionPeaje estacionPeaje = new EstacionPeaje("Estación 1", "Ciudad A");
        estacionPeaje.setVehiculos(vehiculos);

        System.out.println(estacionPeaje.imprimirInforme());
    }
}
