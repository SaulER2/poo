/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.darkem.poo;

/**
 *
 * @author emmanuel
 */
public class Questions {
    public Questions() {
        this.init();
    }
    public static void init() {
        Question mainQuestion = new Question("Preguntas iniciales", "Main");
        
        Question numeroPitidos = new Question("Numero de pitidos", "El problema son pitidos");
        Question opciones = new Question("Opciones", "ningun pitido");
        Answer speaker = new Answer("1) verifique bla bla bla", "ola.jpg", "Speaker no funcionando");
        opciones.addAnswer(speaker);
        numeroPitidos.addAnswer(opciones);
        mainQuestion.addAnswer(numeroPitidos);
        
        Question otros = new Question("Errores", "Otros errores");
        
        
        QuestionsFrame frame = new QuestionsFrame(mainQuestion);
    }
}
