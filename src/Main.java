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

import javafx.scene.Node;

//make clean && make && cd bin && java Main && cd ..

public class Main extends Application
{
	public static final int WINDOW_WIDTH = 800;
	public static final int  WINDOW_HEIGHT = 800;

	public static void main(String[] args)
	{
		Application.launch(Main.class, args);

        /*Plateau p = new Plateau();
        p.initialisation();

        System.out.println(p.getEchiquier(0, 0).getPiece().getChemin());
        //System.out.println(p.getEchiquier(4, 4).getPiece().getChemin());


        Deplacement d = new Deplacement(new Point(0, 0), new Point(4,4));
        p.seDeplacer(d);

        System.out.println(p.getEchiquier(0, 0).getPiece().getChemin());*/
        //System.out.println(p.getEchiquier(4, 4).getPiece().getChemin());


        //System.out.println(p.getEchiquier(0, 0).getPiece().getChemin());
	}

	@Override
	public void start(Stage primaryStage) 
	{
		primaryStage.setTitle("Jeu d'échecs");
		Group root = new Group();
        Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT, Color.WHITE);
        GridPane gPane = new GridPane();

        Plateau p = new Plateau();
        p.initialisation();

        affichage(gPane, p);

        /*gPane.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            public void handle(MouseEvent me)
            {
                event.getSceneX() 
                //Node source = (Node)me.getSource();
                Integer colIndex = gPane.getColumnIndex((Node)me.getSource());
                Integer rowIndex = gPane.getRowIndex((Node)me.getSource());
                Deplacement d = new Deplacement(new Point(colIndex.intValue(), rowIndex.intValue()), new Point(0,0));
                p.seDeplacer(d);
                affichage(gPane, p);
            }
        });*/

        // gPane.b.setGraphic(iv1);

        gPane.setPrefSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        gPane.setMinSize(Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE);

        root.getChildren().add(gPane);
        primaryStage.setScene(scene);


        primaryStage.show();
	}

    public void affichage(GridPane gPane, Plateau p)
    {
        for (int i=0; i<8; i++)
        {
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
                
                if(p.getEchiquier(j, i).getPiece() != null)
                {
                    Image image = new Image(p.getEchiquier(j, i).getPiece().getChemin());
                    ImageView iv1 = new ImageView();
                    iv1.setImage(image);
                    b.setGraphic(iv1);
                }

                gPane.add(b, i, j);
            }
        }

        for(Node n : gPane.getChildren())
        {
            n.setOnMouseClicked(new EventHandler<MouseEvent>()
            {
                public void handle(MouseEvent me)
                {
                    if(n.getBoundsInParent().contains(me.getSceneX(),me.getSceneY()))
                    {
                        n.setStyle("-fx-border-color: #FF0000");
                        //gPane[GridPane.getRowIndex(n)][GridPane.getColumnIndex(n)].setStyle("-fx-border-color: #444444");

                        for(Node n2 : gPane.getChildren())
                        {
                            n2.setOnMouseClicked(new EventHandler<MouseEvent>()
                            {
                                public void handle(MouseEvent me)
                                {
                                    if(n2.getBoundsInParent().contains(me.getSceneX(),me.getSceneY()))
                                    {
                                        Deplacement d = new Deplacement(new Point(GridPane.getRowIndex(n2), GridPane.getColumnIndex(n2)), new Point(GridPane.getRowIndex(n), GridPane.getColumnIndex(n)));
                                        p.seDeplacer(d);
                                        affichage(gPane, p);
                                    } 
                                   
                                }
                            });
                        }
                    } 
                   
                }
            });
        }
    }
}