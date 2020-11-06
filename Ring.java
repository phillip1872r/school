
/**
 * @author 
 * @version 
 */
import sum.kern.*;
/**
 * @author Bernard Schriek
 * @version 24.7.2005
 */
public class Ring extends Figur
{
    // Bezugsobjekte

    // Attribute

    // Konstruktor
    public Ring(int pH, int pV, int pRadius, int pFarbe)
    {
        super(pH, pV, pRadius, pFarbe);       
    }

    // Dienste
    protected void zeichne()
    {
        this.getStift().zeichneKreis(this.getGroesse());
        this.getStift2().zeichneKreis(this.getGroesse()/ 2);
        
    }
    
    public boolean getroffen(int pH, int pV)
    {
        return pH >= this.getStift().hPosition() 
            && pH <= this.getStift().hPosition()+ this.getGroesse()
            && pV >= this.getStift().vPosition() 
            && pV <= this.getStift().vPosition()+ this.getGroesse();
            
    }
    
   
}
