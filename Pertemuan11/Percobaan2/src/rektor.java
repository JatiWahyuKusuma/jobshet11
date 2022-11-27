public class rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude");
        System.out.println("Selamat! silahkan perkenalkan diri Anda..");

        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        System.out.println("===========================================");
    }

    public void beriSertifikatMawapres( IBerprestasi Mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! bagaimana Anda bisa berprestasi?");

        Mahasiswa.menjuaraiKompetisi();
        Mahasiswa.membuatPublikasiIlmiah();
        System.out.println("===========================================");

    }
    public void beriSertifikatMawapresNasional( IBerprestasi Mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! bagaimana Anda bisa berprestasi?");

        Mahasiswa.menjuaraiKompetisiNasional();
        Mahasiswa.membuatPublikasiIlmiahNasional();
        System.out.println("===========================================");

    }
}
