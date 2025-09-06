package PBO_SMT_3.JS2.Percobaan;

public class TestMahasiswa {

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Saskiya";
        mhs2.alamat = "Pandaan";
        mhs2.kelas = "2B";
        mhs2.tampilBiodata();
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 103;
        mhs3.nama = "Luhung";
        mhs3.alamat = "lawang";
        mhs3.kelas = "2F";
        mhs3.tampilBiodata();
    }
}
