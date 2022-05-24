package factoryMethod.practica;

public class CreatorPasajeSolidario extends Creator{
    @Override
    public IPasaje createPasage(Pasajero pasajero, int asiento) {
        Destino destino=new Destino();
        destino.setPais("EEUU");
        destino.setCiudad("Los Angeles");
        destino.setAeropuerto("Aeropuerto internacional de los angeles");
        Origen origen=new Origen();
        origen.setPais("Bolivia");
        origen.setCiudad("La Paz");
        origen.setAeropuerto("Aeropuerto internacional de el alto");
        Avion avion=new Avion();
        avion.setMarca("Boa");
        avion.setCapacidad("30 personas");
        avion.setModelo("Airbus 330");
        avion.setNumeroDeAsientos(30);
        PasajeSolidario solidario=new PasajeSolidario(destino, origen, avion, pasajero);
        solidario.setNumeroDeVuelo(4);
        solidario.setNumeroAsiento(asiento);
        solidario.setCostoDePasaje("1000 Bs");
        solidario.setDescuento(" 20% ");
        solidario.setMotivoDelDescuento("Por ser una muy buena persona");
        return solidario;
    }
}