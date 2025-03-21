public class TesteLista {
    public static void main(String[] args) {
        ListaSimpes lista = new ListaSimpes();
        boolean nulo = lista.estaVazia();
        System.out.println(nulo);

        System.out.println("Lista foi criada\n"+lista);
        try{
            lista.removeInicio();
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        lista.insereInicio(10);
        lista.insereInicio(20);
        lista.insereInicio(30);

        System.out.println("Lista depois das inserções de início \n" + lista);

        lista.removeInicio();
        System.out.println("Lista pós remoção do início"+ lista);

        lista.insereFim(15);
        lista.insereFim(25);
        lista.insereFim(35);
        System.out.println("Lista pós adição no fim"+ lista);

        try{
            System.out.println(lista.removeFim()+ " removido");
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Lista pós remoção no fim\n"+ lista);
    }
}
