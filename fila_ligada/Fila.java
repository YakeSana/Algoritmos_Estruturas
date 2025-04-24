public class Fila {
    private No primeiro;
    private No ultimo;

    public boolean filaVazia(){
        return primeiro == null;
    }

    public void enfileira(int i){
        No no = new No(i);
        if(filaVazia()){
            primeiro = no;
        }
        else{
            ultimo.setProx(no);
        }
        ultimo = no;
    }

    public int desenfileira(){
        if(filaVazia()) throw new RuntimeException("Falha no desenfileiramento");
        int temp = primeiro.getInfo();
        primeiro = primeiro.getProx();
        if(primeiro == null) ultimo = null;
        return temp;
    }

    @Override
    public String toString(){
        if(filaVazia()) return "Fila Vazia";
        String s = "";
        No runner = primeiro;
        while(runner != null){
            s += runner + " -> ";
            runner = runner.getProx();
        }
        return s;
    }
}
