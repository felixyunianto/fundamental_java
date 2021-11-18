import org.w3c.dom.ls.LSOutput;

public class Method {
    public static void main(String[] args) {
        sayHelloWorld();
        sayHello("Felix", "Yunianto");

        var a = 100;
        var b = 200;
        var c = sum(a, b);

        System.out.println("Hasil " + c);

        System.out.println(hitung(100, "+", 100));
        System.out.println(hitung(200, "-", 100));
        System.out.println(hitung(100, "salah", 100));

        System.out.println("Variable Argument");
        int[] values = {80, 80, 70, 90};

        sayCongrats("Felix", values);
        sayCongrats("Yunianto", 50, 60, 70,40);

        System.out.println("OverLoading");
        sayHai();
        sayHai("Felix");
        sayHai("Felix", "Yunianto");
    }

    static void sayHelloWorld(){
        System.out.println("Hello World");
    }

//    Dengan Parameter
    static void sayHello(String firstName, String lastName){
        System.out.println("Hello "+ firstName + " " + lastName);
    }

//    Mengembalikan Value
    static int sum (int a, int b){
        var total = a + b;
        return total;
    }

    static int hitung(int value1, String operasi, int value2){
        switch (operasi){
            case "+" :
                return value1 + value2;
            case "-" :
                return value1 - value2;
            default:
                return 0;
        }
    }

//    Variable Argument
    static void sayCongrats(String name, int... values){
        var total = 0;
        for(var value : values){
            total += value;
        }

        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        }else{
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }

//    Overloading
    static void sayHai(){
        System.out.println("Hello");
    }

    static void sayHai(String firstName){
        System.out.println("Hello " + firstName);
    }

    static void sayHai(String firstName, String lastName){
        System.out.println("Hello "+ firstName + " " + lastName);
    }
}
