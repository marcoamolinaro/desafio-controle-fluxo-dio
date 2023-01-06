package controle;

import java.util.Scanner;

import controle.exception.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro par�metro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo par�metro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o m�todo contendo a l�gica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMsg());
		}
		terminal.close();
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroDois <= parametroUm) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		
		//realizar o for para imprimir os n�meros com base na vari�vel contagem
		for (int i = 0; i < contagem; i++) {
			System.out.println("Imprimindo o n�mero " + (i+1));
		}
	}

}
