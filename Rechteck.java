
/**
 * @author 
 * @version 
 */
import sum.kern.*;
/**
 * @author Bernard Schriek
 * @version 24.7.2005
 */
public class Rechteck extends Figur
{
    // Bezugsobjekte

    // Attribute
    
    // Konstruktor
    public Rechteck(int pH, int pV, int pBreite, int pFarbe)
    {
        super(pH, pV, pBreite, pFarbe);       
    }

    // Dienste
    protected void zeichne()
    {
        this.getStift().zeichneRechteck(this.getGroesse(), this.getGroesse() * 2);
    }
    
    public boolean getroffen(int pH, int pV)
    {
        return pH >= this.getStift().hPosition() 
            && pH <= this.getStift().hPosition()+ this.getGroesse()
            && pV >= this.getStift().vPosition() 
            && pV <= this.getStift().vPosition()+ this.getGroesse();
    }
}
