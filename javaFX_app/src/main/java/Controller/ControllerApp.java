package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void saveResult(ActionEvent actionEvent){

    }

    public void loadResult(ActionEvent actionEvent){

    }

    public void clearScreen(ActionEvent actionEvent){
        fieldResult.clear();
        fieldEnter.clear();

    }

    public void countExample(ActionEvent actionEvent){


    }


}
