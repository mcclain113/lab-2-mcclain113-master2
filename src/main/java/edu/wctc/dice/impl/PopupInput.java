package edu.wctc.dice.impl;

import edu.wctc.dice.iface.DieRollerInput;
import edu.wctc.dice.iface.GameInput;

import javax.swing.*;


public class PopupInput implements GameInput {

    public PopupInput() {
        System.out.println("PopupInput constructor");
    }

    @Override
    public String getInput(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }

}

