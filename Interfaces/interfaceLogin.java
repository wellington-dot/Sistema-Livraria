import java.util.ArrayList;
import java.util.Scanner;

public class interfaceLogin {

    String emailUsuario;
    int senhaUsuario;
    int idUsuario;
    interfaceCadastro cadastrosDeUsuarios = new interfaceCadastro();
    logar logar = new logar();

    Scanner input = new Scanner(System.in);

    public void verificacaoLogin(){
        System.out.println("-------------------------------");
        System.out.println("LOGAR-SE: ");
        System.out.println("-------------------------------\n");
        System.out.print("Seu email: ");
        emailUsuario = input.nextLine();

        System.out.print("Sua Senha: ");
        senhaUsuario = input.nextInt();
        input.nextLine();
        System.out.println("-------------------------------");

        Integer validacaoLogin = logar.validacaoLogin(cadastrosDeUsuarios.cadastrosUsuario ,emailUsuario, senhaUsuario);

        if(validacaoLogin == null){
            System.out.println("Este login não existe.");
        } else{
            String dadoNome;
            dadoNome = logar.dadosUsuariosNome(cadastrosDeUsuarios.cadastrosUsuario, validacaoLogin); 
            System.out.println("Bem vindo Sr(a): " + dadoNome);
        }
        idUsuario = logar.idUsuario(cadastrosDeUsuarios.cadastrosUsuario , validacaoLogin);
    }

}