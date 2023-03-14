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
        Question errores = new Question("Errores","Otros errores");
        Question hardwere = new Question("Hardwere","Hardwere");
        
        Question nPitidos = new Question("Opciones", "ningun pitido");
        
        //pendiente por rellenar (poner imagenes y el texto)
        Answer speaker = new Answer("<html>Razon:"
                + "<br>Speaker no funcionando"
                + "<br>Solución:"
                + "<br>1) verifique que el speaker este conectado correctamente a la placa base"
                + "<br>2)Pruebe el speaker con aplicaciones gratuitas como la descargable en: http://www.ajpdsoft.com/modules.php?name=news&file=article&sid=409#aplicacion"
                + "<br>3)De no haberse solucionado en el paso 1 o el speaker no funcione correctamente según la aplicación, cambie el speaker (Costo entre $15 y $25)", "speaker.jpg", "Speaker no funcionando");
        Answer pbDC = new Answer("", "","Placa base diferente a las comunes");
        Answer sSE = new Answer("", "","Sin suministro electrico");
        Answer pbD = new Answer("", "","Placa base deteriorada");
        
        //pendiente por rellenar (poner imagenes y el texto) 
        Answer pitidosC = new Answer("", "","Un pitido corto");
        Answer pitidosCon = new Answer("","","Un pitido continuo");
        Answer pitidosLa = new Answer("","","Un pitido largo");
        Answer pitidosLaCor = new Answer("","","Un pitido largo y un pitido corto");
        Answer pitidosLaDCor = new Answer("","","Un pitido largo y dos pitidos cortos");
        Answer pitidosDLaCor = new Answer("","","Dos pitidos largos y uno pitido corto");
        Answer pitidosDC = new Answer("","","Dos pitidos Cortos");
        Answer pitidosTC = new Answer("","","Tres pitidos Cortos");
        Answer pitidosCC = new Answer("","","Cuatro pitidos Cortos");
        Answer pitidosCinC = new Answer("","","Cinco pitidos Cortos");
        Answer pitidosSC = new Answer("","","Seis pitidos Cortos");
        Answer pitidosSieC = new Answer("","","Siete pitidos Cortos");
        Answer pitidosOC = new Answer("","","Ocho pitidos Cortos");
        Answer pitidosNC = new Answer("","","Nueve pitidos Cortos");
        Answer pitidosDiC = new Answer("","","Diez pitidos Cortos");
        Answer pitidosOnC = new Answer("","","Once pitidos Cortos");
        
        //pendiente por rellenar (poner imagenes y el texto)
        Answer pTC = new Answer("", "","Programas se tildan y cierran");
        Answer pC = new Answer("", "","Programas se cierran");
        Answer cRA = new Answer("", "","La computadora se reinicia automaticamente"); 
        Answer cAA = new Answer("", "","La computadora se reinicia automaticamente");
        Answer rEG = new Answer("", "","Ruidos extraños en el gabinete");
        Answer pCS = new Answer("", "","Pagina de inicio cambio sola");
        Answer pcE = new Answer("", "","PC no enciende");
        Answer eBE = new Answer("", "","Se escuchan beeps al encender");
        Answer pcRS = new Answer("", "","PC se reinicia sola");
        Answer pcAS = new Answer("", "","PC se apaga sola");
        
        //pendiente por rellenar (poner imagenes y el texto)
        Answer tR = new Answer("", "","El teclado no responde");
        Answer pcDR = new Answer("", "","Pc no detecta la ram");
        Answer pcDDD = new Answer("", "","Pc no detecta el disco duro");
        Answer pcTI = new Answer("", "","Pc no tiene internet");
        Answer pcEN = new Answer("", "","Pc no se escucha nada");
        Answer pcEV = new Answer("", "","Pc enciende y no da video");
        Answer pcVCF = new Answer("", "","Pc no da video y el cable vga si funciona");
        Answer pcVCRF = new Answer("", "","Pc no da video el cable vga y la memoria ram si funcionan");
        Answer pcNE = new Answer("", "","Pc no enciende");
        Answer pcADcF = new Answer("", "","Pc se apaga y el dispensador de calir funciona");
        Answer pcVCRTF = new Answer("", "","Pc no da video el cable vga,la memoria ram y trajeta de video si funcionan");
        Answer rP = new Answer("", "","Rallas en la pantalla");
        Answer rPMF = new Answer("", "","Rallas en la pantalla y el monitor funcionan");
        Answer rPMRF = new Answer("", "","Rallas en la pantalla,monitor y memoria ram funcionan");
        
        nPitidos.addAnswer(speaker);
        nPitidos.addAnswer(pbDC);
        nPitidos.addAnswer(sSE);
        nPitidos.addAnswer(pbD);
        
        numeroPitidos.addAnswer(nPitidos);
        numeroPitidos.addAnswer(pitidosC);
        numeroPitidos.addAnswer(pitidosCon);
        numeroPitidos.addAnswer(pitidosLa);
        numeroPitidos.addAnswer(pitidosLaCor);
        numeroPitidos.addAnswer(pitidosLaDCor);
        numeroPitidos.addAnswer(pitidosDLaCor);
        numeroPitidos.addAnswer(pitidosDC);
        numeroPitidos.addAnswer(pitidosTC);
        numeroPitidos.addAnswer(pitidosCC);
        numeroPitidos.addAnswer(pitidosCinC);
        numeroPitidos.addAnswer(pitidosSC);
        numeroPitidos.addAnswer(pitidosSieC);
        numeroPitidos.addAnswer(pitidosOC);
        numeroPitidos.addAnswer(pitidosNC);
        numeroPitidos.addAnswer(pitidosDiC);
        numeroPitidos.addAnswer(pitidosOnC);
        
        errores.addAnswer(pTC);
        errores.addAnswer(pC);
        errores.addAnswer(cRA);
        errores.addAnswer(cAA);
        errores.addAnswer(rEG);
        errores.addAnswer(pCS);
        errores.addAnswer(pcE);
        errores.addAnswer(eBE);
        errores.addAnswer(pcRS);
        errores.addAnswer(pcAS);
        
        hardwere.addAnswer(tR);
        hardwere.addAnswer(pcDR);
        hardwere.addAnswer(pcDDD);
        hardwere.addAnswer(pcTI);
        hardwere.addAnswer(pcEN);
        hardwere.addAnswer(pcEV);
        hardwere.addAnswer(pcVCF);
        hardwere.addAnswer(pcVCRF);
        hardwere.addAnswer(pcNE);
        hardwere.addAnswer(pcADcF);
        hardwere.addAnswer(pcVCRTF);
        hardwere.addAnswer(rP);
        hardwere.addAnswer(rPMF);
        hardwere.addAnswer(rPMRF);
        
        mainQuestion.addAnswer(numeroPitidos);
        mainQuestion.addAnswer(errores);
        mainQuestion.addAnswer(hardwere);
        
        
        
        Question otros = new Question("Errores", "Otros errores");
        
        
        QuestionsFrame frame = new QuestionsFrame(mainQuestion);
    }
}
