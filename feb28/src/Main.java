public class Main {
    public static void main(String[] args) {
    int n = 3;
    int res = suma(n);
    int factorial = factorial(n);
    int mcd = 80;
    int mcd2 = 32;
        System.out.println(res);
        System.out.println(factorial);
        System.out.println(mcd(mcd,mcd2));
    }

    public static int suma(int n){
        int valor;
        if( n == 1)
            valor = 1;
        else{
            valor = suma (n-1)+n;
        }
        return valor;
    }
    public static int factorial (int n){
        if (n==0){
            n = 1;
        }
        else{
            n = n*factorial(n-1);
        }
        return n;
    }
    // Máximo Común divisor de dos números.
    public static int mcd (int i1, int j1){
        int res = 0, k;
        k = i1%j1;
        if (k == 0)res =1;
        else res = mcd(j1,k);
        return res;

    }
}