package edu.wctc.dice.impl;

import edu.wctc.dice.iface.DieRollerOutput;

import javax.swing.*;

public class DiePopUpOutput implements DieRollerOutput {

    public DiePopUpOutput() {
        System.out.println("PopupOutput constructor");
    }

    @Override
    public void getDieRollerOutput(String text) {
        JOptionPane.showMessageDialog(null, text);
    }
}
