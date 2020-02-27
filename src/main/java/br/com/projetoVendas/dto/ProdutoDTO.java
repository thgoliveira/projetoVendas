package br.com.projetoVendas.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class ProdutoDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private Long codigo;
	private List<String> cor;
	private List<String> tamanho;

}
