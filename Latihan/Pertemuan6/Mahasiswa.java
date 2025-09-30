package PBO_SMT_3.Latihan.Pertemuan6;

public class Mahasiswa extends AnggotaKampus {

    String nim;
    String programStudi;

    Mahasiswa(String nama, String id, String nim, String programStudi) {
        super(nama, id);
        this.nim = nim;
        this.programStudi = programStudi;
    }

    public String getNim() {
        return nim;
    }

    public String getProgramStudi() {
        return programStudi;
    }

}