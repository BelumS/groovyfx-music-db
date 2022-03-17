/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package groovyfx.music.db;

import groovy.util.logging.Slf4j;
import groovyfx.music.db.config.Datasource;
import groovyfx.music.db.controllers.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Paths;

@Slf4j
public class App extends Application {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    @Override
    public void init() throws Exception {
        super.init();
        if (!Datasource.INSTANCE.connect()) {
            log.error("FATAL ERROR: Couldn't connect to datasource!");
            System.exit(-1);
        }
    }

    static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final String fxmlFile = System.getProperty("user.dir") + "/src/main/resources/views/main.fxml";
        FXMLLoader loader = new FXMLLoader(Paths.get(fxmlFile).toUri().toURL());
        Parent root = loader.load();

        Controller controller = loader.getController();
        controller.listArtists();

        primaryStage.setTitle("Music Database");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        Datasource.INSTANCE.disconnect();
    }
}