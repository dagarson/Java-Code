import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class fourCards extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        BorderPane pane = new BorderPane();
        FourCardPane cardPane = new FourCardPane();
        Button button = new Button("Refresh");
        button.setOnAction(event -> cardPane.refreshCards());
        pane.setTop(cardPane);
        pane.setBottom(button);
        BorderPane.setAlignment(button, Pos.CENTER);
        Scene scene = new Scene(pane);

        primaryStage.setTitle("FourCards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private class FourCardPane extends HBox{
        private final List<Integer> cardList = generateRandomNumberList();
        private final ImageView card1 = new ImageView();
        private final ImageView card2 = new ImageView();
        private final ImageView card3 = new ImageView();
        private final ImageView card4 = new ImageView();


        public FourCardPane() {
            setSpacing(4);
            setPadding(new Insets(4));
            getChildren().addAll(card1, card2, card3, card4);
            refreshCards();
        }

        public void refreshCards() {
            Collections.shuffle(cardList);
            card1.setImage(new Image("file:card/" + cardList.get(0) + ".png"));
            card2.setImage(new Image("file:card/" + cardList.get(1) + ".png"));
            card3.setImage(new Image("file:card/" + cardList.get(2) + ".png"));
            card4.setImage(new Image("file:card/" + cardList.get(3) + ".png"));
        }

        private List<Integer> generateRandomNumberList() {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 1; i <= 52; i++) {
                list.add(i);
            }
            Collections.shuffle(list);
            return list;
        }
    }
}
