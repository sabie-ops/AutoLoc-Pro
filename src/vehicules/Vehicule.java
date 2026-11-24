package vehicules;

public class Vehicule {
    private String immatriculation;
    private String marque;
    private String modele;
    private int kilometrage;
    private double tarifJournalier;
    private boolean disponible;

    public Vehicule(){
       this.immatriculation = "N/A";
       this.marque = "N/A";
       this.modele = "N/A";
       this.kilometrage = 0;
       this.tarifJournalier = 0.0;
       this.disponible= true;
    }

    public Vehicule(String immatriculation,String marque,String modele,int kilometrage,double tarifJournalier,boolean disponible){
            this.immatriculation = immatriculation;
            this.marque = marque;
            this.modele = modele;
            this.kilometrage = kilometrage;
            this.tarifJournalier = tarifJournalier;
            this.disponible = disponible;
    }


    public Vehicule(Vehicule v){
        this.immatriculation = v.immatriculation;
        this.marque = v.marque;
        this.modele = v.modele;
        this.kilometrage = v.kilometrage;
        this.tarifJournalier = v.tarifJournalier;
        this.disponible = v.disponible;
    }

    public void rouler(int km){
            km = kilometrage+1;
    }

    public void afficherinfos(){
       System.out.println("Vehicule"+"{"+"nimmatriculation = "+immatriculation+","+" marque = "+marque+","+" modele = "+modele+","+" km = "+kilometrage+","+" tarif = "+tarifJournalier+","+" disponible = "+disponible+"}");
    }

}






