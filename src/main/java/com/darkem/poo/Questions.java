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
public class Questions {
    public static Answer[] answers; 
    private static Question getMainQuestion() {
        Question mainQuestion = new Question("Preguntas iniciales", "Main");
        
        Question numeroPitidos = new Question("Numero de pitidos", "El problema son pitidos");
        Question errores = new Question("Errores","Otros errores");
        Question hardwere = new Question("Hardwere","Hardwere");
        
        Question nPitidos = new Question("Opciones", "ningun pitido");
        
        Answer speaker = new Answer("<br>Solución:"
                + "<br>1) verifique que el speaker este conectado correctamente a la placa base"
                + "<br>2)Pruebe el speaker con aplicaciones gratuitas como la descargable en: http://www.ajpdsoft.com/modules.php?name=news&file=article&sid=409#aplicacion"
                + "<br>3)De no haberse solucionado en el paso 1 o el speaker no funcione correctamente según la aplicación, cambie el speaker (Costo entre $15 y $25)", "speaker.jpg", "Speaker no funcionando");
        Answer pbDC = new Answer("<br>Solución:"
                + "<br>Si la PC enciende y el speaker funciona: sin errores"
                + "<br>Hable con su proveedor para más información sobre su tarjeta madre", "mboard.jpg","Placa base diferente a las comunes");
        Answer sSE = new Answer("<br>solución:"
                + "<br>1)Verifique que el equipo está conectado a la corriente electrica"
                + "<br>2)Asegúrese de que todo esté conectado correctamente dentro de la PC (especialmente los cables unidos a la tarjeta madre)"
                + "<br>3)Revise si la fuente de poder funciona correctamente"
                + "<br>4)Reemplace la fuente de poder por otra del mismo tipo de ser necesario"
                + "<br>5)De haber cambiado la Fuente de Poder y persistir con el error, significa que la fuente dañada daño la tarjeta madre. Tendrá que reemplazarla", "contacto.jpg","Sin suministro electrico");
        Answer pbD = new Answer("<br>Solución:"
                + "<br>1)Si anteriormente no tuvo este problema reinicie la placa base"
                + "<br>En  la placa base hay un jumper (en caso de las Pentium D en adelante) o más de uno"
                + "<br>(si es de Pentium 4 para abajo)"
                + "<br>2)Apague la PC y busque uno que diga CMOS"
                + "<br>3)Retirela 5 minutos y coloquela nuevamente (Reinicia el software de arranque de la placa base -CMOS-)"
                + "<br>4)Encienda la PC y de continuar el problema, cambie la placa base para evitar el daño a los demás dispositivos", "mboard.jpg","Placa base deteriorada");
        
        Answer pitidosC = new Answer("<br>Solución:"
                + "<br>Todo bien !Felicidades¡", "bien.jpg","Un pitido corto");
        Answer pitidosCon = new Answer("<br>Solución:"
                + "<br>1)Verifique que el cooler o disparador este bien colocado"
                + "<br>2)De ser así puede que la fuente de poder este dañada. Pruebe la fuente de poder en otra pc"
                + "<br>3)Si la fuente de poder no funciona, reemplacela con otra similar"
                + "<br>4)De lo contrario, extraiga el cooler y reemplacelo","cool.jpg","Un pitido continuo");
        Answer pitidosLa = new Answer("<br>Solución:"
                + "<br>1)Para solucionar este problema apague la PC"
                + "<br>2)Retire la o las memorias RAM y limpie los pines con un borrador blanco"
                + "<br>3)Utilizando un producto limpiador de electrónicos, pase una pequeña franela por los contactos"
                + "<br>y el resto de cada módulo"
                + "<br>4) Espere un par de minutos y reinstale las memorias RAM","ram.jpg","Un pitido largo");
        Answer pitidosLaCor = new Answer("<br>Solución:"
                + "<br>1)Si anteriormente no tuvo este problema reinicie la placa base"
                + "<br>En la placa base hay un jumper (en caso de las Pentium D en adelante) o más de uno (si es de Pentium 4 para abajo)"
                + "<br>Apague la PC y busque uno que diga CMOS"
                + "<br>Retirela 5 minutos y coloquela nuevamente (Reinicia el software de arranque de la placa base -CMOS-)"
                + "<br>2) Encienda la PC y de continuar el problema, apague la PC y limpie la placa base con un limpiador de electrónicos o brocha"
                + "<br>3) Como último recurso, cambie la placa base para evitar el daño a los demás dispositivos","mboard.jpg","Un pitido largo y un pitido corto");
        Answer pitidosLaDCor = new Answer("<br>Solución:"
                + "<br>1) Coloque correctamente la tarjeta gráfica en la tarjeta madre"
                + "<br>Si aun no se soluciona:"
                + "<br>2)Verifique que la tarjeta sea compatible con su placa base, de lo contrario investigue con su proveedor las características"
                + "<br>de la tarjeta gráfica correcta y comprela"
                + "<br>3)Si la ranura de la tarjeta está defectuosa.Cambiela"
                + "<br>4)Si el problema persiste, el puerto de la tarjeta gráfica está fallando:"
                + "<br>Cambie la tarjeta madre o agregue una tarjeta gráfica externa","tarjetavideo.jpg","Un pitido largo y dos pitidos cortos");
        Answer pitidosDLaCor = new Answer("<br>Solución:"
                + "<br>Indefinida (Esto solo se puede dar en placas antiguas y es muy raro que ocurra)"
                + "<br>Consulte a un experto","mboard.jpg","Dos pitidos largos y uno pitido corto");
        Answer pitidosDC = new Answer("<br>Solución:"
                + "<br>Deshabilite la opción de paridad en el BIOS"
                + "<br>Al iniciar una computadora se le indica la tecla para entrar a su configuración","ram.jpg","Dos pitidos Cortos");
        Answer pitidosTC = new Answer("<br>Solución:"
                + "<br>1)Reemplazar la memoria RAM","ram.jpg","Tres pitidos Cortos");
        Answer pitidosCC = new Answer("<br>Solución:"
                + "<br>El reloj de la propia placa base esta estropeado, no hay mas solución que cambiar la placa"
                + "<br>No confundir con CMOS cheksum error una cosa es la pila y otra el contador o reloj de la placa base","mboard.jpg","Cuatro pitidos Cortos");
        Answer pitidosCinC = new Answer("<br>Solución:"
                + "<br>El procesador o la tarjeta gráfica se encuentran bloqueados. Consulte a un experto","tarjetavideo.jpg","Cinco pitidos Cortos");
        Answer pitidosSC = new Answer("<br>Solución:"
                + "<br>1)Conecte el teclado a otra PC para determinar su bien o mal funcionamiento"
                + "<br>de ser necesario reemplace el teclado defectuoso. Si el teclado funciona bien:"
                + "<br>2)Conectelo a la PC y reinicie el sistema"
                + "<br>3)De persistir el problema significa que el el puerto PS2 o USB del teclado está deteriorado. Cambie de puerto en uso","teclado.jpg","Seis pitidos Cortos");
        Answer pitidosSieC = new Answer("<br>Solución:"
                + "<br>Este problema se debe a que no se ha podido detectar el procesador o no funciona"
                + "<br>1)Apague la PC"
                + "<br>2) Asegurese de que está bien colocado en la placa base. De no haberse solucionado:"
                + "<br>3) Revise la configuración del procesador, de no estar correcta corríjala"
                + "<br>4)Si el problema persiste cambie el procesador","procesador.jpg","Siete pitidos Cortos");
        Answer pitidosOC = new Answer("<br>Solución:"
                + "<br>1)Verifique la existencia de la tarjeta de video"
                + "<br>2) De estar pero no ser detectada: Cambiamos de slot la tarjeta"
                + "<br>3)Si el error persiste revise que la tarjeta de video sea compatible de ser así"
                + "<br>posiblemente está dañada. Sustituyala","tarjetavideo.jpg","Ocho pitidos Cortos");
        Answer pitidosNC = new Answer("<br>Solución:"
                + "<br>Reemplace el chip","bioschip.jpg","Nueve pitidos Cortos");
        Answer pitidosDiC = new Answer("<br>Solución:"
                + "<br>La BIOS no puede leer / escribir los datos almacenados en la CMOS"
                + "<br>1)Intente borrar estos datos puenteando el jumper Clean CMOS o quitando la pila"
                + "<br>Si el problema persiste, cambie la placa ya que este chip viene siempre soldado","cmos-ram.jpg","Diez pitidos Cortos");
        Answer pitidosOnC = new Answer("<br>Solución:"
                + "<br>Reactivela mediante la combinación Control + Alt + Shift + I","sram.jpg","Once pitidos Cortos");
        
        Answer pTC = new Answer("<br>Solución:"
                + "<br>Podrías fijarte re-instalando el programa que funciona mal", "spy.jpg","Programas se tildan y cierran");
        Answer pC = new Answer("<br>Solución:"
                + "<br>Si notamos que el problema puede venir de la memoria RAM"
                + "<br>se le puede agregar mayor memoria virtual a la PC y así optimizar su rendimiento", "ram.jpg","Programas se cierran");
        Answer cRA = new Answer("<br>Solución:"
                + "<br>Correr los antivirus correspondientes", "anti.jpg","La computadora se reinicia automaticamente"); 
        Answer cAA = new Answer("<br>Solución:"
                + "<br>Una buena forma de evitarlo es mantener el interior del gabinete y el cooler limpios"
                + "<br>tener la CPU en un lugar ventilado, y evitar su exposición al huemo."
                + "<br>Si el problema persiste, el problema puede ser la fuente de la pc"
                + "<br>por lo que habría que chequear si ésta funciona correctamente o si está bien conectada", "bien.jpg","La computadora se apaga automaticamente");
        Answer rEG = new Answer("<br>Solución:"
                + "<br>Si no encontramos ninguna anormalidad en el gabinete"
                + "<br>fijar si hay algún hardware que no funcione bien, buscar los drivers"
                + "<br>si es muy complicado lo más conveniente es llamar al servicio técnico", "ga.jpg","Ruidos extraños en el gabinete");
        Answer pCS = new Answer("<br>Solución:"
                + "<br>Corriendo algún programa de diagnóstico"
                + "<br>se puede evitar la llamada al servicio técnico", "ini.jpg","Pagina de inicio cambio sola");
        Answer pcE = new Answer("<br>Solución:"
                + "<br>Es conveniente desconectar los periféricos Ópticos, Discos,ETC"
                + "<br>Para descartarlos directamente, en mi caso cuando surge este tipo de falla trato de iniciar la PC","en.jpg","PC no enciende");
        Answer eBE = new Answer("<br>Solución:"
                + "<br>el motherboard ya esta defectuoso"
                + "<br>lo más conveniente es reemplazar el motherboard", "pi.jpg","Se escuchan beeps al encender");
        Answer pcRS = new Answer("<br>Solución:"
                + "<br>Puede deberse a:"
                + "<br>Hardware dañada, fuente en mal estado, Controladores (Drivers) ocasionando conflictos"
                + "<br>Excesos de temperatura debido a un incorrecto flujo de aire en el gabinete", "rei.jpg","PC se reinicia sola");
        Answer pcAS = new Answer("<br>Solución:"
                + "<br>Es conveniente reemplazar la grasa térmica"
                + "<br>Suele secarse debido a las altas temperaturas", "en.jpg","PC se apaga sola");
        
        Answer tR = new Answer("<br>Solución:"
                + "<br>Conectar de nuevo el teclado ala pc o verificar que el puerto este funcionando correctamente"
                + "<br>probando con algun dispositivo extraible,si funciona el problema esta en teclado"
                + "<br>podria esta dañado o podrias probar en otra pc el mismo teclado", "teclado.jpg","El teclado no responde");
        Answer pcDR = new Answer("<br>Solución:"
                + "<br>Conectar de nuevo el teclado ala pc o"
                + "<br>verificar que el puerto este funcionando correctamente"
                + "<br>el problema deberia quedar resuelto", "ram.jpg","Pc no detecta la ram");
        Answer pcDDD = new Answer("<br>Solución:"
                + "<br>Se tiene que cambiar el sata o ide dependiendo de que tipo de disco"
                + "<br>se esta usando, si no se reconoce aun, podria estar dañado"
                + "<br>el disco duro o el slot al que se esta poniendo", "dd.jpg","Pc no detecta el disco duro");
        Answer pcTI = new Answer("<br>Solución:"
                + "<br>Instalar driver de red, de asuerdo asu hardware, buscar en la pg oficial de la motherboard"
                + "<br>se recomineda activar el adaptador, si es que esta desactivado"
                + "<br>si el problema aun sigue la  tarjeta podria estar dañada", "red.jpg","Pc no tiene internet");
        Answer pcEN = new Answer("<br>Solución:"
                + "<br>Verificar si el driver de sonido esta instalado"
                + "<br>si lo esta y aun persiste el problema"
                + "<br>probablemente las bocinas estan desactivadas o estan dañadas"
                + "<br>se recomienda cambiarlas", "bocinas.jpg","Pc no se escucha nada");
        Answer pcEV = new Answer("<br>Solución:"
                + "<br>Limpie los cabezales del cable y trate de conectar, si el problema persiste cambie de cable", "1vga.jpg","Pc enciende y no da video");
        Answer pcVCF = new Answer("<br>Solución:"
                + "<br>Retire la memoria de el slot en el que se encuentra, pase un borrador por sus ranuras"
                + "<br>limpielo con una brocha y empape con liquido dielectrico y deje secando"
                + "<br>Limpie slot de memoria ram. Si esto no funciona cambie de slot"
                + "<br>si esto no funciona cambie memoria ram", "ram.jpg","Pc no da video y el cable vga si funciona");
        Answer pcVCRF = new Answer("<br>Solución:"
                + "<br>Si su tarjeta esta soldada a la placa intente instalando una tarjeta dedicada"
                + "<br>Si usted ya tiene una tarjeta dedicada instalada en su equipo retirela de el slot en el que se encuentra"
                + "<br>pase un borrador por sus ranuras,limpielo con una brocha y empape con liquido dielectrico y deje secando"
                + "<br>Limpie slot de tarjeta. Si esto no funciona cambie de slot, si esto no funciona cambie tarjeta de video", "tarjetavideo.jpg","Pc no da video el cable vga y la memoria ram si funcionan");
        Answer pcNE = new Answer("<br>Solución:"
                + "<br>Habra su equipo, retire dispador de calor y cambie pasta termica que se pone sobre el procesador"
                + "<br>si esto no funciona cambie procesador", "fuente.jpg","Pc no enciende");
        Answer pcADcF = new Answer("<br>Solución:"
                + "<br>Problemas con procesador,Habra su equipo, retire disipador de calor y cambie pasta termica que se pone"
                + "<br>sobre el procesador, si esto no funciona cambie procesador", "proc.jpg","Pc se apaga y el dispensador de calor funciona");
        Answer pcVCRTF = new Answer("<br>Solución:"
                + "<br>Cambie motherboard", "mboard.jpg","Pc no da video el cable vga,la memoria ram y trajeta de video si funcionan");
        Answer rP = new Answer("<br>Solución:"
                + "<br>Cambie de monitor", "pant.jpg","Rallas en la pantalla");
        Answer rPMF = new Answer("<br>Solución:"
                + "<br>Retire la memoria de el slot en el que se encuentra, pase un borrador por sus ranuras"
                + "<br>limpielo con una brocha y empape con liquido dielectrico y deje secando"
                + "<br>Limpie slot de memoria ram. Si esto no funciona cambie de slot, si esto no funciona cambie memoria ram", "ram.jpg","Rallas en la pantalla y el monitor funcionan");
        Answer rPMRF = new Answer("<br>Solución:"
                + "<br>Si su tarjeta esta soldada a la placa intente instalando una tarjeta dedicada"
                + "<br>Si usted ya tiene una tarjeta dedicada instalada en su equipo retirela de el slot en el que se encuentra"
                + "<br>pase un borrador por sus ranuras,limpielo con una brocha y empape con liquido dielectrico y deje secando"
                + "<br>Limpie slot de tarjeta. Si esto no funciona cambie de slot, si esto no funciona cambie tarjeta de video", "tarjetavideo.jpg","Rallas en la pantalla,monitor y memoria ram funcionan");
        
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
        
        Answer[] answers = {
            speaker, 
            pbDC,
            sSE,
            pbD,
            pitidosC,
            pitidosCon,
            pitidosLa,
            pitidosLaCor,
            pitidosLaDCor,
            pitidosDLaCor,
            pitidosDC,
            pitidosTC,
            pitidosCC,
            pitidosCinC,
            pitidosSC,
            pitidosSieC,
            pitidosOC,
            pitidosNC,
            pitidosDiC,
            pitidosOnC,
            pTC,
            pC,
            cRA,
            cAA,
            rEG,
            pCS,
            pcE,
            eBE,
            pcRS,
            pcAS,
            tR,
            pcDR,
            pcDDD,
            pcTI,
            pcEN,
            pcEV,
            pcVCF,
            pcVCRF,
            pcNE,
            pcADcF,
            pcVCRTF,
            rP,
            rPMF,
            rPMRF
        };
        Questions.answers = answers;
        return mainQuestion;
    }
    public static void init() {
        Question mainQuestion = getMainQuestion();
        QuestionsFrame frame = new QuestionsFrame(mainQuestion);
    }
    public static void initTest() {
        Question mainQuestion = getMainQuestion();
        TestFrame frame = new TestFrame(mainQuestion, Questions.answers);
    }
}