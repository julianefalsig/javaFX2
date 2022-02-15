
public class HelloFX {
    public class HelloFX extends Application {
        public static void run() {
            launch();
        }
        @Override
        public void start(Stage stage) throws Exception {
            String version = System.getProperty("javaFX: " + version);
            Lable lable = new Lable(text:"hello from JavaFX: " + version);
            StackPane stackpane = new StackPane(lable);
            Scene scene = new Scene(stackPane, width 640, hight:480);
            stage.setScene(scene);
            stage.show();
        }
        }
    }
}

