public class Test {
public static void main(String[] args){
    Restoran obj= new Restoran();
    obj.setImeNaRestoran("Malechka");
    obj.setLokacija("Bitola");
    obj.setTelefon("8736435355");
    obj.setBrojnaSedishta(123);


    System.out.println("Ime na restoran: "+ obj.getImeNaRestoran());
    System.out.println("Lokacija:"+ obj.getLokacija());
    System.out.println("Telefonski broj:"+ obj.getTelefon());
    System.out.println("BRoj na sedishta: " + obj.getBrojnaSedishta());

}


}
