import java.util.Scanner;

public class Atividade1 {
        public static void main(String[] args) {
            System.out.println("=======Alunos:Bruno Custodio de castro,Marlon Silva, Victor Fernandes=========");
            int[] vetor= new int[10];
            Scanner scan= new Scanner(System.in);
            System.out.println("Digite o vetor");
            for(int i=0; i<vetor.length; i++) {
                vetor[i]=scan.nextInt();
            }
            for (int imprimir: vetor) {
                System.out.print(imprimir+" ");
            }
        }

    }

