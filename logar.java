import java.util.ArrayList;

public class logar{

    //Método validação login
    public Integer validacaoLogin(ArrayList<cadastrar>cadastrosUsuario, String emailUsuario, int senhaUsuario){
        for(int i=0; i<cadastrosUsuario.size(); i++){
            if(cadastrosUsuario.get(i).getEmailUsuario().equals(emailUsuario) && cadastrosUsuario.get(i).getSenhaUsuario() == senhaUsuario){
                return i;

            }
        }
        return null;
    }
    
    //Método retorna o nome do Usuário
    public String dadosUsuariosNome(ArrayList<cadastrar>cadastrosUsuario, int validacaoLogin){
        return(cadastrosUsuario.get(validacaoLogin).getNomeUsuario());
    }

    //Método retorna Id
    public int idUsuario(ArrayList<cadastrar>cadastrosUsuario, int validacaoLogin){
        return(cadastrosUsuario.get(validacaoLogin).getIdUsuario());
    }



}
