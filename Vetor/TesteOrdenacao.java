import java.util.Scanner;

public class TesteOrdenacao {
    public static void main(String[] args) {
        NossoVetor v;
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0){
            v = new NossoVetor(t);
            v.preencheVetor();
            System.out.println("Original: "+v);
            v.bubbleSort();
            System.out.println("Ordenado: "+v);
            System.out.println("\nEscolha o novo tamanho, 0 encerra: ");
            t = scanner.nextInt();
        }
        scanner.close();
    }

}
