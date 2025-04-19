package org.lizardsquad.recedit.domain.samples;

import org.lizardsquad.recedit.domain.mp3.Id3v1;
import org.lizardsquad.recedit.domain.mp3.Mp3AudioFile;

public class Mp3AudioFileSample {

	public static final Id3v1 ID_3_V_1 = Id3v1Sample.id3v1Mp3();
	public static final Integer ZIZI = 1;

	private Mp3AudioFileSample() {}

	public static Mp3AudioFile mp3AudioFile() {
		return Mp3AudioFile.builder()
			.id3v1mp3(ID_3_V_1)
			.build();
	}

	public static Mp3AudioFile.Builder mp3AudioFileBuilder() {
		return Mp3AudioFile.builder()
			.id3v1mp3(ID_3_V_1);
	}
}
