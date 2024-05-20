package collections;

import java.util.Vector;

public class ExemploVector {

	public static void main(String[] args) {

		Vector<String> nomes = new Vector<>();

		nomes.add("Alice");
		nomes.add("Bob");
		nomes.add("Carol");

		System.out.println(nomes.get(1));

		for (String nome : nomes) {
			System.out.println(nome);
		}

		if (nomes.contains("Carol")) {
			System.out.println("Carol está na lista.");
		}

		nomes.remove("Carol");

		if (!nomes.contains("Carol")) {
			System.out.println("Carol NÃO está na lista.");
		}

		nomes.clear();
		if (nomes.isEmpty()) {
			System.out.println("A lista está vazia.");
		}

	}

}
