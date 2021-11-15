public class TipeDataBukanPrimitif {
//    Tipe data primitif adalah tipe bawaan di dalam bahasa pemrograman. Tipe data primitif tidak bisa diubah lagi.
//    Tipe data number, char, boolean adalah tipe data primitif. Tipe data primitif selalu memiliki default value
//    Tipe data String bukan tipe data data primitif, tipe data bukan primitif tidak memiliki default value, dan bisa bernilai null
//    Tipe data bukan primitif bisa memiliki method/function
//    Di java, semua tipe data primitif memiliki representasi tipe data bukan primitifnya.

//    Primitif                    Bukan Primitif
//    byte                        Byte
//    short                       Short
//    int                         Integer
//    long                        Long
//    float                       Float
//    double                      Double
//    char                        Character
//    boolean                     Boolean

//    Tipe data primitif default valuenya null



    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);


//        Konversi primitif -> bukan primitif

        int iniInt = 100;
        Integer intObject = iniInt;

        short iniShort = intObject.shortValue();

        long iniLong2 = intObject.longValue();
        float iniFloat = intObject.floatValue();

        Long amount = 1000000L;


    }
}
