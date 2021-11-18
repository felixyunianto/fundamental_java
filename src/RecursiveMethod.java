public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));
    }

    static int factorialLoop(int value){
        var result = 1;

        for(var counter = 1; counter <= value; counter++){
            result *= counter;
        }

        return result;
    }

    static int factorialRecursive(int value){
        if(value == 1){
            return 1;
        }else{
            return value * factorialRecursive(value - 1);
        }
    }

//    Hati hati dalam menggunakan resursive karena jika recursive terlalu dalam maka ada kemungkinan error StackOverflow
//    Error StackOverflow ini terjadi tergantung berapa besar memori yang di pakai. (Setiap device berbeda).
};
