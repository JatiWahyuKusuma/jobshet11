public class Singa extends Binatang implements karnivora{
    public String suara;
    public String warnaBulu;

    public Singa(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.nama = nama;
        this.jmlKaki = jmlKaki;
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    public void displayMakan(){
        System.out.println("Makanan     :Daging "); 
    }

    public void displayBinatang(){   
        super.Binatang();
        System.out.println("Jenis       :Karnivora");
    }

    public void displayData(){
        System.out.println("Suara       :"+suara);
        System.out.println("Warna Bulu  :"+warnaBulu);
        
    }
}
