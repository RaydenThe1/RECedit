package com.lizardsquad.recedit.screenshot.primary;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class ScreenshotViewer extends Application implements Runnable {

  public ScreenshotViewer() {}

  @Override
  public void start(Stage stage) throws Exception {

    Image imageFromPath = getImageFromPath(LocalDate.now() + ".png");
    ImageView imageView = new ImageView();
    imageView.setImage(imageFromPath);
    imageView.fitWidthProperty().bind(stage.widthProperty());
    imageView.setPreserveRatio(true);

    Scene scene = new Scene(new StackPane(imageView), 2560, 1440);
    stage.setTitle("Displaying of screenshot taken on " +  LocalDate.now());
    stage.setScene(scene);
    stage.setMaximized(true);
    stage.show();
  }

  private Image getImageFromPath(String path) throws IOException {
    Image image = null;
    Path pathClass = Paths.get("./img/" + LocalDate.now() + ".png");
    try (InputStream inputStream = Files.newInputStream(pathClass)) {
      if (inputStream != null) {
        image = new Image(inputStream);
      } else {
        String className = this.getClass().getSimpleName();
        System.out.println(className + " - Image was not found");
      }
    } catch (Exception ex) {
      String className = this.getClass().getSimpleName();
      System.out.println("[" + className + "]" + " - Unable to read image, ");
    }
    return image;
  }

  @Override
  public void run() {
    launch();
  }
}
