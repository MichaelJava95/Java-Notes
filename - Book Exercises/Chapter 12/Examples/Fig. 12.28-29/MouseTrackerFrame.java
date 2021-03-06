/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Built the book example using visual IDE tools.
 * Latest version: 7:24 AM, 2/14/2021
 * Older versions: 
 */

import java.awt.Color;

public class MouseTrackerFrame extends javax.swing.JFrame
{

	/**
	 * Creates new form MouseTrackerFrame
	 */
	public MouseTrackerFrame()
	{
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents()
   {

      jLabel1 = new javax.swing.JLabel();
      jPanel2 = new javax.swing.JPanel();
      mousePanel = new javax.swing.JPanel();
      statusBar = new javax.swing.JLabel();

      jLabel1.setText("jLabel1");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 100, Short.MAX_VALUE)
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 100, Short.MAX_VALUE)
      );

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Demonstrating Mouse Events");

      mousePanel.setBackground(new java.awt.Color(255, 255, 255));
      mousePanel.setPreferredSize(new java.awt.Dimension(400, 315));
      mousePanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
      {
         public void mouseDragged(java.awt.event.MouseEvent evt)
         {
            mousePanelMouseDragged(evt);
         }
         public void mouseMoved(java.awt.event.MouseEvent evt)
         {
            mousePanelMouseMoved(evt);
         }
      });
      mousePanel.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            mousePanelMouseClicked(evt);
         }
         public void mouseEntered(java.awt.event.MouseEvent evt)
         {
            mousePanelMouseEntered(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt)
         {
            mousePanelMouseExited(evt);
         }
         public void mousePressed(java.awt.event.MouseEvent evt)
         {
            mousePanelMousePressed(evt);
         }
         public void mouseReleased(java.awt.event.MouseEvent evt)
         {
            mousePanelMouseReleased(evt);
         }
      });

      javax.swing.GroupLayout mousePanelLayout = new javax.swing.GroupLayout(mousePanel);
      mousePanel.setLayout(mousePanelLayout);
      mousePanelLayout.setHorizontalGroup(
         mousePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );
      mousePanelLayout.setVerticalGroup(
         mousePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 98, Short.MAX_VALUE)
      );

      statusBar.setText("Mouse outside JPanel");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(statusBar, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
            .addContainerGap())
         .addComponent(mousePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addComponent(mousePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(statusBar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void mousePanelMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_mousePanelMouseClicked
   {//GEN-HEADEREND:event_mousePanelMouseClicked
		statusBar.setText(String.format("Clicked at [%d, %d]", evt.getX(), evt.getY()));
   }//GEN-LAST:event_mousePanelMouseClicked

   private void mousePanelMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_mousePanelMousePressed
   {//GEN-HEADEREND:event_mousePanelMousePressed
		statusBar.setText(String.format("Pressed at [%d, %d]", evt.getX(), evt.getY()));
   }//GEN-LAST:event_mousePanelMousePressed

   private void mousePanelMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_mousePanelMouseReleased
   {//GEN-HEADEREND:event_mousePanelMouseReleased
		statusBar.setText(String.format("Released at [%d, %d]", evt.getX(), evt.getY()));
   }//GEN-LAST:event_mousePanelMouseReleased

   private void mousePanelMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_mousePanelMouseEntered
   {//GEN-HEADEREND:event_mousePanelMouseEntered
		statusBar.setText(String.format("Mouse entered at [%d, %d]", evt.getX(), evt.getY()));
		mousePanel.setBackground(Color.GREEN);
   }//GEN-LAST:event_mousePanelMouseEntered

   private void mousePanelMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_mousePanelMouseExited
   {//GEN-HEADEREND:event_mousePanelMouseExited
		statusBar.setText(String.format("Mouse outside JPanel"));
		mousePanel.setBackground(Color.WHITE);
   }//GEN-LAST:event_mousePanelMouseExited

   private void mousePanelMouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_mousePanelMouseDragged
   {//GEN-HEADEREND:event_mousePanelMouseDragged
		statusBar.setText(String.format("Dragged at [%d, %d]", evt.getX(), evt.getY()));
   }//GEN-LAST:event_mousePanelMouseDragged

   private void mousePanelMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_mousePanelMouseMoved
   {//GEN-HEADEREND:event_mousePanelMouseMoved
		statusBar.setText(String.format("Moved at [%d, %d]", evt.getX(), evt.getY()));
   }//GEN-LAST:event_mousePanelMouseMoved

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[])
	{
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try
		{
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
			{
				if ("Nimbus".equals(info.getName()))
				{
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}
		catch (ClassNotFoundException ex)
		{
			java.util.logging.Logger.getLogger(MouseTrackerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (InstantiationException ex)
		{
			java.util.logging.Logger.getLogger(MouseTrackerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (IllegalAccessException ex)
		{
			java.util.logging.Logger.getLogger(MouseTrackerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (javax.swing.UnsupportedLookAndFeelException ex)
		{
			java.util.logging.Logger.getLogger(MouseTrackerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				new MouseTrackerFrame().setVisible(true);
			}
		});
	}

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel jLabel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel mousePanel;
   private javax.swing.JLabel statusBar;
   // End of variables declaration//GEN-END:variables
}
