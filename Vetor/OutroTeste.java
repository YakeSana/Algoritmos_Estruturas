import java.util.Random;

public class OutroTeste {
    public static void main(String[] args) {
        NossoVetor vetor = new NossoVetor();
        Random random = new Random();
        for (int i = 0; i<=100;i++){
           if(random.nextBoolean()){
            vetor.insere(i);
           } 
           else{
            vetor.remove();
            }
        System.out.println("Tamanho: "+ vetor.getTamanho());
        System.out.println(vetor);
        }
        
    }
}
