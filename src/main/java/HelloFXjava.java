import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class HelloFXjava extends Application
{
    public static void run() {
        launch();
    }
    @Override
    public void start(Stage stage) throws Exception {
        String version = System.getProperty("javafx.version");
        Label label = new Label("hello from JavaFX_ commit nr.2 juliane : " + version);
        StackPane stackPane = new StackPane(label);
        //Scene scene = new Scene(stackPane, 640,480);
        //stage.setScene(scene);
        //stage.show();
        //FlowPane flowPane = new FlowPane(label);
        //flowPane.getChildren().add(new Label("Hej IT 62450!"));

        Label label1 = new Label("Hello from JavaFX: " + version);
        Label label2 = new Label("Hej IT 62450!");

        GridPane pane = new GridPane();
        pane.setGridLinesVisible(true); // Only for debugging/layouting
        pane.add(label1,0,0);
        pane.add(label2,1,1);
        Scene scene = new Scene(pane, 640,480);
        stage.setScene(scene);
        stage.show();

        }

    }
