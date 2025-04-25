import java.util.Date;
import java.util.Scanner;

public class TesteQuick {
    public static void main(String[] args) {
        
        long ini, term;
        Scanner scanner = new Scanner(System.in);
        int t = 10;
        while (t > 0) {
            NossoVetor v = new NossoVetor(t);
            t = scanner.nextInt();
            // Quick Sort
            v.preencheVetor();
            ini = new Date().getTime();
            v.quickSort(0, v.getTamanho() - 1);
            term = new Date().getTime();
            System.out.println("O quick demorou " + (term - ini) + " milisegundos");
    
            // Overflow
            ini = new Date().getTime();
            v.quickSort(0, v.getTamanho() - 1);
            term = new Date().getTime();
            System.out.println("O quick demorou " + (term - ini) + " milisegundos");
        }
    }
}
