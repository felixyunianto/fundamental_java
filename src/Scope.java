public class Scope {
//    Di Java, variable hanya bisa diakses di dalam area dimana variable dibuat
//    Hal ini disebut scope
//    Contohnya jika variable dibuat didalam method atau block, maka variable tersebut hanya dapat di pakai di dalam
//    method atau block itu sendiri. Tidak bisa dipanggil dari luar method

    public static void main(String[] args) {
        sayHello("Felix");
    }

    static void sayHello(String name){
        String hello = "Hello, " + name;
        if(!name.isBlank()){
            String hi = "Hi "+ name;
            System.out.println(hi);
        }

        System.out.println(hello);

//        variable hi tidak bisa di akses dari luat block if
//        System.out.println(hi);


    }
}
