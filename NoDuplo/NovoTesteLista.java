import java.util.Random;

public class NovoTesteLista {
    
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();
        Random random = new Random();
        for (int i = 0;i <= 20; i++){
            if(random.nextBoolean()){
                if(random.nextBoolean()){
                    lista.insereInicio(random.nextInt(100));
                }
                else{
                    lista.insereFim(random.nextInt(100));
                }
            }
            else{
                try{
                    if(random.nextBoolean()){
                        System.out.println(lista.removeInicio() + " saiu da lista.");
                    }
                    else{
                        System.out.println(lista.removeFim() + " saiu da lista.");
                    }
                }
                catch(RuntimeException e){
                    System.out.println(e.getMessage());
                }
            }
            System.out.println(lista);
        }
        
    }

}
