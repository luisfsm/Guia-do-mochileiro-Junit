package br.com.alura.tdd.service;

import java.util.ArrayList;
import java.util.List;
import br.com.alura.tdd.modelo.Produtos;

public class CarrinhoDeCompras {
	
	
	private List<Produtos> PedidoItens = new ArrayList<Produtos>();
	private double total = 0.0;
	
	
	public void adicionarProdutoCarrinho(Produtos produto) {
		this.PedidoItens.add(produto);
	}
	
	
	public void removerProdutoCarrinho(int id_produto) {
		this.PedidoItens.remove(id_produto);
	}
	
	
	public Double totalValorAPagar() {
		for(int i = 0; i < PedidoItens.size(); i++) {
			
			setTotal(PedidoItens.get(i).getPrice());	
		}
		return total;
	}
	

	public void setTotal(double total) {
		this.total = total;
	}


	public Double verificaDescontoAcima() {
		if(this.total >=4000) {
			this.total -= 10;
		}
		
		return this.total;
	}
}
