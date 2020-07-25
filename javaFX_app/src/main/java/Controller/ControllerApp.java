package Controller;

import IOFile.ReaderFromFile;
import IOFile.WriterInFile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerApp implements Initializable {

    @FXML
    private Button buttonSaveResult;

    @FXML
    private Button buttonLoadResult;

    @FXML
    private Button buttonClearScreen;

    @FXML
    private Button buttonCountExample;

    @FXML
    private TextArea fieldEnter;

    @FXML
    private TextArea fieldResult;

    @FXML
    private ComboBox<String> changeExample;

    Stage primaryStage;

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public ComboBox<String> getChangeExample() {
        return (ComboBox<String>) changeExample;
    }

    public void setChangeExample(ComboBox<String> changeExample) {
        this.changeExample = changeExample;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void saveResult(ActionEvent actionEvent) {
        WriterInFile.writeInFile(fieldEnter.getText(), primaryStage, changeExample);

    }

    public void loadResult(ActionEvent actionEvent) {
        String rawData = ReaderFromFile.readFromFile(primaryStage);
        String data = "";
        if (rawData.contains("#NumberExpanded#\n")) {
            data = rawData.replace("#NumberExpanded#\n", "");
            changeExample.setValue("NumberExpanded");
        }
        if (rawData.contains("#LexicOrderArray#\n")) {
            data = rawData.replace("#LexicOrderArray#\n", "");
            changeExample.setValue("LexicOrderArray");

        }
        fieldEnter.setText(data);

    }

    public void clearScreen(ActionEvent actionEvent) {
        fieldResult.clear();
        fieldEnter.clear();

    }

    public void chooseExample(ActionEvent actionEvent) {
        //clearScreen(null);
    }

    public void countExample(ActionEvent actionEvent) {


    }


}
