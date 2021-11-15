public class TipeDataArray {
//    Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
//    Jumlah data di Array tidak bisa berubah setelah pertama kali dibuat

    public static void main(String[] args) {
        String[] arrayString;

        arrayString = new String[3];
        arrayString[0] = "Felix";
        arrayString[1] = "Yunianto";
        arrayString[2] = "Gunawan";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

//        Array Initializer

        String[] arrayMyName = {
                "Felix", "Yunianto", "Gunawan"
        };

        arrayMyName[0] = null;

        int[] arrayInt = new int[]{
                10,90,80,67,29
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        arrayLong[0] = 0;

        System.out.println(arrayLong.length);

        String[][] members = {
                {"Felix", "Yunianto", "Gunawan"},
                {"Ziyan Fadilla"},
                {"Plugin"}
        };

        System.out.println(members[0][2]);

    }


}
