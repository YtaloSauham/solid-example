package investimento;

import entities.Usuario;

public interface RegraDeCalculoInvestimento {
	
	double calculoDeInvestimento(Usuario usuario, Double resultado);

}
