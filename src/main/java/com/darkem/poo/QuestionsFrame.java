/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.darkem.poo;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;

/**
 *
 * @author emmanuel
 */
public class QuestionsFrame extends javax.swing.JFrame {
    private int questions = 0;
    ArrayList<JPanel> components = new ArrayList<JPanel>();
    int pages;
    private int currentPage = 0;
    private int firstEl;
    private int elCount;
    JPanel mainPanel;
    //private Color color1 = new Color(5,16,148);
    private Color color1 = new Color(5,16,148);//Principal
    private Color color2 = new Color(206,207,201);//Complementario
    private Color color3 = new Color(10,49,67);//Oscuro
    private Color color4 = new Color(239,239,239);//Claro
    

    /**
     * Creates new form QuestionsFrame
     */
    public QuestionsFrame(Question mainQuestion) {
        initComponents();
        mainQuestion.getQuestion(this);
        this.setVisible(true);
    }
    
    public void addQuestionPanel(Question question) {
        final int questions = this.questions;
        JPanel questionPanel = new JPanel();
        //questionPanel.setLayout(new GridLayout(2, 1));
        JLabel questionLabel = new JLabel(question.question);
        DefaultComboBoxModel<String> optionsModel = new DefaultComboBoxModel<>();
        for(int i=0;i<question.answers.length;i++) {
            Object answer = question.answers[i];
            if(answer.getClass() == Answer.class) {
                Answer answerAnswer = (Answer) answer;
                optionsModel.addElement(answerAnswer.option);
            }
            else if(answer.getClass() == Question.class) {
                Question answerQuestion = (Question) answer;
                optionsModel.addElement(answerQuestion.option);
            }
        }
        JComboBox<String> questionSelect = new JComboBox<>(optionsModel);
        questionSelect.setSelectedItem(null);
        
        
        questionSelect.setMaximumSize(questionSelect.getPreferredSize());
        questionSelect.setAlignmentX(CENTER_ALIGNMENT);
        questionLabel.setAlignmentX(CENTER_ALIGNMENT);
        questionPanel.setLayout(new BoxLayout(questionPanel, BoxLayout.Y_AXIS));
        
        //Estilo
        questionPanel.setBackground(color1);
        questionLabel.setForeground(color4);
        questionSelect.setBackground(color2);
        
        
        questionPanel.add(questionLabel);
        questionPanel.add(questionSelect);
        
        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.setBackground(color1);

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.CENTER;

        centerPanel.add(questionPanel, c);

        this.components.add(centerPanel);
        
        //this.mainPanel.add(questionPanel);
        QuestionsFrame frame = this;
        
        questionSelect.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    int selectedIndex = questionSelect.getSelectedIndex();
                    int size = frame.components.size();
                    for(int i=questions+1;i<size;i++) {
                        frame.components.remove(frame.components.size() - 1);
                    }
                    question.getAnswer(selectedIndex);
                    frame.renderQuestions();
                }
            }
        });
        
        this.renderQuestions();
        
        this.questions++;
    }
    
    public void renderQuestions() {
        JFrame frame = this;
        JPanel mainPanel = jPanel1;
        this.mainPanel = mainPanel;
        
        this.mainPanel.setBackground(color1); //Color fondo
        
        int panelComponents = this.mainPanel.getComponentCount();
        
        int pages = ((int) this.components.size()) / 4;
        pages = pages * 4 == this.components.size() ? pages - 1 : pages;
        int firstEl = pages * 4;
        int elCount = this.components.size() - pages * 4;
        
        this.firstEl = firstEl;
        this.elCount = elCount;
        this.pages = pages;
        this.currentPage = pages;
        this.renderComponents();
    }
    
    public void renderComponents() {
        this.mainPanel.removeAll();
        int firstEl = this.currentPage == pages ? this.firstEl : this.firstEl - 4;
        int elCount = this.currentPage == pages ? this.elCount : 4;
        for(int i=firstEl;i<firstEl+elCount;i++){
            this.mainPanel.add(this.components.get(i));
        }
        
        //int rows = ((float) this.questions - 4*this.pages) / 2 <= 1 ? 1 : Math.round(((float) this.questions - 4*this.pages)/2);
        //int cols = this.questions+1 < 2 ? this.questions+1 : 2;
        
        int rows = Math.round((float) elCount / 2);
        int cols = elCount < 2 ? 1 : 2;
        
        this.mainPanel.setLayout(new GridLayout(rows, cols));
        this.revalidate();
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        jMenuBar1.setAlignmentX(0.0F);

        jMenu1.setText("Ayuda");

        jMenuItem2.setText("Autor");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Sobre el programa");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Tutorial");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        TutorialFrame tutorial = new TutorialFrame();
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
