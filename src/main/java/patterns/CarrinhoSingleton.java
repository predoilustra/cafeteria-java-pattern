package patterns;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoSingleton {
    private static CarrinhoSingleton instance;
    private List<Pedido> pedidos;
    private List<PedidoObserver> observers;

    private CarrinhoSingleton() {
        pedidos = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static CarrinhoSingleton getInstance() {
        if (instance == null) {
            instance = new CarrinhoSingleton();
        }
        return instance;
    }

    public void adicionarObserver(PedidoObserver observer) {
        observers.add(observer);
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
        notificarObservers(pedido);
    }

    private void notificarObservers(Pedido pedido) {
        for (PedidoObserver observer : observers) {
            observer.atualizar(pedido);
        }
    }

    // Outros métodos de gerenciamento de pedidos no carrinho
}
