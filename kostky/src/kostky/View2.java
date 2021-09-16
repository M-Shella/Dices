package kostky;

import java.awt.image.BufferedImage;

public class View2 extends javax.swing.JFrame {
    private Prepravka prepravka;
    View view;
    Platno2 platna[];
    Metody metody;
    Statistiky stats;
    Statistiky2 docSta;
   
    public View2(View view) {
        initComponents();
        prepravka = Prepravka.getInstance();
        this.view = view;
        stats = new Statistiky(this);
        docSta = new Statistiky2(this);
        metody = new Metody();
        platna = new Platno2[6];
        for (int i = 0; i < 6; i++) {
            Platno2 platno2 = new Platno2();
            platno2.setSize(130, 130);
            platno2.setLocation(i%3*135+5, i/3*135);
            add(platno2);
            platna[i] = platno2;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jButton1 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });

        jButton1.setText("Hodit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu3.setText("Soubor");

        jMenuItem1.setText("1 Kostka");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jCheckBoxMenuItem1.setText("Celkové Statistiky");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setText("Dočasné Statistiky");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem2);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        prepravka.docRes();
        BufferedImage images[] = metody.sestObr();
        for (int i=0; i<6; i++) {
            platna[i].setImage(images[i]);
        }
        stats.setStats();
        docSta.setStats();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        if(jCheckBoxMenuItem1.isSelected()) stats.setVisible(true);
        else stats.setVisible(false);
        stats.setLocation(this.getX()+this.getWidth()-10, this.getY()+1);
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        if(prepravka.isUzamknout1())stats.setLocation(this.getX()+this.getWidth()-10, this.getY()+1);
        if(prepravka.isUzamknout2())docSta.setLocation(this.getX()+this.getWidth()-10+docSta.getWidth(), this.getY()+1);
    }//GEN-LAST:event_formComponentMoved

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        if(jCheckBoxMenuItem2.isSelected()) docSta.setVisible(true);
        else docSta.setVisible(false);
        docSta.setLocation(this.getX()+this.getWidth()-10+docSta.getWidth(), this.getY()+1);
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        stats.setVisible(false);
        docSta.setVisible(false);
        view.setVisible(true);
        prepravka.reset();
        prepravka.docRes();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
