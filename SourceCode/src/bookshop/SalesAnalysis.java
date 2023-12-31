/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookshop;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author suraj
 */
public class SalesAnalysis extends javax.swing.JFrame {

    /**
     * Creates new form SalesAnalysis
     */
    public SalesAnalysis() {
        initComponents();
        SalesTable.getTableHeader().setFont(new Font("Recoleta",Font.BOLD,12));
        SalesTable.getTableHeader().setOpaque(false);
        SalesTable.getTableHeader().setBackground(new Color(9,25,69));
        SalesTable.getTableHeader().setForeground(new Color(255,255,255));
        SalesTable.setRowHeight(25);
        Show_Data();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SalesTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        evaluatebtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        soldtext = new javax.swing.JTextField();
        amounttext = new javax.swing.JTextField();
        expendtext = new javax.swing.JTextField();
        analysistext = new javax.swing.JTextField();
        pertext = new javax.swing.JTextField();
        backbtn1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(64, 205, 232));

        SalesTable.setBackground(new java.awt.Color(255, 185, 45));
        SalesTable.setFont(new java.awt.Font("Product Sans", 1, 12)); // NOI18N
        SalesTable.setForeground(new java.awt.Color(37, 38, 45));
        SalesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Name", "Book Quantity", "Price", "Date"
            }
        ));
        SalesTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(SalesTable);

        jLabel1.setFont(new java.awt.Font("Recoleta Bold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total Books Sold");

        jLabel2.setFont(new java.awt.Font("Recoleta Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total Amount Collected");

        jLabel3.setFont(new java.awt.Font("Recoleta Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter Shop's Expenditure");

        evaluatebtn.setFont(new java.awt.Font("Recoleta Bold", 0, 16)); // NOI18N
        evaluatebtn.setForeground(new java.awt.Color(9, 25, 69));
        evaluatebtn.setText("Evaluate");
        evaluatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluatebtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Recoleta Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Analysis Result");

        jLabel6.setFont(new java.awt.Font("Recoleta Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Percentage");

        soldtext.setFont(new java.awt.Font("Product Sans", 1, 14)); // NOI18N
        soldtext.setForeground(new java.awt.Color(37, 38, 45));
        soldtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        amounttext.setFont(new java.awt.Font("Product Sans", 1, 14)); // NOI18N
        amounttext.setForeground(new java.awt.Color(37, 38, 45));
        amounttext.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        expendtext.setFont(new java.awt.Font("Product Sans", 1, 14)); // NOI18N
        expendtext.setForeground(new java.awt.Color(37, 38, 45));
        expendtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        analysistext.setFont(new java.awt.Font("Product Sans", 1, 14)); // NOI18N
        analysistext.setForeground(new java.awt.Color(37, 38, 45));
        analysistext.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        pertext.setFont(new java.awt.Font("Product Sans", 1, 14)); // NOI18N
        pertext.setForeground(new java.awt.Color(37, 38, 45));
        pertext.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        backbtn1.setBackground(new java.awt.Color(64, 205, 232));
        backbtn1.setFont(new java.awt.Font("Recoleta Bold", 0, 16)); // NOI18N
        backbtn1.setForeground(new java.awt.Color(204, 0, 51));
        backbtn1.setText("Back");
        backbtn1.setBorder(null);
        backbtn1.setMargin(new java.awt.Insets(0, 14, 3, 14));
        backbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn1ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(37, 38, 45));
        jLabel7.setFont(new java.awt.Font("Recoleta Bold", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(9, 25, 69));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SHOP  ACCOUNT  ANALYSIS");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(evaluatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pertext, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(231, 231, 231)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(soldtext, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(expendtext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(analysistext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1))
                                    .addGap(66, 66, 66)
                                    .addComponent(amounttext, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(backbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(soldtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(amounttext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(expendtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(evaluatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(analysistext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(pertext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void evaluatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluatebtnActionPerformed
        int credit = Integer.parseInt(amounttext.getText());
        int debit = Integer.parseInt(expendtext.getText());
        
        
        int d = credit-debit ;
        
        if(d>0)
        {
            double a = (1.0*d/credit)*100;
            analysistext.setText("Profit");
            pertext.setText(String.format("%.2f",a));
          }
        else
        {
            analysistext.setText("Loss");
            double a = ((1.0*(debit-credit))/debit)*100;
            pertext.setText(String.format("%.2f",a));
            
        }
    }//GEN-LAST:event_evaluatebtnActionPerformed

    private void backbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn1ActionPerformed
        DashboardPage_Employee d = new DashboardPage_Employee();
        this.hide();
        d.setVisible(true);
    }//GEN-LAST:event_backbtn1ActionPerformed

    public ArrayList<BookModel> getBooks()
    {
        ArrayList<BookModel> booksList = new ArrayList<BookModel>();
        Connection con = ConnectionManager.getConnection();
        String sql = "SELECT * FROM sales";
        Statement st;
        ResultSet rs;
        
        try{
          
            st = con.createStatement();
            rs = st.executeQuery(sql);
            BookModel bookmodel;
            
            while(rs.next())
            {
                bookmodel = new BookModel(rs.getString("B_ID"),rs.getString("B_Name"),rs.getInt("B_Quantity"),rs.getInt("B_Price"),rs.getString("B_Date"));
                booksList.add(bookmodel);
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.toString());
        }
        return booksList;
    }
    
    public void Show_Data()
    {
        ArrayList<BookModel> list = getBooks();
        DefaultTableModel model = (DefaultTableModel)SalesTable.getModel();
        int c = list.size();
        int total=0;
        Object[] row = new Object[6];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getID();
            row[1]=list.get(i).getname();
            row[2]=list.get(i).getquantity();
            row[3]=list.get(i).getprice();
            row[4]=list.get(i).getdate();
            model.addRow(row);
            total = total+list.get(i).getprice();
        }
        soldtext.setText(String.valueOf(c));
        amounttext.setText(String.valueOf(total));
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SalesAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesAnalysis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable SalesTable;
    private javax.swing.JTextField amounttext;
    private javax.swing.JTextField analysistext;
    private javax.swing.JButton backbtn1;
    private javax.swing.JButton evaluatebtn;
    private javax.swing.JTextField expendtext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pertext;
    private javax.swing.JTextField soldtext;
    // End of variables declaration//GEN-END:variables
}
