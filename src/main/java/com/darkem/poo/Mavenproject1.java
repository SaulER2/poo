/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.darkem.poo;

/**
 *
 * @author emmanuel
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        /*
        question = {
            question: "Test",
            answers: [
                { "opt 1": { answer: "ola", image: "/ola" } },
                { "opt 2": {
                        question: "Test 1",
                        answers: [
                            { "opt 3": { answer: "ola1", image: "/ola1" } }
                        ]
                    }
                }
            ]
        }
        */
        
        Answer answer1 = new Answer("ola", "ola1.jpg");
        
        Answer answer2 = new Answer("ola1", "ola.jpg");
        
        Answer[] answers2 = {answer2};
        
        String[] options2 = {"opt 3"};
        
        Question question1 = new Question("Test 1", options2, answers2);
        
        Object[] answers1 = {answer1, question1};
        
        String[] options1 = {"opt 1", "opt 2"};
        
        Question question = new Question("Test", options1, answers1);
        
        question1.addAnswer("New Option", question);
        
        QuestionsFrame frame = new QuestionsFrame(question);
    }
}
