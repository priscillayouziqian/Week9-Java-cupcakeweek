import java.io.File;
import java.io.IOException;

public class CreateFile {
    public CreateFile(){ //this line is constructor function
        try{
            File salesData = new File("salesData.txt");
            if(salesData.createNewFile()){
                System.out.println("File created: " + salesData.getName());
            }else{
                System.out.println("File already exists.");
            }

        }catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
