import java.util.Random;
import java.util.Scanner;

public class Busca{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] v;
        int tamanho;
        System.out.println("Insira o tamanho do Vetor: ");
        tamanho = scanner.nextInt();
        while(tamanho > 0){
            v = new int[tamanho];
            preencheVetor(v,scanner);
            exibeVetor(v);
            System.out.println("Escolha um novo tamanho, 0 encerra");
            tamanho = scanner.nextInt();
        }
        scanner.close();
    }

    static void preencheVetor(int[] vetor,Scanner scanner){
        for (int i = 0; i < vetor.length; i++) {
            Random random = new Random();
            vetor[i] = random.nextInt(1001);
        }
    }

    static void exibeVetor(int[] vetor){
        for (int i : vetor) {
            System.out.print(i+", ");
            
        }
        System.out.println();
    }

    static int buscaSimples(int valor,int[] vetor){
        for(int i = 0;i > vetor.length;i++){
            if(vetor[i] ==valor){
                return i;
            }
        }
        return -1;
    }
}