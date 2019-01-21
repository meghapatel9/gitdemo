/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beads;

/**
 * A class to model Bead Objects. Beads have a colour and a single
 * letter on them. Example completed in class Week 1.
 * @author dancye, 2019
 */
public class Beads 
{

    private String colour;
    private char letter;

    /**
     * A constructor that takes in both of the fields
     * @param givenColour the new Bead's colour
     * @param givenLetter  the new Bead's letter
     */
    public Beads(String givenColour, char givenLetter)
    {
        colour = givenColour;
        letter = givenLetter;
    }
    /**
     * Getter for colour field
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * Setter for the colour field
     * @param givenColour the colour to set
     */
    public void setColour(String givenColour) {
        colour = givenColour;
    }

    /**
     * Getter for the letter field
     * @return the letter
     */
    public char getLetter() {
        return letter;
    }

    /**
     * Setter for the letter field
     * @param letter the letter to set
     */
    public void setLetter(char givenLetter) {
        letter = givenLetter;
    }
    
    
    
}
