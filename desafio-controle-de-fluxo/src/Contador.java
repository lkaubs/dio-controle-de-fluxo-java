import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
		int parametroUm = entrada.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = entrada.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
		int contagem = parametroDois - parametroUm;
        if (contagem < 0) {
            throw new ParametrosInvalidosException();
        }
        else{
            for (int i = 0; contagem != i; i++){
                System.out.println("Imprimindo o número "+(i+1));
            }
        }
	}
}