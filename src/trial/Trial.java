package trial;

import server.model.ParseDatabase;
import server.referenceclass.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Timer;
import java.util.TimerTask;

public class Trial{
    public static void main(String[] args) {
        ParseDatabase parseDatabase = new ParseDatabase();
        parseDatabase.setConnection();
        parseDatabase.setHighScore(1,50);
    }
}
