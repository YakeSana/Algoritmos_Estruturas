public class TesteHash {
    public static void main(String[] args) {
        NossoHash<Integer,String> mapa = new NossoHash<>();
        mapa.put(new Integer("1234"), "Crostinha");
        mapa.put(new Integer("45"),"Coisas Leves");
        mapa.put(new Integer("1"),"01");
        mapa.put(new Integer("2"),"01");
        mapa.put(new Integer("9123982"),"Goaba");
        mapa.imprime();

        String valor = mapa.get(1234);

        if(valor != null)System.out.println("Chave encontrada, valor= "+ valor);
        else System.out.println("Chave não encontrada");

        if (mapa.containsKey(1234)) System.out.println("Chave existe.");
        else System.out.println("Chave não existe.");
        

        if(mapa.containsValue("FFFF")) System.out.println("Valor esta no mapa.");
        else System.out.println("Valor não está no mapa.");

        System.out.println("O mapa possui tamanho: "+ mapa.size());
        
    }
}
