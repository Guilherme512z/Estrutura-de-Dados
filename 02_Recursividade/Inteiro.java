public class Inteiro{
public int fatorialR( int n){
    if (n>1)
    return fatorialR(n-1)*n;
    return 1;
}
public int soma(int N){
    if (N>1){
        return soma(N-1) + N;
    }
    return N;
    }
}
