/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.darkem.poo;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author emmanuel
 */
public class Answer {
    private String answer;
    private ImageIcon image;
    public String option;
    private Color color2 = new Color(230,230,230); //Principal: 276E90, Compl: CECFC9, OSCURO: 0A3143, CLARO: EFEFEF
    public Answer(String answer, String image, String option) {
        this.answer = answer;
        this.image = new ImageIcon(getClass().getResource("/com/darkem/poo/images/"+image));
        this.option = option;
    }
    
    public String getAnswer(QuestionsFrame frame) {
        //JOptionPane.showMessageDialog(null, this.answer, "Answer", JOptionPane.INFORMATION_MESSAGE);
        JPanel answerPanel = new JPanel();
        JLabel answer = new JLabel(this.answer);
        JLabel imageLabel = new JLabel(this.image);
        answerPanel.setBackground(color2);
        //answer.setForeground(Color.white);
        
        answerPanel.add(answer);
        answerPanel.add(imageLabel);
        JOptionPane.showOptionDialog(null, answerPanel, "Answer", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
        return this.answer;
    }
    
}
