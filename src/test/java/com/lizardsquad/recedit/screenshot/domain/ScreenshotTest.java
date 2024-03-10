package com.lizardsquad.recedit.screenshot.domain;

import com.lizardsquad.recedit.UnitTest;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.math.BigDecimal;

import static com.lizardsquad.recedit.screenshot.domain.ScreenshotFixture.*;
import static org.assertj.core.api.Assertions.assertThat;

@UnitTest
class ScreenshotTest {

  @Test
  void shouldBuild() {
    // Given + When
    Screenshot result = screenshotFixture();

    // Then
    assertThat(result).isNotNull();
    assertThat(result.getWidth()).isEqualTo(SCREENSHOT_WIDTH);
    assertThat(result.getHeight()).isEqualTo(SCREENSHOT_HEIGHT);
  }

  @Test
  void shouldToDomain() {
    // Given
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

    // When
    Screenshot result = Screenshot.fromDimensionToDomain(dimension);

    // Then
    assertThat(result).isNotNull();
    assertThat(result.getHeight()).isEqualTo(BigDecimal.valueOf(dimension.getHeight()));
    assertThat(result.getWidth()).isEqualTo(BigDecimal.valueOf(dimension.getWidth()));
  }
}
