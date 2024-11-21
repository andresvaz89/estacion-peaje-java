package andresvaz.dev;

public class Vehiculo {
    private String tipo;
    private String matricula;
    private int numeroEjesDelVehiculo;

    public Vehiculo(String tipo, String matricula, int numeroEjesDelVehiculo) {
        this.tipo = tipo;
        this.matricula = matricula;
        this.numeroEjesDelVehiculo = numeroEjesDelVehiculo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumeroEjesDelVehiculo() {
        return numeroEjesDelVehiculo;
    }

    public void setNumeroEjesDelVehiculo(int numeroEjesDelVehiculo) {
        this.numeroEjesDelVehiculo = numeroEjesDelVehiculo;
    }
}
