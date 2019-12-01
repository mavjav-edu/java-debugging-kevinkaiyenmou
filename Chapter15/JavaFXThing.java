import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import java.net.URL;
/**  To compile, make sure to set the --module-path and the -cp in `javac`. So you will run something like
 * javac --module-path "$(eval echo ~$USER)/Downloads/javafx-sdk-14/lib/*" -cp "$(eval echo ~$USER)/Downloads/javafx-sdk-14/lib/*" -d . JavaFXThing.java
  */

public class JavaFXThing extends Application{

  public static void main(String[] args) {
    launch(args);
  }
  @Override
  public void start(Stage primaryStage) throws Exception {

    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(new URL("/Users/kevinmou/Documents/GitHub/java-debugging-kevinkaiyenmou/Chapter15/Hello.fxml"));
    AnchorPane anchorpane = loader.<AnchorPane>load();

    Scene scene = new Scene(anchorpane);
    primaryStage.setScene(scene);
    primaryStage.show();

  }

}
