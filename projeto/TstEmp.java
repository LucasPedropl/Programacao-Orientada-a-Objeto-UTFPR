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
                                lp.setSenioridade(l.entDados("\nDigite a senioridade dele: Junior, Pleno, Senior"));
                                System.out.println("Endereço:");
                                e1.setRua(l.entDados("\nDigite a rua do líder do projeto"));
                                e1.setNum(
                                        Integer.parseInt(l.entDados("\nDigite o número da casa do líder do projeto")));
                                lp.setEnder(e1);

                                System.out.println("O líder tem algum dependente?");
                                System.out.println("1. Sim");
                                System.out.println("2. Não");
                                int temDependente = Integer.parseInt(l.entDados(""));
                                if (temDependente == 1) {
                                    Dependentes d = new Dependentes();
                                    d.setCodFun(lp.getCodFun(), lp.getCodFun());
                                    d.setFamiliaridade(l.entDados("Qual a familiaridade do lider e do dependente: "));
                                    lp.setDependente(d);
                                }

                                System.out.println("Qual a forma preferencial de contato?");
                                System.out.println("1 - Email");
                                System.out.println("2 - Telefone");
                                System.out.println("3 - Celular");
                                int formaContato = Integer.parseInt(l.entDados(""));
                                switch (formaContato) {
                                    case 1:
                                        lp.setEmail(l.entDados("\nDigite o email"));
                                        break;
                                    case 2:
                                        lp.setTelefone(l.entDados("\nDigite o telefone"));
                                        break;
                                    case 3:
                                        lp.setCelular(l.entDados("\nDigite o celular"));
                                        break;
                                    default:
                                        System.out.println("Opção inválida!");
                                        break;
                                }

                                emp.setLider(lp);

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
                                c.setnumProjetos(
                                        Integer.parseInt(l.entDados("\nDigite o número de projetos do cliente")));
                                System.out.println("Endereço:");
                                e1.setRua(l.entDados("\nDigite a rua do cliente"));
                                e1.setNum(Integer.parseInt(l.entDados("\nDigite o número da casa do cliente")));
                                c.setEnder(e1);

                                System.out.println("Qual a forma preferencial de contato?");
                                System.out.println("1. Email");
                                System.out.println("2. Telefone");
                                System.out.println("3. Celular");
                                int formaContato = Integer.parseInt(l.entDados(""));
                                switch (formaContato) {
                                    case 1:
                                        c.setEmail(l.entDados("\nDigite o email do cliente"));
                                        break;
                                    case 2:
                                        c.setTelefone(l.entDados("\nDigite o telefone do cliente"));
                                        break;
                                    case 3:
                                        c.setCelular(l.entDados("\nDigite o celular do cliente"));
                                        break;
                                    default:
                                        System.out.println("Opção inválida!");
                                        break;
                                }

                                emp.setCliente(c);

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
                                p.setCodCliente(c.getCodCliente(), c.getCodCliente());
                                p.setCodLider(lp.getCodFun(), lp.getCodFun());
                                emp.setProjeto(p);
                                break;
                            } catch (ExceptionInvalidNome nie) {
                                System.out.println(
                                        "\nO nome do projeto deve ter mais de 0 digitos e menos de 20 digitos");
                            } catch (ExceptionInvalidCnpj cie) {
                                System.out.println("\nCNPJ inválido, deve ser igual ao CNPJ da empresa");
                            } catch (ExceptionInvalidCodCli cie) {
                                System.out.println(
                                        "\nCódigo de cliente inválido, deve ser igual ao Codigo do cliente digitado anteriormente");
                            } catch (ExceptionInvalidCodFun cie) {
                                System.out.println(
                                        "\nCódigo de funcionário inválido, deve ser igual ao Codigo do funcionario digitado anteriormente");
                            }
                        }
                        
                    } else {
                        System.out.println(
                                "\nVocê deve criar um cliente com pelo menos um projeto antes de criar um projeto.");
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
            System.out.println("Senioridade do lider do projeto: " + lp.getSenioridade());
            System.out.println("Rua do Líder do Projeto: " + lp.getEnder().getRua());
            System.out.println("Número da Casa do Líder do Projeto: " + lp.getEnder().getNum());
            System.out.println("Código do Líder do Projeto: " + lp.getCodFun());
            System.out.println("Contato do lider de projeto: "
                    + (lp.getEmail().isEmpty() ? (lp.getTelefone().isEmpty() ? lp.getCelular() : lp.getTelefone())
                            : lp.getEmail()));
            System.out.println("Nome do Cliente: " + c.getNome());
            System.out.println("CPF do Cliente: " + c.getCpf());
            System.out.println("Rua do Cliente: " + c.getEnder().getRua());
            System.out.println("Número da Casa do Cliente: " + c.getEnder().getNum());
            System.out.println("Código do Cliente: " + c.getCodCliente());
            System.out.println("Contato do cliente: "
                    + (c.getEmail().isEmpty() ? (c.getTelefone().isEmpty() ? c.getCelular() : c.getTelefone())
                            : c.getEmail()));
            System.out.println("Número de Projetos do Cliente: " + c.getnumProjetos());
            System.out.println("Nome do Projeto: " + p.getNomeProjeto());

        }
    }
}
