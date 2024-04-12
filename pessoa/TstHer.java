public class TstHer{

	public static void main(String [] arg){ 

	   Leitura l = new Leitura();
	   Aluno a1 = new Aluno();
	System.out.println("CPF-Pessoa..: "+p1.getCpf()); //Pessoa
	System.out.println("NOME-Pessoa..: "+p1.getNome()); //Pessoa





	
	a1.setRa(Integer.parseInt(l.entDados("\nRA-Aluno.:"))); //Aluno
	a1.setCurso(l.entDados("CURSO-Aluno..:")); //Aluno

	a1.setCpf(Integer.parseInt(l.entDados("CPF-Aluno..:"))); //Pessoa

	a1.setSegSoc(Integer.parseInt(l.entDados("SEGURO-Aluno..:"))); //Pessoa
	a1.setNome(l.entDados("NOME-Aluno.:"));//Pessoa


	System.out.println("\nRA-Aluno..: "+a1.getRa()); //Aluno
	System.out.println("CURSO-Aluno..: "+a1.getCurso()); //Aluno

	System.out.println("CPF-Aluno..: "+a1.getCpf()); //Pessoa
	System.out.println("SEGURO-Aluno..: "+a1.getSegSoc()); //Pessoa
	System.out.println("NOME-Aluno..: "+a1.getNome()); //Pessoa
		

	  
	}

}



