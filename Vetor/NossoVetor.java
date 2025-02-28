import java.util.Random;

public class NossoVetor {
    private int ocupacao;
    private int[] vetor; 
    public NossoVetor (int tamanho) {
        vetor = new int[tamanho];
        ocupacao = 0; //por clareza 
    }
    public NossoVetor () {
        this(10);
    }
    // public void insere (int i) {
    //     if (!estaCheio()){
    //         vetor[ocupacao++] = i;
    //     }
    // }
    // public boolean insere(int i){
    //     if(!estaCheio()){
    //         vetor[ocupacao++] = i;
    //         return true;
    //     }
    //     return false;
    // }

    public void insere(int i){
        if(estaCheio()) redimensiona(vetor.length*2);
            vetor[ocupacao++] = i;
    }

    public boolean estaCheio(){
        return ocupacao == vetor.length;
    }

    @Override
    public String toString(){
        String vect = "";
        for (int i=0;i<ocupacao;i++) {
            vect += i+" " ;
        }
        return vect;
    }

    public boolean estaVazio(){
        return ocupacao == 0;
    }

    public int remove(){
        if (!estaVazio()){
            int aux = vetor[--ocupacao];
            if(ocupacao <= vetor.length/4 && vetor.length >= 4){
                redimensiona(vetor.length/2);
            };
            return aux;
        }
        return -1;
    }
    // private void aumentaVetor(){
    //     int[] temp = new int[2*vetor.length]; 
    //     for(int i =0;i<ocupacao;i++){
    //         temp[i] = vetor[i];
    //     }
    //     vetor = temp;
    // }

    // private void diminuiVetor(){
    //     int[] temp = new int[vetor.length/2]; 
    //     for(int i =0;i<ocupacao;i++){
    //         temp[i] = vetor[i];
    //     }
    //     vetor = temp;
    // }

    private void redimensiona(int novoTamanho){
        int[] temp = new int[novoTamanho]; 
        for(int i =0;i<ocupacao;i++){
            temp[i] = vetor[i];
        }
        vetor = temp;
    }

    public int getTamanho(){
        return vetor.length;
    }

    public void preencheVetor(){
        Random random = new Random();
        for(int i =0;i<vetor.length;i++){
            // insere(random.nextInt(vetor.length*10));
            vetor[i] = random.nextInt(vetor.length*10);
        }
        ocupacao = vetor.length;
    }
}
