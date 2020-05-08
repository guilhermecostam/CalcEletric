package Tela;
import calcu.Class_cal;
import javax.swing.JTable;

public class Form_cal extends javax.swing.JFrame {
    public Form_cal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt = new javax.swing.JTextField();
        num1 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        somar = new javax.swing.JButton();
        diminuir = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        resultadoIgual = new javax.swing.JButton();
        apagaTudo = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        seno = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        cosseno = new javax.swing.JButton();
        tangente = new javax.swing.JButton();
        fatorial = new javax.swing.JButton();
        pi = new javax.swing.JButton();
        raizQuadrada = new javax.swing.JButton();
        pontoVirgula = new javax.swing.JButton();
        apagar = new javax.swing.JButton();
        aoQuadrado = new javax.swing.JButton();
        aoCubo = new javax.swing.JButton();
        cotangente = new javax.swing.JButton();
        voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });

        num1.setText("1");
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        num2.setText("2");
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        num3.setText("3");
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });

        num4.setText("4");
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });

        num5.setText("5");
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });

        num6.setText("6");
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });

        somar.setText("+");
        somar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somarActionPerformed(evt);
            }
        });
        somar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                somarKeyPressed(evt);
            }
        });

        diminuir.setText("-");
        diminuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diminuirActionPerformed(evt);
            }
        });

        multiplicar.setText("x");
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });

        dividir.setText("/");
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });

        resultadoIgual.setText("=");
        resultadoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoIgualActionPerformed(evt);
            }
        });

        apagaTudo.setText("AC");
        apagaTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagaTudoActionPerformed(evt);
            }
        });

        num7.setText("7");
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });

        num8.setText("8");
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });

        num9.setText("9");
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });

        seno.setText("sen");
        seno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senoActionPerformed(evt);
            }
        });

        num0.setText("0");
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });

        cosseno.setText("cos");
        cosseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cossenoActionPerformed(evt);
            }
        });

        tangente.setText("tan");
        tangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tangenteActionPerformed(evt);
            }
        });

        fatorial.setText("fact");
        fatorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatorialActionPerformed(evt);
            }
        });

        pi.setText("pi");
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });

        raizQuadrada.setText("raiz");
        raizQuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizQuadradaActionPerformed(evt);
            }
        });

        pontoVirgula.setText(".");
        pontoVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontoVirgulaActionPerformed(evt);
            }
        });

        apagar.setText("apagar");
        apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarActionPerformed(evt);
            }
        });

        aoQuadrado.setText("x^2");
        aoQuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoQuadradoActionPerformed(evt);
            }
        });

        aoCubo.setText("x^3");
        aoCubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoCuboActionPerformed(evt);
            }
        });

        cotangente.setText("cot");
        cotangente.setPreferredSize(new java.awt.Dimension(49, 23));
        cotangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cotangenteActionPerformed(evt);
            }
        });

        voltar.setText("Voltar");
        voltar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(num4, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                    .addComponent(num1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(diminuir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(somar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(apagar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(pontoVirgula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(apagaTudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(num9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(multiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(raizQuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tangente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cotangente, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(aoCubo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(seno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cosseno, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(aoQuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(resultadoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(40, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num1)
                            .addComponent(num2)
                            .addComponent(num3)
                            .addComponent(somar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(num4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(num5)
                                .addComponent(num6)
                                .addComponent(diminuir)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num7)
                            .addComponent(num8)
                            .addComponent(num9)
                            .addComponent(multiplicar)
                            .addComponent(pi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num0)
                            .addComponent(pontoVirgula)
                            .addComponent(apagaTudo)
                            .addComponent(dividir)
                            .addComponent(raizQuadrada)))
                    .addComponent(apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seno)
                            .addComponent(cosseno)
                            .addComponent(aoQuadrado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tangente)
                            .addComponent(cotangente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aoCubo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(resultadoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(voltar)
                        .addContainerGap())))
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
    }// </editor-fold>//GEN-END:initComponents
    public double acum;
    public double valor;
    public double no;    
    
    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActionPerformed

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
        if (no>0){
            txt.setText("");
            txt.setText(txt.getText()+ String.valueOf(9));
            no=0;
        }else{
            txt.setText(txt.getText()+ String.valueOf(9));   
        }
    }//GEN-LAST:event_num9ActionPerformed

    private void fatorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatorialActionPerformed
        // TODO add your handling code here:
        Class_cal Obj_calc=new Class_cal();
      Obj_calc.Setn1(Double.parseDouble(txt.getText()));
      txt.setText(Obj_calc.factorial()+"");
        
    }//GEN-LAST:event_fatorialActionPerformed

    private void somarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_somarKeyPressed
        // TODO add your handling code here:
        Class_cal Obj_calc = new Class_cal();
        if (valor==1){
            Obj_calc.Setn2(Double.parseDouble(txt.getText()));
            Obj_calc.Setn1(acum);
                txt.setText(Obj_calc.Sumar()+"");
        }
        if (valor==2){
            Obj_calc.Setn2(Double.parseDouble(txt.getText()));
            Obj_calc.Setn1(acum);
                    txt.setText(Obj_calc.Restar()+"");
        }
        if (valor==3){
             Obj_calc.Setn2(Double.parseDouble(txt.getText()));
             Obj_calc.Setn1(acum);

             txt.setText(Obj_calc.Multiplicar()+"");
         }
        if (valor==4){
            Obj_calc.Setn2(Double.parseDouble(txt.getText()));
            Obj_calc.Setn1(acum);
                    txt.setText(Obj_calc.Dividir()+"");
        }else{
                acum=Double.parseDouble (txt.getText());
                txt.setText("");
            valor=1;
}        
    }//GEN-LAST:event_somarKeyPressed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        // TODO add your handling code here:
        if (no>0)
    {
      txt.setText(""); 
       txt.setText(txt.getText()+ String.valueOf(1));
       no=0;
    }else{
        txt.setText(txt.getText()+ String.valueOf(1));
    }
    }//GEN-LAST:event_num1ActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        // TODO add your handling code here:
        if (no>0){
       txt.setText("");
       txt.setText(txt.getText()+ String.valueOf(2));
       no=0;
       }else{
        txt.setText(txt.getText()+ String.valueOf(2));
       }
    }//GEN-LAST:event_num2ActionPerformed

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
        // TODO add your handling code here:
        if (no>0){
            txt.setText("");
            txt.setText(txt.getText()+ String.valueOf(3));
            no=0;
        }else{
        txt.setText(txt.getText()+ String.valueOf(3));   
        }
    }//GEN-LAST:event_num3ActionPerformed

    private void senoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senoActionPerformed
        // TODO add your handling code here:
        Class_cal Obj_calc=new Class_cal();
      Obj_calc.Setn1(Double.parseDouble(txt.getText()));
      txt.setText(Obj_calc.seno()+"");
    }//GEN-LAST:event_senoActionPerformed

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
        // TODO add your handling code here:
        if (no>0)
    {
     txt.setText("");
     txt.setText(txt.getText()+ String.valueOf(0));
     no=0;
    }
    else
    {
     txt.setText(txt.getText()+ String.valueOf(0));
    
    }
    }//GEN-LAST:event_num0ActionPerformed

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
        // TODO add your handling code here:
        if (no>0){
            txt.setText("");
            txt.setText(txt.getText()+ String.valueOf(4));
            no=0;
        }else{
             txt.setText(txt.getText()+ String.valueOf(4));
        }
    }//GEN-LAST:event_num4ActionPerformed

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed
        // TODO add your handling code here:
        if (no>0){
            txt.setText("");
            txt.setText(txt.getText()+ String.valueOf(5));
            no=0;
        }else{
            txt.setText(txt.getText()+ String.valueOf(5));
        }
    }//GEN-LAST:event_num5ActionPerformed

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
        // TODO add your handling code here:
        if (no>0){
            txt.setText("");
            txt.setText(txt.getText()+ String.valueOf(6));
            no=0;
        }else{
          txt.setText(txt.getText()+ String.valueOf(6));
        }
    }//GEN-LAST:event_num6ActionPerformed

    private void cossenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cossenoActionPerformed
        // TODO add your handling code here:
        Class_cal Obj_calc=new Class_cal();
      Obj_calc.Setn1(Double.parseDouble(txt.getText()));
      txt.setText(Obj_calc.coseno()+"");
    }//GEN-LAST:event_cossenoActionPerformed

    private void aoCuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoCuboActionPerformed
        // TODO add your handling code here:
        Class_cal Obj_calc=new Class_cal();
      Obj_calc.Setn1(Double.parseDouble(txt.getText()));
      txt.setText(Obj_calc.cubo()+"");
    }//GEN-LAST:event_aoCuboActionPerformed

    private void diminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diminuirActionPerformed
        // TODO add your handling code here:
        Class_cal Obj_calc=new Class_cal();
 
 if (valor==1){
        Obj_calc.Setn2(Double.parseDouble(txt.getText()));
        Obj_calc.Setn1(acum);
                txt.setText(Obj_calc.Sumar()+"");
}
 if (valor==2){
        Obj_calc.Setn2(Double.parseDouble(txt.getText()));
        Obj_calc.Setn1(acum);
                txt.setText(Obj_calc.Restar()+"");
    }
 if (valor==3){
        Obj_calc.Setn2(Double.parseDouble(txt.getText()));
        Obj_calc.Setn1(acum);
        txt.setText(Obj_calc.Multiplicar()+"");
    }
  if (valor==4){
        Obj_calc.Setn2(Double.parseDouble(txt.getText()));
        Obj_calc.Setn1(acum);
        txt.setText(Obj_calc.Dividir()+"");
    }
