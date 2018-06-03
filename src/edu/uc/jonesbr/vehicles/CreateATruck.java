/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uc.jonesbr.vehicles;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author jonesb
 */
public class CreateATruck {

    public static void main(String[] args) {
        promptUser();
    }

    private static void promptUser() {
        
        String name = promptForName();
        
        // validate the name
        if (name == null || name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "You did not enter a name");
        } else {
            JOptionPane.showMessageDialog(null, "Welcome " + name);
        }
        
        String[] cab = new String[3];
        cab[0] = REGULAR;
        cab[1] = SUPERCAB;
        cab[2] = DOUBLE_CAB;

        Object selectedCab = JOptionPane.showInputDialog(null, "Choose a Cab Type", "Cab Selection", JOptionPane.QUESTION_MESSAGE, null, cab, SUPERCAB);

        String[] bedLength = new String[3];
        bedLength[0] = SHORT__BED;
        bedLength[1] = MEDIUM__BED;
        bedLength[2] = LONG__BED;

        final Object selectedBedLength = JOptionPane.showInputDialog(null, "Choose a Bed Length", "Bed Selection", JOptionPane.QUESTION_MESSAGE, null, bedLength, MEDIUM__BED);

        if (selectedCab.equals(DOUBLE_CAB) && selectedBedLength.equals(LONG__BED)) {
            bedAndCabError(selectedCab, selectedBedLength);
        } else if (selectedCab.equals(REGULAR) && selectedBedLength.equals(SHORT__BED)) {
            bedAndCabError(selectedCab, selectedBedLength);
        } else if (selectedCab.equals(SUPERCAB) && selectedBedLength.equals(SHORT__BED)) {
            bedAndCabError(selectedCab, selectedBedLength);
        } else {
            JOptionPane.showMessageDialog(null, "Your selections are valid.  Cab: " + selectedCab + " Bed: " + selectedBedLength);
        }

        String[] engine = new String[3];
        engine[0] = LITER_50;
        engine[1] = LITER_35;
        engine[2] = LITER_27;
        
        // prompt for engine size
        Object selectedEngine = JOptionPane.showInputDialog(null, "Choose a Engine Type", "Engine Selection", JOptionPane.QUESTION_MESSAGE, null, engine, LITER_50);
        
        // prompt for towing capacity
        final String strTowingCapacity = JOptionPane.showInputDialog("What towing capacity do you want?");
        int intTowingCapacity = Integer.parseInt(strTowingCapacity);
        
        if (intTowingCapacity >= 10000  && (selectedEngine.equals(LITER_50) || selectedEngine.equals(LITER_35))) {
            JOptionPane.showMessageDialog(null, "You have chosen a valid combination of towing capacity and engine size");
        } else if (intTowingCapacity >= 10000 && selectedEngine.equals(LITER_27)) {
            JOptionPane.showMessageDialog(null, "You will need a larger engine to tow that much weight.");
        }
         
        // set possible trim levels.
        String[] possibleTrimLevels = {LIMITED, PLATINUM, KING__RANCH, LARIAT, XLT, XL};
        
        
        // prompt the user for trim level.
        Object selectedTrim = JOptionPane.showInputDialog(null, "Choose a Trim Type", "Trim Selection", JOptionPane.QUESTION_MESSAGE, null, possibleTrimLevels, XL);
        // convert user's choice to a String.
        String trimLevel = selectedTrim.toString();
        
        StringBuilder selectedOptions = new StringBuilder();
        
        // build option packages based on trim selection.
        switch(trimLevel) {
            case LIMITED :
                selectedOptions.append("| Twin Moonroof |");
            case PLATINUM :
                selectedOptions.append("| Voice Activated Navigation |");
            case KING__RANCH :
                selectedOptions.append("| 5.0 V8 |");
            case LARIAT :
                selectedOptions.append("| Rear View Camera |");
            case XLT :
                selectedOptions.append("| Power Equipment |");
            case XL : 
                selectedOptions.append("| Automatic Transmission |");
            break;
            default :
                selectedOptions.append("I do not recognize this trim level.");
            break;
            
            
        }
        JOptionPane.showMessageDialog(null, "Selected Options: " + selectedOptions.toString());
        
    }
    public static final String XL = "XL";
    public static final String XLT = "XLT";
    public static final String LARIAT = "Lariat";
    public static final String KING__RANCH = "King Ranch";
    public static final String PLATINUM = "Platinum";
    public static final String LIMITED = "Limited";
    private static final String LITER_27 = "2.7 L";
    private static final String LITER_35 = "3.5 L";
    private static final String LITER_50 = "5.0 L";

    private static void bedAndCabError(Object selectedCab, final Object selectedBedLength) throws HeadlessException {
        JOptionPane.showMessageDialog(null, "Sorry, but you cannot choose both " + selectedCab + " and " + selectedBedLength, "Invalid Combination", JOptionPane.WARNING_MESSAGE);
    }

    private static final String LONG__BED = "Long Bed";
    private static final String MEDIUM__BED = "Medium Bed";
    private static final String SHORT__BED = "Short Bed";

    private static final String REGULAR = "Regular";
    private static final String SUPERCAB = "Supercab";
    private static final String DOUBLE_CAB = "Double Cab";

    private static String promptForName() {
        String name = JOptionPane.showInputDialog("What is your name?");
        
        if (name.length() < 2) {
            return null;
        } else {
            return name;
        }
    }

}