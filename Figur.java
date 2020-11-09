import sum.kern.*;
/**
 * @author Bernard Schriek
 * @version 24.7.2005
 */
public abstract class Figur
{
    // Bezugsobjekte
    private Buntstift stift, stift2;

    // Attribute
    private  int groesse;
    private boolean aktiv;

    // Konstruktor
    public Figur(int pH, int pV, int pGroesse, int pFarbe)
    {
        stift = new Buntstift();
        stift2 = new Buntstift();
        stift.bewegeBis(pH, pV);
        stift2.bewegeBis(pH, pV);
        stift.setzeFarbe(pFarbe);
        stift2.setzeFarbe(Farbe.WEISS);
        aktiv = false;
        groesse = pGroesse;
        this.zeichne();
    }

    // Dienste
    
    public  void groessePlus()
    {
        stift.radiere();
        groesse = groesse + 10;
        this.zeichne();
        stift.normal();
        this.zeichne();
    }
    
<<<<<<< HEAD
    public static void groesseMinus()
=======
        public  void groesseMinus()
>>>>>>> 3fbe93d9938e61c9a9ed1ce83d34ce2c88d101c6
    {
         stift.radiere();
        groesse = groesse - 10;
        this.zeichne();
        stift.normal();
        this.zeichne();
    }


    protected abstract void zeichne();

    public abstract boolean getroffen(int pH, int pV);

    private void loesche()
    {
        stift.radiere();
        this.zeichne();
        stift.normal();
    }

    public void bewegeUm(int pH, int pV)
    {
        this.loesche();
        stift.bewegeBis(stift.hPosition() + pH,
            stift.vPosition() + pV);
        this.zeichne();
    }

    public void aktiviere()
    {
        this.loesche();
        stift.setzeLinienbreite(3);
        aktiv = true;
        stift.setzeFuellmuster(Muster.DURCHSCHEINEND);
        stift2.setzeFuellmuster(Muster.GEFUELLT);        
      
        this.zeichne();
    }

    public void deaktiviere()
    {
        this.loesche();
        stift.setzeLinienbreite(1);
        aktiv = false;
        stift.setzeFuellmuster(Muster.DURCHSICHTIG);
        this.zeichne();
    }

    protected int getGroesse()
    {
        return groesse;
    }

    protected Buntstift getStift()
    {
        return stift;
    }
    
     protected Buntstift getStift2()
    {
        return stift2;
    }
    
}
