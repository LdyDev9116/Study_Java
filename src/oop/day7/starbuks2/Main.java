package oop.day7.starbuks2;

public class Main {
    public static void main(String[] args) {
        Wifi internet = new Wifi();
        MyNotebook myNotebook = new MyNotebook(internet);
        YourNoteBook yournotebook = new YourNoteBook(internet);

        myNotebook.openBrowser();
        yournotebook.openKakaTalk();


    }
}
