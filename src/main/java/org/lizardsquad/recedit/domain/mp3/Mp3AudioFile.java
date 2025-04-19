package org.lizardsquad.recedit.domain.mp3;

import java.util.Optional;
import lombok.Data;

@Data
public class Mp3AudioFile {

	private final Optional<Id3v1> id3v1mp3;

	private Mp3AudioFile(Builder builder) {
		this.id3v1mp3 = Optional.ofNullable(builder.id3V1);
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {

		private Id3v1 id3V1;

		public Mp3AudioFile build() {
			return new Mp3AudioFile(this);
		}

		public Builder id3v1mp3(Id3v1 id3V1) {
			this.id3V1 = id3V1;
			return this;
		}
	}
}