package browser;

/**
 * Created by enginoz on 22.12.2017.
 */


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import org.w3c.dom.NodeList;
import org.w3c.dom.html.HTMLDivElement;

public class BrowserTests extends Application {

    private Scene scene;

    @Override
    public void start(Stage stage) {
        stage.setTitle("Web View");
        scene = new Scene(new Browser(), 700, 500, Color.web("#666970"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

class Browser extends Region {
    final WebView browser = new WebView();
    final WebEngine webEngine = browser.getEngine();

    public Browser() {
        webEngine.load("https://tfxtarget.turkiyefinans.com.tr/logon.aspx");
        getChildren().add(browser);
        webEngine.documentProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                NodeList elements = newValue.getElementsByTagName("div");
                for (int i = 0; i < elements.getLength(); i++) {
                    HTMLDivElement divElement = (HTMLDivElement) elements.item(i);
                    String align = divElement.getAlign();
                }
            }
        });
    }
}
