public class TesteListaDupla {
    public static void main(String[] args) {
        ListaDupla lista1 =new ListaDupla();
        System.out.println(lista1);

        lista1.insereInicio(10);
        lista1.insereInicio(20);
        lista1.insereInicio(30);
        System.out.println("Lista depois das inserções: "+lista1);
        
        lista1.insereInicio(15);
        lista1.insereInicio(25);
        lista1.insereInicio(35);
        System.out.println("Lista depois das inserções no fim: "+lista1);
    }
}
