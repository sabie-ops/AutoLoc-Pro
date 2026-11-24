package clients;


public class Client {

private String nom;
private String prenom;
private String numeroPermis;
private String telephone;
private int anneeNaissance;

public Client(){}

public Client(String nom, String prenom, String numeroPermis, String telephone, int anneeNaissance){
    this.nom = nom;
    this.prenom = prenom;
    this.numeroPermis = numeroPermis;
    this.telephone = telephone;
    this.anneeNaissance = anneeNaissance;
}

public Client(Client c){
    this.nom = c.nom;
    this.prenom = c.prenom;
    this.numeroPermis = c.numeroPermis;
    this.telephone = c.telephone;
    this.anneeNaissance = c.anneeNaissance;
}

public int calculerAge(int anneeCourante){
    return anneeCourante - anneeNaissance;
}

}
