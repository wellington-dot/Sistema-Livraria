public class cadastrar {
    
    private int idUsuario;
    private String nomeUsuario;
    private int idadeUsuario;
    private String telefoneUsuario;
    private String cpfUsuario;
    private String emailUsuario;
    private int senhaUsuario;
    
    public cadastrar(int idUsuario, String nomeUsuario, int idadeUsuario, String telefoneUsuario, String cpfUsuario,
            String emailUsuario, int senhaUsuario) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.idadeUsuario = idadeUsuario;
        this.telefoneUsuario = telefoneUsuario;
        this.cpfUsuario = cpfUsuario;
        this.emailUsuario = emailUsuario;
        this.senhaUsuario = senhaUsuario;
    }

    public int getIdUsuario(){
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario){
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getIdadeUsuario() {
        return idadeUsuario;
    }

    public void setIdadeUsuario(int idadeUsuario) {
        this.idadeUsuario = idadeUsuario;
    }

    public String getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public void setTelefoneUsuario(String telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public int getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(int senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    @Override
    public String toString(){
        return "id: " + idUsuario + "\nNome: "+ nomeUsuario + "\nIdade: " + idadeUsuario + 
                "\nTelefone: " + telefoneUsuario + "\nCpf: " + cpfUsuario + 
                "\nEmail: " + emailUsuario + "\nSenha: " + senhaUsuario;
    }
    
}