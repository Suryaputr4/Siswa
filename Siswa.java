//Object Class
public class Siswa {
    //variabel
    int id;
    String nama;
    double ipk;

    //Constructor (yg membangun object)
    public Siswa() {
        nama = "testing";
        id = 0;
        ipk = 5.0;
    }

    //Getter
    //Setter
    //Method
    public void print() {
        System.out.println("Nama : " + nama);
        System.out.println("Id : " + id);
        System.out.println("IPK : " + ipk);
    }
}