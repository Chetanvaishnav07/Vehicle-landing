
import java.io.File;
import javax.media.Player;


public class Flash extends javax.swing.JFrame implements Runnable {


    public Flash() {
        initComponents();
 Thread th=new Thread(this);
    th.start();
    }
    
@Override
public void run()
{
    try
    {
         
        for(int i=0;i<=100;i++)
        {
          jProgressBar1.setValue(i);
        Thread.sleep(50);
   
        }
           

    
       new Loginwindow() .setVisible (true);
       dispose();
    } 
catch(Exception ex){
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 570, 520, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/giphy.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 599, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
