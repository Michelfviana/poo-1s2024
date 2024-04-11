package livraria;
import java.util.ArrayList;

public class Livraria {
    
    public ArrayList<Livro> livros;

    public Livraria() { 
        this.livros = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public String listarLivros() {
        String listaLivros = "";
        for (Livro l : this.livros) {
            listaLivros += l.id + " - " + l.titulo + "\n";
        }
        return listaLivros;
    }
}