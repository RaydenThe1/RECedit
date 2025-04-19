package org.lizardsquad.recedit.domain.mp3;

import java.time.Year;
import lombok.Data;

@Data
public class Id3v1 {

	private String title;

	private String artist;

	private String album;

	private Year year;

	private String comment;

	private Genre genre;
}
