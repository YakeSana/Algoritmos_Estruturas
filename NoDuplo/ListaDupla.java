public class ListaDupla {
    private NoDuplo primeiro;
    private NoDuplo ultimo;

    boolean isNull(){
        return primeiro == null;
    }

    public void insereInicio(int valor){
        NoDuplo novo = new NoDuplo(valor);
        if(isNull()){
            ultimo = novo;
        }
        else{
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }

    public void insereFim(int valor){
        NoDuplo novo = new NoDuplo(valor);
        if(isNull()){
            primeiro = novo;
        }
        else{
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }

    @Override
    public String toString() {
        if(isNull()) return "Lista Vazia";
        NoDuplo runner = primeiro;
        String s = "\\\\";
        while(runner != null){
            s += runner + "=";
            runner = runner.getProximo();
        }
        return s + "\\\\";
    } 
    
    public int removeInicio(){
        if(isNull()) new RuntimeException("Lista Está Vazia");
        int aux = primeiro.getInfo();
        if(primeiro == ultimo){
            primeiro = null;
            ultimo = null;
        }
        else{
            primeiro = primeiro.getProximo();
            primeiro.setAnterior(null);
        }
        return aux;
    }

    public int removeFim() {
        if (isNull()) throw new RuntimeException();
        int aux = ultimo.getInfo();
        if(primeiro==ultimo) {// tem um só vai esvaziar
            primeiro = null;
            ultimo = null;
        }
        else {
            ultimo = ultimo.getAnterior();
            ultimo.setProximo(null);
        }
        return aux;
    }
}
