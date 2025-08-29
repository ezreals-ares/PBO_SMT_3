package PBO_SMT_3.JS1.Praktikum;

public class demo {
     public static void main(String[] args) {
       smartphone hp = new smartphone();
       keyboard kyb = new keyboard();
       wiredcharger wrd = new wiredcharger();
       wirelesscharger wrl = new wirelesscharger();

       hp.setMerk("Redmi");
       hp.setKapasitasBaterai(5000);
       hp.cetakInformasi();

       kyb.setJenis("Mechanical");
       kyb.setMerek("Cooler Master");
       kyb.cetakInfo();

       wrd.setMerek("Infinix");
       wrd.setDaya(90);
       wrd.setTipeKabel("USB-C");
       wrd.setTipeSoket("Type-F");
       wrd.cetakInfo();

       wrl.setMerek("Infinix");
       wrl.setDaya(30);
       wrl.setJarakMaks(0.5);
       wrl.setSuhuMax(40);
       wrl.cetakInfo();

       hp.hidupkan();
       kyb.tekanTombol();
       wrd.isiDaya();
       wrl.isiDaya();
    
    }
}
