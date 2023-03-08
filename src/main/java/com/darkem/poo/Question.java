/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.darkem.poo;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author emmanuel
 */
public class Question {
    public String question;
    private Object[] answers;
    public String[] options;
    
    //ArrayList<Object> answers = new ArrayList<Object>();
    //ArrayList<String> options = new ArrayList<String>();
    
    private QuestionsFrame frame;
    public Question(String question, String[] options, Object[] answers) {
        this.question = question;
        this.answers = answers;
        this.options = options;
    }
    public String getQuestion(QuestionsFrame frame) {
        this.frame = frame;
        /*
        String[] data = {question};
        //System.arraycopy(options, 0, data, 1, options.length);
        System.out.println(question);
        for(int i=0;i<options.length;i++) {
            System.out.print(i);
            System.out.print(": ");
            System.out.print(options[i]);
            System.out.println();
        }
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int option = Integer.parseInt(input);
        getAnswer(option);
*/
        
        frame.addQuestionPanel(this);
        return question;
    }
    public Object getAnswer(int option) {
        Object selectedAnswer = answers[option];
        if(selectedAnswer.getClass() == Answer.class) {
           Answer answer = (Answer) selectedAnswer;
           return answer.getAnswer(this.frame);
        }
        else if(selectedAnswer.getClass() == Question.class) {
            Question questionAnswer = (Question) selectedAnswer;
            return questionAnswer.getQuestion(this.frame);
        }
        return selectedAnswer;
    }
    
    public String addAnswer(String option, Object answer) {
        String[] newOptions = new String[this.options.length+1];
        Object[] newAnswers = new Object[this.answers.length+1];
        
        for(int i=0;i<this.options.length;i++) {
            newOptions[i] = this.options[i];
            newAnswers[i] = this.answers[i];
        }
        newOptions[this.options.length] = option;
        newAnswers[this.answers.length] = answer;
        
        this.options = newOptions;
        this.answers = newAnswers;
        
        return option;
    }
}
