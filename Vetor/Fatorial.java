public class Fatorial {
    static long fatorial(int n){
        if(n<=1) return 1;
        return n * fatorial(n-1);
    }

    public static void main(String[] args) {
        for (int i = 1;i<31;i++)
        System.out.println("Fatorial de "+i+": "+fatorial(i));
    }
}
