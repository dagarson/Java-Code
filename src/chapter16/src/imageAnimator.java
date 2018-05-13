import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;


public class imageAnimator extends Application {

	 public static void main(String[] args) {
	        Application.launch(args);
	    }
	 
    @Override
    public void start(Stage primaryStage) throws Exception {

        TextAnimationPane pane = new TextAnimationPane();


        primaryStage.setScene(new Scene(pane, 600, 300));
        primaryStage.setTitle("Text Animation");
        primaryStage.show();
    }

    private class TextAnimationPane extends BorderPane {

        Button Start = new Button("Start Animation");

        long animationSpeed;
        String prefix;
        String Directory = "L";
        String extension = ".gif";
        int numImages;
        int current = 1;
        String url;
       
      

        Timeline timeline = null;

        StackPane centerPane = new StackPane();
        TextAnimationPane() {

            setCenter(centerPane);

            HBox top = new HBox(Start);
            top.setAlignment(Pos.CENTER_RIGHT);
            setTop(top);
            

            GridPane bottom = new GridPane();
            bottom.setPadding(new Insets(5));
            bottom.setHgap(5);

            
            Label lblInfo = new Label("Enter information for animation");
            bottom.add(lblInfo, 0, 0);

            
            TextField speed = new TextField();
            speed.setPrefColumnCount(30);
            Label lblAnimationSpeed = new Label("Animation Speed i milliseconds");
            bottom.add(lblAnimationSpeed, 0, 1);
            bottom.add(speed, 1, 1);

            
            TextField imagePrefix = new TextField();
            imagePrefix.setPrefColumnCount(30);
            Label lblImagePrefix = new Label("Image file prefix");
            bottom.add(lblImagePrefix, 0, 2);
            bottom.add(imagePrefix, 1, 2);

            
            TextField numbImages = new TextField();
            numbImages.setPrefColumnCount(30);
            Label lblNumberOfImages = new Label("Number of Images");
            bottom.add(lblNumberOfImages, 0, 3);
            bottom.add(numbImages, 1, 3);

            
            TextField audioUrl = new TextField();
            audioUrl.setPrefColumnCount(30);
            Label lblAudioFileUrl = new Label("Audio file URL");
            bottom.add(lblAudioFileUrl, 0, 4);
            bottom.add(audioUrl, 1, 4);
            setBottom(bottom);

            
            Start.setOnAction(e -> {
                animationSpeed = Long.parseLong(speed.getText().trim());
                prefix = imagePrefix.getText().trim();
                numImages = Integer.parseInt(numbImages.getText());
                url = audioUrl.getText();
                Timeline();});
           
        }

         void Timeline(){
            if (timeline != null) {
                current = 1; 
                timeline = null;
                timeline.stop();
            }

            timeline = new Timeline(
            new KeyFrame(Duration.millis(animationSpeed), e-> nextImage()));

            
            
            MediaPlayer m = new MediaPlayer(new Media(url));
            m.play();
            m.setCycleCount(MediaPlayer.INDEFINITE);
            timeline.setOnFinished(event -> m.stop());
            timeline.setCycleCount(numImages);
            timeline.play();
        }

        void nextImage(){
            centerPane.getChildren().clear();
            centerPane.getChildren().add(
            new ImageView(new Image(Directory +
            		prefix +
            		current++ +
            		extension)));
        }


    }
  
}