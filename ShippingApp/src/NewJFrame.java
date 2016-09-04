import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Calendar;
import java.util.Properties;

/**
 * ****************************************************************************
 * File:NewJFrame.java Course: 17655 Project: Assignment 2 Copyright: Copyright
 * (c) 2009 Carnegie Mellon University Versions: 1.0 November 2009 - Initial
 * rewrite of original assignment 2 (ajl).
 *
 * This class defines a GUI application that allows EEP shipping personnel to
 * mark orders as shipped.
 *
 *****************************************************************************
 */
/*
 * Created on Feb 4, 2010, 7:40:03 PM
 *
 * @author lattanze
 */
public class NewJFrame extends javax.swing.JFrame {

    Integer updateOrderID;
    String versionID = "v2.10.10";
    public String SQLServerIP;
    public String dbuser;
    public String dbpassword;

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        jLabel1.setText("Shipping Application " + versionID);
        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("Config.txt");
            // load a properties file
            prop.load(input);
            // get the property value
            SQLServerIP = prop.getProperty("database_ip");
            dbuser = prop.getProperty("dbuser");
            dbpassword = prop.getProperty("dbpassword");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Shipping Application");

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Order Information:");

        jLabel5.setText("Customer First Name:");

        jLabel6.setText("Last Name:");

        jTextField3.setEditable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Phone Number:");

