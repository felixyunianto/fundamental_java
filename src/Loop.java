public class Loop {
    public static void main(String[] args) {

//      For Loop
        System.out.println("For Loop");
        for(var counter = 1; counter <= 10;counter++){
            System.out.println("Perulangan " + counter);

        }

//      While Loop
        System.out.println("While Loop");
        var counter = 1;
        while(counter <= 10){
            System.out.println("Perulangan " + counter);
            counter++;
        }

//      Do While Loop
        System.out.println("Do While Loop");
        var counter1 = 100;
        do{
            System.out.println("Perulangan " + counter1);
        } while(counter1 <= 10);


    }
}
