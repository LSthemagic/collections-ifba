import java.util.ArrayList;
import java.util.List;

public class ModelLivro {
    List<Livro> list = new ArrayList<>();

    public void addLivro(Livro l){
        list.add(l);
    }

    public void removeLivro(Livro l){
        list.remove(l);
    }

    public void imprimirLIvros(){
        list.forEach(x-> System.out.println(x));
    }

    public boolean contemLivro(Livro l){
        return list.contains(l);
    }

    public Livro getLivro(Livro l){
        int index = list.indexOf(l);
        return  list.get(index);
    }

    public boolean eVazia(){
        return  list.isEmpty();
    }
}
