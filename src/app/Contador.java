package app;

import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Contador {

		public static void main(String[] args) {
			Scanner terminal = new Scanner(System.in);
			try {
				System.out.println("Digite o primeiro parâmetro");
				int parametroUm = terminal.nextInt();
				System.out.println("Digite o segundo parâmetro");
				int parametroDois = terminal.nextInt();
				
				contar(parametroUm, parametroDois);
			
			}catch (ParametrosInvalidosException e) {
				System.out.println(e.getMessage());
			}catch(Exception outrosErros){
				System.out.println(outrosErros.getMessage());
			}finally {
				terminal.close();
			}
			
		}
		static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
			
			if(parametroUm > parametroDois) {
				throw new ParametrosInvalidosException();
			}
			int contagem = parametroDois - parametroUm;
			for (int i=1;i<=contagem;i++) {
				System.out.println("Imprimindo o número "+i);
			}
		}	

}
