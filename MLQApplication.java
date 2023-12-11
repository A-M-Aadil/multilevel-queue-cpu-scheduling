/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mlqapplication;

/**
 *
 * @author aadil
 */
public class MLQApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SplashScreen screen = new SplashScreen();
        screen.setVisible(true);
        screen.setTitle("MLQ Simulator");
        screen.pack();
        screen.setResizable(false);
        screen.setLocationRelativeTo(null);
        
        try{
            for(int i = 0; i < 50; i++){
                Thread.sleep(60);
            }
            
        }catch(Exception e){
            
        }
        screen.setVisible(false);
        MlqWindow windowFrame = new MlqWindow();
        windowFrame.setVisible(true);
        windowFrame.setTitle("MLQ Simulator");
        windowFrame.pack();
        windowFrame.setLocationRelativeTo(null);
        windowFrame.setResizable(false);
        
    }
    
}
