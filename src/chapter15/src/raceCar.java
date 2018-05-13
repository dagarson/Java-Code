import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.ArrayList;


 
public class raceCar extends Application {

    public static void main(String[] args) {
    	
        Application.launch(args);
    }

    @Override
    public void start(Stage primary) throws Exception {
        CPane pane = new CPane();		//console size
        Scene scene = new Scene(pane, 600, 200);

        primary.setTitle("raceCar");
        primary.setScene(scene);
        primary.show();
        pane.requestFocus();
    }

    class CPane extends Pane {

        final Car c = new Car();
        
        //incrementer
        int i = 1;

        public CPane() {
            getChildren().addAll(c);
            c.position(0, getHeight());
            c.size(1);

            KeyFrame keyFrame = new KeyFrame(Duration.millis(30), event -> move());
            Timeline timeline = new Timeline(keyFrame);
            timeline.setCycleCount(Timeline.INDEFINITE);
            timeline.play();

            setOnMousePressed(event -> timeline.pause());
            setOnMouseReleased(event -> timeline.play());
            setOnKeyReleased(event -> {
            							//press up key to increase speed
                if (event.getCode() == KeyCode.UP) {
                    i++;
                    					
                }						//press down key to decrease speed
                else if (event.getCode() == KeyCode.DOWN) {
                    i--;
                }
            });
        }

        public void move() {
            double x = c.getX();
            if (x + i > getWidth()) {
                x = -c.Width();
            } 
            else if (x + i < -c.Width()) {
                x = getWidth();
            } 
            else {
                x += i;
            }
            c.position(x + i, getHeight());
        }
    }

    class Car extends ArrayList<Shape> {

       //default serialable
		private static final long serialVersionUID = 1L;
		
		//color car
		private final Circle Left = new Circle(7, Color.BLACK);
        final Circle Right = new Circle(7, Color.BLACK);
        final Rectangle lowerBody = new Rectangle(50, 10, Color.FUCHSIA);
        final Polygon upperBody = new Polygon();
        double x = 0;
        double y = 0;
        double size = 1;

        public Car() {
            this(0, 0, 1);
        }

        public Car(double x, double y, double size) {
        				//color upper body
        	upperBody.setFill(Color.DARKBLUE);
        	
        	
            add(upperBody);
            add(lowerBody);
            add(Left);
            add(Right);
            this.x = x;
            this.y = y;
            this.size = size;
            buildCar();
        }


        public double getX() {
            return x;
        }

        public void position(double x, double y) {
            this.x = x;
            this.y = y;
            buildCar();
        }

        public void size(double size) {
            this.size = size;
            buildCar();
        }

        public double Width() {
            return 50 * size;
        }
        
        private void buildCar() {
            ObservableList<Double> points = upperBody.getPoints();
            points.clear();
            points.addAll(
                    x + 10 * size, y - 20 * size,
                    x + 20 * size, y - 30 * size,
                    x + 30 * size, y - 30 * size,
                    x + 40 * size, y - 20 * size
            );
            
            //build car body
            lowerBody.setX(x);
            lowerBody.setY(y - 20 * size);
            lowerBody.setWidth(50 * size);
            lowerBody.setHeight(10 * size);
            
            //build car left tire
            Left.setRadius(7 * size);
            Left.setCenterX(x + 15 * size);
            Left.setCenterY(y - 5 * size);
            
            //build car right tire
            Right.setRadius(7 * size);
            Right.setCenterX(x + 35 * size);
            Right.setCenterY(y - 5 * size);
        }
    }
}