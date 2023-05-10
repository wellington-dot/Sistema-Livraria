public class Livros {
    private String nomeLivro;
    private String autorLivro;
    private double precoLivro;
    private int paginasLivro;
    private String editoraLivro;
    
    public Livros(String nomeLivro, String autorLivro, double precoLivro, int paginasLivro, String editoraLivro) {
        this.nomeLivro = nomeLivro;
        this.autorLivro = autorLivro;
        this.precoLivro = precoLivro;
        this.paginasLivro = paginasLivro;
        this.editoraLivro = editoraLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public double getPrecoLivro() {
        return precoLivro;
    }

    public void setPrecoLivro(double precoLivro) {
        this.precoLivro = precoLivro;
    }

    public int getPaginasLivro() {
        return paginasLivro;
    }

    public void setPaginasLivro(int paginasLivro) {
        this.paginasLivro = paginasLivro;
    }

    public String getEditoraLivro() {
        return editoraLivro;
    }

    public void setEditoraLivro(String editoraLivro) {
        this.editoraLivro = editoraLivro;
    }

}



