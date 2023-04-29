import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        logar logar = new logar();
        ArrayList<cadastrar> cadastrosUsuario = new ArrayList<>();

        boolean statusSistema = true;
        int logarCadastrar;
        
        
        do {
            System.out.println("     Amazing Histories");
            System.out.println();
            System.out.println("Bem vindo, oque deseja fazer?");
            System.out.println("Digite: Logar 1, Cadastrar 2.");
            logarCadastrar = input.nextInt();
            input.nextLine();

            if(logarCadastrar == 1){

                String emailUsuario;
                int senhaUsuario;
                

                System.out.print("Seu email: ");
                emailUsuario = input.nextLine();

                System.out.print("Sua Senha: ");
                senhaUsuario = input.nextInt();
                input.nextLine();

                Integer validacaoLogin = logar.validacaoLogin(cadastrosUsuario ,emailUsuario, senhaUsuario);

                if(validacaoLogin == null){
                    System.out.println("Este login não existe.");
                } else {
                    String dadoNome;
                    dadoNome = logar.dadosUsuariosNome(cadastrosUsuario, validacaoLogin); 
                    System.out.println("Bem vindo Sr(a): " + dadoNome);
                }
                
            
            } else if(logarCadastrar == 2){
                //Variaveis auxiliares
                String nomeUsuario;
                int idadeUsuario;
                String telefoneUsuario;
                String cpfUsuario;
                String emailUsuario;
                int senhaUsuario;

                System.out.println("Cadastrar-se:");
                System.out.println();
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

                cadastrar infoUsuario = new cadastrar(nomeUsuario, idadeUsuario, telefoneUsuario, cpfUsuario, emailUsuario, senhaUsuario);

                cadastrosUsuario.add(infoUsuario);

                for(cadastrar x : cadastrosUsuario){
                    System.out.println(x);
                }

            }else{
                System.out.println("Resposta inválida.");
            }
            



        }while(statusSistema == true);

        input.close();
    }
}
