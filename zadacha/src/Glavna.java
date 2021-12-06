import java.util.ArrayList;
import java.util.List;


public class Glavna {
    public static void main(String[] args){
        List<String> Fakulteti = new ArrayList<>();
        Fakulteti.add("FIKT");
        Fakulteti.add("Tehnichki");
        Fakulteti.add("Medicina");

        java.util.Collections.sort(Fakulteti);

        System.out.println(Fakulteti);

    }



}
