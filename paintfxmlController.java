
package painting;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class paintfxmlController implements Initializable {

    @FXML
    private ColorPicker colorpicker;
    
    
    @FXML
    private TextField bsize;
    
    
    @FXML
    private Canvas canvas;
    
    
    boolean toolSelected = false;
    
    GraphicsContext brushTool;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        brushTool = canvas.getGraphicsContext2D();
        canvas.setOnMouseDragged( e -> {
        double size = Double.parseDouble(bsize.getText());
        double x = e.getX() - size /2;
        double y = e.getY() - size /2;
        
        if(toolSelected && !bsize.getText().isEmpty()){
            brushTool.setFill(colorpicker.getValue());
            brushTool.fillRoundRect(x, y, size, size, size, size);
        }
        
        });
    }    
    @FXML
    public void toolselected(ActionEvent e){
        toolSelected = true;
    }
}
