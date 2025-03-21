public class ListaSimpes {
    private No primeiro;
    private No ultimo;
    //Usaremos o construtor padrão, isto é, primeiro = null

    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio (int info) {
        No novo = new No(info);
        if(estaVazia()) {
            ultimo = novo;
        }
        else{
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }
    
    public int removeInicio(){
        if (estaVazia())
            throw new RuntimeException("lista vazia, não há o que remover");
        int removido = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null){
            ultimo = null;
        }
        return removido;
    }
    @Override
    public String toString(){
        String s = "lista: ";
        if (estaVazia()){
            s += "esta vázia";
        }
        else {
            No runner = primeiro;
            while (runner != null){
                s += runner + "->";
                runner = runner.getProximo();
            }
            s += "\\\\";
        }
        return s += "\n";
    }

    public void insereFim(int info){
        No novo = new No(info);
        if(estaVazia()){
            primeiro = novo;
        }
        else{
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }

    public int removeFim(){
        if(estaVazia()){
            throw new RuntimeException("Lista Vazia");
        }
        int val = ultimo.getInfo();
        if(primeiro == ultimo){
            primeiro = null;
            ultimo = null;
        }
        else{
            No runner = primeiro;
            while(runner.getProximo() != ultimo){
                runner = runner.getProximo();
            }
            runner.setProximo(null);
            ultimo = runner;
        }
        return val;
    }

    
}