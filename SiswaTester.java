
//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //membuat Object
        //namaClass namaObject = new Constructor();
        Siswa sabrina = new Siswa();
        Siswa rasyid = new Siswa();
        Siswa felix = new Siswa(14, "Felix", 70);

        sabrina.id = 32;
        sabrina.nama = "Sabrina";
        sabrina.ipk = 85.7;
        rasyid.id = 30;
        rasyid.nama="rasyid";
        rasyid.ipk=72.0;
        sabrina.print();
        rasyid.print();
        felix.print();
    }
}