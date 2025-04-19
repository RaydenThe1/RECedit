package org.lizardsquad.recedit.domain.samples;

import java.time.Year;
import org.lizardsquad.recedit.domain.mp3.Genre;
import org.lizardsquad.recedit.domain.mp3.Id3v1;

public class Id3v1Sample {

	public static final String TITLE = "International Love";
	public static final String ARTIST = "Chris Brown";
	public static final String ALBUM = "The Lord of the Rings";
	public static final Year YEAR = Year.of(2011);
	public static final String COMMENT = "très belle musique";
	public static final Genre GENRE = Genre.POP;

	private Id3v1Sample() {}

	public static Id3v1 id3v1Mp3() {
		return Id3v1.builder().title(TITLE)
						.artist(ARTIST)
						.album(ALBUM)
						.year(YEAR)
						.comment(COMMENT)
						.genre(GENRE)
						.build();
	}
}
