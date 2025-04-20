package org.lizardsquad.recedit.domain.samples;

import org.lizardsquad.recedit.domain.mp3.ID3V1;
import org.lizardsquad.recedit.domain.mp3.MP3AudioFile;

public class MP3AudioFileSample {

	public static final ID3V1 ID_3_V_1 = ID3V1Sample.id3v1Mp3();
	public static final Integer ZIZI = 1;

	private MP3AudioFileSample() {}

	public static MP3AudioFile mp3AudioFile() {
		return MP3AudioFile.builder()
			.id3v1mp3(ID_3_V_1)
			.build();
	}

	public static MP3AudioFile.Builder mp3AudioFileBuilder() {
		return MP3AudioFile.builder()
			.id3v1mp3(ID_3_V_1);
	}
}
