package dad.javafx.template;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {	

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		
		Scene escena = new Scene(root, 320, 200);
		
		primaryStage.setScene(escena);
		primaryStage.setTitle("Título app");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
