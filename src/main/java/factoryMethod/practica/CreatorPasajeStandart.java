package factoryMethod.practica;

public class CreatorPasajeStandart extends Creator{
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
        PasajeStandart standart=new PasajeStandart(destino, origen, avion, pasajero);
        standart.setNumeroDeVuelo(4);
        standart.setNumeroAsiento(asiento);
        standart.setCostoDePasaje("1000 Bs");
        return standart;
    }
}
