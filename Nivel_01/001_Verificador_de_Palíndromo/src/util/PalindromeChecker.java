package util;

public class PalindromeChecker {

	public static boolean isPalindrome(String texto) {
		String textoLimpo = texto.replaceAll("[^a-z]", "").toLowerCase(); // deixa tudo minúsculo
		String textoInvertido = new StringBuilder(textoLimpo).reverse().toString(); //inverte o texto
		return textoLimpo.equals(textoInvertido);

	}
}
