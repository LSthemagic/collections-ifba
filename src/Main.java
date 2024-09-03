public class Main {
    public static void main(String[] args) {
        Livro l = new Livro(123, "fulano", "edit ltda", "ccqq");
        Livro l1 = new Livro(12, "ciclano", "edit ltda", "qq");
        Livro l2 = new Livro(1234, "beltrano", "edit ltda", "2c2q");
        Livro l3 = new Livro(12, "quatrano", "edit ltda", "four4");

        ModelLivro modelLivro = new ModelLivro();
        modelLivro.addLivro(l);
        modelLivro.addLivro(l1);
        modelLivro.addLivro(l2);
        modelLivro.addLivro(l3);

        System.out.println(modelLivro.getLivro(l));
        modelLivro.removeLivro(l1);

        System.out.println(modelLivro.contemLivro(l3));
        System.out.println(modelLivro.contemLivro(new Livro(1,"","","")));
        System.out.println(modelLivro.eVazia());
        modelLivro.imprimirLIvros();

    }
}