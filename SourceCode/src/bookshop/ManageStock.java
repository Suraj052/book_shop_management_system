/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookshop;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author suraj
 */
public class ManageStock extends javax.swing.JFrame {


    public ManageStock() {
        initComponents();
        stockTable.getTableHeader().setFont(new Font("Recoleta",Font.BOLD,12));
        stockTable.getTableHeader().setOpaque(false);
        stockTable.getTableHeader().setBackground(new Color(9,25,69));
        stockTable.getTableHeader().setForeground(new Color(255,255,255));
        stockTable.setRowHeight(25);
            
        Show_Data();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idtext = new javax.swing.JTextField();
        authortext = new javax.swing.JTextField();
        nametext = new javax.swing.JTextField();
        quantitytext = new javax.swing.JTextField();
        categorytext = new javax.swing.JTextField();
        pricetext = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        stockTable = new javax.swing.JTable();
        addbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(931, 581));

        jPanel1.setBackground(new java.awt.Color(64, 205, 232));

        jLabel1.setFont(new java.awt.Font("Recoleta Bold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book ID");

        jLabel2.setFont(new java.awt.Font("Recoleta Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Book Name");

        jLabel3.setFont(new java.awt.Font("Recoleta Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Author");

        jLabel4.setFont(new java.awt.Font("Recoleta Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Category");

        jLabel5.setFont(new java.awt.Font("Recoleta Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity");

        jLabel6.setFont(new java.awt.Font("Recoleta Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price");

        idtext.setFont(new java.awt.Font("Product Sans", 1, 13)); // NOI18N
        idtext.setForeground(new java.awt.Color(37, 38, 45));
        idtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtextActionPerformed(evt);
            }
        });

        authortext.setFont(new java.awt.Font("Product Sans", 1, 13)); // NOI18N
        authortext.setForeground(new java.awt.Color(37, 38, 45));

        nametext.setFont(new java.awt.Font("Product Sans", 1, 13)); // NOI18N
        nametext.setForeground(new java.awt.Color(37, 38, 45));

        quantitytext.setFont(new java.awt.Font("Product Sans", 1, 13)); // NOI18N
        quantitytext.setForeground(new java.awt.Color(37, 38, 45));

        categorytext.setFont(new java.awt.Font("Product Sans", 1, 13)); // NOI18N
        categorytext.setForeground(new java.awt.Color(37, 38, 45));

        pricetext.setFont(new java.awt.Font("Product Sans", 1, 13)); // NOI18N
        pricetext.setForeground(new java.awt.Color(37, 38, 45));

        stockTable.setBackground(new java.awt.Color(255, 189, 41));
        stockTable.setFont(new java.awt.Font("Product Sans", 1, 12)); // NOI18N
        stockTable.setForeground(new java.awt.Color(37, 38, 45));
        stockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Name", "Author", "Category", "Quantity", "Price"
            }
        ));
        stockTable.setFocusable(false);
        stockTable.setRowHeight(25);
        stockTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        stockTable.setSelectionForeground(new java.awt.Color(37, 38, 45));
        stockTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(stockTable);

