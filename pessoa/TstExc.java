public class TstExc {

	public static void main(String[] arg) {

		Leitura l = new Leitura();
		Pessoa p1 = new Pessoa();

		boolean vai = true;
		try {
			p1.setCpf(Integer.parseInt(l.entDados("CPF..:")));
			vai = false;
		}

		catch (ExceptionInvalidCpf cpe) {
			System.out.println("\nCATCH do CPF pequeno");
		}

		finally {
			System.out.println("\nPassou pelo FINALLY");

			if (vai) {
				System.out.println("\nERRO CPF");
			} else {
				System.out.println("\nCPF OK");
			}
		}

		System.out.println("\nCPF..: " + p1.getCpf());

	}

}

/*
 * try --> Tente fazer isso { ... isso ...}
 * 
 * catch --> pegue o objeto lançado pelo método dentro do try
 * 
 * finally--> Independente se houve erro ou não excute isso {... isso do
 * finally...}
 */
