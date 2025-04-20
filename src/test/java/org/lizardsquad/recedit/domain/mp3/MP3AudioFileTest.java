package org.lizardsquad.recedit.domain.mp3;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.lizardsquad.recedit.domain.samples.ID3V1Sample;
import org.lizardsquad.recedit.domain.samples.MP3AudioFileSample;

class MP3AudioFileTest {

	@Test
	void shouldBuild() {
		MP3AudioFile mp3AudioFile = MP3AudioFileSample.mp3AudioFile();

		assertThat(mp3AudioFile).isNotNull();
		assertThat(mp3AudioFile.getId3v1mp3()).contains(ID3V1Sample.id3v1Mp3());
	}
}