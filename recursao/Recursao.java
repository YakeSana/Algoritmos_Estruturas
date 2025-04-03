public class Recursao{
   static public long lasso(long n){
    int f = 1;
    while(n>1){
        f *= n--;
    }
    return f;
   }

   static public long recursao(long n){
    if(n==1) return 1;
    return n * recursao(n-1);
   }

   public static void main(String[] args) {
    for(int i=1;i<30;i++)     
    System.out.println("Recursao"+i+": "+recursao(i));
   }
}