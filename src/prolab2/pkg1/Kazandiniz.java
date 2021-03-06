package prolab2.pkg1;
public class Kazandiniz extends javax.swing.JFrame {
	
	/**
	 * Creates new form Kazandiniz
	 */
	public Kazandiniz(int puanGoster) {
		initComponents();
		setTitle("KAZANDİNİZ");
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
		jLabel2 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		tekrarOyna.setBackground(new java.awt.Color(51, 153, 255));
		tekrarOyna.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
		tekrarOyna.setForeground(new java.awt.Color(255, 255, 255));
		tekrarOyna.setText("TEKRAR OYNA");
		tekrarOyna.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				tekrarOynaActionPerformed(evt);
			}
		});
		getContentPane().add(tekrarOyna);
		tekrarOyna.setBounds(740, 830, 410, 90);
		
		puanGoster.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
		puanGoster.setForeground(new java.awt.Color(0, 153, 0));
		puanGoster.setText("puan");
		getContentPane().add(puanGoster);
		puanGoster.setBounds(730, 450, 570, 70);
		
		jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 200)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(0, 153, 51));
		jLabel2.setText("KAZANDINIZ");
		getContentPane().add(jLabel2);
		jLabel2.setBounds(350, 40, 1320, 170);
		
		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/KazandinizEkrani.jpg"))); // NOI18N
		jLabel1.setText("jLabel1");
		getContentPane().add(jLabel1);
		jLabel1.setBounds(0, 0, 2080, 1030);
		
		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 2090, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 1050, Short.MAX_VALUE));
		
		getContentPane().add(jPanel1);
		jPanel1.setBounds(0, 0, 2090, 1050);
		
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
			java.util.logging.Logger.getLogger(Kazandiniz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Kazandiniz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Kazandiniz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Kazandiniz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Kazandiniz(0).setVisible(true);
			}
		});
	}
	
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel puanGoster;
	private javax.swing.JButton tekrarOyna;
	// End of variables declaration//GEN-END:variables
}
