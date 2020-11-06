import sum.kern.*;

/**
 * @author Bernard Schriek
 * @version 24.7.2005
 */
public class MeinProgramm
{
    public static void main(String args[])
    {
        // Objektdeklarationen
        Figur aktiveFigur;
        Kreis meinKreis1, meinKreis2, meinKreis3;
        Ring meinRing, meinRing2;
        Quadrat meinQuadrat1, meinQuadrat2, meinQuadrat3; 
        Rechteck meinRechteck, meinRechteck2;
        Bildschirm derBildschirm;
        Maus dieMaus;
        Tastatur dieTastatur;
    
        // Initialisierung
        derBildschirm = new Bildschirm();
        dieMaus = new Maus();
        dieTastatur = new Tastatur();
        meinRechteck = new Rechteck(300, 400, 100, Farbe.BLAU);
        meinRing = new Ring(550, 300, 100, Farbe.GELB);
        meinRechteck2 = new Rechteck(700, 400, 100, Farbe.BLAU);
        meinRing2 = new Ring(500, 700, 100, Farbe.GELB);
        
        meinKreis1 = new Kreis(100, 100, 30, Farbe.ROT);
        meinKreis2 = new Kreis(200, 200, 70, Farbe.BLAU);
        meinKreis3 = new Kreis(300, 150, 50, Farbe.GRUEN);
        meinQuadrat1 = new Quadrat(150, 300, 50, Farbe.ORANGE);
        meinQuadrat2 = new Quadrat(250, 50, 40, Farbe.CYAN);
        meinQuadrat3 = new Quadrat(350, 250, 80, Farbe.MAGENTA);
        
                
        // Aktionsteil
        aktiveFigur = meinRechteck;
        aktiveFigur.aktiviere();
        do
        {
            
            if (dieMaus.istGedrueckt())
            {
                if (aktiveFigur != null)
                {
                    aktiveFigur.deaktiviere();
                    aktiveFigur = null;
                }
                if (meinKreis1.getroffen(dieMaus.hPosition(), dieMaus.vPosition()))
                    aktiveFigur = meinKreis1;
                if (meinKreis2.getroffen(dieMaus.hPosition(), dieMaus.vPosition()))
                    aktiveFigur = meinKreis2;
                if (meinKreis3.getroffen(dieMaus.hPosition(), dieMaus.vPosition()))
                    aktiveFigur = meinKreis3;
                if (meinQuadrat1.getroffen(dieMaus.hPosition(), dieMaus.vPosition()))
                    aktiveFigur = meinQuadrat1;
                if (meinQuadrat2.getroffen(dieMaus.hPosition(), dieMaus.vPosition()))
                    aktiveFigur = meinQuadrat2;
                if (meinQuadrat3.getroffen(dieMaus.hPosition(), dieMaus.vPosition()))
                    aktiveFigur = meinQuadrat3;
                if (meinRechteck.getroffen(dieMaus.hPosition(), dieMaus.vPosition()))
                    aktiveFigur = meinRechteck;         
                if (meinRing.getroffen(dieMaus.hPosition(), dieMaus.vPosition()))
                    aktiveFigur = meinRing;  
                if (meinRechteck2.getroffen(dieMaus.hPosition(), dieMaus.vPosition()))
                    aktiveFigur = meinRechteck2;         
                if (meinRing2.getroffen(dieMaus.hPosition(), dieMaus.vPosition()))
                    aktiveFigur = meinRing2;     
                    
                if (aktiveFigur != null)
                    aktiveFigur.aktiviere();
                    
            }
            if (dieTastatur.wurdeGedrueckt() && aktiveFigur != null)
            {
                switch (dieTastatur.zeichen())
                {
                    case Zeichen.PFEILRECHTS: aktiveFigur.bewegeUm(5, 0); break;
                    case Zeichen.PFEILLINKS: aktiveFigur.bewegeUm(-5, 0); break;
                    case Zeichen.PFEILOBEN: aktiveFigur.bewegeUm(0, -5); break;
                    case Zeichen.PFEILUNTEN: aktiveFigur.bewegeUm(0, 5); break;
                    
                }
                dieTastatur.weiter();
            }
            if (dieTastatur.wurdeGedrueckt() && aktiveFigur != null)
            {
                switch (dieTastatur.zeichen())
                {
                    case Zeichen.PFEILRECHTS: aktiveFigur.bewegeUm(5, 0); break;
                    
                     
                }
                dieTastatur.weiter();
            }
            
        } while (!dieMaus.doppelKlick());
        
        // Aufraeumen
        derBildschirm.gibFrei();
    }
}