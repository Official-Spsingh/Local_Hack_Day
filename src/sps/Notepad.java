/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sps;


import com.ozten.font.JFontChooser;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.FileDialog;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;


import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

/**
 *
 * @author welcome
 */
public class Notepad extends javax.swing.JFrame {

    /**
     * Creates new form Notepad
     */
    public Notepad() {
        super("Notepad By S.P.Singh");
        initComponents();
        normaltheme.setEnabled(false);
        darktheme.setEnabled(true);
        
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jDialog2 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        findtext = new javax.swing.JTextField();
        findbtndialog = new javax.swing.JButton();
        cancelbtndialog = new javax.swing.JButton();
        jDialog3 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cancelsave = new javax.swing.JButton();
        dnsavefilefornew = new javax.swing.JButton();
        savefilefornew = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textbox = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newfile = new javax.swing.JMenuItem();
        open = new javax.swing.JMenuItem();
        savefile = new javax.swing.JMenuItem();
        saveas = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        ptrintfile = new javax.swing.JMenuItem();
        exitfile = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        cut = new javax.swing.JMenuItem();
        copy = new javax.swing.JMenuItem();
        paste = new javax.swing.JMenuItem();
        deletee = new javax.swing.JMenuItem();
        find = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        selectAll = new javax.swing.JMenuItem();
        timeanddate = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        fontchoose = new javax.swing.JMenuItem();
        jmenu6 = new javax.swing.JMenu();
        darktheme = new javax.swing.JMenuItem();
        normaltheme = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        viewhelp = new javax.swing.JMenuItem();
        aboutnotepad = new javax.swing.JMenuItem();

        jDialog1.setMinimumSize(new java.awt.Dimension(692, 464));
        jDialog1.setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sps/AAAA.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(692, 464));
        jLabel1.setMinimumSize(new java.awt.Dimension(692, 464));
        jLabel1.setPreferredSize(new java.awt.Dimension(692, 464));

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDialog2.setLocation(new java.awt.Point(300, 300));
        jDialog2.setMinimumSize(new java.awt.Dimension(385, 120));
        jDialog2.setResizable(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Find What :");

        findbtndialog.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        findbtndialog.setText("Find...");
        findbtndialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findbtndialogActionPerformed(evt);
            }
        });

        cancelbtndialog.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cancelbtndialog.setText("Cancel");
        cancelbtndialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtndialogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(findtext, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(findbtndialog)
                        .addGap(57, 57, 57)
                        .addComponent(cancelbtndialog)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(findtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelbtndialog)
                    .addComponent(findbtndialog))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jDialog3.setLocation(new java.awt.Point(300, 200));
        jDialog3.setMinimumSize(new java.awt.Dimension(420, 160));
        jDialog3.setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Do you want to save changes to file ?");

        cancelsave.setBackground(new java.awt.Color(204, 204, 204));
        cancelsave.setForeground(new java.awt.Color(0, 0, 102));
        cancelsave.setText("Cancel");
        cancelsave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelsave.setMaximumSize(new java.awt.Dimension(95, 37));
        cancelsave.setMinimumSize(new java.awt.Dimension(95, 37));
        cancelsave.setPreferredSize(new java.awt.Dimension(95, 37));
        cancelsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelsaveActionPerformed(evt);
            }
        });

        dnsavefilefornew.setBackground(new java.awt.Color(204, 204, 204));
        dnsavefilefornew.setForeground(new java.awt.Color(0, 0, 102));
        dnsavefilefornew.setText("Don't Save");
        dnsavefilefornew.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dnsavefilefornew.setMaximumSize(new java.awt.Dimension(95, 37));
        dnsavefilefornew.setMinimumSize(new java.awt.Dimension(95, 37));
        dnsavefilefornew.setPreferredSize(new java.awt.Dimension(95, 37));
        dnsavefilefornew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dnsavefilefornewActionPerformed(evt);
            }
        });

        savefilefornew.setBackground(new java.awt.Color(204, 204, 204));
        savefilefornew.setForeground(new java.awt.Color(0, 0, 102));
        savefilefornew.setText("Save");
        savefilefornew.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        savefilefornew.setMaximumSize(new java.awt.Dimension(95, 37));
        savefilefornew.setMinimumSize(new java.awt.Dimension(95, 37));
        savefilefornew.setPreferredSize(new java.awt.Dimension(95, 37));
        savefilefornew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savefilefornewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(savefilefornew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(dnsavefilefornew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(cancelsave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savefilefornew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dnsavefilefornew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelsave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 200));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        textbox.setBackground(new java.awt.Color(255, 255, 255));
        textbox.setColumns(20);
        textbox.setForeground(new java.awt.Color(0, 0, 0));
        textbox.setLineWrap(true);
        textbox.setRows(5);
        textbox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        textbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textboxKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(textbox);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("File");
        jMenu1.setMargin(new java.awt.Insets(2, 3, 2, 3));
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        newfile.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        newfile.setForeground(new java.awt.Color(0, 0, 0));
        newfile.setText("New                         Ctrl+N");
        newfile.setIconTextGap(22);
        newfile.setMargin(new java.awt.Insets(4, 10, 4, 10));
        newfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newfileActionPerformed(evt);
            }
        });
        jMenu1.add(newfile);

        open.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        open.setForeground(new java.awt.Color(0, 0, 0));
        open.setText("Open...                     Ctrl+O");
        open.setIconTextGap(22);
        open.setMargin(new java.awt.Insets(4, 10, 4, 10));
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        jMenu1.add(open);

        savefile.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        savefile.setForeground(new java.awt.Color(0, 0, 0));
        savefile.setText("Save                         Ctrl+S");
        savefile.setIconTextGap(22);
        savefile.setMargin(new java.awt.Insets(4, 10, 4, 10));
        savefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savefileActionPerformed(evt);
            }
        });
        jMenu1.add(savefile);

        saveas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        saveas.setForeground(new java.awt.Color(0, 0, 0));
        saveas.setText("Save as...");
        saveas.setIconTextGap(22);
        saveas.setMargin(new java.awt.Insets(4, 10, 4, 10));
        saveas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveasActionPerformed(evt);
            }
        });
        jMenu1.add(saveas);

        jMenuItem5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem5.setText("Page Setup...");
        jMenuItem5.setIconTextGap(22);
        jMenuItem5.setMargin(new java.awt.Insets(4, 10, 4, 10));
        jMenu1.add(jMenuItem5);

        ptrintfile.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ptrintfile.setForeground(new java.awt.Color(0, 0, 0));
        ptrintfile.setText("Print...                      Ctrl+P");
        ptrintfile.setIconTextGap(22);
        ptrintfile.setMargin(new java.awt.Insets(4, 10, 4, 10));
        ptrintfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptrintfileActionPerformed(evt);
            }
        });
        jMenu1.add(ptrintfile);

        exitfile.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        exitfile.setForeground(new java.awt.Color(0, 0, 0));
        exitfile.setText("Exit");
        exitfile.setIconTextGap(22);
        exitfile.setMargin(new java.awt.Insets(4, 10, 4, 10));
        exitfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitfileActionPerformed(evt);
            }
        });
        jMenu1.add(exitfile);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setForeground(new java.awt.Color(0, 0, 0));
        jMenu2.setText("Edit");
        jMenu2.setMargin(new java.awt.Insets(4, 10, 4, 10));

        jMenuItem8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem8.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem8.setText("Undo                      Ctrl+Z");
        jMenuItem8.setIconTextGap(22);
        jMenuItem8.setMargin(new java.awt.Insets(4, 10, 4, 10));
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        cut.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cut.setForeground(new java.awt.Color(0, 0, 0));
        cut.setText("Cut                          Ctrl+X");
        cut.setIconTextGap(22);
        cut.setMargin(new java.awt.Insets(4, 10, 4, 10));
        cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutActionPerformed(evt);
            }
        });
        jMenu2.add(cut);

        copy.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        copy.setForeground(new java.awt.Color(0, 0, 0));
        copy.setText("Copy                       Ctrl+C");
        copy.setIconTextGap(22);
        copy.setMargin(new java.awt.Insets(4, 10, 4, 10));
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        jMenu2.add(copy);

        paste.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        paste.setForeground(new java.awt.Color(0, 0, 0));
        paste.setText("Paste                      Ctrl+V");
        paste.setIconTextGap(22);
        paste.setMargin(new java.awt.Insets(4, 10, 4, 10));
        paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteActionPerformed(evt);
            }
        });
        jMenu2.add(paste);

        deletee.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        deletee.setForeground(new java.awt.Color(0, 0, 0));
        deletee.setText("Delete                         Del");
        deletee.setIconTextGap(22);
        deletee.setMargin(new java.awt.Insets(4, 10, 4, 10));
        deletee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteeActionPerformed(evt);
            }
        });
        jMenu2.add(deletee);

        find.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        find.setForeground(new java.awt.Color(0, 0, 0));
        find.setText("Find...                      Ctrl+F");
        find.setIconTextGap(22);
        find.setMargin(new java.awt.Insets(4, 10, 4, 10));
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });
        jMenu2.add(find);

        jMenuItem15.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem15.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem15.setText("Replace...               Ctrl+H");
        jMenuItem15.setEnabled(false);
        jMenuItem15.setIconTextGap(22);
        jMenuItem15.setMargin(new java.awt.Insets(4, 10, 4, 10));
        jMenu2.add(jMenuItem15);

        selectAll.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        selectAll.setForeground(new java.awt.Color(0, 0, 0));
        selectAll.setText("Select All                Ctrl+A");
        selectAll.setIconTextGap(22);
        selectAll.setMargin(new java.awt.Insets(4, 10, 4, 10));
        selectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAllActionPerformed(evt);
            }
        });
        jMenu2.add(selectAll);

        timeanddate.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        timeanddate.setForeground(new java.awt.Color(0, 0, 0));
        timeanddate.setText("Time/Date                   F5");
        timeanddate.setIconTextGap(22);
        timeanddate.setMargin(new java.awt.Insets(4, 10, 4, 10));
        timeanddate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeanddateActionPerformed(evt);
            }
        });
        jMenu2.add(timeanddate);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setForeground(new java.awt.Color(0, 0, 0));
        jMenu3.setText("Format");
        jMenu3.setMargin(new java.awt.Insets(4, 10, 4, 10));
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        fontchoose.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        fontchoose.setForeground(new java.awt.Color(0, 0, 0));
        fontchoose.setText("Font...");
        fontchoose.setIconTextGap(22);
        fontchoose.setMargin(new java.awt.Insets(4, 10, 4, 10));
        fontchoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontchooseActionPerformed(evt);
            }
        });
        jMenu3.add(fontchoose);

        jMenuBar1.add(jMenu3);

        jmenu6.setBackground(new java.awt.Color(255, 255, 255));
        jmenu6.setForeground(new java.awt.Color(0, 0, 0));
        jmenu6.setText("Theme");
        jmenu6.setMargin(new java.awt.Insets(4, 10, 4, 10));
        jmenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenu6ActionPerformed(evt);
            }
        });

        darktheme.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        darktheme.setForeground(new java.awt.Color(0, 0, 0));
        darktheme.setText("Dark                       Ctrl+D");
        darktheme.setIconTextGap(22);
        darktheme.setMargin(new java.awt.Insets(4, 10, 4, 10));
        darktheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darkthemeActionPerformed(evt);
            }
        });
        jmenu6.add(darktheme);

        normaltheme.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        normaltheme.setForeground(new java.awt.Color(0, 0, 0));
        normaltheme.setText("Normal                  Ctrl+W");
        normaltheme.setIconTextGap(22);
        normaltheme.setMargin(new java.awt.Insets(4, 10, 4, 10));
        normaltheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalthemeActionPerformed(evt);
            }
        });
        jmenu6.add(normaltheme);

        jMenuBar1.add(jmenu6);

        jMenu4.setBackground(new java.awt.Color(255, 255, 255));
        jMenu4.setForeground(new java.awt.Color(0, 0, 0));
        jMenu4.setText("View");
        jMenu4.setMargin(new java.awt.Insets(4, 10, 4, 10));

        jMenuItem21.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem21.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem21.setText("Status Bar");
        jMenuItem21.setEnabled(false);
        jMenuItem21.setIconTextGap(22);
        jMenuItem21.setMargin(new java.awt.Insets(4, 10, 4, 10));
        jMenu4.add(jMenuItem21);

        jMenuBar1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(255, 255, 255));
        jMenu5.setForeground(new java.awt.Color(0, 0, 0));
        jMenu5.setText("Help");
        jMenu5.setMargin(new java.awt.Insets(4, 10, 4, 10));

        viewhelp.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        viewhelp.setForeground(new java.awt.Color(0, 0, 0));
        viewhelp.setText("View Help");
        viewhelp.setIconTextGap(22);
        viewhelp.setMargin(new java.awt.Insets(4, 10, 4, 10));
        viewhelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewhelpActionPerformed(evt);
            }
        });
        jMenu5.add(viewhelp);

        aboutnotepad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        aboutnotepad.setForeground(new java.awt.Color(0, 0, 0));
        aboutnotepad.setText("About Notepad");
        aboutnotepad.setIconTextGap(22);
        aboutnotepad.setMargin(new java.awt.Insets(4, 10, 4, 10));
        aboutnotepad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutnotepadActionPerformed(evt);
            }
        });
        jMenu5.add(aboutnotepad);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
