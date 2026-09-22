package exercicio1oo;

public class TesteLivro {
    public static void main(String[] args){
        Livro livro = new Livro();
        livro.titulo = "Programador Pragmatico";
        livro.autor = "Andrew Hunt";
        livro.genero = "Engenharia de Softwere";
        livro.emprestado = true;

        System.out.println("Livro: " + livro.titulo);
        System.out.println("Autor do Livro: " + livro.autor);
        System.out.println("Genero do Livro: " + livro.genero);
        System.out.println("O livro esta emprestado? " + livro.emprestado);
    }
}
