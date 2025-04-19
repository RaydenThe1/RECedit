package org.lizardsquad.recedit.domain.mp3;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.lizardsquad.recedit.domain.samples.Id3v1Sample;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class Id3v1Test {

	@Test
	void shouldBuild() {
		Id3v1 id3V1 = Id3v1Sample.id3v1Mp3();

		assertThat(id3V1.getTitle()).isEqualTo(Id3v1Sample.TITLE);
		assertThat(id3V1.getArtist()).isEqualTo(Id3v1Sample.ARTIST);
		assertThat(id3V1.getAlbum()).isEqualTo(Id3v1Sample.ALBUM);
		assertThat(id3V1.getYear()).isEqualTo(Id3v1Sample.YEAR);
		assertThat(id3V1.getComment()).isEqualTo(Id3v1Sample.COMMENT);
		assertThat(id3V1.getGenre()).isEqualTo(Id3v1Sample.GENRE);
	}
}