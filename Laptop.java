public class Laptop extends AbstractKomputer implements Mouse, Keyboard, Printer {
    @Override
    void Hidupkan_OS(){
        System.out.println("Hidupkan Laptop");
    }
    @Override
    void Matikan_OS(){
        System.out.println("Matikan Laptop");
    }
    @Override
    public void Klik_Kanan(){
        System.out.println("Klik Kanan");
    }
    @Override
    public void Klik_Kiri(){
        System.out.println("Klik Kiri");
    }
    @Override
    public void Tekan_Enter(){
        System.out.println("Tekan Enter");
    }
    @Override
    public void Cetak_Data(){
        System.out.println("Cetak Data");
    }    
}