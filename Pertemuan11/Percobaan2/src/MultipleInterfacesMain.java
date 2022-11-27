
public class MultipleInterfacesMain {
    public static void main(String[] args){
        rektor pakrektor = new rektor();

        Sarjana sarjanaCum = new Sarjana("Dini");
        PascaSarjana masterCum = new PascaSarjana("Elok");

        // pakrektor.beriSertifikatMawapres(sarjanaCum);
        pakrektor.beriSertifikatMawapresNasional(masterCum);
        pakrektor.beriSertifikatMawapres(masterCum);
        
    }
}
