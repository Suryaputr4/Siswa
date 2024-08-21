/**
 * TesGuru
 */
public class TesGuru {
    int nip;
    String nama, mapel, status;

    public TesGuru (int p, String n, String m, String s) {
        nip = p;
        nama = n;
        mapel = m;
        status = s;

        System.out.println("Nip : "+ nip);
        System.out.println("=================");
        System.out.println("Nama : "+ nama);
        System.out.println("=================");
        System.out.println("Mapel : "+ mapel);
        System.out.println("=================");
        System.out.println("Status : "+ status);
        System.out.println("=================");
    }


}