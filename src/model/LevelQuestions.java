package model;

public class LevelQuestions {

    private Question[] questions;

    public LevelQuestions(int level){
        createQuestions(level);
    }

    public Question getRandomQuestion(){
        int random = (int)(Math.random()*questions.length);
        Question q = questions[random];
        return q;
    }

    private void createQuestions(int level){
        if(level == 1){
            //TODO Fragen hinzufügen
            questions = new Question[2];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schuuule findet der Info-LK statt?",answers1,"C");

            String[] answers2 = new String[4];
            answers2[0] = "Herr Geller";
            answers2[1] = "Herr Ambrosius";
            answers2[2] = "Herr Kneblewski";
            answers2[3] = "Herr Röckrath";
            questions[1] = new Question("Wie heißt der Lehrer im Info-LK?",answers2,"B");
        }else if(level == 2){
            //TODO Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "Daniel Kahl";
            answers1[1] = "Paul Stych";
            answers1[2] = "Noah Kaiser";
            answers1[3] = "David Zabudkin";
            questions[0] = new Question("Wer ist der Kurssprecher im Info-LK?",answers1,"A");
        }else if(level == 3){
            //TODO Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "N.31";
            answers1[1] = "N.34";
            answers1[2] = "N.33";
            answers1[3] = "N.32";
            questions[0] = new Question("In welchem Raum findet der Info-LK statt?",answers1,"C");
        }else if(level == 4){
            //TODO Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "7";
            answers1[1] = "3";
            answers1[2] = "4";
            answers1[3] = "6";
            questions[0] = new Question("Wie viele Schüler des Info-LKs sind auch im Mathe-LK?",answers1,"D");
        }else if(level == 5){
            //TODO Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
        }else if(level == 6){
            //TODO Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
        }else if(level == 7){
            //TODO Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
        }else if(level == 8){
            //TODO Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
        }else if(level == 9){
            //TODO Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
        }else if(level == 10){
            //TODO Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
        }else if(level == 11){
            //TODO Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
        }else if(level == 12){
            //TODO Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
        }else if(level == 13){
            //TODO Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
        }else if(level == 14){
            //TODO Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
        }else if(level == 15){
            //TODO Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
        }
    }
}
