//PEDRO LUCAS DA SILVA MOTA
//a2565943

public class TstEmp {

	public static void main(String[] arg) {
		Leitura l = new Leitura();
		Pessoa p1 = new Pessoa();

		boolean condition = true;

		while (condition == true) {
			try {

				p1.setNome(l.entDados("Digite o nome"));
				p1.setCpf(Integer.parseInt(l.entDados("\nDigite o CPF")));
				condition = false;
	
			} catch (ExeptionInvalidCpf cpf) {
				System.out.println("\nO CPF deve ser maior que 0");
	
			} catch (ExeptionNomeGrande nge) {
				System.out.println("\nO nome deve ter menos de 10 letras");
	
			}
		}

		System.out.println("Nome: " + p1.getNome());
		System.out.println("CPF: " + p1.getCpf());
	}

}
