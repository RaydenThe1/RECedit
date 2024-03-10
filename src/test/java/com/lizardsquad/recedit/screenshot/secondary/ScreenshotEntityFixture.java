package com.lizardsquad.recedit.screenshot.secondary;

import com.lizardsquad.recedit.screenshot.domain.Screenshot;

import java.math.BigDecimal;

public class ScreenshotEntityFixture {


  public static final BigDecimal SCREENSHOT_ENTITY_WIDTH = BigDecimal.valueOf(2560);
  public static final BigDecimal SCREENSHOT_ENTITY_HEIGHT = BigDecimal.valueOf(1440);

  private ScreenshotEntityFixture() {

  }

  public static ScreenshotEntity.ScreenshotEntityBuilder screenshotEntityBuilder() {
    return new ScreenshotEntity.ScreenshotEntityBuilder().width(SCREENSHOT_ENTITY_WIDTH).height(SCREENSHOT_ENTITY_HEIGHT);
  }

  public static ScreenshotEntity screenshotEntityFixture() {
    return screenshotEntityBuilder().build();
  }
}
