package enums;


import investimento.InvestidorArrojado;
import investimento.InvestidorConservador;
import investimento.InvestidorModerado;
import investimento.RegraDeCalculoInvestimento;

public enum TipoInvestidor {
	CONSERVADOR(new InvestidorConservador()),
	MODERADO(new InvestidorModerado()),
	ARROJADO(new InvestidorArrojado());
	
	
	private RegraDeCalculoInvestimento regra;
	
	TipoInvestidor(RegraDeCalculoInvestimento regra){
		this.regra = regra;
	}
	
	public RegraDeCalculoInvestimento getRegra() {
		return regra;
	}

}
