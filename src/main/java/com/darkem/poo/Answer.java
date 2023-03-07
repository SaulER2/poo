/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.darkem.poo;

import javax.swing.JOptionPane;

/**
 *
 * @author emmanuel
 */
public class Answer {
    private String answer, image;
    public Answer(String answer, String image) {
        this.answer = answer;
        this.image = image;
    }
    public String getAnswer(QuestionsFrame frame) {
        /*
        String[] data = {answer, image};
        System.out.print("answer: ");
        System.out.print(answer);
        System.err.println();
        System.out.print("image: ");
        System.out.print(image);
        System.err.println();
        */
        JOptionPane.showMessageDialog(null, this.answer, "Answer", JOptionPane.INFORMATION_MESSAGE);
        return this.answer;
    }
}
