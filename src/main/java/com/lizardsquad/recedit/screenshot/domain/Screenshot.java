package com.lizardsquad.recedit.screenshot.domain;

import com.lizardsquad.recedit.shared.generation.domain.ExcludeFromGeneratedCodeCoverage;

import java.awt.*;
import java.math.BigDecimal;

public class Screenshot {

  private final BigDecimal width;

  private final BigDecimal height;


  public Screenshot(Screenshot.ScreenshotBuilder screenshotBuilder) {
    this.width = screenshotBuilder.width;
    this.height = screenshotBuilder.height;
  }

  // TODO: decommenter ce truc c pour sonar voir si ça marche bien
  public BigDecimal getWidth() {
    return width;
  }

  public BigDecimal getHeight() {
    return height;
  }

  public static class ScreenshotBuilder {

    private BigDecimal width;
    private BigDecimal height;


    public Screenshot build() {
      return new Screenshot(this);
    }

    public ScreenshotBuilder width(double width) {
      this.width = BigDecimal.valueOf(width);
      return this;
    }

    public ScreenshotBuilder height(double height) {
      this.height = BigDecimal.valueOf(height);
      return this;
    }

    public ScreenshotBuilder width(BigDecimal width) {
      this.width = width;
      return this;
    }

    public ScreenshotBuilder height(BigDecimal height) {
      this.height = height;
      return this;
    }
  }

  @ExcludeFromGeneratedCodeCoverage
  public static Screenshot fromDimensionToDomain(Dimension dimension) {
    return new ScreenshotBuilder()
      .width(dimension.getWidth())
      .height(dimension.getHeight())
      .build();
  }
}
