package resolved.aula2;

/* Enunciado:
 * Sabemos que existe uma plataforma muito famosa, que busca ajudar as pessoas ,
 * estudantes que estão com dificuldade em algumas matérias (respondeAí). Pensando  
 * em algo que possa representar essa plataforma, escreva pelo menos 2 classes com 
 * propriedades e métodos que represente o modelo da plataforma! Atenção, use da 
 * melhor maneira a composição, encapsulamento e as boas práticas que aprendeu até o momento
 */

public class RepresentandoOMundo {
 String info = "crie as classes no pacote atual (aula2). use os métodos delas aqui e printe(sout) o resultado";
	public static void main(String[] args) {
        System.out.println("Boa sorte!");

        String summaryName = "Loop for em javascript";
        String summarySubject = "Programação";
        String summaryText = "Para criar um loop for uzando JavaScript é neccessário seguir estes passos...";

        FreeSummary summary = new FreeSummary();
        summary.setName(summaryName);
        summary.setSubject(summarySubject);
        summary.setText(summaryText);
        System.out.println(summary.getName());
        System.out.println(summary.getSubject());
        System.out.println(summary.getText());

        RespondeAi respondeAi = new RespondeAi();
        System.out.println(respondeAi.getName());
        System.out.println(respondeAi.getAddress());
    }
}
