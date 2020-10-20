package dad.javafx.buscarreemplazar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private Controlador controller = new Controlador();

	@Override
	public void start(Stage primaryStage) throws Exception {
				
		Scene escena = new Scene(controller.getView(), 550, 200);
		
		primaryStage.setScene(escena);
		primaryStage.setTitle("Buscar y Reemplazar");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
