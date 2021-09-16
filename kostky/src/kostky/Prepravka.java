package kostky;

public class Prepravka{
    
    private static Prepravka single_instance = null; 
    private Platno platno;
    
    private boolean uzamknout1;
    private boolean uzamknout2;
    private int celkem;
    private int pocet[];
    private int docPoc[];
    private int docCel;
    
    public Prepravka() {
        uzamknout1 = true;
        uzamknout2 = true;
        celkem = 0;
        docCel = 0;
        pocet = new int[6];
        docPoc = new int[6];
    }

    public int[] getDocPoc() {
        return docPoc;
    }

    public void setDocPoc(int x) {
        docPoc[x-1]++;
        docCel+=x;
    }

    public int getDocCel() {
        return docCel;
    }
    
    public Platno getPlatno() {
        return platno;
    }

    public void setPlatno(Platno platno) {
        this.platno = platno;
    }
    
    public void setPocet(int x){
        pocet[x-1]++;
        celkem+=x;
    }
    public int[] getPocet(){
        return pocet;
    }

    public boolean isUzamknout1() {
        return uzamknout1;
    }
    public void setUzamknout1(boolean uzamknout1) {
        this.uzamknout1 = uzamknout1;
    }
    public boolean isUzamknout2() {
        return uzamknout2;
    }
    public void setUzamknout2(boolean uzamknout2) {
        this.uzamknout2 = uzamknout2;
    }
    
    public int getCelkem() {
        return celkem;
    }

    public void reset() {
        pocet = new int[6];
        celkem = 0;
    }
    public void docRes() {
        docPoc = new int[6];
        docCel = 0;
    }
    public static Prepravka getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new Prepravka(); 
  
        return single_instance; 
    }
}
