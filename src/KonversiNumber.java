public class KonversiNumber {
    byte iniByte = 10;
    short iniShort = iniByte;
    int iniInt = iniShort;
    long iniLong = iniInt;

    // Hati-hati jika melakukan konversi paksa karena min max value tiap tipe berbeda
    // Number overflow operasi berulang.
    byte iniByte2 = (byte) iniInt;
}
