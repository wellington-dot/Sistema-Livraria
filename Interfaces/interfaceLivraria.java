import java.util.Scanner;

public class interfaceLivraria {

    Scanner input = new Scanner(System.in);
        
        String nomeLivro;
        String autorLivro;
        double precoLivro;
        int paginasLivro;
        String editoraLivro;        
        
        Livros livro = new Livros(nomeLivro, autorLivro, precoLivro, paginasLivro, editoraLivro);

   
    public void cadastrarLivros(){

        System.out.println("-------------------------------");
        System.out.println("CADASTRAR LIVROS: ");
        System.out.println("-------------------------------\n");
        System.out.print("Nome: ");
        nomeLivro = input.nextLine();

        System.out.print("Autor: ");
        autorLivro = input.nextLine();

        System.out.print("Preço: ");
        precoLivro = input.nextDouble();

        System.out.print("Páginas: ");
        paginasLivro = input.nextInt();
        input.nextLine();

        System.out.print("Editora: ");
        editoraLivro = input.nextLine();
        System.out.println("-------------------------------");



        livro.setNomeLivro(nomeLivro);
        livro.setAutorLivro(autorLivro);
        livro.setPrecoLivro(precoLivro);
        livro.setPaginasLivro(paginasLivro);
        livro.setEditoraLivro(editoraLivro);

    }

}