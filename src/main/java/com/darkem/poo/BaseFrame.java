/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.darkem.poo;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author emmanuel
 */
public class BaseFrame extends JFrame {
    public int questions = 0;
    ArrayList<JPanel> components = new ArrayList<JPanel>();
    int pages;
    public int currentPage = 0;
    public int firstEl;
    public int elCount;
    JPanel mainPanel;
    //private Color color1 = new Color(5,16,148);
    public Color color1 = new Color(5,16,148);//Principal
    public Color color2 = new Color(206,207,201);//Complementario
    public Color color3 = new Color(10,49,67);//Oscuro
    public Color color4 = new Color(239,239,239);//Claro
    
    public void renderComponents() {
        this.mainPanel.removeAll();
        //int firstEl = this.currentPage == pages ? this.firstEl : this.firstEl - 4;
        //int elCount = this.currentPage == pages ? this.elCount : 4;


        // Cambiar el administrador de diseño a GridBagLayout
        this.mainPanel.setLayout(new GridBagLayout());

        // Establecer la posición de cada componente en el panel
        GridBagConstraints gbc = new GridBagConstraints();
        for (int i = 0; i < elCount; i++) {
            gbc.gridx = i;
            gbc.gridy = i;
            gbc.anchor = GridBagConstraints.WEST; // Establecer la alineación a la izquierda
            gbc.fill = GridBagConstraints.HORIZONTAL; // Establecer el relleno horizontal
            gbc.weightx = 1.0;
            this.mainPanel.add(this.components.get(i), gbc);
        }

        this.revalidate();
        this.repaint();
    }
    
    public void renderQuestions(JPanel mainPanel) {
        this.mainPanel = mainPanel;
        this.renderQuestions();
    }
    
    public void addQuestionPanel(Question question, JPanel mainPanel) {
        this.mainPanel = mainPanel;
        final int questions = this.questions;
        DropShadowPanel questionPanel = new DropShadowPanel(10, new Color(230, 233, 237));
        //questionPanel.setLayout(new GridLayout(2, 1));
        JLabel questionLabel = new JLabel(question.question);
        DefaultComboBoxModel<String> optionsModel = new DefaultComboBoxModel<>();
        for(int i=0;i<question.answers.length;i++) {
            Object answer = question.answers[i];
            if(answer.getClass() == Answer.class) {
                Answer answerAnswer = (Answer) answer;
                optionsModel.addElement(answerAnswer.option);
            }
            else if(answer.getClass() == Question.class) {
                Question answerQuestion = (Question) answer;
                optionsModel.addElement(answerQuestion.option);
            }
        }
        JComboBox<String> questionSelect = new JComboBox<>(optionsModel);
        questionSelect.setSelectedItem(null);
        
        
        questionSelect.setMaximumSize(questionSelect.getPreferredSize());
        questionSelect.setAlignmentX(CENTER_ALIGNMENT);
        questionLabel.setAlignmentX(CENTER_ALIGNMENT);
        questionPanel.setLayout(new BoxLayout(questionPanel, BoxLayout.Y_AXIS));
        
        //Estilo
        //questionPanel.setBackground(color1);
        //questionPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        questionLabel.setForeground(new Color(0, 0, 0));
        questionSelect.setBackground(color2);
        
        
        questionPanel.add(questionLabel);
        questionPanel.add(questionSelect);
        
        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.setBackground(color1);

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.CENTER;

        centerPanel.add(questionPanel, c);

        this.components.add(centerPanel);
        
        //this.mainPanel.add(questionPanel);
        BaseFrame frame = this;
        
        questionSelect.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    int selectedIndex = questionSelect.getSelectedIndex();
                    int size = frame.components.size();
                    for(int i=questions+1;i<size;i++) {
                        frame.components.remove(frame.components.size() - 1);
                    }
                    question.getAnswer(selectedIndex);
                    frame.renderQuestions();
                }
            }
        });
        
        this.renderQuestions();
        
        this.questions++;
    }

    private void renderQuestions() {
        this.mainPanel.setBackground(color1); //Color fondo
        
        int panelComponents = this.mainPanel.getComponentCount();
        
        int pages = ((int) this.components.size()) / 4;
        pages = pages * 4 == this.components.size() ? pages - 1 : pages;
        int firstEl = pages * 4;
        int elCount = this.components.size() - pages * 4;
        
        this.firstEl = firstEl;
        this.elCount = elCount;
        this.pages = pages;
        this.currentPage = pages;
        this.renderComponents();
    }
}
