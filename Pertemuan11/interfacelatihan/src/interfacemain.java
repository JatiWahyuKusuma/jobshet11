// import intefaceslatihan.ICumlaude;
// import interfacelatihan.Mahasiswa;
// import interfaceslatihan.PascaSarjana;
// import interfaceslatihan.rektor;
// import interfaceslatihan.Sarjana;

public class interfacemain {
    public static void main(String[] args){
        rektor pakrektor = new rektor();
        
        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude  = new PascaSarjana("Elok");

        // pakrektor.beriSertifikatCumlaude(mhsBiasa);
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);
        
    }
}
