public class RegistroNotasV1{
    public static void main(String[] args) {
        NossoHash<String,Double> boletim = new NossoHash<>();
        boletim.put("Jonas", 6.0);
        boletim.put("Crostera", 4.5);
        boletim.put("Lil'Rock", 3.25);
        boletim.put("Jonas", 5.5);
        boletim.put("Crostera", 6.5);
        boletim.put("Lil'Rock", 5.25);  
        boletim.imprime();
        System.out.println("Notas do Lil'Rock: " + boletim.getListaValores("Lil'Rock"));
    }
}