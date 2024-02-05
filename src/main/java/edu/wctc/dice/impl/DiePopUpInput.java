package edu.wctc.dice.impl;

import edu.wctc.dice.iface.DieRollerInput;

import javax.swing.*;

public class DiePopUpInput implements DieRollerInput {
    public DiePopUpInput() {
        System.out.println("PopupInput constructor");
    }

    @Override
    public String getDieRollerInput(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }
}

