package patterns;

import model.Pedido;

public interface PedidoObserver {
    void atualizar(Pedido pedido);
}
