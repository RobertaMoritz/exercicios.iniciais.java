
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int quantidadePessoas = 1;
		int idade = 15;
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos!");
		} 
		else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� n�o tem 18 anos, mas est� acompanhado, pode entrar!");
			}
			else {
				System.out.println("Voc� n�o pode entrar!");
			}		
		}
	}
}
		
		
