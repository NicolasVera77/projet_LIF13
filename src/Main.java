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

	// affiche la saisie et le résultat
	Text affichage;

	@Override
	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("Jeu d'échecs");

		// gestion du placement (permet de palcer le champ Text affichage en haut, et GridPane gPane au centre)
		BorderPane border = new BorderPane();

		// permet de placer les diffrents boutons dans une grille
		GridPane gPane = new GridPane();

		int column = 0;
		int row = 0;

		affichage = new Text("");
		affichage.setFont(Font.font ("Verdana", 20));
		affichage.setFill(Color.RED);
		border.setTop(affichage);

		// création des bouton et placement dans la grille
		for (String s : new String[]{"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "+", "0", "(", ")"})
		{
			final Text t = new Text(s);
			t.setWrappingWidth(30);
			t.setFont(Font.font ("Verdana", 20));
			t.setTextAlignment(TextAlignment.CENTER);

			gPane.add(t, column++, row);

			if (column > 3)
			{
				column = 0;
				row++;
			}
		}

		final Text t = new Text("=");
		t.setWrappingWidth(30);
		gPane.add(t, column++, row);
		t.setTextAlignment(TextAlignment.CENTER);

		gPane.setGridLinesVisible(true);

		border.setCenter(gPane);

		Scene scene = new Scene(border, Color.LIGHTBLUE);

		primaryStage.setScene(scene);
		primaryStage.show();
	}
}