import java.util.Random;

public class TesteFilaVetor {
    public static void main(String[] args) {
        Random rd = new Random();
        Fila fila = new Fila(8);
        for(int i = 0; i < 20; i++){
            try {
                if(rd.nextBoolean()){
                    fila.enfileira(rd.nextInt(10));
                }
                else{
                    System.out.println(fila.desenfileira()+ " saiu.");
                }
                System.out.println(fila.stringVetor());
                System.out.println(fila);
                
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
