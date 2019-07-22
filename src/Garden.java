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

public class Test1 extends Application {
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

        Button wallnutbutton = new Button();
        Image card_wallnut = new Image(new FileInputStream("C:\\Users\\nickr\\CPSC_233\\images\\card_wallnut.png"));
        ImageView card_wn = new ImageView(card_wallnut);
        card_wn.setX(200);
        card_wn.setFitHeight(100);
        card_wn.setFitWidth(140);
        card_wn.setPreserveRatio(true);
        wallnutbutton.setGraphic(card_wn);

        Button cherryBombButton = new Button();
        Image card_cherrybomb = new Image(new FileInputStream("C:\\Users\\nickr\\CPSC_233\\images\\card_cherrybomb.png"));
        ImageView card_cb = new ImageView(card_cherrybomb);
        card_cb.setX(200);
        card_cb.setFitHeight(100);
        card_cb.setFitWidth(140);
        card_cb.setPreserveRatio(true);
        cherryBombButton.setGraphic(card_cb);

        Button freezePeaShooterButton = new Button();
        Image card_freezepeashooter = new Image(new FileInputStream("C:\\Users\\nickr\\CPSC_233\\images\\card_freezepeashooter.png"));
        ImageView card_fp = new ImageView(card_freezepeashooter);
        card_fp.setX(200);
        card_fp.setFitHeight(100);
        card_fp.setFitWidth(140);
        card_fp.setPreserveRatio(true);
        freezePeaShooterButton.setGraphic(card_fp);

        cards.getChildren().add(peabutton);
        cards.getChildren().add(sunflowerbutton);
        cards.getChildren().add(wallnutbutton);
        cards.getChildren().add(cherryBombButton);
        cards.getChildren().add(freezePeaShooterButton);

        Group root = new Group(GardenView, cards);
        Scene scene = new Scene(root, 1000, 600);
        primaryStage.setTitle("PvZ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
