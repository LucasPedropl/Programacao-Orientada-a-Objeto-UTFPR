public class TstPes{

	public static void main(String [] arg){ //classLoader

	   Leitura l = new Leitura();
	   //Pessoa p1 = new Pessoa();
	   //Pessoa p2 = new Pessoa(34, "Aleph", new Endereco());
	   //Pessoa p3 = new Pessoa(new Endereco(), 52, "Yeshua");

           //stem.out.println("\nCPF.: "+p3.getCpf());
            //System.out.println("NOME: "+p3.getNome());

		//l.entDados("\n Press any key to continue..."); 

          int cpf = (Integer.parseInt(l.entDados("\nCPF.: ")));
          String nome = (l.entDados("NOME..: "));

	  Pessoa p2 = new Pessoa(cpf, nome, new Endereco());  

            System.out.println("\nCPF.: "+p2.getCpf());
            System.out.println("NOME: "+p2.getNome());       
/*
          p1.setCpf(Integer.parseInt(l.entDados("\nCPF.: ")));
          p1.setNome(l.entDados("NOME..: "));

//REFLEXIVIDADE
	 p1.getEnder().setRua(l.entDados("RUA..: "));
	 p1.getEnder().setNum(Integer.parseInt(l.entDados("NUM.: ")));



            System.out.println("\nCPF.: "+p1.getCpf());
            System.out.println("NOME: "+p1.getNome());

//REFLEXIVIDADE
            System.out.println("RUA: "+p1.getEnder().getRua());
            System.out.println("NUM: "+p1.getEnder().getNum());
*/

	}

}


/* ERROS:

	   Endereco e1 = new Endereco();

	e1.setRua(l.entDados("RUA: "));
	e1.setNum(Integer.parseInt(l.entDados("NUMERO.: ")));

		p1.setEnder(e1);

            System.out.println("\nRUA: "+ e1.getRua());
            System.out.println("NUMERO: "+ e1.getNum());

*/


