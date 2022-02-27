package basicEcom;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Produtos;
import br.com.alura.tdd.service.CarrinhoDeCompras;


class TestCarrinhoDeCompras {
	
	Produtos produtos;
	CarrinhoDeCompras carrinho;
	
	
	@BeforeAll
	public static void antesDeTodos() {
		System.out.println("Executo só uma vez ao iniciar");
	}
	
	@AfterAll
	public static void depoisDeTodos() {
		System.out.println("Executo só uma vez ao finalizar");
	}
	
	
	
	//Metodo que iniciliza antes de todos os tests
	//Metodo instancia a cada novo teste
	@BeforeEach
	public void incializar() {
		this.produtos = new Produtos("PS5", 5000.0);
		this.carrinho = new CarrinhoDeCompras();
		carrinho.adicionarProdutoCarrinho(produtos);
		System.out.println("Iniciar metodo");
	}
	
	@AfterEach
	public void finalizar() {
		System.out.println("Finalizando metodo");
	}
	

	
	@Test
	@DisplayName("Testando valores")
	void testarVAlorProduto5000() {
		
		//Assert equals verifica se igual
		assertEquals(5000.0, carrinho.totalValorAPagar());
	}
	
	
	@Test
	void testaDescontoAcimaDe4000EClientePremium() {
		
		this.carrinho.totalValorAPagar();

		//Assert equals verifica se igual
		assertEquals(4990.0, carrinho.verificaDescontoAcima());
		
	}

}
