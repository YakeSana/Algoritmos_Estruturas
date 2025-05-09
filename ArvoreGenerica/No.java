public class No<T> implements Comparable<T>{
    private T info;
    private No<T> direita;
    private No<T> esquerda;
    public No(T info){
        setInfo(info);
    }
    public T getInfo() {
        return info;
    }
    public void setInfo(T info) {
        this.info = info;
    }

    public String toString(){
        return info + "";
    }
    public No<T> getDireita() {
        return direita;
    }
    public void setDireita(No<T> direita) {
        this.direita = direita;
    }
    public No<T> getEsquerda() {
        return esquerda;
    }
    public void setEsquerda(No<T> esquerda) {
        this.esquerda = esquerda;
    }

    public int compareTo(T o) {
        return 0;
    }

    
}
