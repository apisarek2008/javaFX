package javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource("/fxml/StackPaneWindow.fxml"));
		StackPane stackPane = loader.load();
		
		Scene scene = new Scene(stackPane);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Apka");
		primaryStage.show();
		
		

		
		
	}

}
