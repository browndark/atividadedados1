import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        System.out.println("=====Alunos:Bruno Custodio de Castro, Marlon Silva, Victor Fernandes=====");
        Scanner scan = new Scanner(System.in);

        int[] idade = new int[10];
        String[] nome = new String[10];
        float[] altura = new float[10];

        System.out.println("Digite a idade de 10 pessoas:");
        for (int i = 0; i < idade.length; i++) {
            System.out.print("Idade " + (i + 1) + ": ");
            idade[i] = scan.nextInt();
        }

        scan.nextLine();

        System.out.println("Digite o nome de 10 pessoas:");
        for (int i = 0; i < nome.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nome[i] = scan.nextLine();
        }

        System.out.println("Digite a altura de 10 pessoas:");
        for (int i = 0; i < altura.length; i++) {
            System.out.print("Altura " + (i + 1) + ": ");
            altura[i] = scan.nextFloat();
        }

        System.out.println("\nInformações específicas:");
        System.out.println("Nome da pessoa na posição 3: " + nome[2]); // posição 3 (índice 2)
        System.out.println("Idade da pessoa na posição 6: " + idade[5]); // posição 6 (índice 5)
        System.out.println("Altura da pessoa na posição 10: " + altura[9]); // posição 10 (índice 9)

        scan.close();
    }
}



