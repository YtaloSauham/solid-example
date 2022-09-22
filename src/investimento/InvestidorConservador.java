package investimento;

import entities.Usuario;

public class InvestidorConservador implements RegraDeCalculoInvestimento {
	
	@Override
	public double calculoDeInvestimento(Usuario usuario,Double resultado) {
		
		return usuario.getValor()* 0.008;
	}

}
