package br.com.projetoVendas.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PaginacaoDTO<F> implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer quantidadePorPagina;
	private Integer numeroPagina;
	private String sortBy;
	private F filter;

}
