public class KomputerCetak {
    public static void main (String [] args){
        AbstractKomputer [] Asus = new AbstractKomputer [3];
        
        Asus[0]=new PC();
        Asus[1]=new Laptop();
        Asus[2]=new Netbook();
        
        for (AbstractKomputer ROG : Asus){
            ROG.Hidupkan_OS();
            ROG.Matikan_OS();
            ROG.Klik_Kanan();
            ROG.Klik_Kiri();
            ROG.Tekan_Enter();
            ROG.Cetak_Data();
        }
    }
}
