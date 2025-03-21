public class ListaSimplesCopia {
    private No primeiro;
    //Usaremos o construtor padrão, isto é, primeiro = null

    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio (int info) {
        No novo = new No(info);
        if(!estaVazia()) {
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }
    
    public int removeInicio(){
        if (estaVazia())
            throw new RuntimeException("lista vazia, não há o que remover");
        int removido = primeiro.getInfo();
        primeiro = primeiro.getProximo();
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
            No runner = primeiro;
            while (runner.getProximo() != null){
                runner = runner.getProximo();
            }
            runner.setProximo(novo);
        }
    }
}
