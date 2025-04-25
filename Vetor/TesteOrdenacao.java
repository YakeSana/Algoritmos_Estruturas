import java.util.Date;
import java.util.Scanner;

public class TesteOrdenacao {
    public static void main(String[] args) {
        NossoVetor v;
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long inicio,fim;
        while(t>0){
            v = new NossoVetor(t);
            //Teste de Ordenação
            v.preencheVetor();
            //System.out.println("Original: "+v);

            //Bubble
            inicio = new Date().getTime();
            v.bubbleSort();
            fim = new Date().getTime();
            System.out.println("O bubble demorou "+(fim-inicio)+" milisegundos");

            //Selection
            v.preencheVetor();
            inicio = new Date().getTime();
            v.selectionsort();
            fim = new Date().getTime();
            System.out.println("O selection demorou "+(fim-inicio)+" milisegundos");

            //Insertion
            v.preencheVetor();
            inicio = new Date().getTime();
            v.insertionsort();
            fim = new Date().getTime();
            System.out.println("O insertion demorou "+(fim-inicio)+" milisegundos");

            //Bubble Ordenado
            v.preencheVetor();
            inicio = new Date().getTime();
            v.bubbleSort();
            fim = new Date().getTime();
            System.out.println("O bubble demorou "+(fim-inicio)+" milisegundos");

            //Selection Ordenado
            v.preencheVetor();
            inicio = new Date().getTime();
            v.selectionsort();
            fim = new Date().getTime();
            System.out.println("O selection demorou "+(fim-inicio)+" milisegundos");

            //Insertion Ordenado
            v.preencheVetor();
            inicio = new Date().getTime();
            v.insertionsort();
            fim = new Date().getTime();
            System.out.println("O insertion demorou "+(fim-inicio)+" milisegundos");


            System.out.println("\nEscolha o novo tamanho, 0 encerra: ");
            t = scanner.nextInt();
        }
        scanner.close();
    }

}
