import java.util.ArrayList;
import java.util.List;


public class Glavna {

    public static void main(String[] args) {
        MetodiZaListaNiza obj = new MetodiZaListaNiza();

        List<String> lista = new ArrayList<String>();
        lista.add("A");
        lista.add("B");
        obj.listToArray(lista);
        String[] niza = {"a", "b", "c"};
        obj.arrayToList(niza);


    }
}



