/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.darkem.poo;

import java.awt.Color;
import java.awt.event.WindowEvent;

import javax.swing.*;

/**
 *
 * @author emmanuel
 */
public class Answer {
    public String answer;
    private ImageIcon image;
    public String option;
    private Color color2 = new Color(10,49,67);
    private Color color4 = new Color(239,239,239);
    public Answer(String answer, String image, String option) {
        this.answer = answer;
        this.image = new ImageIcon(getClass().getResource("/com/darkem/poo/images/"+image));
        this.option = option;
    }
    
    public String getAnswer(BaseFrame frame) {
        //JOptionPane.showMessageDialog(null, this.answer, "Answer", JOptionPane.INFORMATION_MESSAGE);
        JPanel answerPanel = new JPanel();
        JLabel answer = new JLabel(this.answer);
        String correctAnswer = "";
        if(frame.getClass() == TestFrame.class) {
            if(this.answer == frame.answerText) {
                correctAnswer = "<h1>Obtuviste la respuesta deseada</h1><br>";
            }
            else {
                correctAnswer = "<h1>Esta no es la respuesta deseada</h1><br>";
            }
        }
        answer.setText("<html>" + correctAnswer + "Razón:<br>"+this.option+"<br>"+this.answer);
        JLabel imageLabel = new JLabel(this.image);
        answerPanel.setBackground(color2);
        answer.setForeground(color4);
        
        answerPanel.add(answer);
        answerPanel.add(imageLabel);
        JOptionPane.showOptionDialog(null, answerPanel, this.option, JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
        return this.answer;
    }
    
    public String getAnswer(TutorialFrame frame) {
        //JOptionPane.showMessageDialog(null, this.answer, "Answer", JOptionPane.INFORMATION_MESSAGE);
        JPanel answerPanel = new JPanel();
        JLabel answer = new JLabel(this.answer);
        answer.setText("<html>Razón:<br>"+this.option+"<br><br>Solución:<br>"+this.answer);
        JLabel imageLabel = new JLabel(this.image);
        answerPanel.setBackground(color2);
        answer.setForeground(color4);
        
        answerPanel.add(answer);
        answerPanel.add(imageLabel);
        int selection = JOptionPane.showOptionDialog(null, answerPanel, "Opciòn elegida", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
        if(selection >= 0) {
            Questions questions = new Questions();
            questions.init();
            frame.dispose();
        }
        return this.answer;
    }
}
