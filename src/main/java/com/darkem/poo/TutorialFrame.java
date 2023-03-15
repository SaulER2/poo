/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.darkem.poo;

import java.awt.Color;
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
public class TutorialFrame extends javax.swing.JFrame {
    private int questions = 0;
    ArrayList<JPanel> components = new ArrayList<JPanel>();
    int pages;
    private int currentPage = 0;
    private int firstEl;
    private int elCount;
    JPanel mainPanel;
    private Color color1 = new Color(39,110,114);
    private Color color2 = new Color(206,207,201);//Complementario
    private Color color3 = new Color(10,49,67);//Oscuro
    private Color color4 = new Color(239,239,239);//Claro

    /**
     * Creates new form QuestionsFrame
     */
    public TutorialFrame() {
        initComponents();
        Answer tutorialAnswer = new Answer("Este es un ejemplo de respuesta", "ola.jpg", "Esta es una opcion");
        Question tutorial = new Question("Esta es una pregunta", tutorialAnswer, "tutorial");
        tutorial.getQuestion(this);
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
        
        questionPanel.setBackground(color1);
        questionLabel.setForeground(color4);
        questionSelect.setBackground(color2);
        
        questionPanel.add(questionLabel);
        questionPanel.add(questionSelect);
        
        this.components.add(questionPanel);
        
        //this.mainPanel.add(questionPanel);
        TutorialFrame frame = this;
        
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
        this.mainPanel.setBackground(color1);
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
            .addGap(0, 414, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
