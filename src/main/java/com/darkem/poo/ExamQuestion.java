/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.darkem.poo;

import java.util.ArrayList;

/**
 *
 * @author emmanuel
 */
public class ExamQuestion {
    ArrayList<String> answers = new ArrayList<String>();
    String question;
    
    public ExamQuestion(String question) {
        this.question = question;
    }
    
    public void addAnswer(String answer) {
        this.answers.add(answer);
    }
}
