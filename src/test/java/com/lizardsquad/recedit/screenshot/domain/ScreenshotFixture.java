package com.lizardsquad.recedit.screenshot.domain;

import java.math.BigDecimal;

public class ScreenshotFixture {

  public static final BigDecimal SCREENSHOT_WIDTH = BigDecimal.valueOf(1920);
  public static final BigDecimal SCREENSHOT_HEIGHT = BigDecimal.valueOf(1080);

  private ScreenshotFixture() {

  }

  public static Screenshot.ScreenshotBuilder screenshotBuilder() {
    return new Screenshot.ScreenshotBuilder().width(SCREENSHOT_WIDTH).height(SCREENSHOT_HEIGHT);
  }

  public static Screenshot screenshotFixture() {
    return screenshotBuilder().build();
  }
}
