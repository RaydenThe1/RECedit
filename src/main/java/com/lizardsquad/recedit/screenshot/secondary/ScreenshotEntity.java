package com.lizardsquad.recedit.screenshot.secondary;

import com.lizardsquad.recedit.screenshot.domain.Screenshot;
import com.lizardsquad.recedit.shared.generation.domain.ExcludeFromGeneratedCodeCoverage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;

// En fait cette classe elle sert a rien mais c juste pour l'exemple
public class ScreenshotEntity {

  private final BigDecimal width;

  private final BigDecimal height;


  public ScreenshotEntity(ScreenshotEntity.ScreenshotEntityBuilder screenshotBuilder) {
    this.width = screenshotBuilder.width;
    this.height = screenshotBuilder.height;
  }

  public BigDecimal getWidth() {
    return width;
  }

  public BigDecimal getHeight() {
    return height;
  }

  public static class ScreenshotEntityBuilder {

    private BigDecimal width;
    private BigDecimal height;

    public ScreenshotEntity build() {
      return new ScreenshotEntity(this);
    }

    public ScreenshotEntity.ScreenshotEntityBuilder width(BigDecimal width) {
      this.width = width;
      return this;
    }

    public ScreenshotEntity.ScreenshotEntityBuilder height(BigDecimal height) {
      this.height = height;
      return this;
    }
  }

  public static ScreenshotEntity toEntity(Screenshot screenshot) {
    return new ScreenshotEntityBuilder()
      .width(screenshot.getWidth())
      .height(screenshot.getHeight())
      .build();
  }

  @ExcludeFromGeneratedCodeCoverage
  public static ScreenshotEntity save(ScreenshotEntity entity, String name) throws AWTException, IOException {
    Robot robot = new Robot();
    BufferedImage image = robot.createScreenCapture(new Rectangle(entity.getWidth().intValue(), entity.getHeight().intValue()));
    ImageIO.write(image, "png", new File("./img/"+ name + ".png"));
    return entity;
  }
}
