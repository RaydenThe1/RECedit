package com.lizardsquad.recedit.main;

import com.lizardsquad.recedit.screenshot.domain.Screenshot;
import com.lizardsquad.recedit.screenshot.secondary.ScreenshotEntity;
import com.lizardsquad.recedit.shared.generation.domain.ExcludeFromGeneratedCodeCoverage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

@ExcludeFromGeneratedCodeCoverage
public class Main {

    private void generateAndDisplayRandomArray() {
      Random rand = new Random();
      ArrayList<Integer> arr = new ArrayList<>();
      for (int i = 0; i < 20; i++) {
        arr.add(rand.nextInt(50));
        System.out.println("Array value is : " + arr.get(i));
      }
    }

  public static void main(String[] args) throws AWTException, IOException {

    // Normalement ce truc va dans un dossier primary
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    // passage de primary vers domain pour faire du traitement
    Screenshot screenshot = Screenshot.fromDimensionToDomain(screenSize);

    // passage vers secondary (Entity)
    ScreenshotEntity entity = ScreenshotEntity.toEntity(screenshot);
    ScreenshotEntity save = ScreenshotEntity.save(entity);
  }
}
