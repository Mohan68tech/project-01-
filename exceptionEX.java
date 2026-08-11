import java.io.*;
public class exceptionEX{
    public static void main(String[] args){

        try{
            FileReader file = new
            FileReader("data.text");
            BufferedReader br = new
            BufferedReader(file);
System.out.println(br.readLine());
br.close();

        }catch (IOException e) {
            System.out.println("File not found or cannot be read.");

        }
    }
}