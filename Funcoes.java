public class Funcoes {
    public static void main(String[] args){
        String letsCode = "Let's Code";
        saudacao(letsCode);

        int resultado = soma(4,7);
        System.out.println(resultado);
    }

    public static void saudacao(String nome){
        System.out.println("Olá, " + nome + "!");
    }

    public static int soma(int a, int b){
        return a+b;
    }
}
