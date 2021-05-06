
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int quantidadePessoas = 1;
		int idade = 15;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos!");
		} 
		else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não tem 18 anos, mas está acompanhado, pode entrar!");
			}
			else {
				System.out.println("Você não pode entrar!");
			}		
		}
	}
}
		
		
