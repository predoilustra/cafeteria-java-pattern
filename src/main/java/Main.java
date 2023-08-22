public class Main {
    public static void main(String[] args) {
        CarrinhoSingleton carrinho = CarrinhoSingleton.getInstance();
        PedidoFactory factory = new PedidoFactory();

        PedidoObserver observer = new PedidoObserver() {
            @Override
            public void atualizar(Pedido pedido) {
                System.out.println("Novo pedido adicionado: " + pedido.getDescricao());
            }
        };

        carrinho.adicionarObserver(observer);

        Pedido pedido1 = factory.criarPedido("Café expresso", 3.5);
        Pedido pedido2 = factory.criarPedido("Bolo de chocolate", 4.0);

        carrinho.adicionarPedido(pedido1);
        carrinho.adicionarPedido(pedido2);
    }
}
