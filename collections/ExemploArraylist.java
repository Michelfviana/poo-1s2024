package collections;

import java.util.ArrayList;

public class ExemploArraylist {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<>();

		nomes.add("Johnatan");
		nomes.add("James");
		nomes.add("Scarlet");

		System.out.println(nomes.get(1));

		for (String nome : nomes) {
			System.out.println(nome);
		}

		if (nomes.contains("Johnatan")) {
			System.out.println("Johnatan está na lista.");
		}

		nomes.remove("Johnatan");

		if (!nomes.contains("Johnatan")) {
			System.out.println("Johnatan NÃO está na lista.");
		}

		nomes.clear();
		if (nomes.isEmpty()) {
			System.out.println("A lista está vazia.");
		}
	}
}
