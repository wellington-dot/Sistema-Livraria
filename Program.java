import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;

public class Program {
    public static void main(String[] args) throws IOException, InterruptedException{
        Scanner input = new Scanner(System.in);

        logar logar = new logar();
        ArrayList<cadastrar> cadastrosUsuario = new ArrayList<>();

        boolean statusSistema = true;
        int opcoesInput;
        int idUsuario;

        //Criando o arquivo
        try {
        File arquivo = new File("C:/Users/rweli/Desktop/CÓDIGOS/Vs Code/java/SistemaLivraria/Usuarios.txt");
        arquivo.createNewFile();

        } catch (IOException erro) {
            System.out.println("an error ocurred");
            erro.printStackTrace();
        }
        
        do {
            System.out.println("-------------------------------");
            System.out.println("     AMAZING HISTORIES");
            System.out.println("-------------------------------");
            System.out.println("Bem vindo, oque deseja fazer?");
            System.out.println("\n1.Logar \n2.Cadastrar \n3.Listar Usuários");
            System.out.println("-------------------------------");
            System.out.print("Escolha uma opção: ");
            
            opcoesInput = input.nextInt();
            input.nextLine();

            if(opcoesInput == 1){

                //Limpar tela
                if (System.getProperty("os.name").contains("Windows")){
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                }   else{
                    Runtime.getRuntime().exec("clear");
                }
                String emailUsuario;
                int senhaUsuario;
                System.out.println("-------------------------------");
                System.out.println("LOGAR-SE: ");
                System.out.println("-------------------------------\n");
                System.out.print("Seu email: ");
                emailUsuario = input.nextLine();

                System.out.print("Sua Senha: ");
                senhaUsuario = input.nextInt();
                input.nextLine();
                System.out.println("-------------------------------");

                Integer validacaoLogin = logar.validacaoLogin(cadastrosUsuario ,emailUsuario, senhaUsuario);

                if(validacaoLogin == null){
                    System.out.println("Este login não existe.");
                } else {
                    String dadoNome;
                    dadoNome = logar.dadosUsuariosNome(cadastrosUsuario, validacaoLogin); 
                    System.out.println("Bem vindo Sr(a): " + dadoNome);
                }

                idUsuario = logar.idUsuario(cadastrosUsuario, validacaoLogin);
                
            
            } else if(opcoesInput == 2){

                if (System.getProperty("os.name").contains("Windows")){
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                }   else{
                    Runtime.getRuntime().exec("clear");
                }
                //Variaveis auxiliares
                String nomeUsuario;
                int idadeUsuario;
                String telefoneUsuario;
                String cpfUsuario;
                String emailUsuario;
                int senhaUsuario;

                System.out.println("-------------------------------");
                System.out.println("Cadastrar-se:");
                System.out.println("-------------------------------\n");
                System.out.println("Id: ");
                idUsuario = input.nextInt();

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

                if (System.getProperty("os.name").contains("Windows")){
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                }   else{
                    Runtime.getRuntime().exec("clear");
                }

            }else if(opcoesInput == 3){
                System.out.println("-------------------------------");
                System.out.println("Lista de Usuários: ");
                System.out.println("-------------------------------");
                try {
                    File arquivo = new File("C:/Users/rweli/Desktop/CÓDIGOS/Vs Code/java/SistemaLivraria/Usuarios.txt");
                    Scanner read = new Scanner(arquivo);
                    
                    while(read.hasNextLine()){
                        String leitura = read.nextLine();
                        System.out.println(leitura);
                    }
                    read.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
            }

            try { Thread.sleep (3000); } catch (InterruptedException ex) { }

            System.out.println("\nPresione qualquer tecla para voltar ao inicio..");
            input.nextLine();

            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }   else{
                Runtime.getRuntime().exec("clear");
            }
                
            }else{
                System.out.println("Resposta inválida.");
            }
            



        }while(statusSistema == true);

        input.close();
    }
}
