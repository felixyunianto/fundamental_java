public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Felix Yunianto Gunawan";

        int age = 23;
        String address = "Tegal";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        name = "Ziyan Fadilla";
        System.out.println(name);

//        Sejak versi java 10, java mendukung pembuatan variable dengan kata kunci var
//        Namun var harus langsung mengisi valuenya

        var firstName = "Felix";
        var middleName = "Yunianto";
        var lastName = "Gunawan";

//        Default variable nilainya dapat barubah ubah
//        Jika tidak ingin diubah (konstan) pakai final

        final String application = "Belajar Java";
//        application = "Belajar PHP"; error




    }
}
