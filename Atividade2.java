import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        System.out.println("====ALUNOS:Bruno Custodio de Castro, Marlon Silva, Victor Fernandes Ferreira");
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

        System.out.println("\nDados inseridos:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Pessoa " + (i + 1) + ": Nome: " + nome[i] + ", Idade: " + idade[i] + ", Altura: " + altura[i]);
        }

        scan.close();
    }
}


