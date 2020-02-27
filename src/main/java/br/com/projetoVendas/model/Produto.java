package br.com.projetoVendas.model;

import java.util.List;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Produto {
	
	private Long id;
	private String nome;
	private Long codigo;
	private List<String> cor;
	private List<String> tamanho;
	
}
