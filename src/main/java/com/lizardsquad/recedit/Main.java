package com.lizardsquad.recedit;

import com.lizardsquad.recedit.screenshot.domain.Screenshot;
import com.lizardsquad.recedit.screenshot.primary.ScreenshotViewer;
import com.lizardsquad.recedit.screenshot.secondary.ScreenshotEntity;
import com.lizardsquad.recedit.shared.generation.domain.ExcludeFromGeneratedCodeCoverage;

import java.awt.*;
import java.io.IOException;
import java.time.LocalDate;

@ExcludeFromGeneratedCodeCoverage
public class Main {

  public static void main(String[] args) throws AWTException, IOException {

    // Normalement ce truc va dans un dossier primary
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    // passage de primary vers domain pour faire du traitement
    Screenshot screenshot = Screenshot.fromDimensionToDomain(screenSize);

    // passage vers secondary (Entity)
    ScreenshotEntity entity = ScreenshotEntity.toEntity(screenshot);
    ScreenshotEntity.save(entity, LocalDate.now().toString());

    ScreenshotViewer viewer = new ScreenshotViewer();
    viewer.run();
  }
}
