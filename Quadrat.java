import sum.kern.*;
/**
 * @author Bernard Schriek
 * @version 24.7.2005
 */
public class Quadrat extends Figur
{
    // Bezugsobjekte

    // Attribute

    // Konstruktor
    public Quadrat(int pH, int pV, int pGroesse, int pFarbe)
    {
        super(pH, pV, pGroesse, pFarbe);
    }

    // Dienste
    protected void zeichne()
    {
        this.getStift().zeichneRechteck(this.getGroesse(), this.getGroesse());
    }
    
    public boolean getroffen(int pH, int pV)
    {
        return pH >= this.getStift().hPosition() 
            && pH <= this.getStift().hPosition()+ this.getGroesse()
            && pV >= this.getStift().vPosition() 
            && pV <= this.getStift().vPosition()+ this.getGroesse();
    }
}
