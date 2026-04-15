// USING THWOS KEYWORD TO THROW THE EXCEPTION 
// trows just indicate exception it can never handale exception 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class readwrite {
    void ReadFile() throws FileNotFoundException  // using throws keyword for exception handling another one can handle according to the project 
    {
        FileInputStream fis = new FileInputStream("c:desktop/good.txt");
    }

    void Savefile() throws FileNotFoundException   
    // using throws keyword for exception handling another one can handle according to the project 
    {
        String text = "my name";
        FileOutputStream fos = new FileOutputStream("c:dounload/myfile.txt");
    }
    
}

// HANDLING THIS EXCEPTION 

class test{
    public static void main(String[] args) throws FileNotFoundException // this the mathod so throws keyword use here it can just indicat the exception
    // prifrabale is to use try catch to handal the exception 

    // THROS KEYWORD CAN TERMINAT MAIN MATHOD AND WE DONT WANT TO TERMINAT ABNORMALLY MAIN MATHOD SO WE CAN USE TRY-CATCH
    {
        readwrite rw = new readwrite();
    

       // rw.ReadFile(); // this is the caller mathod it can accur the error FileNotFoundException
        rw.Savefile();  // this is the caller mathod it can accur the error FileNotFoundException

      // WE CAN HANDALE THIS ON 2 WAYS 
      // USING TRY- CATCH
      // ALSO USING THROWS KEYWORD 

      try{
        rw.ReadFile();
        // rw.Savefile();
      }
      catch(FileNotFoundException e)
      {
        e.printStackTrace();
        System.out.println(e);
      }

        
    }
}
