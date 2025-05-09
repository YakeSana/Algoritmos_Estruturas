public class ArvoreBinaria<T extends Comparable<T>> {
    private No<T> raiz;
    public ArvoreBinaria(){
        raiz = null;
    }
    public boolean inNull(){
        return raiz == null;
    } 

    public void insere(T info){
        No<T> novo = new No<>(info);
        if(inNull()){
            raiz = novo;
        }
        else{
            insereRec(novo,raiz);
        }
    }

    public void insereRec(No<T> novo, No<T> atual){
        if (novo.getInfo().compareTo(atual.getInfo()) > 0){
            if(atual.getDireita()==null) atual.setDireita(novo);
            else insereRec(novo, atual.getDireita());
        }
        else{
            if(atual.getEsquerda()==null) atual.setEsquerda(novo);
            else insereRec(novo, atual.getEsquerda());
        }
    }

    public String toStringRec(No<T> no){
        String s = "";
        if(no != null){
            s+=toStringRec(no.getEsquerda());
            s+= no;
            s+=toStringRec(no.getDireita());
        }
        return s;
    }

    @Override
    public String toString(){
        if (inNull()) return "Árvore Vazia";
        return toStringRec(raiz); 
    }
}