String fileName;
  boolean sps=true;
  
  
  class MyHighLightPainter extends DefaultHighlighter.DefaultHighlightPainter
  {

        public MyHighLightPainter(Color color) {
            super(color);
        }
      
     
  }
  Highlighter.HighlightPainter myHighlightPainter =new MyHighLightPainter(Color.YELLOW);
  public void removeHighlights(JTextComponent textComp)
  {
       Highlighter hilight =textComp.getHighlighter();
       Highlighter.Highlight[] hilites=hilight.getHighlights();
       for (int i = 0; i < hilites.length; i++) {
           if(hilites[i].getPainter() instanceof MyHighLightPainter)
           {
               hilight.removeHighlight(hilites[i]);
           }
          
      }
  }
   public void highlight(JTextComponent textComp,String pattern)
      {
          removeHighlights(textComp);
          try{
              Highlighter hilight =textComp.getHighlighter();
              Document doc=textComp.getDocument();
              String text=doc.getText(0,doc.getLength());
              int pos=0;
              
              while((pos=text.toUpperCase().indexOf(pattern.toUpperCase(), pos))>=0){
                  
                  hilight.addHighlight(pos, pos+pattern.length(), myHighlightPainter);
                  pos=pos+pattern.length();
              }
          }
          catch(Exception e)
          {
              
          }
      }

  
  
  
  
  
  
  
  
  
  
  

  
  
  
    private void viewhelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewhelpActionPerformed
        // TODO add your handling code here:
        try {
    Desktop.getDesktop().browse(new URL("http://www.google.com").toURI());
} catch (Exception e) {}
    }//GEN-LAST:event_viewhelpActionPerformed

    private void saveasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveasActionPerformed
                     
         FileDialog filedialog =new FileDialog(Notepad.this,"Save File",FileDialog.SAVE);
        filedialog.setVisible(true);
         if(filedialog.getFile()!=null)
        {
            fileName=filedialog.getDirectory()+filedialog.getFile();
            setTitle(fileName);
            
        }
       
        try {
            FileWriter filewriter = new FileWriter(fileName);
             filewriter.write(textbox.getText());
             setTitle(fileName);
             filewriter.close();
             sps=false;
             
        } catch (IOException ex) {
            System.out.println("File Not Found");
        }
        
         
         
        
    }//GEN-LAST:event_saveasActionPerformed
         
    private void newfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newfileActionPerformed
     if(sps==true && textbox.getText().length()>0)
     {
         jDialog3.setVisible(true);
     }
     else
     {
          textbox.setText(null);
       sps=true;
        setTitle("Notepad By S.P.Singh");  
     }
     
        
    }//GEN-LAST:event_newfileActionPerformed

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        // TODO add your handling code here:
        FileDialog filedialog =new FileDialog(Notepad.this,"Open File",FileDialog.LOAD);
        filedialog.setVisible(true);
        if(filedialog.getFile()!=null)
        {
            fileName=filedialog.getDirectory()+filedialog.getFile();
            setTitle(fileName);
            
        }
        try{
            BufferedReader reader=new BufferedReader(new FileReader(fileName));
            StringBuilder sb=new StringBuilder();
            String line=null;
            while((line=reader.readLine())!=null)
            {
                sb.append(line+"\n");
                textbox.setText(sb.toString());
            }
            reader.close();
            sps=true;
        }
        catch(Exception e)
        {
            System.out.println("File Not Found");
        }
    }//GEN-LAST:event_openActionPerformed

    private void savefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savefileActionPerformed
        
        if(sps==true)
        {
        
          FileDialog filedialog =new FileDialog(Notepad.this,"Save File",FileDialog.SAVE);
        filedialog.setVisible(true);
         if(filedialog.getFile()!=null)
        {
            fileName=filedialog.getDirectory()+filedialog.getFile();
            setTitle(fileName);
            
        }
       
        try {
            FileWriter filewriter = new FileWriter(fileName);
            
             filewriter.write(textbox.getText());
             setTitle(fileName);
             filewriter.close();
             sps=false;
             
        } catch (IOException ex) {
            System.out.println("File Not Found");
        }}
        else
        {
            try {
            FileWriter filewriter = new FileWriter(fileName);
            
             filewriter.write(textbox.getText());
             setTitle(fileName);
             filewriter.close();
             sps=false;
             
        } catch (IOException ex) {
            System.out.println("File Not Found");
        } 
        }
        
    }//GEN-LAST:event_savefileActionPerformed
