public class OperasiBoolean {
    public static void main(String[] args) {
        var absen = 80;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilaiakhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiakhir;

        System.out.println(lulus);
    }
}
