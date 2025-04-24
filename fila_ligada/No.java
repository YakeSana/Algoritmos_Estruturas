public class No{
    private int info;
    private No prox;

    public No(int i){
        setInfo(i);
    }
    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }
    public No getProx() {
        return prox;
    }
    public void setProx(No prox) {
        this.prox = prox;
    }

    @Override
    public String toString(){
        return "["+info+"]";
    }
}