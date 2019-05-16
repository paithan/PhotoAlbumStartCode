//This is terribly-designed code for the beginning of a software-engineering project.
// Authors: Grant Holliday, Stephanie Labeck, Jacob Reich <jjreich15@gmail.com>, Jonathan Rozenberg, Kyle Burke <paithanq@gmail.com>
import javafx.application.Application;
import javafx.geometry.*;
import javafx.embed.swing.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.ScrollPane;

public class DuckFaceAggregator extends Application {

public String MONKEY_TITLE = "Duck Faces Bonanza Party!!!!!";

  public static void main(String[] args) {launch(args);}

  public void start(Stage primaryStage) {
    String[] duckFace_photos = new String[] {"photos/AmberDuckFace.jpg", "photos/BenStillerDuckFace.jpg", "photos/ArianaGrandeDuckFace.jpg", "photos/JessicaSimpsonDuckFace.jpg", "photos/KyleDuckFace2.jpg"};
    String[] capShuns = new String[] {"Photo A", "Photo 2", "Photo 3", "Photo D", "Best DuckFace Evar!!!!!!!!!1"};

    //solution from stackoverflow user Sagar Damani at: https://stackoverflow.com/questions/14025718/javafx-toolkit-not-initialized-when-trying-to-play-an-mp3-file-through-mediap
            final JFXPanel bananarama = new JFXPanel();


    primaryStage.setTitle(this.MONKEY_TITLE);
    final GridPane paneofgridmonkeys = new GridPane();
    paneofgridmonkeys.setAlignment(Pos.CENTER);
    paneofgridmonkeys.setVgap(10);

    Image sweetnessForever = new Image(duckFace_photos[0]);
    ImageView viewapalooza = new ImageView();
    viewapalooza.setImage(sweetnessForever);
    paneofgridmonkeys.add(viewapalooza, 0, 0);
        paneofgridmonkeys.add(new Label("I got this one from Wikipedia"), 0, 1);
        final Image belugasForever = new Image(duckFace_photos[1]);
        final ImageView viewapalooza2 = new ImageView();
        viewapalooza2.setImage(belugasForever);
        paneofgridmonkeys.add(viewapalooza2, 0, 2);
        paneofgridmonkeys.add(new Label(capShuns[1]), 0, 3);
        Image bitternessForever = new Image(duckFace_photos[2]);
            ImageView viewapalooza3 = new ImageView();
            viewapalooza3.setImage(bitternessForever);
            paneofgridmonkeys.add(viewapalooza3, 0, 4);
            //this is a useless comment
            paneofgridmonkeys.add(new Label(capShuns[2]), 0, 5);
                ImageView viewapaloozaGrant = new ImageView();
                viewapaloozaGrant.setImage(new Image(duckFace_photos[3]));
                paneofgridmonkeys.add(viewapaloozaGrant, 0, 6);
                paneofgridmonkeys.add(new Label(capShuns[3]), 0, 7);
                sweetnessForever = new Image(duckFace_photos[4]);
                    ImageView viewapalooza99 = new ImageView();
                    viewapalooza99.setImage(sweetnessForever);
                    paneofgridmonkeys.add(viewapalooza99, 0, 8);
                    paneofgridmonkeys.add(new Label(capShuns[4]), 0, 9);

                    //Setting the position of the image


                    Button button = getButton();
                    button.setText("Change the first photo.");
                    button.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            //code to play a song modified from stackoverflow user jasonwaste's answer on https://stackoverflow.com/questions/6045384/playing-mp3-and-wav-in-java

                            Image newAwesomeImage = new Image("photos/DuckmanDuckFace.jpeg");
                            ImageView view = new ImageView();
                            view.setImage(newAwesomeImage);
                            paneofgridmonkeys.add(view, 0, 0);
                            paneofgridmonkeys.add(new Label("Changed the image!"), 0, 1);}});
                              paneofgridmonkeys.add(button, 0, 10);



ScrollPane allTehFaces = new ScrollPane(paneofgridmonkeys);
allTehFaces.setFitToWidth(true);
    primaryStage.setScene(new Scene(allTehFaces, 500, 1000));primaryStage.show();




  }


  public static Button getButton() { return new Button();}


} //end of DuckFaceAggegator.java
