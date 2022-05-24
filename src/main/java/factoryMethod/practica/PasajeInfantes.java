package factoryMethod.practica;

public class PasajeInfantes implements IPasaje{
    private int numeroDeVuelo;
    private Destino destino;
    private Origen origen;
    private Avion avion;
    private Pasajero pasajero;
    private int numeroAsiento;
    private String costoEspecial;

    public PasajeInfantes(Destino destino, Origen origen, Avion avion, Pasajero pasajero) {
        this.destino=destino;
        this.origen=origen;
        this.avion=avion;
        this.pasajero=pasajero;
    }

    public int getNumeroDeVuelo() {
        return numeroDeVuelo;
    }

    public void setNumeroDeVuelo(int numeroDeVuelo) {
        this.numeroDeVuelo = numeroDeVuelo;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Origen getOrigen() {
        return origen;
    }

    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getCostoEspecial() {
        return costoEspecial;
    }

    public void setCostoEspecial(String costoEspecial) {
        this.costoEspecial = costoEspecial;
    }

    @Override
    public void showInfo() {
        System.out.println("Pasaje Infantes");

        System.out.println("numero de vuelo "+numeroDeVuelo);
        System.out.println("destino pais "+destino.getPais());
        System.out.println("destino ciudad "+destino.getCiudad());
        System.out.println("destino aeropuerto "+destino.getAeropuerto());
        System.out.println("origen pais "+origen.getPais());
        System.out.println("origen ciudad "+origen.getCiudad());
        System.out.println("origen aeropuerto "+origen.getAeropuerto());
        System.out.println("avion marca "+avion.getMarca());
        System.out.println("avion capacidad "+avion.getCapacidad());
        System.out.println("avion modelo "+avion.getModelo());
        System.out.println("avion numero de asientos "+avion.getNumeroDeAsientos());
        System.out.println("pasajero nombre "+pasajero.getNombre());
        System.out.println("pasajero ci "+pasajero.getCi());
        System.out.println("pasajero fecha de nacimiento "+pasajero.getFechaNacimiento());
        System.out.println("numero de asiento "+numeroAsiento);
        System.out.println("costo especial "+costoEspecial);
        System.out.println();
    }
}
