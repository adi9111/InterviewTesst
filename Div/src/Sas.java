import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class Sas {

  public static void main(String[] args) {

      int wartosc = 0;
    FileReader fr= null;
   double suma=0;

    //OTWIERANIE PLIKU:
    try {
        fr = new FileReader("dane.txt");
     } catch (FileNotFoundException e) {
           System.out.println("B£¥D PRZY OTWIERANIU PLIKU!");
          
     }

     StreamTokenizer st = new StreamTokenizer(fr);
     //ODCZYT KOLEJNYCH "TOKENÓW" Z PLIKU:
     try {
        while( (wartosc = st.nextToken()) != StreamTokenizer.TT_EOF ){
              if(wartosc == StreamTokenizer.TT_WORD)
                    System.out.println("Wczytano s³owo: "+ st.sval);
              else if(wartosc == StreamTokenizer.TT_NUMBER)  
                    System.out.println("Wczytano liczbê: "+ st.nval);
                    suma+=st.nval;
                    
         }
      } catch (IOException e) {
            System.out.println("B£¥D ODCZYTU Z PLIKU!");
            
      }
     System.out.println(suma);

      //ZAMYKANIE PLIKU:
      try {
         fr.close();
      } catch (IOException e) {
           System.out.println("B£¥D PRZY ZAMYKANIU PLIKU!");
           
      }
   }
}