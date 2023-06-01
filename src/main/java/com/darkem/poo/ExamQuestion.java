/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.darkem.poo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author emmanuel
 */
public class ExamQuestion extends JPanel {
    ArrayList<String> answers = new ArrayList<String>();
    String correctAnswer;
    String question;
    JPanel answersPanel = new JPanel();
    ButtonGroup group = new ButtonGroup();
    
    public ExamQuestion(String question) {
        super();
        this.question = question;
        this.setLayout(new BorderLayout());
        this.setOpaque(false);
        
        JLabel text = new JLabel(question);
        this.add(text, BorderLayout.NORTH);
        this.add(answersPanel);
    }
    
    public void addAnswer(String answer) {
        if(answers.size() == 0) this.correctAnswer = answer;
        this.answers.add(answer);
    }
    
    public void createGroup() {
        answersPanel.setLayout(new GridLayout(this.answers.size(), 1));
        Random rnd = new Random();
        Collections.shuffle(answers, rnd);
        for (String answer : answers) {
            JRadioButton answerButton = new JRadioButton(answer);
            group.add(answerButton);
            answersPanel.add(answerButton);
        }        
        
        this.revalidate();
        this.repaint();
    }
}
