package demo;

import java.text.DecimalFormat;
import java.util.Random;

import entities.Usuario;
import enums.TipoInvestidor;

public class RealizadorDeInvestimento {
	
	
	public static void main(String[] args) {

		
		Usuario usuario = new Usuario("teste",1000.0,TipoInvestidor.MODERADO);
		
        Random gerador = new Random();
        
        double resultado = gerador.nextDouble();
        
        System.out.println("Resultado:"+resultado+"\n"+"Retorno:R$"+new DecimalFormat("#.##").format(usuario.calculaInvestimento(resultado)));
        
        
        
        
        
        
        
        

       
        
    }
}
