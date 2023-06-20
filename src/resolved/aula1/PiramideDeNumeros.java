package resolved.aula1;

/* Enunciado:
 * Crie utilizando tudo que aprendeu até o momento, uma pirâmide de números, onde
 * você deve imprimir em cada linha separada a quantidade de números que está sendo 
 * iterado no momento! Por exemplo, se a sua iteração for de 1 a 5 ficaria assim o
 * resultado final:
 * 1
 * 22
 * 333
 * 4444
 * 55555
 */

public class PiramideDeNumeros {
  public static void main(String[] args) {
        int init = 1;
        int end = 7;
        PiramideDeNumeros.showPyramid(init, end);
    }

  public static void showPyramid(int init, int end) {
      for(int i = init; i <= end; i++){
        String letter = Integer.toString(i);
        StringBuilder row = new StringBuilder();

        while(row.length() != i){
          row.append(letter);
        }

        System.out.println(row);
      }
    }
}
