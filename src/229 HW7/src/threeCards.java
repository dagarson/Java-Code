import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import java.util.ArrayList;

	


public class threeCards extends Application {
	@Override
	public void start(Stage primaryStage){
		ArrayList<Integer> cardList = new ArrayList<>();
		for (int i =1; i <= 52; i++){
			cardList.add(i);	
		}
		java.util.Collections.shuffle(cardList);
		HBox console = new HBox(3);
		console.setAlignment(Pos.CENTER);
		console.getChildren().add(new ImageView("file:card/"+ cardList.get(0)+ ".png"));
		console.getChildren().add(new ImageView("file:card/"+ cardList.get(1)+ ".png"));
		console.getChildren().add(new ImageView("file:card/"+ cardList.get(2)+ ".png"));
		
		Scene show = new Scene(console);
		primaryStage.setTitle("threeCards");
		primaryStage.setScene(show);
		primaryStage.show();
	}
	
	public static void main(String[] args){
		launch(args);
	}

    
}