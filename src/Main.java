import javafx.scene.Group;
import javafx.scene.control.Button;

import java.util.Observable;
import java.util.Observer;
import javafx.application.Application;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.effect.Blend;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.effect.Shadow;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.layout.Region;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.RowConstraints;

public class Main extends Application
{
	public static final int WINDOW_WIDTH = 800;
	public static final int  WINDOW_HEIGHT = 800;

	public static void main(String[] args)
	{
		Application.launch(Main.class, args);
	}

	@Override
	public void start(Stage primaryStage) 
	{
		Group root = new Group();
        Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT, Color.LIGHTBLUE);
        GridPane gPane = new GridPane();

        //gPane.setPrefSize(1000,1000);

        for (int i=0; i<8; i++)
        {
        	// RowConstraints row = new RowConstraints();
    		// row.setPercentHeight(50);
    		// gPane.getRowConstraints().add(row);
        	for (int j=0; j<8; j++)
        	{
        		ColumnConstraints column = new ColumnConstraints();
        		column.setPercentWidth(100);
        		gPane.getColumnConstraints().add(column);

        		Button b = new Button();
        		b.setMaxWidth(100);
        		b.setMinWidth(100);
        		b.setMaxHeight(100);
        		b.setMinHeight(100);
        		gPane.add(b, i, j);
        	}
        }

        gPane.setPrefSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        gPane.setMinSize(Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE);

        root.getChildren().add(gPane);
        primaryStage.setScene(scene);


        primaryStage.show();
	}
}