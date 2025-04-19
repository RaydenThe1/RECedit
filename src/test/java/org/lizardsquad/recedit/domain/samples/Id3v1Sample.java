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
		Id3v1 id3V1 = new Id3v1();
		id3V1.setTitle(TITLE);
		id3V1.setArtist(ARTIST);
		id3V1.setAlbum(ALBUM);
		id3V1.setYear(YEAR);
		id3V1.setComment(COMMENT);
		id3V1.setGenre(GENRE);

		return id3V1;
	}
}
