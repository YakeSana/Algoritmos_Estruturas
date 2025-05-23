import java.util.Date;
import java.util.Scanner;
public class TesteMerge {
    public static void main(String[] args) {
        
        long ini, term;
        Scanner scanner = new Scanner(System.in);
        int t = 10;
        while (t > 0) {
            NossoVetor v = new NossoVetor(t);
            t = scanner.nextInt();

            v.preencheVetor();
            ini = new Date().getTime();
            v.mergeSort(0, v.getTamanho());
            term = new Date().getTime();
            System.out.println("O quick demorou " + (term - ini) + " milisegundos");
    

        }
    }


}
