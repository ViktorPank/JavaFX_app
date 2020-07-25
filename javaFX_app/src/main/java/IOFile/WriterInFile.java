package IOFile;

import Controller.ControllerApp;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterInFile {

    public static void writeInFile(String data, Stage primaryStage) {
        if (data != null) {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Сохранить данные в файл");
            FileChooser.ExtensionFilter extensionFilter =
                    new FileChooser.ExtensionFilter("DATA files (*.bin)", "*.bin");
            fileChooser.getExtensionFilters().add(extensionFilter);
            File file = fileChooser.showSaveDialog(primaryStage);

            try (FileWriter writer = new FileWriter(file , false)) {
                writer.write(data);
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
