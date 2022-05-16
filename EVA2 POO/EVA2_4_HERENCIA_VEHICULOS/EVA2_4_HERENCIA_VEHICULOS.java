package EVA2_4_HERENCIA_VEHICULOS;

public class EVA2_4_HERENCIA_VEHICULOS {

    public static void main(String[] args) {
        Motocicleta moto = new Motocicleta();
        moto.setCombustible("Gasolina");
        moto.setLlantas(4);
        moto.setLitros(10);
        moto.setCilindros(6);
        moto.setPasajeros(2);
        moto.setMarca("Italika");
        moto.setModelo("150");
        moto.setAño("2015");
        moto.setManubrios("Manubrios");
        moto.setTipo("Cuatrimoto");
        moto.setTipLlantas("4X4");
        moto.imprimirDatos();
        System.out.println("");

        Automovil auto = new Automovil();
        auto.setCombustible("Gasolina");
        auto.setLlantas(4);
        auto.setLitros(160);
        auto.setCilindros(6);
        auto.setPasajeros(2);
        auto.setMarca("W Motors");
        auto.setModelo("Lykan HyperSport");
        auto.setAño("2013");
        auto.setTipo("Coupe de 2 puertas");
        auto.setClase("Superdeportivo");
        auto.setTransmicion("Semi automatica");
        auto.imprimirDatos();
        System.out.println("");
        
        Camioneta camion = new Camioneta();
        camion.setCombustible("Diesel");
        camion.setLlantas(4);
        camion.setLitros(160);
        camion.setCilindros(6);
        camion.setPasajeros(2);
        camion.setMarca("Ford");
        camion.setModelo("Ranger");
        camion.setAño("2021");
        camion.setCapacidad("!377 kg");
        camion.setTipLlantas("4x4");
        camion.setMCPEso(1377);
        camion.imprimirDatos();
        System.out.println("");
        
        Camiones camiones = new Camiones();
        camiones.setCombustible("Diesel");
        camiones.setLlantas(14);
        camiones.setLitros(160);
        camiones.setCilindros(6);
        camiones.setPasajeros(2);
        camiones.setMarca("CAT");
        camiones.setModelo("V23");
        camiones.setAño("2019");
        camiones.setCapacidad(12000);
        camiones.setEjes(3);
        camiones.setCargas(3);
        camiones.imprimirDatos();
        System.out.println("");
        
        

    }

}
class Camiones extends Vehiculo{
    private double capacidad;
    private int ejes;
    private int cargas;

    public Camiones() {
        this.capacidad = 0;
        this.ejes = 0;
        this.cargas = 0;
    }

    public Camiones(double capacidad, int ejes, int cargas, String combustible, int llantas, int litros, int cilindros, int pasajeros, String marca, String modelo, String año) {
        super(combustible, llantas, litros, cilindros, pasajeros, marca, modelo, año);
        this.capacidad = capacidad;
        this.ejes = ejes;
        this.cargas = cargas;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public int getCargas() {
        return cargas;
    }

    public void setCargas(int cargas) {
        this.cargas = cargas;
    }
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Capacidad de Carga: " + capacidad + " kg");
        System.out.println("Numero de ejes: " + ejes);
        System.out.println("Cargas: " + cargas);
    
    }
    

}

class Camioneta extends Vehiculo {
    private String Capacidad;
    private String TipLlantas;
    private double MCPEso;

    public Camioneta() {
        this.Capacidad = "";
        this.TipLlantas = "";
        this.MCPEso = 0;
    }

    public Camioneta(String Capacidad, String TipLlantas, double MCPEso, String combustible, int llantas, int litros, int cilindros, int pasajeros, String marca, String modelo, String año) {
        super(combustible, llantas, litros, cilindros, pasajeros, marca, modelo, año);
        this.Capacidad = Capacidad;
        this.TipLlantas = TipLlantas;
        this.MCPEso = MCPEso;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String Capacidad) {
        this.Capacidad = Capacidad;
    }

    public String getTipLlantas() {
        return TipLlantas;
    }

    public void setTipLlantas(String TipLlantas) {
        this.TipLlantas = TipLlantas;
    }

    public double getMCPEso() {
        return MCPEso;
    }

    public void setMCPEso(double MCPEso) {
        this.MCPEso = MCPEso;
    }
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Capacidad: " + Capacidad);
        System.out.println("Tipo de Llantas: " + TipLlantas);
        System.out.println("Peso del Montacargas: " + MCPEso);
    
    }

}

class Automovil extends Vehiculo {

    private String tipo;
    private String clase;
    private String transmicion;

    public Automovil() {
        this.tipo = "";
        this.clase = "";
        this.transmicion = "";
    }

    public Automovil(String tipo, String clase, String transmicion, String combustible, int llantas, int litros, int cilindros, int pasajeros, String marca, String modelo, String año) {
        super(combustible, llantas, litros, cilindros, pasajeros, marca, modelo, año);
        this.tipo = tipo;
        this.clase = clase;
        this.transmicion = transmicion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getTransmicion() {
        return transmicion;
    }

    public void setTransmicion(String transmicion) {
        this.transmicion = transmicion;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Tipo de Automovil: " + tipo);
        System.out.println("Clase de Automovil: " + clase);
        System.out.println("Transmicion del Automovil: " + transmicion);

    }

}

class Motocicleta extends Vehiculo {

    private String manubrios;
    private String tipo;
    private String Tipllantas;

    public Motocicleta() {
        this.manubrios = "";
    }

    public Motocicleta(String tipo, String Tipllantas, String manubrios, String combustible, int llantas, int litros, int cilindros, int pasajeros, String marca, String modelo, String año) {
        super(combustible, llantas, litros, cilindros, pasajeros, marca, modelo, año);
        this.manubrios = manubrios;
        this.tipo = tipo;
        this.Tipllantas = Tipllantas;
    }

    public String getManubrios() {
        return manubrios;
    }

    public void setManubrios(String manubrios) {
        this.manubrios = manubrios;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipLlantas() {
        return Tipllantas;
    }

    public void setTipLlantas(String Tripllantas) {
        this.Tipllantas = Tipllantas;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Tipo de volante: " + manubrios);
        System.out.println("Tipo de moto: " + tipo);
        System.out.println("Tipo de llantas que usa: " + Tipllantas);

    }

}

class Vehiculo {

    private String combustible;
    private int llantas;
    private int litros;
    private int cilindros;
    private int pasajeros;
    private String marca;
    private String modelo;
    private String año;

    public Vehiculo() {
        this.combustible = "";
        this.llantas = 0;
        this.litros = 0;
        this.cilindros = 0;
        this.pasajeros = 0;
        this.marca = "";
        this.modelo = "";
        this.año = "";
    }

    public Vehiculo(String combustible, int llantas, int litros, int cilindros, int pasajeros, String marca, String modelo, String año) {
        this.combustible = combustible;
        this.llantas = llantas;
        this.litros = litros;
        this.cilindros = cilindros;
        this.pasajeros = pasajeros;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public void imprimirDatos() {
        System.out.println("Combustible: " + combustible);
        System.out.println("No de Llantas: " + llantas);
        System.out.println("Litros: " + litros);
        System.out.println("Cilindros del Motor: " + cilindros);
        System.out.println("Capacidad de Pasajeros: " + pasajeros);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);

    }
}
