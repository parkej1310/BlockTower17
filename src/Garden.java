import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;

public class Garden extends Application {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        Image Garden = new Image(new FileInputStream("C:\\Users\\nickr\\CPSC_233\\images\\Garden.png"));
        ImageView GardenView = new ImageView(Garden);
        GardenView.setFitHeight(600);
        GardenView.setFitWidth(1000);
        
        HBox cards = new HBox();
        
        Button peabutton = new Button();
        Image card_peashooter = new Image(new FileInputStream("C:\\Users\\nickr\\CPSC_233\\images\\card_peashooter.png"));
        ImageView card_ps = new ImageView(card_peashooter);
        card_ps.setX(200);
        card_ps.setFitHeight(100);
        card_ps.setFitWidth(140);
        card_ps.setPreserveRatio(true);
        peabutton.setGraphic(card_ps);
        
        Button sunflowerbutton = new Button();
        Image card_sunflower = new Image(new FileInputStream("C:\\Users\\nickr\\CPSC_233\\images\\card_sunflower.png"));
        ImageView card_sun = new ImageView(card_sunflower);
        card_sun.setX(200);
        card_sun.setFitHeight(100);
        card_sun.setFitWidth(140);
        card_sun.setPreserveRatio(true);
        sunflowerbutton.setGraphic(card_sun);
        
        cards.getChildren().add(peabutton);
        cards.getChildren().add(sunflowerbutton);
        
        Group root = new Group(cards);
        Scene scene = new Scene(root, 1000, 600);
        primaryStage.setTitle("PvZ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}