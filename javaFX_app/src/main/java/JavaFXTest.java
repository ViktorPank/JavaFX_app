import Controller.ControllerApp;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.InputStream;

public class JavaFXTest extends Application {


    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        ObservableList<String> examples = FXCollections.observableArrayList("NumberExpanded", "LexicOrderArray");
        //Load FXML and set setting
        try {
            // Read file fxml and draw interface.
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MyScene.fxml"));
            Parent root = loader.load();
            ControllerApp controllerApp = (ControllerApp) loader.getController();
            controllerApp.setPrimaryStage(primaryStage);
            ComboBox <String> chooseExample = (ComboBox<String>) controllerApp.getChangeExample();
            chooseExample.setItems(examples);
            primaryStage.setTitle("My Application");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
        Load icon
         */
        InputStream iconStream = getClass().getResourceAsStream("images/man.png");
        Image image = new Image(iconStream);
        primaryStage.getIcons().add(image);

       // primaryStage.show();

    }

}
