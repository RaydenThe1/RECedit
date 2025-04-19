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

	public Id3v1(Builder builder) {
		this.title =   builder.title;
		this.artist =  builder.artist;
		this.album =   builder.album;
		this.year =    builder.year;
		this.comment = builder.comment;
		this.genre =   builder.genre;
	}
	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		private String title;
		private String artist;
		private String album;
		private Year year;
		private String comment;
		private Genre genre;

		public Id3v1 build(){
			return new Id3v1(this);
		}

		public Builder title(String title) {
			this.title = title;
			return this;
		}

		public Builder artist(String artist) {
			this.artist = artist;
			return this;
		}

		public Builder album(String album) {
			this.album = album;
			return this;
		}

		public Builder year(Year year) {
			this.year = year;
			return this;
		}

		public Builder comment(String comment) {
			this.comment = comment;
			return this;
		}

		public Builder genre(Genre genre) {
			this.genre = genre;
			return this;
		}
	}
}

