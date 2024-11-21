package andresvaz.dev;

import java.util.List;

public class EstacionPeaje {
    private String nombreEstacion;
    private String ciudadEstacion;
    private int recaudacionEstacion;
    private List<Vehiculo> vehiculos;

    public EstacionPeaje(String nombreEstacion, String ciudadEstacion) {
        this.nombreEstacion = nombreEstacion;
        this.ciudadEstacion = ciudadEstacion;
        this.recaudacionEstacion = 0;
    }

    public int calcularPeaje(Vehiculo vehiculo) {
        switch (vehiculo.getTipo()) {
            case "coche":
                return 100;
            case "moto":
                return 50;
            case "camion":
                return vehiculo.getNumeroEjesDelVehiculo() * 50;
            default:
                return 0;
        }
    }

    public int calcularTotalRecaudado() {
        int total = 0;
        for (Vehiculo vehiculo : vehiculos) {
            total += calcularPeaje(vehiculo);
        }
        recaudacionEstacion = total;
        return total;
    }

    public String imprimirInforme() { 
        return "El total recaudado en la estación " + nombreEstacion + " de " + ciudadEstacion + " es: $" + recaudacionEstacion;
    } 
    
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
