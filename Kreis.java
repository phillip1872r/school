import sum.kern.*;
/**
 * @author Bernard Schriek
 * @version 23.7.2005
 */
public class Kreis extends Figur
{
    // Bezugsobjekte

    // Attribute

    // Konstruktor
    public Kreis(int pH, int pV, int pGroesse, int pFarbe)
    {
        super(pH, pV, pGroesse, pFarbe);
    }

    // Dienste
    protected void zeichne()
    {
        this.getStift().zeichneKreis(this.getGroesse());
    }
    
    public boolean getroffen(int pH, int pV)
    {
        return (pH - this.getStift().hPosition()) * (pH - this.getStift().hPosition())
            + (pV - this.getStift().vPosition()) * (pV - this.getStift().vPosition()) <= this.getGroesse() * this.getGroesse();
    }
}
