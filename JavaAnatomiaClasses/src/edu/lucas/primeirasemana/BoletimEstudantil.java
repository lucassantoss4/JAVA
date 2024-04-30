package edu.lucas.primeirasemana;
public class BoletimEstudantil {
    // Método principal
    public static void main(String[] args) {
        double media = 6.5; // Exemplo de média do aluno

        // Chama o método que classifica o aluno com base na média
        String resultado = classificarAluno(media);

        // Imprime o resultado da classificação
        System.out.println("Média: " + media);
        System.out.println("Classificação: " + resultado);
    }

    // Método para classificar o aluno com base na média
    public static String classificarAluno(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5 && media < 7) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
