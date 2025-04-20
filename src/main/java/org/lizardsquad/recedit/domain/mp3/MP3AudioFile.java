package org.lizardsquad.recedit.domain.mp3;

import java.util.Optional;
import lombok.Data;

@Data
public class MP3AudioFile {

	private final Optional<ID3V1> id3v1mp3;

	private MP3AudioFile(Builder builder) {
		this.id3v1mp3 = Optional.ofNullable(builder.id3V1);
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {

		private ID3V1 id3V1;

		public MP3AudioFile build() {
			return new MP3AudioFile(this);
		}

		public Builder id3v1mp3(ID3V1 id3V1) {
			this.id3V1 = id3V1;
			return this;
		}
	}
}