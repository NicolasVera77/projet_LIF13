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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

//make clean && make && cd bin && java Main && cd ..

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
		primaryStage.setTitle("Jeu d'échecs");
		Group root = new Group();
        Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT, Color.WHITE);
        GridPane gPane = new GridPane();

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
        	

        		if((i+j)%2==0)
        		{
        			b.setStyle("-fx-background-color: #ffffff;");
        		}
        		else
        		{
        			b.setStyle("-fx-background-color: #87591A;");

        		}

                if(j==0)
                {
                    Image image = new Image("file:../img/TN.gif");

                    if((i==0) || (i==7))
                    {
                        image = new Image("file:../img/TN.gif");
                    }
                    else if((i==1) || (i==6))
                    {
                        image = new Image("file:../img/CN.gif");
                    }
                    else if((i==2) || (i==5))
                    {
                        image = new Image("file:../img/FN.gif");
                    }
                    else if(i==3)
                    {
                        image = new Image("file:../img/DN.gif");
                    }
                    else if(i==4)
                    {
                        image = new Image("file:../img/RN.gif");
                    }

                    ImageView iv1 = new ImageView();
                    iv1.setImage(image);
                    /*iv1.setFitWidth(100);
                    iv1.setPreserveRatio(true);*/

                    b.setGraphic(iv1);
                }
                else if(j==7)
                {
                    Image image = new Image("file:../img/TN.gif");

                    if((i==0) || (i==7))
                    {
                        image = new Image("file:../img/TB.gif");
                    }
                    else if((i==1) || (i==6))
                    {
                        image = new Image("file:../img/CB.gif");
                    }
                    else if((i==2) || (i==5))
                    {
                        image = new Image("file:../img/FB.gif");
                    }
                    else if(i==3)
                    {
                        image = new Image("file:../img/DB.gif");
                    }
                    else if(i==4)
                    {
                        image = new Image("file:../img/RB.gif");
                    }

                    ImageView iv1 = new ImageView();
                    iv1.setImage(image);
                    /*iv1.setFitWidth(100);
                    iv1.setPreserveRatio(true);*/

                    b.setGraphic(iv1);
                }
                else if(j==1)
                {
                    Image image = new Image("file:../img/PN.gif");

                    ImageView iv1 = new ImageView();
                    iv1.setImage(image);
                    /*iv1.setFitWidth(100);
                    iv1.setPreserveRatio(true);*/

                    b.setGraphic(iv1);
                }
                else if(j==6)
                {
                    Image image = new Image("file:../img/PB.gif");

                    ImageView iv1 = new ImageView();
                    iv1.setImage(image);
                    /*iv1.setFitWidth(100);
                    iv1.setPreserveRatio(true);*/

                    b.setGraphic(iv1);
                }

        		gPane.add(b, i, j);
        	}
        }

        // gPane.b.setGraphic(iv1);

        gPane.setPrefSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        gPane.setMinSize(Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE);

        root.getChildren().add(gPane);
        primaryStage.setScene(scene);


        primaryStage.show();
	}
}