else{
        acum=Double.parseDouble (txt.getText());
        txt.setText("");
        valor=2;
    }      
    }//GEN-LAST:event_diminuirActionPerformed

    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed
        // TODO add your handling code here:
        Class_cal Obj_calc=new Class_cal();

 if (valor==1){
        Obj_calc.Setn2(Double.parseDouble(txt.getText()));
        Obj_calc.Setn1(acum);
                txt.setText(Obj_calc.Sumar()+"");
}
 if (valor==2){
        Obj_calc.Setn2(Double.parseDouble(txt.getText()));
        Obj_calc.Setn1(acum);
                txt.setText(Obj_calc.Restar()+"");
    }
   if (valor==3){
        Obj_calc.Setn2(Double.parseDouble(txt.getText()));
        Obj_calc.Setn1(acum);

        txt.setText(Obj_calc.Multiplicar()+"");
    }
    if (valor==4){
        Obj_calc.Setn2(Double.parseDouble(txt.getText()));
        Obj_calc.Setn1(acum);
                txt.setText(Obj_calc.Dividir()+"");
    }
else{
            acum=Double.parseDouble (txt.getText());
            txt.setText("");
        valor=3;
    }
    }//GEN-LAST:event_multiplicarActionPerformed

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
        // TODO add your handling code here:
        if (no>0){
            txt.setText("");
            txt.setText(txt.getText()+ String.valueOf(8));
            no=0;
        }else{
            txt.setText(txt.getText()+ String.valueOf(8));
        }
    }//GEN-LAST:event_num8ActionPerformed

    private void tangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tangenteActionPerformed
        // TODO add your handling code here:
        Class_cal Obj_calc=new Class_cal();
      Obj_calc.Setn1(Double.parseDouble(txt.getText()));
      txt.setText(Obj_calc.tangente()+"");
    }//GEN-LAST:event_tangenteActionPerformed

    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
        // TODO add your handling code here:
        Class_cal Obj_calc=new Class_cal();

 if (valor==1){
        Obj_calc.Setn2(Double.parseDouble(txt.getText()));
        Obj_calc.Setn1(acum);
                txt.setText(Obj_calc.Sumar()+"");
}
 if (valor==2){
        Obj_calc.Setn2(Double.parseDouble(txt.getText()));
        Obj_calc.Setn1(acum);
                txt.setText(Obj_calc.Restar()+"");
    }
   if (valor==3){
        Obj_calc.Setn2(Double.parseDouble(txt.getText()));
        Obj_calc.Setn1(acum);

        txt.setText(Obj_calc.Multiplicar()+"");
    }
    if (valor==4){
        Obj_calc.Setn2(Double.parseDouble(txt.getText()));
        Obj_calc.Setn1(acum);
                txt.setText(Obj_calc.Dividir()+"");
    }
