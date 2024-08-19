
public class SiswaTester {
    public static void main(String[] args) {
        //membuat Object
        //namaClass namaObject = new Constructor();
        Siswa Dimas = new Siswa();
        Siswa Kevin = new Siswa();
        Siswa arkan = new Siswa();
        Siswa Surya = new Siswa();
        Siswa Zaky = new Siswa ();
        Siswa Rabbani = new Siswa ();

        
        Dimas.nama = "Dimas Ardian";
        Dimas.id = 10;
        Dimas.ipk = 29.1;
        Kevin.nama = "Moh Kevin";
        Kevin.id = 20;
        Kevin.ipk = 51.5;
        arkan.nama = "Arkan Mariadi";
        arkan.id = 22;
        arkan.ipk = 10.3;
        Surya.nama = "Surya Putra";
        Surya.id = 33;
        Surya.ipk = 999;
        Zaky.nama = "Ananda Zaky";
        Zaky.id = 3;
        Zaky.ipk = 44;
        Rabbani.nama = "Rabbani";
        Rabbani.id = 18;
        Rabbani.ipk = 54.2;


        Dimas.print();
        Kevin.print();
        arkan.print();
        Surya.print();
        Zaky.print();
        Rabbani.print();
    }
}