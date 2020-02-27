package br.com.projetoVendas.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmpresaDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String nomeFantasia;
	private String razaoSocial;
	private String endereco;
	private Long numero;
	private String cidade;
	private String pais;
	private Long cnpj;
	private String email;
	private Long telefone;
	private Long telefoneAdc;
	private Long celular;
	private String detalhes;
	
}
