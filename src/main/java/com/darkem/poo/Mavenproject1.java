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
                { "answer1": { answer: "ola", image: "/ola", option: "opt 1" } },
                { "answer2": {
                        question: "Test 1",
                        answers: [
                            { "answer3": { answer: "ola1", image: "/ola1", option: "opt 2 } }
                        ],
                        option: opt 3"
                    }
                }
            ]
        }
        */
        /*
        Answer answer1 = new Answer("ola", "ola1.jpg", "opt 1");
        
        Answer answer2 = new Answer("ola1", "ola.jpg", "opt 3");
        
        Answer[] answers2 = {answer2};
        
        Question question1 = new Question("Test 1", answers2, "opt 2");
        
        Object[] answers1 = {answer1, question1};
        
        Question question = new Question("Test", answers1, "New Option");
        
        question1.addAnswer(question);
        
        QuestionsFrame frame = new QuestionsFrame(question);
        */
        Question mainQuestion = new Question("Preguntas iniciales", "Main");
        
        Question numeroPitidos = new Question("Numero de pitidos", "El problema son pitidos");
        Question opciones = new Question("Opciones", "ningun pitido");
        Answer speaker = new Answer("1) verifique bla bla bla", "ola.jpg", "Speaker no funcionando");
        opciones.addAnswer(speaker);
        numeroPitidos.addAnswer(opciones);
        mainQuestion.addAnswer(numeroPitidos);
        
        Question otros = new Question("Errores", "Otros errores");
        
        
        //QuestionsFrame frame = new QuestionsFrame(mainQuestion);
        TutorialFrame frame = new TutorialFrame();
    }
}
