package com.lizardsquad.recedit.testSurObjet;

public class Perso {

  private final String nom;

  private final String prenom;

  private final Integer age;

  public Perso(PersoBuilder persoBuilder) {
    this.nom = persoBuilder.nom;
    this.prenom = persoBuilder.prenom;
    this.age = persoBuilder.age;
  }

  public String getNom() {
    return nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public Integer getAge() {
    return age;
  }

  public static class PersoBuilder {
    private String nom;
    private String prenom;
    private Integer age;

    public Perso build() {
      return new Perso(this);
    }

    public PersoBuilder nom(String nom) {
      this.nom = nom;
      return this;
    }

    public PersoBuilder prenom(String prenom) {
      this.prenom = prenom;
      return this;
    }

    // TODO: DECOMMENTER CE TRUC
    /*public PersoBuilder age(Integer age) {
      this.age = age;
      return this;
    }*/
  }
}