Clipboard clipboard=getToolkit().getSystemClipboard();


    private void exitfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitfileActionPerformed
      System.exit(0);
    }//GEN-LAST:event_exitfileActionPerformed

    private void ptrintfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptrintfileActionPerformed
        // TODO add your handling code here:
        try{
         textbox.print();
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_ptrintfileActionPerformed

    private void cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutActionPerformed
        // TODO add your handling code here:
        String cutString=textbox.getSelectedText();
        StringSelection cutSelection=new StringSelection(cutString);
        clipboard.setContents(cutSelection, cutSelection);
        textbox.replaceRange("",textbox.getSelectionStart(),textbox.getSelectionEnd());
        
        
        
    }//GEN-LAST:event_cutActionPerformed

    private void pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteActionPerformed
        // TODO add your handling code here:
        
        try
        {
          Transferable pastetext=clipboard.getContents(Notepad.this);
          String selection=(String)pastetext.getTransferData(DataFlavor.stringFlavor);
         textbox.replaceRange(selection,textbox.getSelectionStart(),textbox.getSelectionEnd());
         
        }
        catch(Exception e)
        {
            System.out.println("Not Worked");
        }
    }//GEN-LAST:event_pasteActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
        // TODO add your handling code here:
         String copyString=textbox.getSelectedText();
        StringSelection copySelection=new StringSelection(copyString);
        clipboard.setContents(copySelection, copySelection);
    }//GEN-LAST:event_copyActionPerformed

    private void textboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textboxKeyPressed
        // TODO add your handling code here:
        
        if((evt.getKeyCode()==KeyEvent.VK_N)&& ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0))
        {
            
             textbox.setText(null);
       sps=true;
        setTitle("Notepad By S.P.Singh");
        
        }
        
        
        //**********************************************************************************************************************
         if((evt.getKeyCode()==KeyEvent.VK_F)&& ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0))
        {
            
        jDialog2.setVisible(true);
        }
        //************************************************************************************************************************
         if((evt.getKeyCode()==KeyEvent.VK_O)&& ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0))
        {
        
            
            
            
            
            
            
            
             // TODO add your handling code here:
        FileDialog filedialog =new FileDialog(Notepad.this,"Open File",FileDialog.LOAD);
        filedialog.setVisible(true);
        if(filedialog.getFile()!=null)
        {
            fileName=filedialog.getDirectory()+filedialog.getFile();
            setTitle(fileName);
            
        }
        try{
            BufferedReader reader=new BufferedReader(new FileReader(fileName));
            StringBuilder sb=new StringBuilder();
            String line=null;
            while((line=reader.readLine())!=null)
            {
                sb.append(line+"\n");
                textbox.setText(sb.toString());
            }
            reader.close();
            sps=true;
        }
        catch(Exception e)
        {
            System.out.println("File Not Found");
        }
            
            
            
            
            
            
        }
         
         //********************************************************************************************************************************
          if((evt.getKeyCode()==KeyEvent.VK_P)&& ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0))
        {
           try{
         textbox.print();
        }
        catch(Exception e)
        {
            
        }
        }
           //**************************************************************************************************************************
         if(evt.getKeyCode()==KeyEvent.VK_F5)
        {
            
              Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E dd.MM.yyyy   'Time ' hh:mm:ss a zzz");
      textbox.append(" "+ft.format(dNow));  
        
        }
        //**************************************************************************************************************************
         if((evt.getKeyCode()==KeyEvent.VK_D)&& ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0))
        {
         textbox.setBackground(Color.black);
           textbox.setForeground(Color.white);
           jMenuBar1.setBackground(Color.black);
            jMenuBar1.setForeground(Color.white);
            jMenu1.setForeground(Color.white);
            jMenu2.setForeground(Color.white);
            jMenu3.setForeground(Color.white);
            jMenu4.setForeground(Color.white);
            jMenu5.setForeground(Color.white);
            jmenu6.setForeground(Color.white);
            open.setBackground(Color.black);
            open.setForeground(Color.white);
             newfile.setBackground(Color.black);
            newfile.setForeground(Color.white);
            savefile.setBackground(Color.black);
            savefile.setForeground(Color.white); 
            saveas.setBackground(Color.black);
            saveas.setForeground(Color.white); 
            exitfile.setBackground(Color.black);
            exitfile.setForeground(Color.white); 
            jMenuItem5.setBackground(Color.black);
            jMenuItem5.setForeground(Color.white); 
            ptrintfile.setBackground(Color.black);
            ptrintfile.setForeground(Color.white); 
            cut.setBackground(Color.black);
            cut.setForeground(Color.white); 
            copy.setBackground(Color.black);
            copy.setForeground(Color.white); 
            paste.setBackground(Color.black);
            paste.setForeground(Color.white);
            deletee.setBackground(Color.black);
            deletee.setForeground(Color.white);
            find.setBackground(Color.black);
            find.setForeground(Color.white); 
            selectAll.setBackground(Color.black);
            selectAll.setForeground(Color.white); 
            timeanddate.setBackground(Color.black);
            timeanddate.setForeground(Color.white);
            jMenuItem8.setBackground(Color.black);
            jMenuItem8.setForeground(Color.white);
            jMenuItem15.setBackground(Color.black);
            jMenuItem15.setForeground(Color.white);
            fontchoose.setBackground(Color.black);
            fontchoose.setForeground(Color.white);
           
            darktheme.setBackground(Color.black);
            darktheme.setForeground(Color.white);
           
            normaltheme.setBackground(Color.black);
            normaltheme.setForeground(Color.white);
           
            jMenuItem21.setBackground(Color.black);
            jMenuItem21.setForeground(Color.white);
           
            viewhelp.setBackground(Color.black);
            viewhelp.setForeground(Color.white);
           
            aboutnotepad.setBackground(Color.black);
            aboutnotepad.setForeground(Color.white);
            normaltheme.setEnabled(true);
            darktheme.setEnabled(false);
           
        }
         
         
           if((evt.getKeyCode()==KeyEvent.VK_W)&& ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0))
        {
         textbox.setBackground(Color.white);
           textbox.setForeground(Color.black);
                jMenuBar1.setBackground(Color.white);
            jMenuBar1.setForeground(Color.black);
            jMenu1.setForeground(Color.black);
            jMenu2.setForeground(Color.black);
            jMenu3.setForeground(Color.black);
            jMenu4.setForeground(Color.black);
            jMenu5.setForeground(Color.black);
            jmenu6.setForeground(Color.black);
            open.setBackground(Color.white);
            open.setForeground(Color.black);
             newfile.setBackground(Color.white);
            newfile.setForeground(Color.black);
            savefile.setBackground(Color.white);
            savefile.setForeground(Color.black); 
            saveas.setBackground(Color.white);
            saveas.setForeground(Color.black); 
            exitfile.setBackground(Color.white);
            exitfile.setForeground(Color.black); 
            jMenuItem5.setBackground(Color.white);
            jMenuItem5.setForeground(Color.black); 
            ptrintfile.setBackground(Color.white);
            ptrintfile.setForeground(Color.black); 
            cut.setBackground(Color.white);
            cut.setForeground(Color.black); 
            copy.setBackground(Color.white);
            copy.setForeground(Color.black); 
            paste.setBackground(Color.white);
            paste.setForeground(Color.black);
            deletee.setBackground(Color.white);
            deletee.setForeground(Color.black);
            find.setBackground(Color.white);
            find.setForeground(Color.black); 
            selectAll.setBackground(Color.white);
            selectAll.setForeground(Color.black); 
            timeanddate.setBackground(Color.white);
            timeanddate.setForeground(Color.black);
            jMenuItem8.setBackground(Color.white);
            jMenuItem8.setForeground(Color.black);
            jMenuItem15.setBackground(Color.white);
            jMenuItem15.setForeground(Color.black);
            fontchoose.setBackground(Color.white);
            fontchoose.setForeground(Color.black);
           
            darktheme.setBackground(Color.white);
            darktheme.setForeground(Color.black);
           
            normaltheme.setBackground(Color.white);
            normaltheme.setForeground(Color.black);
           
            jMenuItem21.setBackground(Color.white);
            jMenuItem21.setForeground(Color.black);
           
            viewhelp.setBackground(Color.white);
            viewhelp.setForeground(Color.black);
           
            aboutnotepad.setBackground(Color.white);
            aboutnotepad.setForeground(Color.black);
            normaltheme.setEnabled(false);
            darktheme.setEnabled(true);
        }
        
        
        
        
        
        //**************************************************************************************************************
        if((evt.getKeyCode()==KeyEvent.VK_S)&& ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0))
        {
            
            
             if(sps==true)
        {
        
          FileDialog filedialog =new FileDialog(Notepad.this,"Save File",FileDialog.SAVE);
        filedialog.setVisible(true);
         if(filedialog.getFile()!=null)
        {
            fileName=filedialog.getDirectory()+filedialog.getFile();
            setTitle(fileName);
            
        }
       
        try {
            FileWriter filewriter = new FileWriter(fileName);
            
             filewriter.write(textbox.getText());
             setTitle(fileName);
             filewriter.close();
             sps=false;
             
        } catch (IOException ex) {
            System.out.println("File Not Found");
        }}
        else
        {
            try {
            FileWriter filewriter = new FileWriter(fileName);
            
             filewriter.write(textbox.getText());
             setTitle(fileName);
             filewriter.close();
             sps=false;
             
        } catch (IOException ex) {
            System.out.println("File Not Found");
        } 
        }
         
            
            
            
            
            
        }
    }//GEN-LAST:event_textboxKeyPressed

    private void fontchooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontchooseActionPerformed
     JFontChooser fc=new JFontChooser();  
        JOptionPane.showMessageDialog(null,fc,"Choose Font",JOptionPane.PLAIN_MESSAGE);
        textbox.setFont(fc.getPreviewFont());
        
        
    }//GEN-LAST:event_fontchooseActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

      
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void timeanddateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeanddateActionPerformed
        // TODO add your handling code here:
         Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E dd.MM.yyyy   'Time ' hh:mm:ss a zzz");
      textbox.append(" "+ft.format(dNow));
      
        
        
    }//GEN-LAST:event_timeanddateActionPerformed

    private void aboutnotepadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutnotepadActionPerformed
        // TODO add your handling code here:
        jDialog1.setVisible(true);
    }//GEN-LAST:event_aboutnotepadActionPerformed

    private void deleteeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteeActionPerformed
         String delString=textbox.getSelectedText();
        StringSelection delSelection=new StringSelection(delString);
       textbox.replaceRange("",textbox.getSelectionStart(),textbox.getSelectionEnd());
        
    }//GEN-LAST:event_deleteeActionPerformed

    private void selectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAllActionPerformed
        // TODO add your handling code here:
        
           textbox.requestFocusInWindow();
           textbox.selectAll();
    }//GEN-LAST:event_selectAllActionPerformed

    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
        // TODO add your handling code here:
        jDialog2.setVisible(true);
    }//GEN-LAST:event_findActionPerformed

    private void findbtndialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findbtndialogActionPerformed
        
       highlight(textbox,findtext.getText());
    }//GEN-LAST:event_findbtndialogActionPerformed

    private void cancelbtndialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtndialogActionPerformed
    removeHighlights(textbox);
    jDialog2.setVisible(false);
    }//GEN-LAST:event_cancelbtndialogActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void savefilefornewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savefilefornewActionPerformed
   
             if(sps==true)
        {
        
          FileDialog filedialog =new FileDialog(Notepad.this,"Save File",FileDialog.SAVE);
        filedialog.setVisible(true);
         if(filedialog.getFile()!=null)
        {
            fileName=filedialog.getDirectory()+filedialog.getFile();
            setTitle(fileName);
            
        }
       
        try {
            FileWriter filewriter = new FileWriter(fileName);
            
             filewriter.write(textbox.getText());
             setTitle(fileName);
             filewriter.close();
             sps=false;
             jDialog3.setVisible(false);
               textbox.setText(null);
       sps=true;
        setTitle("Notepad By S.P.Singh"); 
             
        } catch (IOException ex) {
            System.out.println("File Not Found");
        }}
        else
        {
            try {
            FileWriter filewriter = new FileWriter(fileName);
            
             filewriter.write(textbox.getText());
             setTitle(fileName);
             filewriter.close();
             sps=false;
             
        } catch (IOException ex) {
            System.out.println("File Not Found");
        } 
        }  
    }//GEN-LAST:event_savefilefornewActionPerformed

    private void dnsavefilefornewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dnsavefilefornewActionPerformed
       jDialog3.setVisible(false);
       textbox.setText(null);
       sps=true;
        setTitle("Notepad By S.P.Singh"); 
       
    }//GEN-LAST:event_dnsavefilefornewActionPerformed

    private void cancelsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelsaveActionPerformed
        // TODO add your handling code here:
         jDialog3.setVisible(false);
        
    }//GEN-LAST:event_cancelsaveActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void darkthemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darkthemeActionPerformed
           textbox.setBackground(Color.black);
           textbox.setForeground(Color.white);
           jMenuBar1.setBackground(Color.black);
            jMenuBar1.setForeground(Color.white);
            jMenu1.setForeground(Color.white);
            jMenu2.setForeground(Color.white);
            jMenu3.setForeground(Color.white);
            jMenu4.setForeground(Color.white);
            jMenu5.setForeground(Color.white);
            jmenu6.setForeground(Color.white);
            open.setBackground(Color.black);
            open.setForeground(Color.white);
             newfile.setBackground(Color.black);
            newfile.setForeground(Color.white);
            savefile.setBackground(Color.black);
            savefile.setForeground(Color.white); 
            saveas.setBackground(Color.black);
            saveas.setForeground(Color.white); 
            exitfile.setBackground(Color.black);
            exitfile.setForeground(Color.white); 
            jMenuItem5.setBackground(Color.black);
            jMenuItem5.setForeground(Color.white); 
            ptrintfile.setBackground(Color.black);
            ptrintfile.setForeground(Color.white); 
            cut.setBackground(Color.black);
            cut.setForeground(Color.white); 
            copy.setBackground(Color.black);
            copy.setForeground(Color.white); 
            paste.setBackground(Color.black);
            paste.setForeground(Color.white);
            deletee.setBackground(Color.black);
            deletee.setForeground(Color.white);
            find.setBackground(Color.black);
            find.setForeground(Color.white); 
            selectAll.setBackground(Color.black);
            selectAll.setForeground(Color.white); 
            timeanddate.setBackground(Color.black);
            timeanddate.setForeground(Color.white);
            jMenuItem8.setBackground(Color.black);
            jMenuItem8.setForeground(Color.white);
            jMenuItem15.setBackground(Color.black);
            jMenuItem15.setForeground(Color.white);
            fontchoose.setBackground(Color.black);
            fontchoose.setForeground(Color.white);
           
            darktheme.setBackground(Color.black);
            darktheme.setForeground(Color.white);
           
            normaltheme.setBackground(Color.black);
            normaltheme.setForeground(Color.white);
           
            jMenuItem21.setBackground(Color.black);
            jMenuItem21.setForeground(Color.white);
           
            viewhelp.setBackground(Color.black);
            viewhelp.setForeground(Color.white);
           
            aboutnotepad.setBackground(Color.black);
            aboutnotepad.setForeground(Color.white);
            normaltheme.setEnabled(true);
            darktheme.setEnabled(false);
           
           
           
    }//GEN-LAST:event_darkthemeActionPerformed

    private void jmenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmenu6ActionPerformed

    private void normalthemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalthemeActionPerformed
       
         textbox.setBackground(Color.white);
           textbox.setForeground(Color.black);
                jMenuBar1.setBackground(Color.white);
            jMenuBar1.setForeground(Color.black);
            jMenu1.setForeground(Color.black);
            jMenu2.setForeground(Color.black);
            jMenu3.setForeground(Color.black);
            jMenu4.setForeground(Color.black);
            jMenu5.setForeground(Color.black);
            jmenu6.setForeground(Color.black);
            open.setBackground(Color.white);
            open.setForeground(Color.black);
             newfile.setBackground(Color.white);
            newfile.setForeground(Color.black);
            savefile.setBackground(Color.white);
            savefile.setForeground(Color.black); 
            saveas.setBackground(Color.white);
            saveas.setForeground(Color.black); 
            exitfile.setBackground(Color.white);
            exitfile.setForeground(Color.black); 
            jMenuItem5.setBackground(Color.white);
            jMenuItem5.setForeground(Color.black); 
            ptrintfile.setBackground(Color.white);
            ptrintfile.setForeground(Color.black); 
            cut.setBackground(Color.white);
            cut.setForeground(Color.black); 
            copy.setBackground(Color.white);
            copy.setForeground(Color.black); 
            paste.setBackground(Color.white);
            paste.setForeground(Color.black);
            deletee.setBackground(Color.white);
            deletee.setForeground(Color.black);
            find.setBackground(Color.white);
            find.setForeground(Color.black); 
            selectAll.setBackground(Color.white);
            selectAll.setForeground(Color.black); 
            timeanddate.setBackground(Color.white);
            timeanddate.setForeground(Color.black);
            jMenuItem8.setBackground(Color.white);
            jMenuItem8.setForeground(Color.black);
            jMenuItem15.setBackground(Color.white);
            jMenuItem15.setForeground(Color.black);
            fontchoose.setBackground(Color.white);
            fontchoose.setForeground(Color.black);
           
            darktheme.setBackground(Color.white);
            darktheme.setForeground(Color.black);
           
            normaltheme.setBackground(Color.white);
            normaltheme.setForeground(Color.black);
           
            jMenuItem21.setBackground(Color.white);
            jMenuItem21.setForeground(Color.black);
           
            viewhelp.setBackground(Color.white);
            viewhelp.setForeground(Color.black);
           
            aboutnotepad.setBackground(Color.white);
            aboutnotepad.setForeground(Color.black);
            normaltheme.setEnabled(false);
            darktheme.setEnabled(true);
    }//GEN-LAST:event_normalthemeActionPerformed

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
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try{
  UIManager.setLookAndFeel( new MetalLookAndFeel() );
        }
        catch(Exception e)
        {
            
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutnotepad;
    private javax.swing.JButton cancelbtndialog;
    private javax.swing.JButton cancelsave;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem cut;
    private javax.swing.JMenuItem darktheme;
    private javax.swing.JMenuItem deletee;
    private javax.swing.JButton dnsavefilefornew;
    private javax.swing.JMenuItem exitfile;
    private javax.swing.JMenuItem find;
    private javax.swing.JButton findbtndialog;
    private javax.swing.JTextField findtext;
    private javax.swing.JMenuItem fontchoose;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu jmenu6;
    private javax.swing.JMenuItem newfile;
    private javax.swing.JMenuItem normaltheme;
    private javax.swing.JMenuItem open;
    private javax.swing.JMenuItem paste;
    private javax.swing.JMenuItem ptrintfile;
    private javax.swing.JMenuItem saveas;
    private javax.swing.JMenuItem savefile;
    private javax.swing.JButton savefilefornew;
    private javax.swing.JMenuItem selectAll;
    private javax.swing.JTextArea textbox;
    private javax.swing.JMenuItem timeanddate;
    private javax.swing.JMenuItem viewhelp;
    // End of variables declaration//GEN-END:variables
}
