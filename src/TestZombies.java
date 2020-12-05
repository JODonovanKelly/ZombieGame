import javax.swing.*;
import java.awt.*;
public class TestZombies{

    public static void main(String[] args) {
        Weapons w1 = new Weapons("Starting Pistol", "1", "1");
        Weapons w2 = new Weapons("Beginner Shotgun", "1", "2");
        Weapons w3 = new Weapons("Pro Sniper", "3", "2");
        Weapons w4 = new Weapons("Wayfarer Machine Gun", "3", "3");

        Board.Cell r = new Board.Cell("room", 0);
        Board.Cell d = new Board.Cell("door", 2);
        Board.Cell p = new Board.Cell("path", 0);
        Board.Cell s = new Board.Cell("spawner", 0);
        Board.Cell b = new Board.Cell("begin", 0);
        Board.Cell f = new Board.Cell("finish", 0);
        Board.Cell w = new Board.Cell("wall", 999);

        Board.Cell[][] theBoard = {

                { r, r, w, r, r, w, r, r, w, b, w},
                { r, r, w, r, r, w, r, r, w, p, w },
                { w, d, w, w, d, w, w, d, w, p, w},
                { s, p, p, p, p, p, p, p, p, p, s},
                { p, w, d, w, p, w, w, d, w, p, w},
                { p, w, r, w, p, w, r, r, w, p, w},
                { p, w, w, w, p, w, w, w, w, p, w},
                { s, p, p, p, p, p, p, p, p, p, s},
                { w, d, w, w, d, w, d, w, w, p, w},
                { r, r, w, r, r, w, r, r, w, p, w},
                { r, r, w, r, r, w, r, r, w, f, w}};



    }

}
