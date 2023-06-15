import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class GerarSenha {
    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int comprimento = 0;
        System.out.println("Qual a quantidade de caracteres desejada?");
        comprimento = teclado.nextInt();

        String senha = gerarSenha(comprimento);
        System.out.println("Senha: " + senha);
    }

    private static String gerarSenha(int comprimento) {
        StringBuilder senha = new StringBuilder();
        Random random = new Random();

        while (senha.length() < comprimento){
            int indice = random.nextInt(CARACTERES.length());
            char caractere = CARACTERES.charAt(indice);
            senha.append(caractere);
        }
        return senha.toString();
    }
}
