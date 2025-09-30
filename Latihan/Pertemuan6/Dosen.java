package PBO_SMT_3.Latihan.Pertemuan6;

public class Dosen extends AnggotaKampus {
    String nip;
    String departemen;

    Dosen(String nama, String id, String nip, String departemen) {
        super(nama, id);
        this.id = id;
        this.departemen = departemen;
    }

    public String getNip() {
        return nip;
    }

    public String getDepartemen() {
        return departemen;
    }
}

