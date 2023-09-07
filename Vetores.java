import java.util.Arrays;

public class Vetores {
    public static void main(String[] args){
       int[] numeros=new int[5];
        numeros[0]=0;
        numeros[1]=1;
        numeros[2]=2;
        numeros[3]=3;
        numeros[4]=4;
        System.out.println(Arrays.toString(numeros));

        String[] letras = {"A", "B","C", "x","z"};
        System.out.println(Arrays.toString(letras));

        int[] meusNumeros = {10, 9, 25, 2, 12};
        int maiorNumero=meusNumeros[0];
        int menorNumero=meusNumeros[0];
        int media=0;
        for(int i=0; i<meusNumeros.length; i++){
            if(meusNumeros[i]>maiorNumero){
                maiorNumero=meusNumeros[i];
            }
            if(meusNumeros[i]<menorNumero){
                menorNumero=meusNumeros[i];
            }
            media+=meusNumeros[i];
        }
        System.out.println("Maior numero: "+ maiorNumero);
        System.out.println("Menor numero: " + menorNumero);
        System.out.println("Media: " + media/meusNumeros.length);
    }
}
