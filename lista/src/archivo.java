import java.io.BufferedReader;
import java.io.FileReader;

public class archivo {
    public String leerTXT(String direccion){
        String texto = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){

                temp = temp + bfRead;
            }
            texto = temp;
        }catch(Exception e){
            System.out.println("No se encontrĂ³ el archivo");
        }
        return texto;
    }
}
