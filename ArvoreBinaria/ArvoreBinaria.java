public class ArvoreBinaria {
    private No raiz;

    public boolean arvoreVazia(){
        return raiz == null;
    }

    public void insere(int valor){
        No no = new No(valor);
        if(arvoreVazia()) raiz=no;
        else insereRec(no,raiz);
    }

    private void insereRec(No novo,No atual){
        if(novo.getInfo()>atual.getInfo()){
            if(atual.getDireita()==null) 
                atual.setDireita(novo);
            else insereRec(novo, 
                atual.getDireita());  
        }
        else{
            if(atual.getEsquerda()==null) 
                atual.setEsquerda(novo);
            else 
                insereRec(novo, atual.getEsquerda());
            
        }
    }

    @Override
    public String toString(){
        if(arvoreVazia()) return "Arvore Vazia";
        return toStringRec(raiz);
    }

    private String toStringRec(No atual){
        String s = "";
        if (atual.getEsquerda() != null) {
            s += toStringRec(atual.getEsquerda());
        }
        s+= atual + " ";
        if (atual.getDireita() != null){
            s += toStringRec(atual.getDireita());
        }
        return s;
    }

    public void insereComOcorrencias(int info){
        if(arvoreVazia()){
            raiz = new NoOcorrencias(info); 
        }
        else{
            insereComOcorrenciasRec(info,raiz);
        }
    }

    private void insereComOcorrenciasRec(int info,No atual){
        if(atual.getInfo()==info){
            NoOcorrencias noocorrencias = (NoOcorrencias)atual;
            noocorrencias.add1ocorrencia();
        }
        else if(info > atual.getInfo()){
            if(atual.getDireita()==null){
                atual.setDireita(new NoOcorrencias(info));
            }
            else{
                insereComOcorrenciasRec(info, atual.getDireita());
            }
        }
        else{
            if(atual.getEsquerda()==null){
                atual.setEsquerda(new NoOcorrencias(info));
            }
            else{
                insereComOcorrenciasRec(info, atual.getEsquerda());
            }
        }
    }

    public int altura(){
        if (arvoreVazia() || raiz.getDireita()==null && raiz.getEsquerda()==null) return 0;
        return alturaRec(raiz);
    }

    private int alturaRec(No atual){
        if (atual == null || raiz.getDireita()==null && raiz.getEsquerda()==null) return 0;
        int alturaDir = alturaRec(atual.getDireita());
        int alturaEsq = alturaRec(atual.getEsquerda());
        return alturaDir > alturaEsq ? alturaDir + 1:alturaEsq + 1;
    }
}

