public class ForEach {
    public static void main(String[] args) {
        String[] array = {
                "Felix", "Yunianto", "Gunawan", "Programmer", "Tegal"
        };

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

//        ForEach
        System.out.println("FOR EACH");
        for(var value : array){
            System.out.println(value);
        }
    }
}
