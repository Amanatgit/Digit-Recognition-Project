import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import org.omg.CORBA.FREE_MEM;

public class DigitRecognition extends Canvas implements MouseListener,ActionListener{
	
	public static int stroke=3;
	private int x1, y1 , x2, y2;
	BufferedImage grid;
	Graphics2D gc;
	public void paintComponent(Graphics g)
	{ 
	     super.paint(g);  
	     Graphics2D g2 = (Graphics2D)g;
	     if(grid == null){
	        int w = this.getWidth();
	        int h = this.getHeight();
	        grid = (BufferedImage)(this.createImage(w,h));
	        gc = grid.createGraphics();
	        gc.setColor(Color.BLUE);
	     }

	     g2.drawImage(grid, null, 0, 0);
	}
	     public void draw()
	 	{
	 	    Graphics2D g = (Graphics2D)getGraphics();
	 	     int w = x2 - x1;
	 	        if (w<0)
	 	        w = w *(-1);

	 	   int h = y2-y1;
	 	        if (h<0)
	 	        h=  h*(-1);
	 	            gc.drawLine(x1, y1, x2, y2);
	 	            repaint();            
	 	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	


}
