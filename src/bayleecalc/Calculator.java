/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bayleecalc;

/**
 *
 * @author Wes
 */
public class Calculator extends javax.swing.JFrame {

    public static class Range
    {
        public double low;
        public double high;
    }
    
    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
        //HideBMI();
    }
    
    private void HideBMI() {
        jLabel8.setVisible(false);
        w_textbox_bmi.setVisible(false);
    }
    
    private void ShowBMI() {
        jLabel8.setVisible(true);
        w_textbox_bmi.setVisible(true);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        w_textbox_height = new javax.swing.JTextField();
        w_textbox_weight = new javax.swing.JTextField();
        w_textbox_age = new javax.swing.JTextField();
        w_combobox_gender = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        w_combobox_equation = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        w_textbox_bee = new javax.swing.JTextField();
        w_combobox_heightUnits = new javax.swing.JComboBox();
        w_combobox_weightUnits = new javax.swing.JComboBox();
        w_combobox_ageUnits = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        w_textbox_bmi = new javax.swing.JTextField();
        w_label_correctness = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Gender");

        jLabel2.setText("Height");

        jLabel3.setText("Weight");

        jLabel4.setText("Age");

        w_textbox_height.setMaximumSize(new java.awt.Dimension(40, 20));
        w_textbox_height.setMinimumSize(new java.awt.Dimension(40, 20));
        w_textbox_height.setName("w_texbox_height"); // NOI18N
        w_textbox_height.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                w_textbox_heightKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                w_textbox_heightKeyTyped(evt);
            }
        });

        w_textbox_weight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                w_textbox_weightKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                w_textbox_weightKeyTyped(evt);
            }
        });

        w_textbox_age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                w_textbox_ageKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                w_textbox_ageKeyTyped(evt);
            }
        });

        w_combobox_gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        w_combobox_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w_combobox_genderActionPerformed(evt);
            }
        });

        jLabel5.setText("Equation");

        w_combobox_equation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Harris-Benedict", "Mifflin - St Jeor", "Ireton-Jones", "Institute of Medicine", "World Health Organization" }));
        w_combobox_equation.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                w_combobox_equationItemStateChanged(evt);
            }
        });

        jLabel6.setText("Resting Energy Expenditure");

        w_textbox_bee.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        w_textbox_bee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w_textbox_beeActionPerformed(evt);
            }
        });

        w_combobox_heightUnits.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "cm", "in" }));
        w_combobox_heightUnits.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                w_combobox_heightUnitsItemStateChanged(evt);
            }
        });

        w_combobox_weightUnits.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "kg", "lb" }));
        w_combobox_weightUnits.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                w_combobox_weightUnitsItemStateChanged(evt);
            }
        });

        w_combobox_ageUnits.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "yrs", "mos" }));
        w_combobox_ageUnits.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                w_combobox_ageUnitsItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Resting Energy Expenditure");

        jLabel8.setText("BMI");
        jLabel8.setFocusCycleRoot(true);

        w_textbox_bmi.setEditable(false);

        w_label_correctness.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(w_label_correctness, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(w_textbox_bee, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(w_combobox_equation, 0, 1, Short.MAX_VALUE)
                                    .addComponent(w_combobox_gender, 0, 109, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(w_textbox_bmi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                            .addComponent(w_textbox_weight, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(w_textbox_age, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(w_textbox_height, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(w_combobox_heightUnits, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(w_combobox_weightUnits, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(w_combobox_ageUnits, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(w_combobox_equation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(w_combobox_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(w_textbox_height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w_combobox_heightUnits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(w_textbox_weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w_combobox_weightUnits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(w_textbox_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w_combobox_ageUnits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(w_textbox_bmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(w_textbox_bee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(w_label_correctness, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void w_combobox_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_w_combobox_genderActionPerformed
        Recalculate();
    }//GEN-LAST:event_w_combobox_genderActionPerformed

    private void w_textbox_beeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_w_textbox_beeActionPerformed
//        Recalculate();
    }//GEN-LAST:event_w_textbox_beeActionPerformed

    private void w_textbox_heightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_w_textbox_heightKeyTyped
//        Recalculate();
    }//GEN-LAST:event_w_textbox_heightKeyTyped

    private void w_textbox_weightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_w_textbox_weightKeyTyped
//        Recalculate();
    }//GEN-LAST:event_w_textbox_weightKeyTyped

    private void w_textbox_ageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_w_textbox_ageKeyTyped
//        Recalculate();
    }//GEN-LAST:event_w_textbox_ageKeyTyped

    private void w_textbox_heightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_w_textbox_heightKeyReleased
        Recalculate();
    }//GEN-LAST:event_w_textbox_heightKeyReleased

    private void w_textbox_weightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_w_textbox_weightKeyReleased
        Recalculate();
    }//GEN-LAST:event_w_textbox_weightKeyReleased

    private void w_textbox_ageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_w_textbox_ageKeyReleased
        Recalculate();
    }//GEN-LAST:event_w_textbox_ageKeyReleased

    private void w_combobox_equationItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_w_combobox_equationItemStateChanged
        Recalculate();
    }//GEN-LAST:event_w_combobox_equationItemStateChanged

    private void w_combobox_ageUnitsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_w_combobox_ageUnitsItemStateChanged
        Recalculate();
    }//GEN-LAST:event_w_combobox_ageUnitsItemStateChanged

    private void w_combobox_weightUnitsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_w_combobox_weightUnitsItemStateChanged
        Recalculate();
    }//GEN-LAST:event_w_combobox_weightUnitsItemStateChanged

    private void w_combobox_heightUnitsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_w_combobox_heightUnitsItemStateChanged
        Recalculate();
    }//GEN-LAST:event_w_combobox_heightUnitsItemStateChanged

    private double InchesToCentimeters(double inches) {
        return (double) (inches * (double)2.54);
    }
    
    private double MonthsToYears(double months) {
        return (double) (months / (double)12);
    }
    
    private double PoundsToKilograms(double pounds) { 
        return (double) (pounds * (double).453592);
    }
    
    ///weight in KG, Height in cm
    private double GetBMI(double weight, double height) {
        double ret = 0;
        height = height / 100;
        ret = (double) (weight / (double)(height * height));
        
        return ret;
    }
    
    private void Recalculate()
    {
        //Re-evaluate the B.E.E. 
        double bee = 0;
        Calculator.Range correctnessRange;
        double age = 0;
        double height = 0; 
        double weight = 0;
        boolean male = false;
        double bmi = 0;
        String equation;
        
        try
        {
            //Get weight from text fields
            weight = Integer.parseInt(w_textbox_weight.getText());
            if(w_combobox_weightUnits.getSelectedItem().toString().contains("lb"))
                weight = PoundsToKilograms(weight);
            
            //Get height from text fields
            height = Integer.parseInt(w_textbox_height.getText());
            if(w_combobox_heightUnits.getSelectedItem().toString().contains("in"))
                height = InchesToCentimeters(height);
            
            //Calculate BMI (based on weight and height only)
                bmi = GetBMI(weight, height);
            bmi = (double)Math.round(bmi * 100) / 100;
            w_textbox_bmi.setText(Double.toString(bmi));
            
            //Get age from text fields
            age = Integer.parseInt(w_textbox_age.getText());
            if(w_combobox_ageUnits.getSelectedItem().toString().contains("mos"))
                age = MonthsToYears(age);
            
            //Get gender from combobox
            if(w_combobox_gender.getSelectedItem().toString().contains("Male"))
                male = true;
                        
            //Calculate energy expenditure
            equation = w_combobox_equation.getSelectedItem().toString();
            if(equation.contains("Harris"))
            {
                bee = Harris(male, age, height, weight);   
            }
            else if(equation.contains("Mifflin"))
            {
                bee = Mifflin(male, age, height, weight);
            }
            else if(equation.contains("Ireton"))
            {
                bee = Ireton(male, age, weight, false);
            }
            else if(equation.contains("Institute"))
            {
                bee = Institute(male, age, height, weight, 1);
            }
            else if(equation.contains("World Health Organization"))
            {
                bee = WHO(male, weight);
            }
            
            //round to 3 decimal places
            bee = (double)Math.round(bee * 1000) / 1000;
            correctnessRange = ErrorRange(bee, 10);
            //display the bee
            w_textbox_bee.setText(Double.toString(bee));
            //display the range of acceptable results
            w_label_correctness.setText("(" + Double.toString(correctnessRange.low) + " - " + Double.toString(correctnessRange.high) + ")");
        }
        catch(NumberFormatException e)
        {
            
        }
    }
    
    
    
    private static Calculator.Range ErrorRange(double number, double percent)
    {
        Calculator.Range ret = new Calculator.Range();
        double difference;
        
        difference = number * (percent/100);
        ret.low = (double)Math.round((number - difference) * 1000) / 1000;
        ret.high = (double)Math.round((number + difference) * 1000) / 1000;
        return ret;
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }
    
    ///age in years, height in cm, weight in kg
    private static double Harris(boolean male, double age, double height, double weight) {
        double ret = 0;
        
        if(male) {
            ret = 66.5 + (13.75*weight) + (5*height) - (6.775*age);
        }
        else {
            ret = 655.1 + (9.563*weight) + (1.850*height) - (4.676*age);
        }
            
        return ret;
    }
    
    ///age in years, height in cm, weight in kg
    private static double Mifflin(boolean male, double age, double height, double weight) {
        double ret = 0;
        
        if(male) {
            ret = (9.99*weight) + (6.25*height) - (4.92*age) + 5;
        }
        else {
            ret = (9.99*weight) + (6.25*height) - (4.92*age) - 161;
        }
        
        return ret;
    }
    
    ///age in years, weight in kg
    private static double Ireton(boolean male, double age, double weight, boolean ventilator) {
        double ret = 0;
        
        ret = (9*weight) - (12*age) + 1444;
        if(male)
            ret += 606;
        if(ventilator)
            ret += 400;
        
        return ret;
    }
    
    ///age in years, height in cm, weight in kg
    private static double Institute(boolean male, double age, double height, double weight, double activity) {
        double ret = 0;
        
        if(male) {
            ret = 662 - (9.53*age) + (activity*15.91*weight) + (539.6*height/100);
        }
        else {
            ret = 354 - (6.91*age) + (activity*9.36*weight) + (726*height/100);
        }
        
        return ret;
    }
    
    private static double WHO(boolean male, double weight)
    {
        double ret = 0;
        
        if(male) {
            ret = (15.057*weight) + 692.2;
        }
        else {
            ret = (14.818*weight) + 486.6;
        }
        
        return ret;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox w_combobox_ageUnits;
    private javax.swing.JComboBox w_combobox_equation;
    private javax.swing.JComboBox w_combobox_gender;
    private javax.swing.JComboBox w_combobox_heightUnits;
    private javax.swing.JComboBox w_combobox_weightUnits;
    private javax.swing.JLabel w_label_correctness;
    private javax.swing.JTextField w_textbox_age;
    private javax.swing.JTextField w_textbox_bee;
    private javax.swing.JTextField w_textbox_bmi;
    private javax.swing.JTextField w_textbox_height;
    private javax.swing.JTextField w_textbox_weight;
    // End of variables declaration//GEN-END:variables
}
