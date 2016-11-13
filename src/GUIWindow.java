
import java.awt.DisplayMode;
import java.awt.EventQueue;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wadeowen
 */
public class GUIWindow {
    
    
    private JFrame frm;
    private int frmHeight;
    private int frmWidth;
    
    public void main(){
        
        EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                try{
                    GUIWindow window = new GUIWindow();
                }catch(Exception e){
                    
                }
            }      
            
        });
          
    }
    
     public void run(){
        try{
            GUIWindow window = new GUIWindow();
            window.frm.setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    } 
     
    public GUIWindow(){
        initialize();
    }

    
    public void initialize(){
        GraphicsDevice graphics = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        DisplayMode dMode = graphics.getDisplayMode();
        frmHeight = 500;
        frmWidth = 700;
        
        frm = new JFrame();
        frm.setTitle("Home 4 U");
        frm.setBounds((int)(dMode.getWidth()/2 - frmWidth/2), (int)(dMode.getHeight()/2 - frmHeight/2), frmWidth, frmHeight);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLayout(null);
        
        
    }
    
}
