package basicEcom;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Produtos;
import br.com.alura.tdd.service.CarrinhoDeCompras;

class TestCarrinhoDeCompras {

	@Test
	void TestaValorDePrecoDeProduto() {
		Produtos produto = new Produtos("Carro", 5000.0);
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarProdutoCarrinho(produto);		
		assertEquals(5000.0, carrinho.totalValorAPagar());
	}

}
