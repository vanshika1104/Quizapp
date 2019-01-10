package com.transparentapps.myapplication1;

public class Questions {
    public String myQuestions[] ={
            "In android studio, callback that is called when activity interaction with user is started is?",
            "Tab that can be used to do any task that can be done from DOS window is?",
            "Tab that shows hierarchy of project is?",
            "In android, compiled code is executed by part of android system called?",
            "A part of android studio, that work as a simulator for android devices is called?",
            "Space between edge to of widget content of widget can be customized using?",
            "By default in android studio during app development, file that holds information about app's fundamental features and components is?",
            "Underlying operating system for android is?",
            "Android component that manages appearance and format on screen is called?",
            "A method that is used to handle what happens after clicking a button is?",
            "A type of layout elements that allows all included elements in order is?",
    };

    private String choices[][]={
            {"onStart", "onStop", "onResume", "onDestroy"},
            {"TODO","messages","terminal","comments"},
            {"Build variants", "Structure", "Favorites", "Project"},
            {"DEX", "DVM", "JDK", "API"},
            {"driver", "emulator", "stub", "firmware"},
            {"margins", "height", "padding" ,"weight"},
            {"AndroidManifest.xml" , "res/values" , "Build.gradle" , "res/layout"},
            {"Linux" , "Windows" , "Contiki" , "Ubuntu"},
            {"fragment" , "intent" , "view" , "layout"},
            {"OnCreate" , "onSelect" , "onClick" , "onDo"},
            {"ConstraintLayout" , "TextviewLayout" , "LinearLayout" , "RelativeLayout"}
    };

    private String answers[] = {
            "onResume",
            "terminal",
            "Structure",
            "DVM",
            "emulator",
            "padding",
            "AndroidManifest.xml",
            "Linux",
            "layout",
            "onClick",
            "LinearLayout",
    };
    public String getQuestion(int a){
        String question = myQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice = choices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = choices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = choices[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = choices[a][3];
        return choice;
    }

    public String getAnswer(int a ){
        String answer = answers[a];
        return answer;
    }

    public String[] getChoices(int a){
        String options[] = choices[a];
        return options;
    }
}
