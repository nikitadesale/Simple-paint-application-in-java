
package painting;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Painting extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("paintfxml.fxml"));

stage.setTitle("Painting");
stage.setScene(new Scene(root));
stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
