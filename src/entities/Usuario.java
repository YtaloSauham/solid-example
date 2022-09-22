package entities;

import enums.TipoInvestidor;

public class Usuario {
	private String nome;
	private Double valor;
	private TipoInvestidor tipoDeInvestidor;
	
	
	
	public Usuario(String nome, Double valor,TipoInvestidor tipoDeInvestidor) {
		this.nome = nome;
		this.valor = valor;
		this.tipoDeInvestidor = tipoDeInvestidor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}

	public TipoInvestidor getTipoDeInvestidor() {
		return tipoDeInvestidor;
	}

	public void setTipoDeInvestidor(TipoInvestidor tipoDeInvestidor) {
		this.tipoDeInvestidor = tipoDeInvestidor;
	}
	
	public double calculaInvestimento(Double resultado) {
		return tipoDeInvestidor.getRegra().calculoDeInvestimento(this, resultado);
	}
	
	
	
	
	
}
