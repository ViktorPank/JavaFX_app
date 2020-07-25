package IOFile;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReaderFromFile {

    public static String readFromFile(Stage primarystage){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Загрузка файла данных");
        FileChooser.ExtensionFilter extensionFilter =
                new FileChooser.ExtensionFilter("DATA files (*.bin)", "*.bin");
        fileChooser.getExtensionFilters().add(extensionFilter);
        File file = fileChooser.showOpenDialog(primarystage);
        StringBuffer stringBuffer = new StringBuffer();

        try (FileReader fileReader = new FileReader(file)){
            char[] buf = new char[256];
            int c;
            while((c = fileReader.read(buf))>0){

                if(c < 256){
                    buf = Arrays.copyOf(buf, c);
                }
                stringBuffer.append(buf);
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return stringBuffer.toString();
    }
}
