package ChainOfResponsability;

public class Main {
    public static void main(String[] args) {
        TiendaElectronica tienda1 = new TiendaElectronica1(null);
        TiendaElectronica tienda2 = new TiendaElectronica2(tienda1);
        TiendaElectronica tienda3 = new TiendaElectronica3(tienda2);

        Producto producto1 = new Producto("Cámara", 400);
        Producto producto2 = new Producto("Teléfono móvil", 1200);
        Producto producto3 = new Producto("Laptop", 2500);

        tienda3.procesarSolicitud(producto1);
        tienda3.procesarSolicitud(producto2);
        tienda3.procesarSolicitud(producto3);
    }
}