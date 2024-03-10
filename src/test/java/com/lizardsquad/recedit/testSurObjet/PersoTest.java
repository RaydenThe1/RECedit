package com.lizardsquad.recedit.testSurObjet;

import com.lizardsquad.recedit.UnitTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@UnitTest
class PersoTest {

  @Test
  void shouldBuild() {

    Perso perso = PersoFixture.persoAlex();

    assertThat(perso).isNotNull();
    assertThat(perso.getNom()).isEqualTo("LE");
    assertThat(perso.getPrenom()).isEqualTo("dsqd");
    //assertThat(perso.getAge()).isEqualTo(23);
  }
}
