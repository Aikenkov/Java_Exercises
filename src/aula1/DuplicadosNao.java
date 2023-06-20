package aula1;

/* Enunciado:
 * Escreva um código que encontre os elementos em comum que existem em dois arrays 
 * e imprima os nomes dos itens em comum! Exemplo:
 * arr1 = ["morango", "uva", "acerola", "manga"] , arr2 = ["morango", "pêra", "caju","uva"]
 * deve printar:
 * morango
 * uva
 */

public class DuplicadosNao {
  public static void main(String[] args) {
        String[] list1 = new String[]{"morango", "uva", "acerola", "manga"};
        String[] list2 = new String[]{"morango", "pêra", "caju","uva"};

        DuplicadosNao.showDuplicates(list1, list2);
    }

  public static void showDuplicates(String[] list1, String[] list2) {
        for (String word1 : list1) {
          for (String word2 : list2) {
            if(word1.equals(word2)){
              System.out.println(word1);
            }
          }
        }
    }
}
