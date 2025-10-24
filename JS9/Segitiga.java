package PBO_SMT_3.JS9;

public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
    }

    public static void main(String[] args) {
        Segitiga seg = new Segitiga();

        System.out.println("Total sudut (1 sudut): " + seg.totalSudut(60));
        System.out.println("Total sudut (2 sudut): " + seg.totalSudut(60, 30));
        System.out.println("Keliling (3 sisi): " + seg.keliling(3, 4, 5));
        System.out.println("Keliling (2 sisi): " + seg.keliling(3, 4));
    }
}
