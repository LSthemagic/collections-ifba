import java.util.Objects;

public class Livro {
    private int isbn;
    private String autor, editora, titulo;

    public Livro(int isbn, String autor, String editora, String titulo) {
        this.isbn = isbn;
        this.autor = autor;
        this.editora = editora;
        this.titulo = titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return isbn == livro.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "isbn=" + isbn +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
