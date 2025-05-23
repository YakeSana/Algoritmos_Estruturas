import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.List;

public class NossoHash<K,V> {
    private Entrada<K,V>[] tabela;
    private int capacidade = 16;
    @SuppressWarnings("unchecked")
    public NossoHash(){
        tabela = new Entrada[16];
    }

    private int hash(K key){
        return Math.abs(key.hashCode()) % capacidade;
    }

    public void put(K key, V value){
        int indice = hash(key);
        Entrada<K,V> entrada = new Entrada<>(key,value);
        entrada.proximo = tabela[indice];
        tabela[indice] = entrada;
    }

    public V get (K key){
        int indice = hash(key);
        Entrada<K,V> atual = tabela[indice];
        while(atual != null){
            if(key.equals(atual.key)){
                return atual.value;
            }
            atual = atual.proximo;
        }
        return null;
    }

    public void imprime(){
        for(int i=0;i<capacidade;i++){
            System.out.println("Posição "+i);
            Entrada<K,V> atual = tabela[i];
            while(atual != null){
                System.out.println("{chave: "+atual.key+", valor: "+atual.value+"}");
                atual = atual.proximo;
            }
            System.out.println("\n");
        }
    }

    public boolean isEmpty(){
        for(int i=0;i<capacidade;i++){
            if(tabela[i] != null){
                return false;
            }
        }
        return true;
    }

    public boolean containsKey(K key){
        int indice = hash(key);
        Entrada<K,V> atual = tabela[indice];
        while(atual != null){
            if(key.equals(atual.key)){
                return true;
            }
            atual = atual.proximo;
        }
        return false;    
    }

    public boolean containsValue(V value){
        for(Entrada<K,V> valor : tabela){
            while(valor != null){
                if(value.equals(valor.value)){
                    return true;
                }
                valor = valor.proximo;  
            }
        }
        return false;
    }

    public int size(){
        int tamanho = 0;
        for(int i=0;i<capacidade;i++){
            Entrada<K,V> atual = tabela[i];
            while(atual != null){
                tamanho++;
            }
        }
        return tamanho;
    }

    public List<V> getListaValores(K key){
        int indice = hash(key);
        Entrada<K,V> atual = tabela[indice];
        List<V> lista = new ArrayList<>();
        while (atual != null) {
            if(atual.key.equals(key)){
                lista.add(atual.value);
            }
            atual = atual.proximo;
        }
        return lista;
    }
}
