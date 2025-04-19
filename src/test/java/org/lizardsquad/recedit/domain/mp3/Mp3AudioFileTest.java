package org.lizardsquad.recedit.domain.mp3;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.lizardsquad.recedit.domain.samples.Id3v1Sample;
import org.lizardsquad.recedit.domain.samples.Mp3AudioFileSample;

class Mp3AudioFileTest {

	@Test
	void shouldBuild() {
		Mp3AudioFile mp3AudioFile = Mp3AudioFileSample.mp3AudioFile();

		assertThat(mp3AudioFile).isNotNull();
		assertThat(mp3AudioFile.getId3v1mp3()).contains(Id3v1Sample.id3v1Mp3());
	}
}