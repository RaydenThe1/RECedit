package com.lizardsquad.recedit.testSurObjet;

public class PersoFixture {

  private PersoFixture() {

  }

  public static Perso.PersoBuilder persoBuilder() {
    return new Perso.PersoBuilder().nom("LE").prenom("Alexandre").age(23);
  }

  public static Perso persoAlex() {
    return persoBuilder().build();
  }

  public static Perso persoSouly() {
    // TODO: test pour sonar voir si ça check bien
    return null;
  }
}
