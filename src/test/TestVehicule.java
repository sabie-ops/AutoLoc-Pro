package test;

import vehicules.Vehicule;

public class TestVehicule {
    public static void main(){
        Vehicule v0;
        v0 = new Vehicule("KEDLDEO0","Mclaren","RG5",40,35,true);
        v0.afficherinfos();
        v0.rouler(250);
        v0.afficherinfos();

        Vehicule v1;
        v1= new Vehicule();
        v1.afficherinfos();
        v1.rouler(250);
        v1.afficherinfos();

        Vehicule v2;
        v2 = new Vehicule(v1);
        v2.afficherinfos();
    }
}
