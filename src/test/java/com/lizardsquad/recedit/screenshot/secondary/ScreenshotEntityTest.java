package com.lizardsquad.recedit.screenshot.secondary;

import com.lizardsquad.recedit.screenshot.domain.Screenshot;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;

import static com.lizardsquad.recedit.screenshot.domain.ScreenshotFixture.*;
import static com.lizardsquad.recedit.screenshot.secondary.ScreenshotEntityFixture.*;
import static org.assertj.core.api.Assertions.assertThat;

class ScreenshotEntityTest {

  @Test
  void shouldBuild() {
    // Given + When
    ScreenshotEntity result = screenshotEntityFixture();

    // Then
    assertThat(result).isNotNull();
    assertThat(result.getWidth()).isEqualTo(SCREENSHOT_ENTITY_WIDTH);
    assertThat(result.getHeight()).isEqualTo(SCREENSHOT_ENTITY_HEIGHT);
  }

  @Test
  void shouldToEntity() {
    // Given
    Screenshot screenshot = screenshotFixture();

    // When
    ScreenshotEntity result = ScreenshotEntity.toEntity(screenshot);

    // Then
    assertThat(result).isNotNull();
    assertThat(result.getHeight()).isEqualTo(screenshot.getHeight());
    assertThat(result.getWidth()).isEqualTo(screenshot.getWidth());
  }

  @Disabled
  // TODO: LANCEZ PAS LE TEST, CV FAIRE UN SCREEN, FAUT QUE JE FIX
  // C PAS CENSE FAIRE CA
  @Test
  void shouldSave() throws IOException, AWTException {
    // Given
    ScreenshotEntity entity = screenshotEntityFixture();

    // When
    ScreenshotEntity result = ScreenshotEntity.save(entity, "test");

    // Then
    assertThat(result).isNotNull();
    assertThat(result.getWidth()).isEqualTo(SCREENSHOT_ENTITY_WIDTH);
    assertThat(result.getHeight()).isEqualTo(SCREENSHOT_ENTITY_HEIGHT);
  }
}
