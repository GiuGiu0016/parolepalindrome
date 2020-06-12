package it.dstech.palindrtomi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("inserisci una frase:");
		String frase = sc.nextLine();
		List<Character> caratteri = eliminaSpazi(frase);
		System.out.println("La frase è palindroma ?  ===> " + palindroma(caratteri));
	}
	
	public static boolean palindroma(List<Character> caratteri){
	    int i1 = 0;
	    int i2 = caratteri.size()-1;
	    while (i2 > i1) {
	        if (caratteri.get(i1) != caratteri.get(i2)) {
	            return false;
	        }
	        ++i1;
	        --i2;
	    }
	    return true;
	}

	private static List<Character> eliminaSpazi(String frase) {
		char[] tutticaratteri = frase.toCharArray();
		List<Character> noSpazi = new ArrayList<>();
		for(int i = 0 ; i<=tutticaratteri.length-1; i++) {
			if(tutticaratteri[i] != ' ') {
			noSpazi.add(tutticaratteri[i]);
			}
		}
		return noSpazi;
	}

}
