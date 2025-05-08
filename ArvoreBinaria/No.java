public class No{
    private int info;
    private No direita;
    private No esquerda;

    No(int info){
        this.info = info;
    }

    public int getInfo(){
        return info;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    @Override
    public String toString(){
        return ""+info;
    }
    
}