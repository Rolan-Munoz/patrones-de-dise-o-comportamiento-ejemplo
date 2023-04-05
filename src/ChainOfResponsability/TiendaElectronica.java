package ChainOfResponsability;

abstract class TiendaElectronica {
    private TiendaElectronica siguiente;

    public TiendaElectronica(TiendaElectronica siguiente) {
        this.siguiente = siguiente;
    }

    public void procesarSolicitud(Producto producto) {
        if (puedeProcesar(producto)) {
            procesar(producto);
        } else if (siguiente != null) {
            siguiente.procesarSolicitud(producto);
        } else {
            System.out.println("Ninguna tienda puede manejar este producto.");
        }
    }

    protected abstract boolean puedeProcesar(Producto producto);

    protected abstract void procesar(Producto producto);
}

class TiendaElectronica1 extends TiendaElectronica {
    public TiendaElectronica1(TiendaElectronica siguiente) {
        super(siguiente);
    }

    protected boolean puedeProcesar(Producto producto) {
        return producto.getPrecio() <= 500;
    }

    protected void procesar(Producto producto) {
        System.out.println("El producto " + producto.getNombre() + " fue manejado por la tienda 1.");
    }
}

class TiendaElectronica2 extends TiendaElectronica {
    public TiendaElectronica2(TiendaElectronica siguiente) {
        super(siguiente);
    }

    protected boolean puedeProcesar(Producto producto) {
        return producto.getPrecio() <= 1000;
    }

    protected void procesar(Producto producto) {
        System.out.println("El producto " + producto.getNombre() + " fue manejado por la tienda 2.");
    }
}

class TiendaElectronica3 extends TiendaElectronica {
    public TiendaElectronica3(TiendaElectronica siguiente) {
        super(siguiente);
    }

    protected boolean puedeProcesar(Producto producto) {
        return producto.getPrecio() <= 2000;
    }

    protected void procesar(Producto producto) {
        System.out.println("El producto " + producto.getNombre() + " fue manejado por la tienda 3.");
    }
}

class Producto {
    private int precio;
    private String nombre;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}


