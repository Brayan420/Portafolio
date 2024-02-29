package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.modelo;
import views.Vista;

public class Controlador implements ActionListener {

    private Vista views;
    private modelo models;

    public Controlador(Vista views, modelo models) {
        this.views = views;
        this.models = models;
        this.views.btn_suma.addActionListener(this);
        this.views.btn_Resta.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        models.setNumero_uno(Integer.parseInt(views.cajaN1.getText()));
        models.setNumero_dos(Integer.parseInt(views.cajaN2.getText()));

        if (e.getSource() == views.btn_suma) {
            models.sumar();
            views.cajaRes.setText(String.valueOf(models.getResultado()));
        } else if (e.getSource() == views.btn_Resta) {
            models.restar();
            views.cajaRes.setText(String.valueOf(models.getResultado()));
        }
    }

}
