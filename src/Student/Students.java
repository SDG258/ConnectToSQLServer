/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author Song Du
 */
public class Students {
    int ID;
    String Name;
    float Scores;
    String Picture;
    String Address;
    String Note;

    public Students() {
    }

    public Students(int ID, String Name, float Scores, String Picture, String Address, String Note) {
        this.ID = ID;
        this.Name = Name;
        this.Scores = Scores;
        this.Picture = Picture;
        this.Address = Address;
        this.Note = Note;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public float getScores() {
        return Scores;
    }

    public void setScores(float Scores) {
        this.Scores = Scores;
    }

    public String getPicture() {
        return Picture;
    }

    public void setPicture(String Picture) {
        this.Picture = Picture;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }
   
}
