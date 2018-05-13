import java.awt.*;
import javax.swing.*;
class RegularPolygonPanel extends JPanel
{
	int numberOfSides;
    int Polygones;
    
    
     public static void main(String[] args) {
    JFrame frame = new JFrame("RegularPolygonPanel");
    frame.getContentPane().add(new RegularPolygonPanel());
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }
    public RegularPolygonPanel()
    {
        numberOfSides = 5;
        Polygones= 6;
    }

    public RegularPolygonPanel(int numSide)
    {
        this.numberOfSides = 3;
        setNumberOfSides(numSide);
    }

    public int getNumberOfSides()
    {
        return numberOfSides;
    }

    public void setNumberOfSides(int numSide)
    {
        this.numberOfSides = numSide;
        repaint();
    }

     protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
         int x = 175 / 2;
        int y = getHeight() / 2;
        int radius = (int)((double)Math.min(145, getHeight()) * 0.5D);
        
        Polygon polygon = new Polygon();
        for(int j=0;j<Polygones;j++)
        {
            double angle = 6.2D / (double)numberOfSides;
        for(int i = 0; i < numberOfSides; i++)
            polygon.addPoint((int)((double)x + (double)radius * Math.cos((double)i * angle)),
            		(int)((double)y - (double)radius * Math.sin((double)i * angle)));
           g.drawPolygon(polygon);
            numberOfSides++;
            polygon = new Polygon();
          x +=  160;
        }

    }

    public Dimension getPreferredSize()
    {				//userinterface demensions
        return new Dimension(1000, 200);
    }

    
}