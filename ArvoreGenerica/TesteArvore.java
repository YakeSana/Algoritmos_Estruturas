import java.util.Random;

public class TesteArvore {
    public static void main(String[] args) {
        Random random = new Random();
        ArvoreBinaria<Pessoa> arvore = new ArvoreBinaria<>();
        for(int i = 0;i<10;i++){
            int n = random.nextInt(50);
            System.out.print(n+" ");
            arvore.insere(new Pessoa(n, "Nome Teste"));
        }
        System.out.println("\n"+arvore);
    }
}
