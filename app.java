import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    public static void main (String [] args){
        launch(args);

    }

    public void start(Stage stage){
        HBox root = new HBox();
       
        VBox playOptions = new VBox();
        VBox settings = new VBox();
        root.getChildren().addAll(settings,playOptions);
       
        Button buttonHappyBirthday = new Button("Happy birthday");
        buttonHappyBirthday.setOnAction(event -> Tunes.happyBirthday());
        Button buttonJingleBells = new Button("Jingle bells");
        buttonJingleBells.setOnAction(event -> Tunes.jingleBells());
        Button buttontwinkle = new Button("Twinkle Twinkle");
        buttontwinkle.setOnAction(event -> Tunes.twinkle());
   
     
        Slider sliderVolume = new Slider();
        playOptions.getChildren().addAll(buttonHappyBirthday,buttonJingleBells,buttontwinkle);
        
        final Scene scene = new Scene(root, 500,500);
        stage.setScene(scene);
        stage.show();

    }
}
