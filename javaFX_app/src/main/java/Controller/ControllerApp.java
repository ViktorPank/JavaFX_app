package Controller;

import IOFile.ReaderFromFile;
import IOFile.WriterInFile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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

    Stage primaryStage;

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void saveResult(ActionEvent actionEvent){
        WriterInFile.writeInFile(fieldEnter.getText(), primaryStage);

    }

    public void loadResult(ActionEvent actionEvent){
        fieldEnter.setText(ReaderFromFile.readFromFile(primaryStage));
    }

    public void clearScreen(ActionEvent actionEvent){
        fieldResult.clear();
        fieldEnter.clear();

    }

    public void countExample(ActionEvent actionEvent){


    }



}
