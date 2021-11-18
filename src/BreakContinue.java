public class BreakContinue {
    public static void main(String[] args) {
        //    Break
        var counter = 1;
        while(true){
            System.out.println("Perulangan " + counter);
            counter++;

            if(counter > 10){
                break;
            }
        }
        System.out.println("Perulangan berhenti");

//        Continue

        for (var counter1 = 1; counter1 <= 100; counter1++){
            if(counter1 % 2 == 0){
                continue;
            }

            System.out.println("Perulangan Ganjil " + counter1);
        }
    }
}
