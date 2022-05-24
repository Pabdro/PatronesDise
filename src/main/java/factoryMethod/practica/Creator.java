package factoryMethod.practica;

public abstract class Creator {
    public Creator(){}
    public abstract IPasaje createPasage(Pasajero pasajero, int asiento);
}
