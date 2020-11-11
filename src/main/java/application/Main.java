package application;

//Test JEROME
//hat es geklappt?
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Main extends Application {

	private BorderPane root = new BorderPane();
	private Canvas canvas = new Canvas(2000, 2000);
	private Group bord = new Group();
	private Board board = new Board( 2, 2, canvas.getWidth()/4, canvas.getHeight()/4);

	@Override
	public void start(Stage primaryStage) {
		try {






			for (int i = 0; i< board.getHorizontalTiles(); i++) {
				for (int j = 0; j<board.getVerticalTiles(); j++) {
					bord.getChildren().add(board.getRectangleField()[i][j]);
				}
			}

			root.setCenter(bord);
			primaryStage.setScene(new Scene(root));
			primaryStage.setTitle("Welcome to Memory!");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}