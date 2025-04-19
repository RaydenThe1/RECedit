package org.lizardsquad.recedit.domain.mp3;

import lombok.Data;
import lombok.Getter;

public enum Genre {
	RAP(1),
	POP(2);

	@Getter
	private Integer id;

	Genre(int id) {
		this.id = id;
	}

}