        addbtn.setFont(new java.awt.Font("Recoleta Bold", 1, 16)); // NOI18N
        addbtn.setForeground(new java.awt.Color(9, 25, 69));
        addbtn.setText("ADD");
        addbtn.setPreferredSize(new java.awt.Dimension(75, 25));
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        deletebtn.setFont(new java.awt.Font("Recoleta Bold", 1, 16)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(9, 25, 69));
        deletebtn.setText("DELETE");
        deletebtn.setPreferredSize(new java.awt.Dimension(75, 25));
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        updatebtn.setFont(new java.awt.Font("Recoleta Bold", 1, 16)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(9, 25, 69));
        updatebtn.setText("UPDATE");
        updatebtn.setPreferredSize(new java.awt.Dimension(75, 25));
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        backbtn.setBackground(new java.awt.Color(64, 205, 232));
        backbtn.setFont(new java.awt.Font("Recoleta Bold", 0, 16)); // NOI18N
        backbtn.setForeground(new java.awt.Color(204, 0, 51));
        backbtn.setText("Back");
        backbtn.setBorder(null);
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(37, 38, 45));
        jLabel7.setFont(new java.awt.Font("Recoleta Bold", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(9, 25, 69));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("  MANAGE  BOOKS  STOCK  ");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pricetext, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                    .addComponent(quantitytext)
                                    .addComponent(nametext)
                                    .addComponent(categorytext)
                                    .addComponent(idtext)
                                    .addComponent(authortext)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(idtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(authortext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(categorytext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(quantitytext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(pricetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        try{
            Connection con = ConnectionManager.getConnection();
            String sql = "UPDATE stock SET book_name=?,author=?,category=?,quantity=?,price=? WHERE book_id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(6,idtext.getText());
            pst.setString(1,nametext.getText());
            pst.setString(2,authortext.getText());
            pst.setString(3,categorytext.getText());
            pst.setString(4,quantitytext.getText());
            pst.setString(5,pricetext.getText());
            int rs = pst.executeUpdate();
            if(rs>=0)
               {
                   JOptionPane.showMessageDialog(this,"Data Updated Successfully");
               }
               else
               {
                   JOptionPane.showMessageDialog(this,"Unable to Update Data");
                    idtext.setText("");
                    nametext.setText("");
                    authortext.setText("");
                    categorytext.setText("");
                    pricetext.setText("");
                    idtext.requestFocus();
               }
            con.close();
            ManageStock d = new ManageStock();
            this.hide();
            d.setVisible(true);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.toString());
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        try{
            Connection con = ConnectionManager.getConnection();
            String sql = "insert into stock (book_id,book_name,author,category,quantity,price) values (?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,idtext.getText());
            pst.setString(2,nametext.getText());
            pst.setString(3,authortext.getText());
            pst.setString(4,categorytext.getText());
            pst.setString(5,quantitytext.getText());
            pst.setString(6,pricetext.getText());
            int rs = pst.executeUpdate();
            if(rs>=0)
               {
                   JOptionPane.showMessageDialog(this,"Data Added Successfully");
               }
               else
               {
                   JOptionPane.showMessageDialog(this,"Unable to Add Data");
                    idtext.setText("");
                    nametext.setText("");
                    authortext.setText("");
                    categorytext.setText("");
                    pricetext.setText("");
                    idtext.requestFocus();
               }
            con.close();
            ManageStock d = new ManageStock();
            this.hide();
            d.setVisible(true);
          
        }   
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.toString());
        }
     
    }//GEN-LAST:event_addbtnActionPerformed

    private void idtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtextActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        try{
            if(!idtext.getText().equals(""))
            {
                Connection con = ConnectionManager.getConnection();
                String sql = "DELETE FROM stock where book_id=?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1,idtext.getText());
                int rs = pst.executeUpdate();
                if(rs>=0)
                   {
                       JOptionPane.showMessageDialog(this,"Data Deleted Successfully");
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(this,"Unable to Delete Data");
                        idtext.setText("");
                        nametext.setText("");
                        authortext.setText("");
                        categorytext.setText("");
                        pricetext.setText("");
                        idtext.requestFocus();
                   }
                con.close();
                ManageStock d = new ManageStock();
                this.hide();
                d.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Enter the Book ID !");
            }
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.toString());
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void stockTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockTableMouseClicked
           int index = stockTable.getSelectedRow();
           Show_Item(index);
    }//GEN-LAST:event_stockTableMouseClicked

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
            DashboardPage_Employee d = new DashboardPage_Employee();
            this.hide();
            d.setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

    public ArrayList<BookModel> getBooks()
    {
        ArrayList<BookModel> booksList = new ArrayList<BookModel>();
        Connection con = ConnectionManager.getConnection();
        String sql = "SELECT * FROM stock";

        Statement st;
        ResultSet rs;
        
        try{
          
            st = con.createStatement();
            rs = st.executeQuery(sql);
            BookModel bookmodel;
            
            while(rs.next())
            {
                bookmodel = new BookModel(rs.getString("book_id"),rs.getString("book_name"),rs.getString("author"),rs.getString("category"),rs.getInt("quantity"),rs.getInt("price"));
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
        DefaultTableModel model = (DefaultTableModel)stockTable.getModel();
        
        Object[] row = new Object[6];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getID();
            row[1]=list.get(i).getname();
            row[2]=list.get(i).getauthor();
            row[3]=list.get(i).getcategory();
            row[4]=list.get(i).getquantity();
            row[5]=list.get(i).getprice();
            
            model.addRow(row);
        }
    }
    
    public void Show_Item(int i)
    {
        idtext.setText(getBooks().get(i).getID());
        nametext.setText(getBooks().get(i).getname());
        authortext.setText(getBooks().get(i).getauthor());
        categorytext.setText(getBooks().get(i).getcategory());
        quantitytext.setText(Integer.toString(getBooks().get(i).getquantity()));
        pricetext.setText(Integer.toString(getBooks().get(i).getprice()));
    }
    
    
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
            java.util.logging.Logger.getLogger(ManageStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField authortext;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField categorytext;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextField idtext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nametext;
    private javax.swing.JTextField pricetext;
    private javax.swing.JTextField quantitytext;
    private javax.swing.JTable stockTable;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
