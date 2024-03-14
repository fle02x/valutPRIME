package com.example.valut;

/**
 * Application ListView
 * Created by EvILeg on 21.07.2015.
 */
public class DataFlags {

    private int flagID;
    private int nameID;
    private int abbreviationID;
    private int capitalID;

    public DataFlags (int _flagID, int _nameID, int _abbreviationID, int _capitalID){
        flagID = _flagID;
        nameID = _nameID;

        abbreviationID = _abbreviationID;
        capitalID = _capitalID;
    }

    public int getFlagID(){
        return flagID;
    }
    public int getCapitalID(){
        return capitalID;
    }
    public int getNameID(){
        return nameID;
    }

    public int getAbbreviationID() {
        return abbreviationID;
    }
}