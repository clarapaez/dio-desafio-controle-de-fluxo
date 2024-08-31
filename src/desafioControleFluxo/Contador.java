package desafioControleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);	
		}catch (ParametrosInvalidosException e) {
			System.out.println(e);
		}
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro! Tente novamente.");
		
		}else {
			int numero = 1;
			for(int i = parametroUm; i < parametroDois; i++) {
				
				System.out.println("Imprimindo o número " + numero);
				numero ++;
				
			}
		}
		
	}
}
	

