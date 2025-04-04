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

   static public long fibonacci(int n){
    if(n<=1) return 1;
    return fibonacci(n-1) + fibonacci(n-2);
   }

   static public long[] fibonacciArray(int n){
    long[] fibo = new long[n+1];
    fibo[0]=1;
    fibo[1] = 1;
    for (int i =2;i<=n;i++){
        fibo[i] = fibo[i-1] + fibo[i-2];
    }
    return fibo;
    }
    static int potencialRecursivo(int k,int n){
        if(n == 0) return 1;
        if(n == 1) return k;
        return k * potencialRecursivo(k, n-1);
    }

    static int multiplicacao(int i, int j){
        if (i == 0|| j==0) return 0;
        return i + multiplicacao(i,j - 1);
    }

    static void exibeNum1(int i){
        System.out.print(i + " ");
        if(i>0) exibeNum1(i-1);
    }

    static void exibeNum2(int i){
        if (i>0) exibeNum2(i-1);
        System.out.print(i+ " ");
    }

    static void exibeNum3(int i,int n){
        System.out.print(i+ " ");
        if (i<n) exibeNum3(i+1,n);
    }

    static void exibeNum4(int i,int n){
        if (i<n) exibeNum4(i+1,n);
        System.out.print(i+ " ");
    }


   public static void main(String[] args) {
    for(int i=1;i<43;i++)     
    System.out.println("lasso"+i+": "+lasso(i));
   
   for(int i=1;i<43;i++)     
    System.out.println("recursao"+i+": "+recursao(i));
   
    for(int i=1;i<40;i++)     
    System.out.println("Fibo"+i+": "+fibonacci(i));

    long[] fibonacci = fibonacciArray(50);
    for (long i:fibonacci){
        System.out.println(i);
    }

    System.out.println(multiplicacao(10, 50));

    System.out.println("Exibe 1: ");
    exibeNum1(4);
    System.out.println("\nExibe 2: ");
    exibeNum2(4);
    System.out.println("\nExibe 3: ");
    exibeNum3(0, 4);
    System.out.println("\nExibe 4: ");
    exibeNum4(0, 4);
   }

   
}