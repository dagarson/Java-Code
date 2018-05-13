import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class selectingColors extends Application {
	
	//get variables for slider
	public Text showColors = new Text("Show Colors");
	public Slider red = new Slider();
	public Slider green = new Slider();
	public Slider blue = new Slider();
	public Slider opacity = new Slider();
	

    public static void main(String[] args) {
        Application.launch(args);
    }
	
    
	@Override 
	public void start(Stage primaryStage) {
		// Create stack pane 
		StackPane textPane = new StackPane(showColors);
		textPane.setPadding(new Insets(20, 10, 5, 10));

		//red
		red.setMin(0.0);
		red.setMax(1.0);
		red.valueProperty().addListener(ov -> setColor());
		
		//green
		green.setMin(0.0);
		green.setMax(1.0);
		green.valueProperty().addListener(ov -> setColor());
		
		//blue
		blue.setMin(0.0);
		blue.setMax(1.0);
		blue.valueProperty().addListener(ov -> setColor());
		
		//opacity
		opacity.setMin(0.0);
		opacity.setMax(1.0);
		opacity.valueProperty().addListener(ov -> setColor());
		opacity.setValue(1);
		
		
		
	
		
		GridPane sliderPane = new GridPane();
		sliderPane.setAlignment(Pos.CENTER);
		sliderPane.setVgap(4);
		sliderPane.setHgap(4);
		
		//label red
		sliderPane.add(new Label("Red"), 0, 0);
		sliderPane.add(red, 1, 0);
		
		//label green
		sliderPane.add(new Label("Green"), 0, 1);
		sliderPane.add(green, 1, 1);
		
		//label blue
		sliderPane.add(new Label("Blue"), 0, 2);
		sliderPane.add(blue, 1, 2);
		
		//label opacity
		sliderPane.add(new Label("Opacity"), 0, 3);
		sliderPane.add(opacity, 1, 3);

	
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(textPane);
		borderPane.setCenter(sliderPane);

	
		
		primaryStage.setTitle("SelectingColor");
		
		Scene scene = new Scene(borderPane, 300, 200);
		
		primaryStage.setScene(scene); 
		primaryStage.show();
	}

	
		void setColor() {
		showColors.setFill(new Color(red.getValue(), green.getValue(), 
		blue.getValue(), opacity.getValue()));
	}

}
