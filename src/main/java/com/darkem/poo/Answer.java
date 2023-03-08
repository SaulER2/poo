/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.darkem.poo;

import javax.swing.*;

/**
 *
 * @author emmanuel
 */
public class Answer {
    private String answer;
    private ImageIcon image;
    public Answer(String answer, String image) {
        this.answer = answer;
        this.image = new ImageIcon(getClass().getResource("/com/darkem/poo/images/"+image));
    }
    public String getAnswer(QuestionsFrame frame) {
        //JOptionPane.showMessageDialog(null, this.answer, "Answer", JOptionPane.INFORMATION_MESSAGE);
        JPanel answerPanel = new JPanel();
        JLabel answer = new JLabel(this.answer);
        JLabel imageLabel = new JLabel(this.image);
        
        answerPanel.add(answer);
        answerPanel.add(imageLabel);
        JOptionPane.showOptionDialog(null, answerPanel, "Answer", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
        return this.answer;
    }
}
