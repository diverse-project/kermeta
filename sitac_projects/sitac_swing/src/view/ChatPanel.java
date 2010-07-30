package view;

import java.awt.event.KeyEvent;

public class ChatPanel extends javax.swing.JPanel {

    public ChatPanel() {
        initComponents();
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        messBox = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        editBox = new javax.swing.JTextArea();
        sendBtn = new javax.swing.JButton();

        setName("Form"); 
        setPreferredSize(new java.awt.Dimension(500, 500));

        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jScrollPane1.setName("jScrollPane1"); 

        messBox.setColumns(20);
        messBox.setEditable(false);
        messBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        messBox.setLineWrap(true);
        messBox.setRows(5);
        messBox.setBorder(null);
        messBox.setName("messBox"); 
        jScrollPane1.setViewportView(messBox);

        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jScrollPane2.setName("jScrollPane2"); 

        editBox.setColumns(20);
        editBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        editBox.setLineWrap(true);
        editBox.setRows(5);
        editBox.setBorder(null);
        editBox.setName("editBox"); 
        editBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editBoxKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(editBox);

        sendBtn.setText("Send");  
        sendBtn.setName("sendBtn"); 
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendBtn)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sendBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(153, Short.MAX_VALUE))
        );
    }

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String text=editBox.getText();
        editBox.setText("");
        editBox.setCaretPosition(0);
        editBox.requestFocusInWindow();
        messBox.append(text+"\n");
    }

    private void editBoxKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            evt.consume();
            String text=editBox.getText();
            editBox.setCaretPosition(0);
            editBox.setText("");
            messBox.append(text+"\n");
        }
    }

    private javax.swing.JTextArea editBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea messBox;
    private javax.swing.JButton sendBtn;
}
