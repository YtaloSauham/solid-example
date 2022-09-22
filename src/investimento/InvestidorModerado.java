package investimento;

import entities.Usuario;

public class InvestidorModerado implements RegraDeCalculoInvestimento {
	@Override
	public double calculoDeInvestimento(Usuario usuario, Double resultado) {
		
		if(resultado >= 0.5) {
			return usuario.getValor() * 0.025; 
		}
		
		else {
			return usuario.getValor() * 0.0007; 
		}
			
		
	}
	
}
