package State;

interface EstadoPedido {
    void cancelarPedido(Pedido pedido);
    void modificarPedido(Pedido pedido);
    void rastrearPedido(Pedido pedido);
}

class PedidoPendiente implements EstadoPedido {
    public void cancelarPedido(Pedido pedido) {
        // Cancelar el pedido y cambiar el estado a "cancelado"
        pedido.setEstado(new PedidoCancelado());
        System.out.println("El pedido ha sido cancelado");
    }
    public void modificarPedido(Pedido pedido) {
        // Modificar los detalles del pedido
        System.out.println("Modificando detalles del pedido");
    }
    public void rastrearPedido(Pedido pedido) {
        System.out.println("El pedido aún no ha sido enviado");
    }
}

class PedidoEnviado implements EstadoPedido {
    public void cancelarPedido(Pedido pedido) {
        System.out.println("El pedido no se puede cancelar después de haber sido enviado");
    }
    public void modificarPedido(Pedido pedido) {
        System.out.println("El pedido no se puede modificar después de haber sido enviado");
    }
    public void rastrearPedido(Pedido pedido) {
        System.out.println("El pedido está en camino");
    }
}

class PedidoCancelado implements EstadoPedido {
    public void cancelarPedido(Pedido pedido) {
        System.out.println("El pedido ya ha sido cancelado");
    }
    public void modificarPedido(Pedido pedido) {
        System.out.println("El pedido no se puede modificar después de haber sido cancelado");
    }
    public void rastrearPedido(Pedido pedido) {
        System.out.println("El pedido ha sido cancelado");
    }
}

class Pedido {
    private EstadoPedido estado;
    public Pedido() {
        estado = new PedidoPendiente();
    }
    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }
    public void cancelarPedido() {
        estado.cancelarPedido(this);
    }
    public void modificarPedido() {
        estado.modificarPedido(this);
    }
    public void rastrearPedido() {
        estado.rastrearPedido(this);
    }
}

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.modificarPedido(); // Se pueden modificar los detalles del pedido
        pedido.cancelarPedido(); // Se puede cancelar el pedido
        pedido.rastrearPedido(); // El pedido aún no ha sido enviado
        pedido.setEstado(new PedidoEnviado());
        pedido.modificarPedido(); // El pedido no se puede modificar después de haber sido enviado
        pedido.cancelarPedido(); // El pedido no se puede cancelar después de haber sido enviado
        pedido.rastrearPedido(); // El pedido está en camino
        pedido.setEstado(new PedidoCancelado());
        pedido.cancelarPedido(); // El pedido ya ha sido cancelado
        pedido.modificarPedido(); // El pedido no se puede modificar después de haber sido cancelado
        pedido.rastrearPedido(); // El pedido ha sido cancelado
    }
}

