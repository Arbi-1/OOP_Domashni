public class PC {
    public int memorija;
    public String tipNaMemorija;
    public int hardDisk;
    public String disk;
    public String SSD;
    String golemina = "GB";

    public PC() {

        this.memorija = 2;
        this.tipNaMemorija = "DDR4";
        this.hardDisk = 160;
        this.disk = "HDD";
        this.SSD = "SSD m.2";


    }

   public void pecatiVrednosti(int zgolemiMemorija , String novSSDDisk ){

        // Memorijata beshe _____ GB ,sega iznesuva ______GB
       
        System.out.println("Memorijata bese "+ this.memorija+" "+ golemina + ","
        +"sega iznesuva" + this.memorija + zgolemiMemorija + " "+ golemina + ".");

        // Tipot na memorijata e _____

        System.out.println("Tipot na memorijata e"+ this.tipNaMemorija + ".");

        //Noviot disk e _____ ima golemina od _____ GB.
String SSDDisk = this.disk+ novSSDDisk;
        System.out.println("Noviot disk e"+SSDDisk + " ima golemina od " + this.SSD + " " + golemina );

        // Predhodno imavme this.disk i iznesuvashe _______GB
        System.out.println("Predhodno imavme"+this.disk +"i iznesuvashe "+this.hardDisk+" "+golemina );


   }
}