else{
            acum=Double.parseDouble (txt.getText());
            txt.setText("");
        valor=4;
    }
    }//GEN-LAST:event_dividirActionPerformed

    private void resultadoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoIgualActionPerformed
        // TODO add your handling code here:
        Class_cal Obj_calc=new Class_cal();
   
if (valor==1){
        Obj_calc.Setn2(Double.parseDouble(txt.getText()));
        Obj_calc.Setn1(acum);
                txt.setText(Obj_calc.Sumar()+"");
}
 if (valor==2){
        Obj_calc.Setn2(Double.parseDouble(txt.getText()));
        Obj_calc.Setn1(acum);
                txt.setText(Obj_calc.Restar()+"");
    }                                        
   if (valor==3){
        Obj_calc.Setn2(Double.parseDouble(txt.getText()));
        Obj_calc.Setn1(acum);

                txt.setText(Obj_calc.Multiplicar()+"");
    }
    if (valor==4){
        Obj_calc.Setn2(Double.parseDouble(txt.getText()));
        Obj_calc.Setn1(acum);
                txt.setText(Obj_calc.Dividir()+"");
   
   
    }
         valor=0;
         no=1;
    }//GEN-LAST:event_resultadoIgualActionPerformed

    private void apagaTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagaTudoActionPerformed
        // TODO add your handling code here:
        txt.setText("");
        acum=0;
        valor=0;
    }//GEN-LAST:event_apagaTudoActionPerformed

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
        // TODO add your handling code here:
        if (no>0){
     txt.setText("");
     txt.setText(txt.getText()+ String.valueOf(7));
      no=0;
    }
    else
    {
     txt.setText(txt.getText()+ String.valueOf(7));   
    }
    }//GEN-LAST:event_num7ActionPerformed

    private void cotangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cotangenteActionPerformed
        // TODO add your handling code here:
        Class_cal Obj_calc=new Class_cal();
      Obj_calc.Setn1(Double.parseDouble(txt.getText()));
      txt.setText(Obj_calc.cotangente()+"");
    }//GEN-LAST:event_cotangenteActionPerformed

    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
        // TODO add your handling code here:
        txt.setText(String.valueOf("3.14"));
    }//GEN-LAST:event_piActionPerformed

    private void raizQuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizQuadradaActionPerformed
        // TODO add your handling code here:
        Class_cal Obj_calc=new Class_cal();
      Obj_calc.Setn1(Double.parseDouble(txt.getText()));
      txt.setText(Obj_calc.Raiz()+"");
    }//GEN-LAST:event_raizQuadradaActionPerformed

    private void pontoVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontoVirgulaActionPerformed
        // TODO add your handling code here:
        String cadena;
        int ponto;
        cadena = txt.getText();
        ponto = cadena.indexOf('.');
        if (ponto==-1)
         {
          txt.setText(txt.getText()+("."));
         }
    }//GEN-LAST:event_pontoVirgulaActionPerformed

    private void apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarActionPerformed
        // TODO add your handling code here:
        String cadena = txt.getText();
        if(!txt.equals(""))
        txt.setText(cadena.substring(0, cadena.length() - 1));
    }//GEN-LAST:event_apagarActionPerformed

    private void aoQuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoQuadradoActionPerformed
        // TODO add your handling code here:
        Class_cal Obj_calc=new Class_cal();
      Obj_calc.Setn1(Double.parseDouble(txt.getText()));
      txt.setText(Obj_calc.cuadrado()+"");
    }//GEN-LAST:event_aoQuadradoActionPerformed

    private void somarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somarActionPerformed
        // TODO add your handling code here:
        Class_cal Obj_calc=new Class_cal();

 if (valor==1){
        Obj_calc.Setn2(Double.parseDouble(txt.getText()));
        Obj_calc.Setn1(acum);
                txt.setText(Obj_calc.Sumar()+"");
}
 if (valor==2){
        Obj_calc.Setn2(Double.parseDouble(txt.getText()));
        Obj_calc.Setn1(acum);
                txt.setText(Obj_calc.Restar()+"");
    }
   if (valor==3){
        Obj_calc.Setn2(Double.parseDouble(txt.getText()));
        Obj_calc.Setn1(acum);

        txt.setText(Obj_calc.Multiplicar()+"");
    }
    if (valor==4){
        Obj_calc.Setn2(Double.parseDouble(txt.getText()));
        Obj_calc.Setn1(acum);
                txt.setText(Obj_calc.Dividir()+"");
    }
else{
            acum=Double.parseDouble (txt.getText());
            txt.setText("");
        valor=1;
   
    }
    }//GEN-LAST:event_somarActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(Form_cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_cal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aoCubo;
    private javax.swing.JButton aoQuadrado;
    private javax.swing.JButton apagaTudo;
    private javax.swing.JButton apagar;
    private javax.swing.JButton cosseno;
    private javax.swing.JButton cotangente;
    private javax.swing.JButton diminuir;
    private javax.swing.JButton dividir;
    private javax.swing.JButton fatorial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton multiplicar;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JButton pi;
    private javax.swing.JButton pontoVirgula;
    private javax.swing.JButton raizQuadrada;
    private javax.swing.JButton resultadoIgual;
    private javax.swing.JButton seno;
    private javax.swing.JButton somar;
    private javax.swing.JButton tangente;
    private javax.swing.JTextField txt;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables

}
