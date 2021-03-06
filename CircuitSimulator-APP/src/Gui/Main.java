package Gui; /**
 * Gui.Main class
 *
 * @author Prášek Matěj - xprase07
 * @author Tichý Michal - xtichy26
 */
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;


public class Main extends Application {

    /**
     * Gui.Main method
     *
     * @param args arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Method that starts stage
     *
     * @param primaryStage stage to start
     */
	@Override
	public void start(Stage primaryStage) {
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                System.exit(0);
            }
        });
		BorderPane root = new BorderPane();

        Thread.setDefaultUncaughtExceptionHandler((t, e) -> {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Unfortunately error occurred during requested operation.");
            alert.show();
        });

        Scene scene = new Scene(root, 850, 600);
        scene.getStylesheets().add(getClass().getResource("/application.css").toExternalForm());
        primaryStage.setTitle("Circuit simulator");
        primaryStage.setScene(scene);
        primaryStage.show();

		root.setCenter(new RootLayout());
	}
}
