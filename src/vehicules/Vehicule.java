package vehicules;

public class Vehicule {
    private String immatriculation;
    private String marque;
    private String modele;
    private int kilometrage;
    private double tarifJournalier;
    private boolean disponible;
    private static int compteurVehicules = 0;
    public static final String DEVISE = "EUR";

    public Vehicule(){
       this.immatriculation = "N/A";
       this.marque = "N/A";
       this.modele = "N/A";
       this.kilometrage = 0;
       this.tarifJournalier = 0.0;
       this.disponible= true;

        compteurVehicules++;
    }

    public Vehicule(String immatriculation,String marque,String modele,int kilometrage,double tarifJournalier,boolean disponible){
            this.immatriculation = immatriculation;
            this.marque = marque;
            this.modele = modele;
            this.kilometrage = kilometrage;
            this.tarifJournalier = tarifJournalier;
            this.disponible = disponible;
        compteurVehicules++;
    }


    public Vehicule(Vehicule v){
        this.immatriculation = v.immatriculation;
        this.marque = v.marque;
        this.modele = v.modele;
        this.kilometrage = v.kilometrage;
        this.tarifJournalier = v.tarifJournalier;
        this.disponible = v.disponible;

        compteurVehicules++;
    }

    public void rouler(int km){
            this.kilometrage = kilometrage + km;

    }

    public void afficherinfos(){
       System.out.println("Vehicule"+"{"+"immatriculation = "+immatriculation+","+" marque = "+marque+","+" modele = "+modele+","+" km = "+kilometrage+","+" tarif = "+tarifJournalier+","+" disponible = "+disponible+"}");
    }

    public String getImmatriculation(){
        return immatriculation;
    }
    public String getMarque(){
        return marque;
    }
    public  String getModele(){
        return modele;
    }
    public int getKilometrage(){
        return kilometrage;
    }
    public double getTarifJournalier(){
        return tarifJournalier;
    }
    public boolean getDisponible(){
        return disponible;
    }

    public void setMarque(String marque) {
        if (marque != null && !marque.isEmpty())
            this.marque = marque;
    }

    public void setModele(String modele) {
        if (modele != null && !modele.isEmpty())
            this.modele = modele;
    }

    public void setKilometrage(int kilometrage) {
        if (kilometrage < 0 )
            System.out.println("ERREUR : le kilometrage est en négatif ");

        this.kilometrage = kilometrage;
    }

    public void setTarifJournalier(double tarifJournalier) {
        if (tarifJournalier < 0)
            System.out.println("ERREUR : le tarif est en négatif ");

        this.tarifJournalier = tarifJournalier;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public static int getCompteurVehicules(){
        return compteurVehicules;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s %s - %d km - %.2f %s/jour - %s",
                immatriculation, marque, modele, kilometrage, tarifJournalier, DEVISE,
                disponible ? "DISPONIBLE" : "INDISPONIBLE");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicule autre = (Vehicule) obj;
        return this.immatriculation.equals(autre.immatriculation);
    }

}






