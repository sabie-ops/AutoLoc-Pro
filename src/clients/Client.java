package clients;


import com.sun.source.doctree.SystemPropertyTree;

public class Client {

    private String nom;
    private String prenom;
    private String numeroPermis;
    private String telephone;
    private int anneeNaissance;
    private static int compteurClients = 0;

    public Client() {
        this.nom = "N/A";
        this.prenom = "N/A";
        this.numeroPermis = "N/A";
        this.telephone = "N/A";
        this.anneeNaissance = 2000;

        compteurClients++;

    }

    public Client(String nom, String prenom, String numeroPermis, String telephone, int anneeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroPermis = numeroPermis;
        this.telephone = telephone;
        this.anneeNaissance = anneeNaissance;
        compteurClients++;
    }

    public Client(Client c) {
        this.nom = c.nom;
        this.prenom = c.prenom;
        this.numeroPermis = c.numeroPermis;
        this.telephone = c.telephone;
        this.anneeNaissance = c.anneeNaissance;
        compteurClients++;
    }

    public int calculerAge(int anneeCourante) {
        return anneeCourante - anneeNaissance;
    }


    public String getNom() {
        return nom;
    }

    public String getPrenom() {return prenom;}

    public String getNumeroPermis(){return numeroPermis;}
    public String getTelephone(){return telephone;}

    public int getAnneeNaissance() {return anneeNaissance;}

    public void setNom(String nom) {
        if (nom != null && !nom.isEmpty())
            System.out.println("le nom est vide");
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        if(prenom != null && !prenom.isEmpty())
            System.out.println("le prenom est vide");
        this.prenom = prenom;
    }

    public void setNumeroPermis(String numeroPermis) {
        if(numeroPermis != null && !numeroPermis.isEmpty())
            System.out.println("le numéro du permis est vide");
        this.numeroPermis = numeroPermis;
    }

    public void setTelephone(String telephone) {
        if(telephone != null && !telephone.isEmpty())
            System.out.println("le numéro de telephone est vide");
        this.telephone = telephone;
    }

    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    public void afficherInfo(){
        System.out.println("nom : "+nom);
        System.out.println("prenom : "+prenom);
        System.out.println("numero permis : "+numeroPermis);
        System.out.println("telephone : "+telephone);
        System.out.println("annee de naissance : "+anneeNaissance);
    }

    public static int getCompteurClients(){
        return compteurClients;
    }
}