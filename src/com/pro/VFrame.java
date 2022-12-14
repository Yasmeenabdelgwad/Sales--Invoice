/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pro;

import com.pro.model.InvoiceHeader;
import com.pro.model.TableModel;
import com.pro.model.InvoiceLine;
import com.pro.model.LinesTableModel;
import com.pro.view.InvoiceHeaderDialog;
import com.pro.view.InvoiceLineDialog;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author DELL
 */
public class VFrame extends javax.swing.JFrame implements ActionListener, ListSelectionListener {

    /**
     * Creates new form InvoiceFrame
     */
    public VFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll1 = new javax.swing.JScrollPane();
        invoicesTable = new javax.swing.JTable();
        invoicesTable.getSelectionModel().addListSelectionListener(this);
        createInvoiceButton = new javax.swing.JButton();
        createInvoiceButton.addActionListener(this);
        deleteInvoiceButton = new javax.swing.JButton();
        deleteInvoiceButton.addActionListener(this);
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        customerNameTextField = new javax.swing.JTextField();
        invoiceDateTexField = new javax.swing.JTextField();
        invNumLbl = new javax.swing.JLabel();
        invTotalLbl = new javax.swing.JLabel();
        scroll2 = new javax.swing.JScrollPane();
        invoiceLinesTable = new javax.swing.JTable();
        createLineButton = new javax.swing.JButton();
        createLineButton.addActionListener(this);
        deleteLineButton = new javax.swing.JButton();
        deleteLineButton.addActionListener(this);
        menuBar = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        loadMenuItem = new javax.swing.JMenuItem();
        loadMenuItem.addActionListener(this);
        saveMenuItem = new javax.swing.JMenuItem();
        saveMenuItem.addActionListener(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoicesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scroll1.setViewportView(invoicesTable);

        createInvoiceButton.setText("Create New Invoice");
        createInvoiceButton.setActionCommand("CreateNewInvoice");

        deleteInvoiceButton.setText("Delete Invoice");
        deleteInvoiceButton.setActionCommand("DeleteInvoice");

        Label1.setText("Invoice Number");

        Label2.setText("Invoide Date");

        Label3.setText("Customer name");

        Label4.setText("Invoice Total");

        invoiceLinesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scroll2.setViewportView(invoiceLinesTable);

        createLineButton.setText("Create New Line");
        createLineButton.setActionCommand("CreateNewLine");

        deleteLineButton.setText("Delete Line");
        deleteLineButton.setActionCommand("DeleteLine");

        Menu.setText("File");

        loadMenuItem.setText("Load File");
        loadMenuItem.setActionCommand("LoadFile");
        Menu.add(loadMenuItem);

        saveMenuItem.setText("Save File");
        saveMenuItem.setActionCommand("SaveFile");
        Menu.add(saveMenuItem);

        menuBar.add(Menu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Label3)
                                            .addComponent(Label1)
                                            .addComponent(Label2)
                                            .addComponent(Label4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(customerNameTextField)
                                            .addComponent(invoiceDateTexField)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(invNumLbl)
                                                    .addComponent(invTotalLbl))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(scroll2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(createLineButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteLineButton)
                                .addGap(113, 113, 113))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(createInvoiceButton)
                        .addGap(87, 87, 87)
                        .addComponent(deleteInvoiceButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label1)
                            .addComponent(invNumLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label2)
                            .addComponent(invoiceDateTexField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label3)
                            .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label4)
                            .addComponent(invTotalLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createLineButton)
                            .addComponent(deleteLineButton))
                        .addGap(44, 44, 44)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteInvoiceButton)
                    .addComponent(createInvoiceButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createInvoiceButton;
    private javax.swing.JButton createLineButton;
    private javax.swing.JTextField customerNameTextField;
    private javax.swing.JButton deleteInvoiceButton;
    private javax.swing.JButton deleteLineButton;
    private javax.swing.JTextField invoiceDateTexField;
    private javax.swing.JTable invoiceLinesTable;
    private javax.swing.JLabel invNumLbl;
    private javax.swing.JLabel invTotalLbl;
    private javax.swing.JTable invoicesTable;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;

    private javax.swing.JMenu Menu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JScrollPane scroll2;
    private javax.swing.JMenuItem loadMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables
    private DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    private List<InvoiceHeader> invoicesList = new ArrayList<>();
    private TableModel invoiceHeaderTableModel;
    private LinesTableModel invoiceLinesTableModel;
    private InvoiceHeaderDialog headerDialog;
    private InvoiceLineDialog lineDialog;

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "CreateNewInvoice":
                displayNewInvoiceDialog();
                break;
            case "DeleteInvoice":
                deleteInvoice();
                break;
            case "CreateNewLine":
                displayNewLineDialog();
                break;
            case "DeleteLine":
                deleteLine();
                break;
            case "LoadFile":
                loadFile();
                break;
            case "SaveFile":
                saveData();
                break;
            case "createInvCancel":
                createInvCancel();
                break;
            case "createInvOK":
                createInvOK();
                break;
            case "createLineCancel":
                createLineCancel();
                break;
            case "createLineOK":
                createLineOK();
                break;
        }
    }



    private void saveData() {
        String headersList = "";
        String linesList = "";
        for (InvoiceHeader header : invoicesList) {
            headersList += header.getDataAsCSV();
            headersList += "\n";
            for (InvoiceLine line : header.getLines()) {
                linesList += line.getDataAsCSV();
                linesList += "\n";
            }
        }
        JOptionPane.showMessageDialog(this, "Please, select file to save header data!", "Attension", JOptionPane.WARNING_MESSAGE);
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File headerFile = fileChooser.getSelectedFile();
            try {
                FileWriter fileWriter = new FileWriter(headerFile);
                fileWriter.write(headersList);
                fileWriter.flush();
                fileWriter.close();

                JOptionPane.showMessageDialog(this, "Please, select file to save lines data!", "Attension", JOptionPane.WARNING_MESSAGE);
                result = fileChooser.showSaveDialog(this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File linesFile = fileChooser.getSelectedFile();
                    FileWriter lFWriter = new FileWriter(linesFile);
                    lFWriter.write(linesList);
                    lFWriter.flush();
                    lFWriter.close();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }
    private void loadFile() {
        JOptionPane.showMessageDialog(this, "Please, select header file!", "Attension", JOptionPane.WARNING_MESSAGE);
        JFileChooser openFile = new JFileChooser();
        int result = openFile.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File headerFile = openFile.getSelectedFile();
            try {
                FileReader headerF = new FileReader(headerFile);
                BufferedReader hBr = new BufferedReader(headerF);
                String headerLine = null;

                while ((headerLine = hBr.readLine()) != null) {
                    String[] headerParts = headerLine.split(",");
                    String invNumStr = headerParts[0];
                    String invDateStr = headerParts[1];
                    String custName = headerParts[2];

                    int invNum = Integer.parseInt(invNumStr);
                    Date invDate = df.parse(invDateStr);

                    InvoiceHeader inv = new InvoiceHeader(invNum, custName, invDate);
                    invoicesList.add(inv);
                }

                JOptionPane.showMessageDialog(this, "Please, select lines file!", "Attension", JOptionPane.WARNING_MESSAGE);
                result = openFile.showOpenDialog(this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File linesFile = openFile.getSelectedFile();
                    BufferedReader lBr = new BufferedReader(new FileReader(linesFile));
                    String linesLine = null;
                    while ((linesLine = lBr.readLine()) != null) {
                        String[] lineParts = linesLine.split(",");
                        String invNumStr = lineParts[0];
                        String itemName = lineParts[1];
                        String itemPriceStr = lineParts[2];
                        String itemCountStr = lineParts[3];

                        int invNum = Integer.parseInt(invNumStr);
                        double itemPrice = Double.parseDouble(itemPriceStr);
                        int itemCount = Integer.parseInt(itemCountStr);
                        InvoiceHeader header = findInvoiceByNum(invNum);
                        InvoiceLine invLine = new InvoiceLine(itemName, itemPrice, itemCount, header);
                        header.getLines().add(invLine);
                    }
                    invoiceHeaderTableModel = new TableModel(invoicesList);
                    invoicesTable.setModel(invoiceHeaderTableModel);
                    invoicesTable.validate();
                }
                System.out.println("Check");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }
    private void invoicesTableRowSelected() {
        int selectedRowIndx = invoicesTable.getSelectedRow();
        if (selectedRowIndx >= 0) {
            InvoiceHeader row = invoiceHeaderTableModel.getInvoicesList().get(selectedRowIndx);
            customerNameTextField.setText(row.getCustomerName());
            invoiceDateTexField.setText(df.format(row.getInvDate()));
            invNumLbl.setText("" + row.getInvNum());
            invTotalLbl.setText("" + row.getInvTotal());
            ArrayList<InvoiceLine> lines = row.getLines();
            invoiceLinesTableModel = new LinesTableModel(lines);
            invoiceLinesTable.setModel(invoiceLinesTableModel);
            invoiceLinesTableModel.fireTableDataChanged();
        }
    }


    @Override
    public void valueChanged(ListSelectionEvent e) {
        invoicesTableRowSelected();
    }
    private InvoiceHeader findInvoiceByNum(int invNum) {
        InvoiceHeader header = null;
        for (InvoiceHeader inv : invoicesList) {
            if (invNum == inv.getInvNum()) {
                header = inv;
                break;
            }
        }
        return header;
    }




    private void createInvCancel() {
        headerDialog.setVisible(false);
        headerDialog.dispose();
        headerDialog = null;
    }

    private void createInvOK() {
        String custName = headerDialog.getCustNameFd().getText();
        String invDateStr = headerDialog.getInvDateFd().getText();
        headerDialog.setVisible(false);
        headerDialog.dispose();
        headerDialog = null;
        try {
            Date invDate = df.parse(invDateStr);
            int invNum = getNextInvoiceNum();
            InvoiceHeader invoiceHeader = new InvoiceHeader(invNum, custName, invDate);
            invoicesList.add(invoiceHeader);
            invoiceHeaderTableModel.fireTableDataChanged();
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

    }
    private void displayNewInvoiceDialog() {
        headerDialog = new InvoiceHeaderDialog(this);
        headerDialog.setVisible(true);
    }

    private void displayNewLineDialog() {
        lineDialog = new InvoiceLineDialog(this);
        lineDialog.setVisible(true);
    }

    private int getNextInvoiceNum() {
        int max = 0;
        for (InvoiceHeader header : invoicesList) {
            if (header.getInvNum() > max) {
                max = header.getInvNum();
            }
        }
        return max + 1;
    }

    private void createLineCancel() {
        lineDialog.setVisible(false);
        lineDialog.dispose();
        lineDialog = null;
    }

    private void createLineOK() {
        String itemName = lineDialog.getItemNameFd().getText();
        String itemCountStr = lineDialog.getItemCountFd().getText();
        String itemPriceStr = lineDialog.getItemPriceFd().getText();
        lineDialog.setVisible(false);
        lineDialog.dispose();
        lineDialog = null;
        int itemCount = Integer.parseInt(itemCountStr);
        double itemPrice = Double.parseDouble(itemPriceStr);
        int headerIndex = invoicesTable.getSelectedRow();
        InvoiceHeader invoice = invoiceHeaderTableModel.getInvoicesList().get(headerIndex);

        InvoiceLine invoiceLine = new InvoiceLine(itemName, itemPrice, itemCount, invoice);
        invoice.addInvLine(invoiceLine);
        invoiceLinesTableModel.fireTableDataChanged();
        invoiceHeaderTableModel.fireTableDataChanged();
        invTotalLbl.setText("" + invoice.getInvTotal());

    }


    private void deleteLine() {
        int lineIndx = invoiceLinesTable.getSelectedRow();
        InvoiceLine line = invoiceLinesTableModel.getInvoiceLines().get(lineIndx);
        invoiceLinesTableModel.getInvoiceLines().remove(lineIndx);
        invoiceLinesTableModel.fireTableDataChanged();
        invoiceHeaderTableModel.fireTableDataChanged();
        invTotalLbl.setText("" + line.getHeader().getInvTotal());

    }


    private void deleteInvoice() {
        int invIndex = invoicesTable.getSelectedRow();
        InvoiceHeader header = invoiceHeaderTableModel.getInvoicesList().get(invIndex);
        invoiceHeaderTableModel.getInvoicesList().remove(invIndex);
        invoiceHeaderTableModel.fireTableDataChanged();
        invoiceLinesTableModel = new LinesTableModel(new ArrayList<InvoiceLine>());
        invoiceLinesTable.setModel(invoiceLinesTableModel);
        invoiceLinesTableModel.fireTableDataChanged();
        customerNameTextField.setText("");
        invoiceDateTexField.setText("");
        invNumLbl.setText("");
        invTotalLbl.setText("");

    }


}
