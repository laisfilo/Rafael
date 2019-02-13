package br.com.fiap.bo;

import org.apache.log4j.Logger;

import br.com.fiap.loja.TerminalConsulta;
import br.com.fiap.to.ProdutoTO;

public class EstoqueBO {
	private static Logger log = Logger.getLogger(EstoqueBO.class);
	
	public static ProdutoTO consultarProduto(int codigo) {
		if(codigo == 401) {
			log.debug(codigo + "Cam Branca");
			return new ProdutoTO(codigo, 2.99, 4, "Camiseta Branca");
		} else if(codigo == 402) {
			log.debug(codigo + "Cam Azul");
			return new ProdutoTO(codigo, 2.99, 4, "Camiseta Azul");
		} else if(codigo == 403) {
			log.debug(codigo + "Cam Rosa");
			return new ProdutoTO(codigo, 2.99, 4, "Camiseta Rosa");
		} else {
			log.error(codigo + "Produto nao encontrado");
			return new ProdutoTO(-1, 0, 0, "Produto n econcontrado");
		}
	}
}
