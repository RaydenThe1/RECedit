package org.lizardsquad.recedit.domain.mp3;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.lizardsquad.recedit.domain.samples.ID3V1Sample;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ID3V1Test {

	@Test
	void shouldBuild() {
		ID3V1 id3V1 = ID3V1Sample.id3v1Mp3();

		assertThat(id3V1.getTitle()).isEqualTo(ID3V1Sample.TITLE);
		assertThat(id3V1.getArtist()).isEqualTo(ID3V1Sample.ARTIST);
		assertThat(id3V1.getAlbum()).isEqualTo(ID3V1Sample.ALBUM);
		assertThat(id3V1.getYear()).isEqualTo(ID3V1Sample.YEAR);
		assertThat(id3V1.getComment()).isEqualTo(ID3V1Sample.COMMENT);
		assertThat(id3V1.getGenre()).isEqualTo(ID3V1Sample.GENRE);
	}
}