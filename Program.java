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
        interfaceCadastro cadastro = new interfaceCadastro();
        interfaceLivraria livros = new interfaceLivraria();
        clearDisplay limpar = new clearDisplay();
        
        boolean statusSistema = true;
        int opcoesInput;
        

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
            System.out.println("\n1.Logar \n2.Cadastrar Usuários \n3.Cadastrar Livros \n4.Listar Usuários \n5.Listar Livros ");
            System.out.println("-------------------------------");
            System.out.print("Escolha uma opção: ");
            
            opcoesInput = input.nextInt();
            input.nextLine();

            if(opcoesInput == 1){

                //Limpar tela
                limpar.cleanDisplay();

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
                limpar.cleanDisplay();

                cadastro.cadastrarUsuarios();

                System.out.println("\nCadastro concluido!");

                try { Thread.sleep (3000); } catch (InterruptedException ex) { }

                System.out.println("\nPresione qualquer tecla para voltar ao inicio..");
                input.nextLine();

                limpar.cleanDisplay();

            }else if(opcoesInput == 3){
                limpar.cleanDisplay();
            
                livros.cadastrarLivros();

                System.out.println("\nCadastro concluido!");

                try { Thread.sleep (3000); } catch (InterruptedException ex) { }

                System.out.println("\nPresione qualquer tecla para voltar ao inicio..");
                input.nextLine();

                limpar.cleanDisplay();
                
            } else if(opcoesInput == 4){
                limpar.cleanDisplay();

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

                limpar.cleanDisplay();
                
            }else{
                limpar.cleanDisplay();
                System.out.println("\nOpção inválida.");
                System.out.println("\nRetornando ao menu em 3 segundos..");
                try { Thread.sleep (3000); } catch (InterruptedException ex) { }
                limpar.cleanDisplay();
            }          

        }while(statusSistema == true);

        input.close();
    }
}
