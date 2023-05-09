import java.io.IOException;

public class clearDisplay {
    
    //método de limpar a tela
    public void cleanDisplay() throws IOException, InterruptedException{
        if (System.getProperty("os.name").contains("Windows")){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }   else{
            Runtime.getRuntime().exec("clear");
        }
    }
}
