import java.util.List;

public class RegistroNotasV2 {
    private NossoHash<String, Double> boletim;

    @SuppressWarnings("unchecked")
    public RegistroNotasV2(){
        boletim = new NossoHash<>();
    }

    public void cadastraNotas(String nome, Double nota){
        boletim.put(nome,nota);
    }

    public void mostraBoletim(){
        boletim.imprime();
    }

    public List<Double> getNotas(String aluno){
        return boletim.getListaValores(aluno);  
    }

    public String stringNotas(String aluno){
        List<Double> lista = boletim.getListaValores(aluno);
        if(lista.isEmpty()) return aluno +" não há notas cadastradas";
        return lista.toString();
    }

    public Double media(String aluno){
        double soma_das_notas = 0;
        List<Double> notas = boletim.getListaValores(aluno);
        if(notas.isEmpty()){
            return 0.0;
        }
        for(double nota: notas){
            soma_das_notas += nota;
        }
        return soma_das_notas/notas.size();
    }

    public static void main(String[] args) {
        RegistroNotasV2 registroNotasV2 = new RegistroNotasV2();
        registroNotasV2.cadastraNotas("Jonas", 6.0);
        registroNotasV2.cadastraNotas("Crostera", 4.5);
        registroNotasV2.cadastraNotas("Lil'Rock", 3.25);
        registroNotasV2.cadastraNotas("Jonas", 5.5);
        registroNotasV2.cadastraNotas("Crostera", 6.5);
        registroNotasV2.cadastraNotas("Lil'Rock", 5.25); 
        registroNotasV2.mostraBoletim();
        System.out.println("Notas do Lil'Rock: "+registroNotasV2.stringNotas("Lil'Rock"));
        System.out.println("Notas do Crostona: "+registroNotasV2.stringNotas("Crostona"));
        System.out.println("Média do Lil'Rock: "+registroNotasV2.media("Lil'Rock"));
        System.out.println("Média do Crostona: "+registroNotasV2.media("Crostona"));
    }

}
