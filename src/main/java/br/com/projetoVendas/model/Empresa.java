package br.com.projetoVendas.model;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Empresa {
	
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
