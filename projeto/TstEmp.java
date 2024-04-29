//PEDRO LUCAS DA SILVA MOTA
//a2565943

public class TstEmp {

    public static void main(String[] arg) {
        Leitura l = new Leitura();
        Endereco e1 = null;
        Empresa emp = null;
        LiderProjeto lp = null;
        Cliente c = null;
        Projeto p = null;
        int opcao;

        do {
            System.out.println("\n=========================================");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Criar Empresa");
            System.out.println("2. Criar Líder de Projeto");
            System.out.println("3. Criar Cliente");
            System.out.println("4. Criar Projeto");
            System.out.println("5. Sair");
            System.out.println("=========================================");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(l.entDados(""));

            switch (opcao) {
                case 1:
                    emp = new Empresa();
                    while (true) {
                        try {
                            emp.setNome(l.entDados("\nDigite o nome da empresa"));
                            emp.setCnpj(l.entDados("\nDigite o CNPJ da empresa"));
                            break;
                        } catch (ExceptionInvalidCnpj cie) {
                            System.out.println("\nCNPJ inválido, deve conter 14 dígitos");
                        } catch (ExceptionInvalidNome nie) {
                            System.out.println("\nO nome deve ter mais de 0 digitos e menos de 20 digitos");
                        }
                    }
                    break;
                case 2:
                    if (emp != null) {
                        lp = new LiderProjeto();
                        e1 = new Endereco();
                        while (true) {
                            try {
								System.out.println("Dados:");
                                lp.setNome(l.entDados("Digite o nome do líder responsavel pelo projeto"));
                                lp.setCpf(l.entDados("\nDigite o CPF do líder responsavel pelo projeto"));
								lp.setCodFun(l.entDados("\nDigite o código do líder responsavel pelo projeto"));
								System.out.println("Endereço:");
                                e1.setRua(l.entDados("\nDigite a rua do líder do projeto"));
                                e1.setNum(Integer.parseInt(l.entDados("\nDigite o número da casa do líder do projeto")));
                                lp.setEnder(e1);
                                
                                break;
                            } catch (ExceptionInvalidNome nie) {
                                System.out.println("\nO nome deve ter mais de 0 digitos e menos de 20 digitos");
                            } catch (ExceptionInvalidCpf cie) {
                                System.out.println("\nCPF invalido, deve conter 11 digitos");
                            } catch (NumberFormatException nfe) {
                                System.out.println("\nO número da casa deve ser um valor numérico");
                            } catch (ExceptionInvalidCodFun cie) {
                                System.out.println("\nCódigo de funcionário inválido");
                            }
                        }
                    } else {
                        System.out.println("\nVocê deve criar uma empresa antes de criar um líder de projeto.");
                    }
                    break;
                case 3:
                    if (lp != null) {
                        c = new Cliente();
                        e1 = new Endereco();
                        while (true) {
                            try {
								System.out.println("Dados:");
                                c.setNome(l.entDados("Digite o nome do cliente"));
                                c.setCpf(l.entDados("\nDigite o CPF do cliente"));
								c.setCodCliente(l.entDados("\nDigite o código do cliente"));
                                c.setnumProjetos(Integer.parseInt(l.entDados("\nDigite o número de projetos do cliente")));
								System.out.println("Endereço:");
                                e1.setRua(l.entDados("\nDigite a rua do cliente"));
                                e1.setNum(Integer.parseInt(l.entDados("\nDigite o número da casa do cliente")));
                                c.setEnder(e1);
                                
                                break;
                            } catch (ExceptionInvalidNome nie) {
                                System.out.println("\nO nome deve ter mais de 0 digitos e menos de 20 digitos");
                            } catch (ExceptionInvalidCpf cie) {
                                System.out.println("\nCPF invalido, deve conter 11 digitos");
                            } catch (NumberFormatException nfe) {
                                System.out.println("\nO número da casa deve ser um valor numérico");
                            } catch (ExceptionInvalidCodCli cie) {
                                System.out.println("\nCódigo de cliente inválido");
                            }
                        }
                    } else {
                        System.out.println("\nVocê deve criar um líder de projeto antes de criar um cliente.");
                    }
                    break;
                case 4:
                    if (c != null && c.getnumProjetos() > 0) {
                        p = new Projeto();
                        while (true) {
                            try {
                                p.setNomeProjeto(l.entDados("\nDigite o nome do projeto"));
                                p.setCnpjEmp(emp.getCnpj(), emp.getCnpj());
								//p.setCnpjEmp(l.entDados("\nDigite o CNPJ da empresa"));
                                p.setCodCliente(c.getCodCliente(), c.getCodCliente());
								//p.setCodCliente(l.entDados("\nDigite o codigo do cliente"));
                                p.setCodLider(lp.getCodFun(), lp.getCodFun());
								//p.setNomeProjeto(l.entDados("\nDigite o codigo do lider responsavel pelo projeto"));
                                break;
                            } catch (ExceptionInvalidNome nie) {
                                System.out.println("\nO nome do projeto deve ter mais de 0 digitos e menos de 20 digitos");
                            } catch (ExceptionInvalidCnpj cie) {
                                System.out.println("\nCNPJ inválido, deve ser igual ao CNPJ da empresa");
                            } catch (ExceptionInvalidCodCli cie) {
                                System.out.println("\nCódigo de cliente inválido, deve ser igual ao Codigo do cliente digitado anteriormente");
                            } catch (ExceptionInvalidCodFun cie) {
                                System.out.println("\nCódigo de funcionário inválido, deve ser igual ao Codigo do funcionario digitado anteriormente");
                            }
                        }
                    } else {
                        System.out.println("\nVocê deve criar um cliente com pelo menos um projeto antes de criar um projeto.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 5);

        if (emp != null && lp != null && c != null && p != null) {
            System.out.println("Nome da Empresa: " + emp.getNome());
            System.out.println("CNPJ da Empresa: " + emp.getCnpj());
            System.out.println("Nome do Líder do Projeto: " + lp.getNome());
            System.out.println("CPF do Líder do Projeto: " + lp.getCpf());
            System.out.println("Rua do Líder do Projeto: " + lp.getEnder().getRua());
            System.out.println("Número da Casa do Líder do Projeto: " + lp.getEnder().getNum());
            System.out.println("Código do Líder do Projeto: " + lp.getCodFun());
            System.out.println("Nome do Cliente: " + c.getNome());
            System.out.println("CPF do Cliente: " + c.getCpf());
            System.out.println("Rua do Cliente: " + c.getEnder().getRua());
            System.out.println("Número da Casa do Cliente: " + c.getEnder().getNum());
            System.out.println("Código do Cliente: " + c.getCodCliente());
            System.out.println("Número de Projetos do Cliente: " + c.getnumProjetos());
            System.out.println("Nome do Projeto: " + p.getNomeProjeto());
        }
    }
}
