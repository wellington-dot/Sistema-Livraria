import java.util.Scanner;

public class Livros {
    private String nomeLivro;
    private String autorLivro;
    private double precoLivro;
    private int paginasLivro;
    private String editoraLivro;
    
    Scanner input = new Scanner(System.in);


    public void cadastrarLivros(){
        System.out.println("-------------------------------");
        System.out.println("CADASTRAR LIVROS: ");
        System.out.println("-------------------------------\n");
        System.out.print("Nome: ");
        this.nomeLivro = input.nextLine();

        System.out.print("Autor: ");
        this.autorLivro = input.nextLine();

        System.out.print("Preço: ");
        this.precoLivro = input.nextDouble();

        System.out.print("Páginas: ");
        this.paginasLivro = input.nextInt();
        input.nextLine();

        System.out.print("Editora: ");
        this.editoraLivro = input.nextLine();





    }


}
