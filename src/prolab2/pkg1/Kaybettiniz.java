
package prolab2.pkg1;
public class Kaybettiniz extends javax.swing.JFrame {
	
	/**
	
	 */
	public Kaybettiniz(int puanGoster) {
		initComponents();
		setTitle("KAYBETTİNİZ");
		setSize(1920, 1080);
		this.puanGoster.setText("Puanınız:" + puanGoster);
		
	}
	
	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		
		tekrarOyna = new javax.swing.JButton();
		puanGoster = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		tekrarOyna.setBackground(new java.awt.Color(0, 153, 255));
		tekrarOyna.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
		tekrarOyna.setForeground(new java.awt.Color(255, 255, 255));
		tekrarOyna.setText("TEKRAR OYNA");
		tekrarOyna.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				tekrarOynaActionPerformed(evt);
			}
		});
		getContentPane().add(tekrarOyna);
		tekrarOyna.setBounds(840, 900, 350, 80);
		
		puanGoster.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
		puanGoster.setForeground(new java.awt.Color(255, 0, 0));
		puanGoster.setText("puan");
		getContentPane().add(puanGoster);
		puanGoster.setBounds(810, 460, 620, 80);
		
		jLabel1.setBackground(new java.awt.Color(255, 0, 0));
		jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 200)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(255, 0, 0));
		jLabel1.setText("KAYBETTİNİZ");
		getContentPane().add(jLabel1);
		jLabel1.setBounds(380, 10, 1340, 220);
		
		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/KaybettinizEkrani.jpg"))); // NOI18N
		jLabel2.setText("jLabel2");
		getContentPane().add(jLabel2);
		jLabel2.setBounds(0, 0, 2030, 1040);
		
		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 2030, Short.MAX_VALUE));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 1040, Short.MAX_VALUE));
		
		getContentPane().add(jPanel2);
		jPanel2.setBounds(0, 0, 2030, 1040);
		
		pack();
	}// </editor-fold>//GEN-END:initComponents
	
	private void tekrarOynaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tekrarOynaActionPerformed
		this.setVisible(false);
		AnaMenu anamenu = new AnaMenu();
		anamenu.setVisible(true);
	}// GEN-LAST:event_tekrarOynaActionPerformed
	
	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel. For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Kaybettiniz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Kaybettiniz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Kaybettiniz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Kaybettiniz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Kaybettiniz(0).setVisible(true);
			}
		});
		System.out.println("dsdsdsd");
		
	}
	
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JLabel puanGoster;
	private javax.swing.JButton tekrarOyna;
	// End of variables declaration//GEN-END:variables
}
