// Nome: Pedro Lucas Mota
// RA: a2565943

public class VetorInversoPedroLucas {
    /*Crie um programa, no qual terá um vetor de inteiros, cujo tamanho será definido pelo valor de uma variável local, que permita ao usuário entrar com os valores. Depois, estes valores serão apresentados na ordem inversa à da entrada.*/

    public static void main(String[] args){

        Leitura l = new Leitura();

        int tamVet = Integer.parseInt(l.entDados("Digite o tamanha do Vetor"));
        int vet[] = new int[tamVet];

        for(int i = 0; i < tamVet; i++){
            vet[i] = Integer.parseInt(l.entDados("Digite o valor do vetor na posição " + i + ":"));
        }
        
        System.out.println("Apresentação do vetor na ordem inversa: ");
        for(int i = tamVet - 1; i >= 0; i--){
            
            System.out.println(vet[i]);
        }
    }
}