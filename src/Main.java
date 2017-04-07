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

public class Main extends Application
{
	public static void main(String[] args)
	{
		Application.launch(Main.class, args);
	}

	@Override
	public void start(Stage primaryStage) 
	{		
		Group root = new Group();
        Scene scene = new Scene(root, 800, 600, Color.LIGHTBLUE);
        GridPane gPane = new GridPane();

        for (int i=0; i<8; i++)
        {
        	for (int j=0; j<8; j++)
        	{
        		gPane.add(new Button(), i, j);
        	}	
        }

        root.getChildren().add(gPane);
        primaryStage.setScene(scene);


        primaryStage.show();
	}
}