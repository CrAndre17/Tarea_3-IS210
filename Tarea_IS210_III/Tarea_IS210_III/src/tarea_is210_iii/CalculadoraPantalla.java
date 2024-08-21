package tarea_is210_iii;

import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import java.awt.event.FocusEvent;

public class CalculadoraPantalla extends javax.swing.JFrame implements KeyListener{
    private double num1,num2,res;
    private String oper;
    private boolean resFin;
    
    public CalculadoraPantalla(){
        initComponents();
        lblPantalla.setText("");
        this.setFocusable(true);
        this.requestFocusInWindow();
        initListeners();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBorrarActual = new javax.swing.JButton();
        btnBorrarTodo = new javax.swing.JButton();
        btnBorrarUno = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnNum8 = new javax.swing.JButton();
        btnNum5 = new javax.swing.JButton();
        btnNum2 = new javax.swing.JButton();
        btnNum1 = new javax.swing.JButton();
        btnNum4 = new javax.swing.JButton();
        btnNum7 = new javax.swing.JButton();
        btnNum9 = new javax.swing.JButton();
        btnNum6 = new javax.swing.JButton();
        btnNum3 = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnPosNeg = new javax.swing.JButton();
        btnNum0 = new javax.swing.JButton();
        btnDec = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnBorrarHistorial = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblMiniPantalla = new javax.swing.JLabel();
        lblPantalla = new javax.swing.JLabel();
        lblHistorial = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Gamer Pro RTX ON - Version 1.0");
        setMaximumSize(new java.awt.Dimension(585, 500));
        setMinimumSize(new java.awt.Dimension(585, 500));
        setPreferredSize(new java.awt.Dimension(585, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBorrarActual.setText("CE");
        btnBorrarActual.setMaximumSize(new java.awt.Dimension(80, 50));
        btnBorrarActual.setMinimumSize(new java.awt.Dimension(80, 50));
        btnBorrarActual.setPreferredSize(new java.awt.Dimension(80, 50));
        btnBorrarActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActualActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrarActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 124, -1, -1));

        btnBorrarTodo.setText("C");
        btnBorrarTodo.setMaximumSize(new java.awt.Dimension(80, 50));
        btnBorrarTodo.setMinimumSize(new java.awt.Dimension(80, 50));
        btnBorrarTodo.setPreferredSize(new java.awt.Dimension(80, 50));
        btnBorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTodoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 124, -1, -1));

        btnBorrarUno.setText("Delete");
        btnBorrarUno.setMaximumSize(new java.awt.Dimension(80, 50));
        btnBorrarUno.setMinimumSize(new java.awt.Dimension(80, 50));
        btnBorrarUno.setPreferredSize(new java.awt.Dimension(80, 50));
        btnBorrarUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarUnoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrarUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 124, -1, -1));

        btnDiv.setText("/");
        btnDiv.setMaximumSize(new java.awt.Dimension(80, 50));
        btnDiv.setMinimumSize(new java.awt.Dimension(80, 50));
        btnDiv.setPreferredSize(new java.awt.Dimension(80, 50));
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 124, -1, -1));

        btnNum8.setText("8");
        btnNum8.setMaximumSize(new java.awt.Dimension(80, 50));
        btnNum8.setMinimumSize(new java.awt.Dimension(80, 50));
        btnNum8.setPreferredSize(new java.awt.Dimension(80, 50));
        btnNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNum8, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 192, -1, -1));

        btnNum5.setText("5");
        btnNum5.setMaximumSize(new java.awt.Dimension(80, 50));
        btnNum5.setMinimumSize(new java.awt.Dimension(80, 50));
        btnNum5.setPreferredSize(new java.awt.Dimension(80, 50));
        btnNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNum5, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 260, -1, -1));

        btnNum2.setText("2");
        btnNum2.setMaximumSize(new java.awt.Dimension(80, 50));
        btnNum2.setMinimumSize(new java.awt.Dimension(80, 50));
        btnNum2.setPreferredSize(new java.awt.Dimension(80, 50));
        btnNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 328, -1, -1));

        btnNum1.setText("1");
        btnNum1.setMaximumSize(new java.awt.Dimension(80, 50));
        btnNum1.setMinimumSize(new java.awt.Dimension(80, 50));
        btnNum1.setPreferredSize(new java.awt.Dimension(80, 50));
        btnNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 328, -1, -1));

        btnNum4.setText("4");
        btnNum4.setMaximumSize(new java.awt.Dimension(80, 50));
        btnNum4.setMinimumSize(new java.awt.Dimension(80, 50));
        btnNum4.setPreferredSize(new java.awt.Dimension(80, 50));
        btnNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNum4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 260, -1, -1));

        btnNum7.setText("7");
        btnNum7.setMaximumSize(new java.awt.Dimension(80, 50));
        btnNum7.setMinimumSize(new java.awt.Dimension(80, 50));
        btnNum7.setPreferredSize(new java.awt.Dimension(80, 50));
        btnNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNum7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 192, -1, -1));

        btnNum9.setText("9");
        btnNum9.setMaximumSize(new java.awt.Dimension(80, 50));
        btnNum9.setMinimumSize(new java.awt.Dimension(80, 50));
        btnNum9.setPreferredSize(new java.awt.Dimension(80, 50));
        btnNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum9ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNum9, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 192, -1, -1));

        btnNum6.setText("6");
        btnNum6.setMaximumSize(new java.awt.Dimension(80, 50));
        btnNum6.setMinimumSize(new java.awt.Dimension(80, 50));
        btnNum6.setPreferredSize(new java.awt.Dimension(80, 50));
        btnNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNum6, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 260, -1, -1));

        btnNum3.setText("3");
        btnNum3.setMaximumSize(new java.awt.Dimension(80, 50));
        btnNum3.setMinimumSize(new java.awt.Dimension(80, 50));
        btnNum3.setPreferredSize(new java.awt.Dimension(80, 50));
        btnNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 328, -1, -1));

        btnSuma.setText("+");
        btnSuma.setMaximumSize(new java.awt.Dimension(80, 50));
        btnSuma.setMinimumSize(new java.awt.Dimension(80, 50));
        btnSuma.setPreferredSize(new java.awt.Dimension(80, 50));
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 328, -1, -1));

        btnResta.setText("-");
        btnResta.setMaximumSize(new java.awt.Dimension(80, 50));
        btnResta.setMinimumSize(new java.awt.Dimension(80, 50));
        btnResta.setPreferredSize(new java.awt.Dimension(80, 50));
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        getContentPane().add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        btnMulti.setText("x");
        btnMulti.setMaximumSize(new java.awt.Dimension(80, 50));
        btnMulti.setMinimumSize(new java.awt.Dimension(80, 50));
        btnMulti.setPreferredSize(new java.awt.Dimension(80, 50));
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });
        getContentPane().add(btnMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 192, -1, -1));

        btnPosNeg.setText("+/-");
        btnPosNeg.setMaximumSize(new java.awt.Dimension(80, 50));
        btnPosNeg.setMinimumSize(new java.awt.Dimension(80, 50));
        btnPosNeg.setPreferredSize(new java.awt.Dimension(80, 50));
        btnPosNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosNegActionPerformed(evt);
            }
        });
        getContentPane().add(btnPosNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 396, -1, -1));

        btnNum0.setText("0");
        btnNum0.setMaximumSize(new java.awt.Dimension(80, 50));
        btnNum0.setMinimumSize(new java.awt.Dimension(80, 50));
        btnNum0.setPreferredSize(new java.awt.Dimension(80, 50));
        btnNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum0ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNum0, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 396, -1, -1));

        btnDec.setText(".");
        btnDec.setMaximumSize(new java.awt.Dimension(80, 50));
        btnDec.setMinimumSize(new java.awt.Dimension(80, 50));
        btnDec.setPreferredSize(new java.awt.Dimension(80, 50));
        btnDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecActionPerformed(evt);
            }
        });
        getContentPane().add(btnDec, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 396, -1, -1));

        btnIgual.setText("=");
        btnIgual.setMaximumSize(new java.awt.Dimension(80, 50));
        btnIgual.setMinimumSize(new java.awt.Dimension(80, 50));
        btnIgual.setPreferredSize(new java.awt.Dimension(80, 50));
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        getContentPane().add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 396, -1, -1));

        btnBorrarHistorial.setText("Borrar Historial");
        btnBorrarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarHistorialActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrarHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 160, 30));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lblMiniPantalla.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMiniPantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMiniPantalla.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblPantalla.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblPantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPantalla.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMiniPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                    .addComponent(lblPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblMiniPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, -1));

        lblHistorial.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblHistorial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHistorial.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 170, 410));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Historial");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 60, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum0ActionPerformed
        if(resFin){
            limpiarLabels();
        }
        String btnNum=lblPantalla.getText()+btnNum0.getText();
        lblPantalla.setText(btnNum);
    }//GEN-LAST:event_btnNum0ActionPerformed

    private void btnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum1ActionPerformed
        if(resFin){
            limpiarLabels();
        }
        String btnNum=lblPantalla.getText()+btnNum1.getText();
        lblPantalla.setText(btnNum);
    }//GEN-LAST:event_btnNum1ActionPerformed

    private void btnNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum2ActionPerformed
        if(resFin){
            limpiarLabels();
        }
        String btnNum=lblPantalla.getText()+btnNum2.getText();
        lblPantalla.setText(btnNum);
    }//GEN-LAST:event_btnNum2ActionPerformed

    private void btnNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum3ActionPerformed
        if(resFin){
            limpiarLabels();
        }
        String btnNum=lblPantalla.getText()+btnNum3.getText();
        lblPantalla.setText(btnNum);
    }//GEN-LAST:event_btnNum3ActionPerformed

    private void btnNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum4ActionPerformed
        if(resFin){
            limpiarLabels();
        }
        String btnNum=lblPantalla.getText()+btnNum4.getText();
        lblPantalla.setText(btnNum);
    }//GEN-LAST:event_btnNum4ActionPerformed

    private void btnNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum5ActionPerformed
        if(resFin){
            limpiarLabels();
        }
        String btnNum=lblPantalla.getText()+btnNum5.getText();
        lblPantalla.setText(btnNum);
    }//GEN-LAST:event_btnNum5ActionPerformed

    private void btnNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum6ActionPerformed
        if(resFin){
            limpiarLabels();
        }
        String btnNum = lblPantalla.getText() + btnNum6.getText();
        lblPantalla.setText(btnNum);
    }//GEN-LAST:event_btnNum6ActionPerformed

    private void btnNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum7ActionPerformed
        if(resFin){
            limpiarLabels();
        }
        String btnNum = lblPantalla.getText() + btnNum7.getText();
        lblPantalla.setText(btnNum);
    }//GEN-LAST:event_btnNum7ActionPerformed

    private void btnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum8ActionPerformed
        if(resFin){
            limpiarLabels();
        }
        String btnNum = lblPantalla.getText() + btnNum8.getText();
        lblPantalla.setText(btnNum);
    }//GEN-LAST:event_btnNum8ActionPerformed

    private void btnNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum9ActionPerformed
        if(resFin){
            limpiarLabels();
        }
        String btnNum = lblPantalla.getText() + btnNum9.getText();
        lblPantalla.setText(btnNum);
    }//GEN-LAST:event_btnNum9ActionPerformed

    private void btnBorrarActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActualActionPerformed
        lblPantalla.setText("");
    }//GEN-LAST:event_btnBorrarActualActionPerformed

    private void btnBorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTodoActionPerformed
        num1=0;
        num2=0;
        lblPantalla.setText("");
        lblMiniPantalla.setText("");
    }//GEN-LAST:event_btnBorrarTodoActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        if(lblPantalla.getText().trim().isEmpty()){
            return;
        }
        num1=Double.parseDouble(lblPantalla.getText());
        lblMiniPantalla.setText(lblPantalla.getText()+" + ");
        lblPantalla.setText("");
        oper="+";
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        if(lblPantalla.getText().trim().isEmpty()){
            return;
        }
        num1=Double.parseDouble(lblPantalla.getText());
        lblMiniPantalla.setText(lblPantalla.getText()+" - ");
        lblPantalla.setText("");
        oper="-"; 
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        if(lblPantalla.getText().trim().isEmpty()){
            return;
        }
        num1=Double.parseDouble(lblPantalla.getText());
        lblMiniPantalla.setText(lblPantalla.getText()+" * ");
        lblPantalla.setText("");
        oper="*";
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        if(lblPantalla.getText().trim().isEmpty()){
            return;
        }
        num1=Double.parseDouble(lblPantalla.getText());
        lblMiniPantalla.setText(lblPantalla.getText()+" / ");
        lblPantalla.setText("");
        oper="/";
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        if(lblPantalla.getText().trim().isEmpty() || oper==null || oper.isEmpty()){
            return;
        }

        double num2=Double.parseDouble(lblPantalla.getText());
        double res=0;
    
        switch(oper){
            case "+":
                res=num1+num2;
                break;
            case "-":
                res=num1-num2;
                break;
            case "*":
                res=num1*num2;
                break;
            case "/":
                if(num2!=0){
                    res=num1/num2;
                }else{
                    lblPantalla.setFont(new java.awt.Font("Segoe UI",java.awt.Font.BOLD,24));
                    lblPantalla.setText("No se puede dividir entre cero.");
                    resFin=true;
                    return;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null,"Operacion no valida.");
                return;
            }
        if(resFin){
            return;
        }
        lblPantalla.setText(formatoNum(res));
        lblMiniPantalla.setText(lblMiniPantalla.getText()+formatoNum(num2)+" = ");
        lblHistorial.setText("<html>"+lblHistorial.getText()+"<br>"+lblMiniPantalla.getText()+formatoNum(res)+"<br><html>");
        resFin=true;
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnPosNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosNegActionPerformed
        if(lblPantalla.getText().trim().isEmpty()){
            return;
        }
        
        double num=Double.parseDouble(String.valueOf(lblPantalla.getText()));
        
        if(resFin){
            lblMiniPantalla.setText("negate("+formatoNum(num)+")");
        }
        
        num=num*(-1);
        lblPantalla.setText(String.valueOf(formatoNum(num)));
    }//GEN-LAST:event_btnPosNegActionPerformed

    private void btnBorrarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarUnoActionPerformed
        String borrar=null;
        if(resFin){
            return;
        }
        if(lblPantalla.getText().length()>0){
            String text=lblPantalla.getText();
            borrar=text.substring(0,text.length()-1);
            lblPantalla.setText(borrar);
        }
    }//GEN-LAST:event_btnBorrarUnoActionPerformed

    private void btnDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecActionPerformed
        if(lblPantalla.getText().trim().isEmpty()){
            return;
        }
        String textoPantalla=lblPantalla.getText();
        if(textoPantalla.isEmpty()){
            lblPantalla.setText("0"+btnDec.getText()); 
        }else{
            if(textoPantalla.contains(btnDec.getText())){
                return;
            }
        lblPantalla.setText(textoPantalla+btnDec.getText());
        }
    }//GEN-LAST:event_btnDecActionPerformed

    private void btnBorrarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarHistorialActionPerformed
        lblHistorial.setText("");
    }//GEN-LAST:event_btnBorrarHistorialActionPerformed
    
    private String formatoNum(double number){
    if(number==(long)number){
        return String.format("%d",(long)number);
    }else{
        return String.format("%.2f",number);
    }
}
    
    private void limpiarLabels(){
        lblPantalla.setText("");
        lblMiniPantalla.setText("");
        resFin=false;
    }
    
    @Override
    public void keyTyped(java.awt.event.KeyEvent evt) {
    }

    @Override
    public void keyPressed(java.awt.event.KeyEvent evt) {
        formKeyPressed(evt);
    }

    @Override
    public void keyReleased(java.awt.event.KeyEvent evt) {
    }

    private void formKeyPressed(java.awt.event.KeyEvent evt){
        char tecla=evt.getKeyChar();
        
        switch(tecla){
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                handleNumberInput(tecla);
                break;
            case '+':
                btnSumaActionPerformed(null);
                break;
            case '-':
                btnRestaActionPerformed(null);
                break;
            case '*':
                btnMultiActionPerformed(null);
                break;
            case '/':
                btnDivActionPerformed(null);
                break;
            case '=':
            case '\n':
                btnIgualActionPerformed(null);
                break;
            case '.':
                btnDecActionPerformed(null);
                break;
            case '\b':
                btnBorrarUnoActionPerformed(null);
                break;
            case 'c':
            case 'C':
                btnBorrarTodoActionPerformed(null);
                break;
            case 'r':
            case 'R':
                btnBorrarTodoActionPerformed(null);
                break;
            default:
                break;
        }
    }

    private void handleNumberInput(char tecla){
        if(resFin){
            limpiarLabels();
        }
        String num=lblPantalla.getText()+tecla;
        lblPantalla.setText(num);
    }
    
    private void initListeners(){
        this.addKeyListener(this);
        this.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e){}

            @Override
            public void focusLost(FocusEvent e){
                requestFocusInWindow();
            }
        });
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculadoraPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraPantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarActual;
    private javax.swing.JButton btnBorrarHistorial;
    private javax.swing.JButton btnBorrarTodo;
    private javax.swing.JButton btnBorrarUno;
    private javax.swing.JButton btnDec;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnNum0;
    private javax.swing.JButton btnNum1;
    private javax.swing.JButton btnNum2;
    private javax.swing.JButton btnNum3;
    private javax.swing.JButton btnNum4;
    private javax.swing.JButton btnNum5;
    private javax.swing.JButton btnNum6;
    private javax.swing.JButton btnNum7;
    private javax.swing.JButton btnNum8;
    private javax.swing.JButton btnNum9;
    private javax.swing.JButton btnPosNeg;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHistorial;
    private javax.swing.JLabel lblMiniPantalla;
    private javax.swing.JLabel lblPantalla;
    // End of variables declaration//GEN-END:variables
}