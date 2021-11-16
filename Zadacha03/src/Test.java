public class Test {
    public static void main (String[] args){
        Proizvod p1= new Proizvod();
        System.out.println(p1.imenaproizvod
        +""+p1.tezina + " "+ p1.cena);

        Proizvod p2 =new Proizvod("Smoki",32);
        System.out.println(p2.imenaproizvod+""+p2.cena);

    }




}
