// Nome: Pedro Lucas Mota
// RA: a2565943

// Nome: Pedro Lucas Mota
// RA: a2565943

public class MatrizInversaPedroLucas {
    /*Crie um programa, no qual terá um vetor de inteiros, cujo tamanho será definido pelo valor de uma variável local, que permita ao usuário entrar com os valores. Depois, estes valores serão apresentados na ordem inversa à da entrada.*/

    public static void main(String[] args){

        Leitura l = new Leitura();

        int lin = Integer.parseInt(l.entDados("Digite a quantidade de linhas"));
        int col = Integer.parseInt(l.entDados("Digite a quantidade de colunas"));
        int mat[][] = new int[lin][col];

        for(int i = 0; i < lin; i++){
            for(int j = 0; j < col; j++){
                mat[i][j] = Integer.parseInt(l.entDados("Digite o valor da matriz na linha " + i + "coluna "+ j +":"));
            }
        }
        
        System.out.println("Apresentação da matriz na ordem inversa: ");
        for(int i = lin - 1; i >= 0; i--){
            for(int j = col - 1; j >= 0; j--){
                System.out.println(mat[i][j]);
            }
        }
    }
}