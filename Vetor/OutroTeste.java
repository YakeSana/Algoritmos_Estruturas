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
            try {
                vetor.remove();   
            } catch (Exception e) {
                new VetorVazioException("Vetor Vazio");
            }
            }
        System.out.println("Tamanho: "+ vetor.getTamanho());
        System.out.println(vetor);
        }
        if(vetor.contem(10)){
            System.out.println("10 está no vetor.");
        }else{
            System.out.println("Não está, 10 não está.");
        }
        
        // int indice = vetor.indexOf(10);
        // if(indice == -1){
        //     System.out.println("Não está no vetor");
        // }
        // else{
        //     System.out.println("O índice de 10 é "+indice);
        // }

        try {
            System.out.println("10 encontrado em" + vetor.indexOf(10));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
