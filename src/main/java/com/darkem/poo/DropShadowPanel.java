package com.darkem.poo;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emmanuel
 */
public class DropShadowPanel extends JPanel {

private static final long serialVersionUID = 1L;
    public int pixels;
    public Color backgroundColor;

    public DropShadowPanel(int pix, Color backgroundColor) {
        this.pixels = pix;
        Border border = BorderFactory.createEmptyBorder(pixels, pixels, pixels, pixels);
        this.setBorder(BorderFactory.createCompoundBorder(this.getBorder(), border));
        this.setLayout(new BorderLayout());
        this.backgroundColor = backgroundColor;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        int topOpacity = 100;
        int borderRadius = 10;
        for (int i = 0; i < pixels; i++) {
            g2d.setColor(new Color(this.backgroundColor.getRed(), this.backgroundColor.getGreen(), this.backgroundColor.getBlue(), ((topOpacity / pixels) * i)));
            g2d.fill(new RoundRectangle2D.Double(i, i, this.getWidth() - ((i * 2) + 1), this.getHeight() - ((i * 2) + 1), borderRadius, borderRadius));
        }
        g2d.dispose();
    }

}