public class Main {
    public static void main(String[] args) {
        int suma, a,b,c;
        a=2;
        b=5;
        c=5;
        suma= sumar(a,b,c);
        System.out.println(suma);
    }

    public static int sumar(int a, int b, int c){
        int resultado=a+b+c;
        return resultado;
    }
}


