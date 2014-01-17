

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BufferedImage img = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB);
        
        
        Random rand = new Random(); 
    int farbe = rand.nextInt(7);
    int form = rand.nextInt(3);

        Graphics g = img.createGraphics();
        
        
        switch(farbe){
        case 0:
                g.setColor(Color.orange);
                break;
        case 1:
                g.setColor(Color.LIGHT_GRAY);
                break;
        case 2:
                g.setColor(Color.MAGENTA);
                break;
        case 3:
                g.setColor(Color.darkGray);
                break;
        case 4:
                g.setColor(Color.black);
                break;
        case 5:
                g.setColor(Color.yellow);
                break;
        case 6:
           		g.setColor(Color.blue);
           		break;
        }
        
        
        switch (form){
        case 0:
                g.fillArc(50, 100, 80, 20, 30, 50);
                break;
        case 1:
        		g.fillRect(50, 20, 100, 50);
        		break;
                
        case 2:
        		g.fillOval(20, 40, 60, 100);
        		break;
                
        }
        
        g.dispose();

        ImageIO.write(img, "jpg", response.getOutputStream()); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
