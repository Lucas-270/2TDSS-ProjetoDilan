package loja;

public class LogListener implements EventListener{

//Alguma coisa
	@Override
	public void update(PedidoInterface pedido) {
		System.out.println("Gravando log do pedido " + pedido);
		
	}

}
