package resolved.aula1;

/* Enunciado:
 * Escreva um código que deve imprimir a tabela de multiplicação desse algum número fornecido,
 * e deve exibir um cabeçalho com o nome Tabela de multiplicação de X, 
 * onde X é o número a ser multiplicado.
 */

public class MultiplicaAi {
  public static void main(String[] args) {
        int num = 5;
        MultiplicaAi.showTable(num);
    }

  public static void showTable(int num) {
        System.out.println("Tabela de multiplaicação do número " + num);

        for(int i = 1; i <= 10; i++){
          final int result = num * i;
          System.out.println(num + " x " + i + " = " + result);
        }   
    }
}
