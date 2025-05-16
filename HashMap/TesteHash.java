public class TesteHash {
    public static void main(String[] args) {
        NossoHash<Integer,String> mapa = new NossoHash<>();
        mapa.put(new Integer("1234"), "Crostinha");
        mapa.put(new Integer("45"),"Coisas Leves");
        mapa.put(new Integer("1"),"01");
        mapa.put(new Integer("2"),"01");
        mapa.put(new Integer("9123982"),"Goaba");
        mapa.imprime();
    }
}
