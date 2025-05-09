public class NoOcorrencias extends No{
    private int ocorrencias;
    public NoOcorrencias(int info){
        super(info);
        setOcorrencias(1);
    }

    public int getOcorrencias() {
        return ocorrencias;
    }
    public void setOcorrencias(int ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    public void add1ocorrencia(){
        setOcorrencias(ocorrencias+1);
    }

    @Override
    public String toString(){
        return super.toString() + " ocorre " + ocorrencias + " vezes";
    }
}
