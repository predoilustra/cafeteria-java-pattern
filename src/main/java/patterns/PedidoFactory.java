package patterns;

import model.Pedido;

public class PedidoFactory {
    public Pedido criarPedido(String descricao, double valor) {
        return new Pedido(descricao, valor);
    }
}
