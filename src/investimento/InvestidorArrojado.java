package investimento;

import entities.Usuario;

public class InvestidorArrojado implements RegraDeCalculoInvestimento {
	
	@Override
	public double calculoDeInvestimento(Usuario usuario, Double resultado) {
		
		if(resultado <= 0.2) {
			return usuario.getValor() * 0.0005; 
		}
		else if (resultado <= 0.3 && resultado > 0.2) {
			return usuario.getValor() * 0.0003; 
		} else {
			return usuario.getValor() * 0.0006;
		}
	}
	
	
	
	

}
