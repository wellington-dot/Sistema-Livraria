import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class interfaceCadastro {
    
    Scanner input = new Scanner(System.in);

    ArrayList<cadastrar> cadastrosUsuario = new ArrayList<>();
    
    int idUsuario;
    String nomeUsuario;
    int idadeUsuario;
    String telefoneUsuario;
    String cpfUsuario;
    String emailUsuario;
    int senhaUsuario;

    public void cadastrarUsuarios(){
        System.out.println("-------------------------------");
        System.out.println("Cadastrar-se:");
        System.out.println("-------------------------------\n");
        System.out.print("Id: ");
        idUsuario = input.nextInt();
        input.nextLine();

        System.out.print("Nome: ");
        nomeUsuario = input.nextLine();

        System.out.print("Idade: ");
        idadeUsuario = input.nextInt();
        input.nextLine();

        System.out.print("Telefone: ");
        telefoneUsuario = input.nextLine();

        System.out.print("Cpf: ");
        cpfUsuario = input.nextLine();

        System.out.print("Email: ");
        emailUsuario = input.nextLine();

        System.out.print("Senha: ");
        senhaUsuario = input.nextInt();
        input.nextLine();
        System.out.println("-------------------------------");

        cadastrar infoUsuario = new cadastrar(idUsuario, nomeUsuario, idadeUsuario, telefoneUsuario, cpfUsuario, emailUsuario, senhaUsuario);

        cadastrosUsuario.add(infoUsuario);

        //Salvar cadastro no arquivo
        try(FileWriter fw = new FileWriter("C:/Users/rweli/Desktop/CÓDIGOS/Vs Code/java/SistemaLivraria/Usuarios.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println("-------------------------------\n" + 
                "Nome: " + nomeUsuario + "\nIdade: " + idadeUsuario + 
                    "\nTelefone: " + telefoneUsuario + "\nCpf: " + cpfUsuario + 
                        "\nEmail: " + emailUsuario + "\nSenha: " + senhaUsuario + 
                                                    "\n-------------------------------");
        } catch (IOException e) {
                System.out.println("Nao conseguiu salvar");
        }

        try { Thread.sleep (3000); } catch (InterruptedException ex) { }


    }
}
