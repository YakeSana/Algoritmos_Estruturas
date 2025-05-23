import java.util.Random;

public class NossoVetor {
    private int ocupacao;
    private int[] vetor;

    public NossoVetor(int tamanho) {
        vetor = new int[tamanho];
        ocupacao = 0; // por clareza
    }

    public NossoVetor() {
        this(10);
    }
    // public void insere (int i) {
    // if (!estaCheio()){
    // vetor[ocupacao++] = i;
    // }
    // }
    // public boolean insere(int i){
    // if(!estaCheio()){
    // vetor[ocupacao++] = i;
    // return true;
    // }
    // return false;
    // }

    public void insere(int i) {
        if (estaCheio())
            redimensiona(vetor.length * 2);
        vetor[ocupacao++] = i;
    }

    public boolean estaCheio() {
        return ocupacao == vetor.length;
    }

    @Override
    public String toString() {
        String vect = "";
        for (int i : vetor) {
            vect += i + " ";
        }
        return vect;
    }

    public boolean estaVazio() {
        return ocupacao == 0;
    }

    // public int remove(){
    // if (!estaVazio()){
    // int aux = vetor[--ocupacao];
    // if(ocupacao <= vetor.length/4 && vetor.length >= 4){
    // redimensiona(vetor.length/2);
    // };
    // return aux;
    // }
    // return -1;
    // }

    public int remove() {
        if (estaVazio()) {
            throw new VetorVazioException("Vetor Vazio, não há oque remover");
        }

        int aux = vetor[--ocupacao];
        if (ocupacao <= vetor.length / 4 && vetor.length >= 4) {
            redimensiona(vetor.length / 2);
        }
        ;
        return aux;

    }

    // private void aumentaVetor(){
    // int[] temp = new int[2*vetor.length];
    // for(int i =0;i<ocupacao;i++){
    // temp[i] = vetor[i];
    // }
    // vetor = temp;
    // }

    // private void diminuiVetor(){
    // int[] temp = new int[vetor.length/2];
    // for(int i =0;i<ocupacao;i++){
    // temp[i] = vetor[i];
    // }
    // vetor = temp;
    // }

    private void redimensiona(int novoTamanho) {
        int[] temp = new int[novoTamanho];
        for (int i = 0; i < ocupacao; i++) {
            temp[i] = vetor[i];
        }
        vetor = temp;
    }

    public int getTamanho() {
        return vetor.length;
    }

    public void preencheVetor() {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            // insere(random.nextInt(vetor.length*10));
            vetor[i] = random.nextInt(vetor.length * 10);
        }
        ocupacao = vetor.length;
    }

    public boolean contem(int valor) {
        for (int i = 0; i < ocupacao; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(int valor) {
        for (int i = 0; i < ocupacao; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public void bubbleSort() {
        for (int vez = 1; vez < vetor.length; vez++) {
            for (int i = 0; i < vetor.length - vez; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                }
            }
        }
    }

    public void selectionsort() {
        for (int i = 0; i < vetor.length - 1; ++i) {
            int min = i;
            for (int j = i + 1; j < vetor.length; ++j)
                if (vetor[j] < vetor[min])
                    min = j;
            int x = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = x;
        }
    }

    public void insertionsort ()
    {
       for (int j = 1; j < vetor.length; ++j) {
          int x = vetor[j];
          int i;
          for (i = j-1; i >= 0 && vetor[i] > x; --i) 
             vetor[i+1] = vetor[i];
          vetor[i+1] = x;
       }
    }

    private int partition(int p, int r){
        int x = vetor[r];
        int i = p -1;
        int aux;
        for(int j = p;j < r;j++){
            if(vetor[j] <=x){
                i++;
                aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
            }
        };
        i++;
        aux = vetor[r];
        vetor[r] = vetor[i];
        vetor[i] = aux;
        return i;
    }

    public void quickSort(int p, int r){
        System.out.print("p = "+p+", r ="+r);
        if(p < r){
            int q = partition(p, r);
            System.out.println(", q ="+q);
            quickSort(p, q-1);
            quickSort(q+1, r);
        }
        System.out.println();
    }

    public void mergeSort(int p,int r){
        if(p<r){
            int q = (p+r)/2;
            mergeSort(p, q);
            mergeSort(q+1, r);
            merge(p,q,r);
        }
    }

    public void merge(int p, int q, int r){
        int n1 = q - p + 1;
        int n2 = r - q + 1;
        int[] left = new int[n1+1];
        int[] right = new int[n2+1];
        
        for( int i =0;i<n1;i++){
            left[i]=vetor[p+i];
        }
        for( int j =0;j<n2;j++){
            right[j]=vetor[q+1+j];
        }
    }
}

class VetorVazioException extends RuntimeException {
    VetorVazioException(String msg) {
        super(msg);
    }
}
