package test;

import vehicules.Vehicule;

public class TestVehicule {
    public static void main(){
        Vehicule v0;
        v0 = new Vehicule("KEDLDEO0","Mclaren","RG5",40,35,true);
        v0.afficherinfos();
        v0.rouler(500);

    }
}
