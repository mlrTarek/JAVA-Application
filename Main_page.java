
package conversion_project;

import javax.swing.JOptionPane;

public class Main_page extends javax.swing.JFrame {

    public Main_page() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        intype = new javax.swing.JComboBox<>();
        text1 = new javax.swing.JTextField();
        Outtype = new javax.swing.JComboBox<>();
        text2 = new javax.swing.JTextField();
        text3 = new javax.swing.JTextField();
        text4 = new javax.swing.JTextField();
        covt = new javax.swing.JButton();
        text5 = new javax.swing.JTextField();
        text6 = new javax.swing.JTextField();
        text7 = new javax.swing.JTextField();
        clr = new javax.swing.JButton();
        ext = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Niagara Solid", 1, 48)); // NOI18N
        jLabel1.setText("Unit Converter");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 6, 220, -1));

        intype.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        intype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Type", "Temperature", "Mass", "Speed", "Length", "Data" }));
        intype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intypeActionPerformed(evt);
            }
        });
        getContentPane().add(intype, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 165, 44));

        text1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text1ActionPerformed(evt);
            }
        });
        getContentPane().add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 225, -1));

        Outtype.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Outtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----" }));
        Outtype.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                OuttypeComponentAdded(evt);
            }
        });
        Outtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OuttypeActionPerformed(evt);
            }
        });
        getContentPane().add(Outtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 165, 44));

        text2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text2ActionPerformed(evt);
            }
        });
        getContentPane().add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 225, -1));

        text3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        text3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text3ActionPerformed(evt);
            }
        });
        getContentPane().add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 225, -1));

        text4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        text4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text4ActionPerformed(evt);
            }
        });
        getContentPane().add(text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 225, -1));

        covt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        covt.setText("Convert");
        covt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                covtActionPerformed(evt);
            }
        });
        getContentPane().add(covt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        text5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        text5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text5ActionPerformed(evt);
            }
        });
        getContentPane().add(text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 225, -1));

        text6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        text6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text6ActionPerformed(evt);
            }
        });
        getContentPane().add(text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 225, -1));

        text7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        text7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text7ActionPerformed(evt);
            }
        });
        getContentPane().add(text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 225, -1));

        clr.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        clr.setText("Clear");
        clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrActionPerformed(evt);
            }
        });
        getContentPane().add(clr, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 180, -1, -1));

        ext.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ext.setText("Exit");
        ext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extActionPerformed(evt);
            }
        });
        getContentPane().add(ext, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 236, 75, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void intypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intypeActionPerformed
            if(intype.getSelectedItem().equals("Temperature")){
            Outtype.removeAllItems();
            Outtype.addItem("Celcius");
            Outtype.addItem("Fahrenheit");
            Outtype.addItem("Kelvin");    
        }
            else if(intype.getSelectedItem().equals("Mass")){
            Outtype.removeAllItems();
            Outtype.addItem("Kilogram");
            Outtype.addItem("Gram");
            Outtype.addItem("Miligram"); 
            Outtype.addItem("Ton");
            Outtype.addItem("Pound");
                
        }
            else if(intype.getSelectedItem().equals("Speed")){
            Outtype.removeAllItems();
            Outtype.addItem("Km/hr");
            Outtype.addItem("Meter/sec");
            Outtype.addItem("Miles/hr");
            Outtype.addItem("Foot/sec");
        }
            else if(intype.getSelectedItem().equals("Length")){
            Outtype.removeAllItems();
            Outtype.addItem("Kilometer");
            Outtype.addItem("Meter");
            Outtype.addItem("Centi Meter");
            Outtype.addItem("Mile");
            Outtype.addItem("Feet");
            Outtype.addItem("Inch");
            
            }
            
            else if(intype.getSelectedItem().equals("Data")){
            Outtype.removeAllItems();
            Outtype.addItem("Byte");
            Outtype.addItem("Kilobyte");
            Outtype.addItem("Megabyte"); 
            Outtype.addItem("Gigabyte");
            Outtype.addItem("Terabyte");
            }
            
            else{
                JOptionPane.showMessageDialog(this, "Please Try Again.");
            }   
    }//GEN-LAST:event_intypeActionPerformed

    private void text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text1ActionPerformed

    private void text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text2ActionPerformed
        
    }//GEN-LAST:event_text2ActionPerformed

    private void text3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text3ActionPerformed

    private void text4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text4ActionPerformed

    private void covtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_covtActionPerformed

        if(intype.getSelectedItem().equals("Temperature") && Outtype.getSelectedItem().equals("Celcius")){
            float i=Float.parseFloat(text1.getText());
            float result1= i;
            float result2= i*9/5+32;
            double result3= i+273.15;
            text2.setText(Float.toString(result1));
            text2.setText(result1 +" °C");
            text3.setText(Float.toString(result2));
            text3.setText(result2 +" °F");
            text4.setText(Double.toString(result3));
            text4.setText(result3 +" K");
            text5.setText(null);
            text6.setText(null);
            text7.setText(null);
        }
        
        else if(intype.getSelectedItem().equals("Temperature") && Outtype.getSelectedItem().equals("Fahrenheit")){
            float j=Float.parseFloat(text1.getText());
            float result1= (j-32)*5/9;
            float result2= j;
            double result3= (j-32)*5/9+273.15;
            text2.setText(Float.toString(result1));
            text2.setText(result1 +" °C");
            text3.setText(Float.toString(result2));
            text3.setText(result2 +" °F");
            text4.setText(Double.toString(result3));
            text4.setText(result3 +" K");
            text5.setText(null);
            text6.setText(null);
            text7.setText(null);
        }
        
        else if(intype.getSelectedItem().equals("Temperature") && Outtype.getSelectedItem().equals("Kelvin")){
            float k=Float.parseFloat(text1.getText());
            double result1= k-273.15;
            double result2= (k-273.15)*9/5+32;
            double result3= k;
            text2.setText(Double.toString(result1));
            text2.setText(result1 +" °C");
            text3.setText(Double.toString(result2));
            text3.setText(result2 +" °F");
            text4.setText(Double.toString(result3));
            text4.setText(result3 +" K");
            text5.setText(null);
            text6.setText(null);
            text7.setText(null);
        }
        
        else if(intype.getSelectedItem().equals("Mass") && Outtype.getSelectedItem().equals("Kilogram")){
            float l=Float.parseFloat(text1.getText());
            float result1= l;
            float result2= l*1000;
            double result3= l*1000000;
            double result4= l/1000;
            double result5= l*2.205;
            
            
            text2.setText(Float.toString(result1));
            text2.setText(result1 +" Kilogram");
            text3.setText(Float.toString(result2));
            text3.setText(result2 +" Gram");
            text4.setText(Double.toString(result3));
            text4.setText(result3 +" Miligram");
            text5.setText(Double.toString(result4));
            text5.setText(result4 +" Tonne");
            text6.setText(Double.toString(result5));
            text6.setText(result5 +" Pound");
            text7.setText(null);
        }
        
        else if(intype.getSelectedItem().equals("Mass") && Outtype.getSelectedItem().equals("Gram")){
            float m=Float.parseFloat(text1.getText());
            float result1= m/1000;
            float result2= m;
            double result3= m*1000;
            double result4= m/1000000;
            double result5= m/454;
            
            
            text2.setText(Float.toString(result1));
            text2.setText(result1 +" Kilogram");
            text3.setText(Float.toString(result2));
            text3.setText(result2 +" Gram");
            text4.setText(Double.toString(result3));
            text4.setText(result3 +" Miligram");
            text5.setText(Double.toString(result4));
            text5.setText(result4 +" Tonne");
            text6.setText(Double.toString(result5));
            text6.setText(result5 +" Pound");
            text7.setText(null);
        }
        
        else if(intype.getSelectedItem().equals("Mass") && Outtype.getSelectedItem().equals("Miligram")){
            float n=Float.parseFloat(text1.getText());
            float result1= n/1000000;
            float result2= n/1000;
            double result3= n;
            double result4= n/1000000000;
            double result5= n/453592;
            
            
            text2.setText(Float.toString(result1));
            text2.setText(result1 +" Kilogram");
            text3.setText(Float.toString(result2));
            text3.setText(result2 +" Gram");
            text4.setText(Double.toString(result3));
            text4.setText(result3 +" Miligram");
            text5.setText(Double.toString(result4));
            text5.setText(result4 +" Tonne");
            text6.setText(Double.toString(result5));
            text6.setText(result5 +" Pound");
            text7.setText(null);
        }
        
        else if(intype.getSelectedItem().equals("Mass") && Outtype.getSelectedItem().equals("Ton")){
            float t=Float.parseFloat(text1.getText());
            float result1= t*1000;
            float result2= t*1000000;
            double result3= t*1000000000;
            double result4= t;
            double result5= t*2205;
            
            
            text2.setText(Float.toString(result1));
            text2.setText(result1 +" Kilogram");
            text3.setText(Float.toString(result2));
            text3.setText(result2 +" Gram");
            text4.setText(Double.toString(result3));
            text4.setText(result3 +" Miligram");
            text5.setText(Double.toString(result4));
            text5.setText(result4 +" Tonne");
            text6.setText(Double.toString(result5));
            text6.setText(result5 +" Pound");
            text7.setText(null);
        }
        
        else if(intype.getSelectedItem().equals("Mass") && Outtype.getSelectedItem().equals("Pound")){
            float p=Float.parseFloat(text1.getText());
            double result1= p/2.205;
            float result2= p*454;
            double result3= p*453592;
            double result4= p/2205;
            double result5= p;
            
            
            text2.setText(Double.toString(result1));
            text2.setText(result1 +" Kilogram");
            text3.setText(Float.toString(result2));
            text3.setText(result2 +" Gram");
            text4.setText(Double.toString(result3));
            text4.setText(result3 +" Miligram");
            text5.setText(Double.toString(result4));
            text5.setText(result4 +" Tonne");
            text6.setText(Double.toString(result5));
            text6.setText(result5 +" Pound");
            text7.setText(null);
        }
        
        else if(intype.getSelectedItem().equals("Speed") && Outtype.getSelectedItem().equals("Km/hr")){
            float w=Float.parseFloat(text1.getText());
            double result1= w;
            double result2= w/3.6;
            double result3= w/1.609;
            double result4= w/1.097;
            
            text2.setText(Double.toString(result1));
            text2.setText(result1 +" Km/hr");
            text3.setText(Double.toString(result2));
            text3.setText(result2 +" m/sec");
            text4.setText(Double.toString(result3));
            text4.setText(result3 +" Mi/hr");
            text5.setText(Double.toString(result4));
            text5.setText(result4 +" Ft/sec");
            text6.setText(null);
            text7.setText(null);
        }
        
        else if(intype.getSelectedItem().equals("Speed") && Outtype.getSelectedItem().equals("Meter/sec")){
            float x=Float.parseFloat(text1.getText());
            double result1= x*3.6;
            double result2= x;
            double result3= x*2.237;
            double result4= x*3.281;
            
            text2.setText(Double.toString(result1));
            text2.setText(result1 +" Km/hr");
            text3.setText(Double.toString(result2));
            text3.setText(result2 +" m/sec");
            text4.setText(Double.toString(result3));
            text4.setText(result3 +" Mi/hr");
            text5.setText(Double.toString(result4));
            text5.setText(result4 +" Ft/sec");
            text6.setText(null);
            text7.setText(null);
        }
        
        else if(intype.getSelectedItem().equals("Speed") && Outtype.getSelectedItem().equals("Miles/hr")){
            float y=Float.parseFloat(text1.getText());
            double result1= y*1.609;
            double result2= y/2.237;
            double result3= y;
            double result4= y*1.467;
            
            text2.setText(Double.toString(result1));
            text2.setText(result1 +" Km/hr");
            text3.setText(Double.toString(result2));
            text3.setText(result2 +" m/sec");
            text4.setText(Double.toString(result3));
            text4.setText(result3 +" Mi/hr");
            text5.setText(Double.toString(result4));
            text5.setText(result4 +" Ft/sec");
            text6.setText(null);
            text7.setText(null);
        }
        
        else if(intype.getSelectedItem().equals("Speed") && Outtype.getSelectedItem().equals("Foot/sec")){
            float z=Float.parseFloat(text1.getText());
            double result1= z*1.097;
            double result2= z/3.281;
            double result3= z/1.467;
            double result4= z;
            
            text2.setText(Double.toString(result1));
            text2.setText(result1 +" Km/hr");
            text3.setText(Double.toString(result2));
            text3.setText(result2 +" m/sec");
            text4.setText(Double.toString(result3));
            text4.setText(result3 +" Mi/hr");
            text5.setText(Double.toString(result4));
            text5.setText(result4 +" Ft/sec");
            text6.setText(null);
            text7.setText(null);
        }
        
        else if(intype.getSelectedItem().equals("Length") && Outtype.getSelectedItem().equals("Kilometer")){
            float a=Float.parseFloat(text1.getText());
            double result1= a;
            float result2= a*1000;
            double result3= a*100000;
            double result4= a/1.609;
            double result5= a*3281;
            double result6= a*39370;
            
            
            text2.setText(Double.toString(result1));
            text2.setText(result1 +" Km");
            text3.setText(Float.toString(result2));
            text3.setText(result2 +" m");
            text4.setText(Double.toString(result3));
            text4.setText(result3 +" cm");
            text5.setText(Double.toString(result4));
            text5.setText(result4 +" mile");
            text6.setText(Double.toString(result5));
            text6.setText(result5 +" ft");
            text7.setText(Double.toString(result6));
            text7.setText(result6 +" inch");
        }
        
        else if(intype.getSelectedItem().equals("Length") && Outtype.getSelectedItem().equals("Meter")){
            float b=Float.parseFloat(text1.getText());
            double result1= b/1000;
            float result2= b;
            double result3= b*100;
            double result4= b/1609;
            double result5= b*3.281;
            double result6= b*39.37;
            
            
            text2.setText(Double.toString(result1));
            text2.setText(result1 +" Km");
            text3.setText(Float.toString(result2));
            text3.setText(result2 +" m");
            text4.setText(Double.toString(result3));
            text4.setText(result3 +" cm");
            text5.setText(Double.toString(result4));
            text5.setText(result4 +" mile");
            text6.setText(Double.toString(result5));
            text6.setText(result5 +" ft");
            text7.setText(Double.toString(result6));
            text7.setText(result6 +" inch");
        }
        
        else if(intype.getSelectedItem().equals("Length") && Outtype.getSelectedItem().equals("Centi Meter")){
            float c=Float.parseFloat(text1.getText());
            double result1= c/100000;
            float result2= c/100;
            double result3= c;
            double result4= c/160934;
            double result5= c*30.48;
            double result6= c*2.54;
            
            
            text2.setText(Double.toString(result1));
            text2.setText(result1 +" Km");
            text3.setText(Float.toString(result2));
            text3.setText(result2 +" m");
            text4.setText(Double.toString(result3));
            text4.setText(result3 +" cm");
            text5.setText(Double.toString(result4));
            text5.setText(result4 +" mile");
            text6.setText(Double.toString(result5));
            text6.setText(result5 +" ft");
            text7.setText(Double.toString(result6));
            text7.setText(result6 +" inch");
        }
        
        else if(intype.getSelectedItem().equals("Length") && Outtype.getSelectedItem().equals("Mile")){
            float d=Float.parseFloat(text1.getText());
            double result1= d/1.609;
            float result2= d*1609;
            double result3= d*160934;
            double result4= d;
            double result5= d*5280;
            double result6= d*63360;
            
            
            text2.setText(Double.toString(result1));
            text2.setText(result1 +" Km");
            text3.setText(Float.toString(result2));
            text3.setText(result2 +" m");
            text4.setText(Double.toString(result3));
            text4.setText(result3 +" cm");
            text5.setText(Double.toString(result4));
            text5.setText(result4 +" mile");
            text6.setText(Double.toString(result5));
            text6.setText(result5 +" ft");
            text7.setText(Double.toString(result6));
            text7.setText(result6 +" inch");
        }
        
        else if(intype.getSelectedItem().equals("Length") && Outtype.getSelectedItem().equals("Feet")){
            float e=Float.parseFloat(text1.getText());
            double result1= e/3281;
            double result2= e/3.281;
            double result3= e*30.48;
            double result4= e/5280;
            double result5= e;
            double result6= e*12;
            
            
            text2.setText(Double.toString(result1));
            text2.setText(result1 +" Km");
            text3.setText(Double.toString(result2));
            text3.setText(result2 +" m");
            text4.setText(Double.toString(result3));
            text4.setText(result3 +" cm");
            text5.setText(Double.toString(result4));
            text5.setText(result4 +" mile");
            text6.setText(Double.toString(result5));
            text6.setText(result5 +" ft");
            text7.setText(Double.toString(result6));
            text7.setText(result6 +" inch");
        }
        
        else if(intype.getSelectedItem().equals("Length") && Outtype.getSelectedItem().equals("Inch")){
            float f=Float.parseFloat(text1.getText());
            double result1= f/39370;
            double result2= f/39.37;
            double result3= f*2.54;
            double result4= f/63360;
            double result5= f/12;
            double result6= f;
            
            
            text2.setText(Double.toString(result1));
            text2.setText(result1 +" Km");
            text3.setText(Double.toString(result2));
            text3.setText(result2 +" m");
            text4.setText(Double.toString(result3));
            text4.setText(result3 +" cm");
            text5.setText(Double.toString(result4));
            text5.setText(result4 +" mile");
            text6.setText(Double.toString(result5));
            text6.setText(result5 +" ft");
            text7.setText(Double.toString(result6));
            text7.setText(result6 +" inch");
        }
        
        else if(intype.getSelectedItem().equals("Data") && Outtype.getSelectedItem().equals("Byte")){
            float q=Float.parseFloat(text1.getText());
            double result1= q;
            double result2= q/1000;
            double result3= q/1000000;
            double result4= q/1000000000;
            //double result5= q/1000000000000;
            String q1 = String.format("%.3f", result1);
            String q2 = String.format("%.3f", result1);
            String q3 = String.format("%.3f", result3);
            String q4 = String.format("%.3f", result4);
            
            //text2.setText(Double.toString(result1));
            text2.setText(q1 +" Byte");
            //text3.setText(Double.toString(result2));
            text3.setText(q2 +" KB");
            //text4.setText(Double.toString(result3));
            text4.setText(q3 +" MB");
            //text5.setText(Double.toString(result4));
            text5.setText(q4 +" GB");
            //text6.setText(Double.toString(result5));
            text6.setText(null);
            text7.setText(null);
        }
        
        else if(intype.getSelectedItem().equals("Data") && Outtype.getSelectedItem().equals("Kilobyte")){
            float r=Float.parseFloat(text1.getText());
            double result1= r*1000;
            double result2= r;
            double result3= r/1000;
            double result4= r/1000000;
            //double result5= q/1000000000000;       
            
            text2.setText(Double.toString(result1));
            text2.setText(result1 +" Byte");
            text3.setText(Double.toString(result2));
            text3.setText(result2 +" KB");
            text4.setText(Double.toString(result3));
            text4.setText(result3 +" MB");
            text5.setText(Double.toString(result4));
            text5.setText(result4 +" GB");
            //text6.setText(Double.toString(result5));
            text6.setText(null);
            text7.setText(null);
        }
        
        else if(intype.getSelectedItem().equals("Data") && Outtype.getSelectedItem().equals("Megabyte")){
            float s=Float.parseFloat(text1.getText());
            double result1= s*1000000;
            double result2= s*1000;
            double result3= s;
            double result4= s/1000;
            //double result5= q/1000000000000;       
            
            text2.setText(Double.toString(result1));
            text2.setText(result1 +" Byte");
            text3.setText(Double.toString(result2));
            text3.setText(result2 +" KB");
            text4.setText(Double.toString(result3));
            text4.setText(result3 +" MB");
            text5.setText(Double.toString(result4));
            text5.setText(result4 +" GB");
            //text6.setText(Double.toString(result5));
            text6.setText(null);
            text7.setText(null);
        }
        
        else if(intype.getSelectedItem().equals("Data") && Outtype.getSelectedItem().equals("Gigabyte")){
            float t=Float.parseFloat(text1.getText());
            double result1= t*1000000000;
            double result2= t*1000000;
            double result3= t*1000;
            double result4= t;
            //double result5= q/1000000000000;       
            
            text2.setText(Double.toString(result1));
            text2.setText(result1 +" Byte");
            text3.setText(Double.toString(result2));
            text3.setText(result2 +" KB");
            text4.setText(Double.toString(result3));
            text4.setText(result3 +" MB");
            text5.setText(Double.toString(result4));
            text5.setText(result4 +" GB");
            //text6.setText(Double.toString(result5));
            text6.setText(null);
            text7.setText(null);
        }
        
        else{
            JOptionPane.showMessageDialog(this, "Wrong Input!\n Please Try Again.");
        }
       
    }//GEN-LAST:event_covtActionPerformed

    private void OuttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OuttypeActionPerformed
        
    }//GEN-LAST:event_OuttypeActionPerformed

    private void OuttypeComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_OuttypeComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_OuttypeComponentAdded

    private void text5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text5ActionPerformed

    private void text6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text6ActionPerformed

    private void text7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text7ActionPerformed

    private void clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrActionPerformed
        text1.setText(null);
        text2.setText(null);
        text3.setText(null);
        text4.setText(null);
        text5.setText(null);
        text6.setText(null);
        text7.setText(null);
        
    }//GEN-LAST:event_clrActionPerformed

    private void extActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_extActionPerformed

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
            java.util.logging.Logger.getLogger(Main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Outtype;
    private javax.swing.JButton clr;
    private javax.swing.JButton covt;
    private javax.swing.JButton ext;
    private javax.swing.JComboBox<String> intype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField text4;
    private javax.swing.JTextField text5;
    private javax.swing.JTextField text6;
    private javax.swing.JTextField text7;
    // End of variables declaration//GEN-END:variables
}