        jTextField4.setEditable(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel8.setText("Mailing Address");

        jTextArea2.setColumns(20);
        jTextArea2.setEditable(false);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton1.setText("Mark As Shipped");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Show  Pending Orders");
        jButton2.setDefaultCapable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Select Order");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setText("Order Number : Order Date & Time: Customer Name");

        jTextArea3.setColumns(20);
        jTextArea3.setEditable(false);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel9.setText("Order Items ");

        jLabel11.setText("Messages");

        jButton4.setText("Show Shipped Orders");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextArea4.setColumns(20);
        jTextArea4.setEditable(false);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jLabel2.setText("Order Date:");

        jTextField5.setEditable(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(228, 228, 228))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField5)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(8, 8, 8)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel11))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // jButton2 is responsible for refreshing the list of pending
        // orders.
        getPendingOrders();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // This button gets the selected line of text from the
        // order list window jTextArea1. The line of text is parsed for the
        // order number. Once the order number is parsed, then the order is
        // retrieved from the orders database. The ordertabel field from the
        // record contains the name of the table that has the items that make
        // up the order. This table is opened and all the items are listed
        // in jTextArea3.

        Boolean connectError = false;       // Error flag
        Connection DBConn = null;           // MySQL connection handle    
        String errString = null;            // String for displaying errors
        int beginIndex;                     // Parsing index
        int endIndex;                       // Parsing index
        String msgString = null;            // String for displaying non-error messages
        String orderSelection = null;       // Order selected from TextArea1
        String orderTable = null;           // The name of the table containing the order items
        String orderID = null;              // Product ID pnemonic
        String productDescription = null;   // Product description
        ResultSet res = null;               // SQL query result set pointer
        Statement s = null;                 // SQL statement pointer
        Boolean orderBlank = false;         // False: order string is not blank
        String SQLStatement;                // SQL query

        // this is the selected line of text
        orderSelection = jTextArea1.getSelectedText();

        // make sure its not blank
        if (orderSelection.length() > 0) {
            // get the product ID
            beginIndex = 0;
            beginIndex = orderSelection.indexOf(" # ", beginIndex);
            beginIndex = beginIndex + 3; //skip past _#_
            endIndex = orderSelection.indexOf(" :", beginIndex);
            orderID = orderSelection.substring(beginIndex, endIndex);

        } else {

            msgString = ">> Order string is blank...";
            jTextArea4.setText("\n" + msgString);
            orderBlank = true;

        } // Blank string check

        // If an order was selected, then connect to the orderinfo database. In
        // all normal situations this would be impossible to do since the select
        // button is disabled until an order is selected... just in case the
        // check is here.
        if (!orderBlank) {
            try {
                msgString = ">> Establishing Driver...";
                jTextArea4.setText("\n" + msgString);

                //load JDBC driver class for MySQL
                Class.forName("com.mysql.jdbc.Driver");

                msgString = ">> Setting up URL...";
                jTextArea4.append("\n" + msgString);

                //define the data source
              
                String sourceURL = "jdbc:mysql://" + SQLServerIP + ":3306/orderinfo";

                msgString = ">> Establishing connection with: " + sourceURL + "...";
                jTextArea4.append("\n" + msgString);

                //create a connection to the db - note the default account is "remote"
                //and the password is "remote_pass" - you will have to set this
                //account up in your database
               DBConn = DriverManager.getConnection(sourceURL, dbuser, dbpassword);

            } catch (Exception e) {

                errString = "\nProblem connecting to orderinfo database:: " + e;
                jTextArea4.append(errString);
                connectError = true;

            } // end try-catch

        } // blank order check 

        if (!connectError && !orderBlank) {
            try {
                s = DBConn.createStatement();
                SQLStatement = "SELECT * FROM orders WHERE order_id = " + Integer.parseInt(orderID);
                res = s.executeQuery(SQLStatement);

                // Get the information from the database. Display the
                // first and last name, address, phone number, address, and
                // order date. Same the ordertable name - this is the name of
                // the table that is created when an order is submitted that
                // contains the list of order items.
                while (res.next()) {

                    orderTable = res.getString(9);         // name of table with list of items
                    jTextField2.setText(res.getString(3)); // first name
                    jTextField3.setText(res.getString(4)); // last name
                    jTextField4.setText(res.getString(6)); // phone
                    jTextField5.setText(res.getString(2)); // order date
                    jTextArea2.setText(res.getString(5));  // address

                } // for each element in the return SQL query

                // get the order items from the related order table
                SQLStatement = "SELECT * FROM " + orderTable;
                res = s.executeQuery(SQLStatement);

                // list the items on the form that comprise the order
                jTextArea3.setText("");

                while (res.next()) {
                    msgString = res.getString(1) + ":  PRODUCT ID: " + res.getString(2)
                            + "  DESCRIPTION: " + res.getString(3) + "  PRICE $" + res.getString(4);
                    jTextArea3.append(msgString + "\n");

                } // while

                // This global variable is used to update the record as shipped
                updateOrderID = Integer.parseInt(orderID);

                // Update the form
                jButton1.setEnabled(true);
                msgString = "RECORD RETRIEVED...";
                jTextArea4.setText(msgString);

            } catch (Exception e) {

                errString = "\nProblem getting order items:: " + e;
                jTextArea1.append(errString);

            } // end try-catch

        } // connect and blank order check

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // This method is responsible changing the status of the order
        // to shipped.

        Boolean connectError = false;       // Error flag
        Connection DBConn = null;           // MySQL connection handle
        String errString = null;            // String for displaying errors
        String msgString = null;            // String for displaying non-error messages
        ResultSet res = null;               // SQL query result set pointer
        int rows;                           // Rows updated
        Statement s = null;                 // SQL statement pointer

        String SQLStatement = null;         // SQL statement string
        int executeUpdateVal;           // Return value from execute indicating effected rows
        String SQLstatement = null;     // String for building SQL queries
        Boolean ShipmentSuccess = true;       // Error flag

         // Calendar utility used to get the current date and time and 
        // change it to MM/DD/YYYY date format and hh:mm:ss time format
        Calendar rightNow = Calendar.getInstance();

        int TheHour = rightNow.get(rightNow.HOUR_OF_DAY);
        int TheMinute = rightNow.get(rightNow.MINUTE);
        int TheSecond = rightNow.get(rightNow.SECOND);
        int TheDay = rightNow.get(rightNow.DAY_OF_MONTH);
        int TheMonth = rightNow.get(rightNow.MONTH) + 1;
        int TheYear = rightNow.get(rightNow.YEAR);

        // Connect to the order database
        try {
            msgString = ">> Establishing Driver...";
            jTextArea4.setText("\n" + msgString);

            //load JDBC driver class for MySQL
            Class.forName("com.mysql.jdbc.Driver");

            msgString = ">> Setting up URL...";
            jTextArea4.append("\n" + msgString);

            //define the data source
           
            String sourceURL = "jdbc:mysql://" + SQLServerIP + ":3306/orderinfo";

            msgString = ">> Establishing connection with: " + sourceURL + "...";
            jTextArea4.append("\n" + msgString);

            //create a connection to the db - note the default account is "remote"
            //and the password is "remote_pass" - you will have to set this
            //account up in your database
           DBConn = DriverManager.getConnection(sourceURL, dbuser, dbpassword);

        } catch (Exception e) {

            errString = "\nProblem connecting to orderinfo database:: " + e;
            jTextArea4.append(errString);
            connectError = true;

        } // end try-catch

        // If we are connected, then we update the shipped status
        if (!connectError) {
            try {
                // first we create the query
                s = DBConn.createStatement();
                SQLStatement = "UPDATE orders SET shipped=" + true + " WHERE order_id=" + updateOrderID;

                // execute the statement
                rows = s.executeUpdate(SQLStatement);

                // if the query worked, then we display the data in TextArea 4 - BTW, its highly
                // unlikely that the row won't exist and if it does the database tables are
                // really screwed up... this should not fail if you get here, but the check (in the
                // form of the else clause) is in place anyway
                if (rows > 0) {
                    jTextArea4.setText("\nOrder #" + updateOrderID + " status has been changed to shipped.");

                } else {

                    jTextArea4.setText("\nOrder #" + updateOrderID + " record not found.");

                } // execute check

                // Clean up the form
                jButton1.setEnabled(false);
                jButton3.setEnabled(false);
                jTextArea1.setText("");
                jTextArea2.setText("");
                jTextArea3.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");

            } catch (Exception e) {

                errString = "\nProblem updating status:: " + e;
                jTextArea4.append(errString);
                jTextArea1.setText("");
                ShipmentSuccess = false;

            } // end try-catch

        } // if connect check

        // check whether shipment is done
        if (ShipmentSuccess) // if shipment is done
        {
            try {

            //define the data source
                //String SQLServerIP = "localhost";
                String sourceURL = "jdbc:mysql://" + SQLServerIP + ":3306/userinfo";

                msgString = ">> Establishing connection with: " + sourceURL + "...";

            //create a connection to the db - note the default account is "remote"
                //and the password is "remote_pass" - you will have to set this
                //account up in your database
                DBConn = DriverManager.getConnection(sourceURL, dbuser, dbpassword);

            } catch (Exception e) {

                errString = "\nProblem connecting to database:: " + e;

                connectError = true;

            } // end try-catch

        /// If we are connected, then we insert a user shipement entry inside the 
            // ordershipment_audit table in userinfo database
            if (!connectError) {
                try {

                    String sMonth = (String.valueOf(TheMonth).length() == 1) ? ("0" + String.valueOf(TheMonth)) : String.valueOf(TheMonth);
                    String sDay = (String.valueOf(TheDay).length() == 1) ? ("0" + String.valueOf(TheDay)) : String.valueOf(TheDay);
                    String sHour = (String.valueOf(TheHour).length() == 1) ? ("0" + String.valueOf(TheHour)) : String.valueOf(TheHour);
                    String sMinute = (String.valueOf(TheMinute).length() == 1) ? ("0" + String.valueOf(TheMinute)) : String.valueOf(TheMinute);
                    String sSecond = (String.valueOf(TheSecond).length() == 1) ? ("0" + String.valueOf(TheSecond)) : String.valueOf(TheSecond);

                    String ShipmentDate = sMonth + "/" + sDay + "/" + TheYear;
                    String ShipmentTime = sHour + ":" + sMinute + ":" + sSecond;

                    s = DBConn.createStatement();
                    // insert the order shipment log into ordershipment_audit table
                    SQLstatement = ("insert into ordershipment_audit(OrderNumber,ShipmentTime,ShipmentDate)"
                            + "values ('" + updateOrderID + "','" + ShipmentTime + "','"
                            + ShipmentDate + "');");

                    executeUpdateVal = s.executeUpdate(SQLstatement);

                } catch (Exception e) {

                    errString = "\nProblem getting ordershipment_audit table:: " + e;

                } // end try-catch
            } // if connect check
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // This button will display the list of orders that have already
        // have been shipped.

        getShippedOrders();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void getPendingOrders() {

        // This method is responsible for querying the orders database and
        // getting the list of pending orders. This are orders that have not
        // been shipped as of yet. The list of pending orders is written to
        // jTextArea1.
        Boolean connectError = false;       // Error flag
        Connection DBConn = null;           // MySQL connection handle
        String errString = null;            // String for displaying errors
        String msgString = null;            // String for displaying non-error messages
        ResultSet res = null;               // SQL query result set pointer
        Statement s = null;                 // SQL statement pointer
        int shippedStatus;                  // if 0, order not shipped, if 1 order shipped

        // Clean up the form before we start
        jTextArea1.setText("");
        jTextArea2.setText("");
        jTextArea3.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");

        // Connect to the order database
        try {
            msgString = ">> Establishing Driver...";
            jTextArea4.setText("\n" + msgString);

            //load JDBC driver class for MySQL
            Class.forName("com.mysql.jdbc.Driver");

            msgString = ">> Setting up URL...";
            jTextArea4.append("\n" + msgString);

            //define the data source
           
            String sourceURL = "jdbc:mysql://" + SQLServerIP + ":3306/orderinfo";

            msgString = ">> Establishing connection with: " + sourceURL + "...";
            jTextArea4.append("\n" + msgString);

            //create a connection to the db - note the default account is "remote"
            //and the password is "remote_pass" - you will have to set this
            //account up in your database
            DBConn = DriverManager.getConnection(sourceURL, dbuser, dbpassword);

        } catch (Exception e) {

            errString = "\nProblem connecting to orderinfo database:: " + e;
            jTextArea4.append(errString);
            connectError = true;

        } // end try-catch

        // If we are connected, then we get the list of trees from the
        // inventory database
        if (!connectError) {
            try {
                // Create a query to get all the orders and execute the query
                s = DBConn.createStatement();
                res = s.executeQuery("Select * from orders");

                //Display the data in the textarea
                jTextArea1.setText("");

                // For each row returned, we check the shipped status. If it is
                // equal to 0 it means it has not been shipped as of yet, so we
                // display it in TextArea 1. Note that we use an integer because
                // MySQL stores booleans and a TinyInt(1), which we interpret
                // here on the application side as an integer. It works, it just
                // isn't very elegant.
                while (res.next()) {
                    shippedStatus = Integer.parseInt(res.getString(8));

                    if (shippedStatus == 0) {
                        msgString = "ORDER # " + res.getString(1) + " : " + res.getString(2)
                                + " : " + res.getString(3) + " : " + res.getString(4);
                        jTextArea1.append(msgString + "\n");

                    } // shipped status check

                } // while

                // notify the user all went well and enable the select order
                // button
                jButton3.setEnabled(true);
                msgString = "\nPENDING ORDERS RETRIEVED...";
                jTextArea4.setText(msgString);

            } catch (Exception e) {

                errString = "\nProblem getting tree inventory:: " + e;
                jTextArea4.append(errString);

            } // end try-catch

        } // if connect check

    } // getPendingOrders

    private void getShippedOrders() {

        // This method is responsible for querying the orders database and
        // getting the list of orders that have been shipped. The list of shipped
        // orders is written to jTextArea1.
        Boolean connectError = false;       // Error flag
        Connection DBConn = null;           // MySQL connection handle
        String errString = null;            // String for displaying errors
        String msgString = null;            // String for displaying non-error messages
        ResultSet res = null;               // SQL query result set pointer
        Statement s = null;                 // SQL statement pointer
        int shippedStatus;                  // if 0, order not shipped, if 1 order shipped

        // Clean up the form before we start
        jTextArea1.setText("");
        jTextArea2.setText("");
        jTextArea3.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");

        // Connect to the order database
        try {
            msgString = ">> Establishing Driver...";
            jTextArea4.setText("\n" + msgString);

            //load JDBC driver class for MySQL
            Class.forName("com.mysql.jdbc.Driver");

            msgString = ">> Setting up URL...";
            jTextArea4.append("\n" + msgString);

            //define the data source
           
            String sourceURL = "jdbc:mysql://" + SQLServerIP + ":3306/orderinfo";

            msgString = ">> Establishing connection with: " + sourceURL + "...";
            jTextArea4.append("\n" + msgString);

            //create a connection to the db - note the default account is "remote"
            //and the password is "remote_pass" - you will have to set this
            //account up in your database
           DBConn = DriverManager.getConnection(sourceURL, dbuser, dbpassword);

        } catch (Exception e) {

            errString = "\nProblem connecting to orderinfo database:: " + e;
            jTextArea4.append(errString);
            connectError = true;

        } // end try-catch

        // If we are connected, then we get the list of trees from the
        // inventory database
        if (!connectError) {
            try {
                // Create a query to get all the rows from the orders database
                // and execute the query.
                s = DBConn.createStatement();
                res = s.executeQuery("Select * from orders");

                //Display the data in the textarea
                jTextArea1.setText("");

                // For each row returned, we check the shipped status. If it is
                // equal to 0 it means it has not been shipped as of yet, so we
                // display it in TextArea 1. Note that we use an integer because
                // MySQL stores booleans and a TinyInt(1), which we interpret
                // here on the application side as an integer. It works, it just
                // isn't very elegant.
                while (res.next()) {
                    shippedStatus = Integer.parseInt(res.getString(8));

                    if (shippedStatus == 1) {
                        msgString = "SHIPPED ORDER # " + res.getString(1) + " : " + res.getString(2)
                                + " : " + res.getString(3) + " : " + res.getString(4);
                        jTextArea1.append(msgString + "\n");

                    } // shipped status check

                } // while

                jButton1.setEnabled(false);
                jButton3.setEnabled(false);

                msgString = "\nSHIPPED ORDERS RETRIEVED...";
                jTextArea4.setText(msgString);

            } catch (Exception e) {

                errString = "\nProblem getting tree inventory:: " + e;
                jTextArea4.append(errString);

            } // end try-catch

        } // connect check

    } // getPendingOrders

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

}
