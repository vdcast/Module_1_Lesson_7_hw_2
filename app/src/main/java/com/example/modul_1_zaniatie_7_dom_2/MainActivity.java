package com.example.modul_1_zaniatie_7_dom_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String text = " Машка, привет! Как ты? У Ани тут день рождения был, так я ей подарок так долго " +
                "выбирала... прямо в голову ничего не лезло. Короче, чайник ей купила. А че, классная тема " +
                "- всегда пригодится, и с размером угадывать не надо. Я думаю Юле тоже чайник подарить, " +
                "когда у нее ДР будет. Или кофеварку... Короче, что-нибудь в таком духе.";


        String requiredWord = "чайник";
        String checking1 = "";
        String checking2 = "";
        String word = "";

//index of our String massives are same for each name!!!
        String[] names = {"Ив","Ан","Кат","Юл","Ма","Пет","Вик"};
        String[] fullNames = {"Иван","Аня","Катя","Юля","Маша","Петя","Виктория"};

        ArrayList<String> foundNames = new ArrayList<>();


//loop for search requiredWord
        for (int i = 0; i < text.length(); i++ ){
            String textChar = text.substring(i, i+1);

//comparison to check if word is over
            if (textChar.equals(" ") || textChar.equals("!") || textChar.equals("?") ||
                    textChar.equals(".") || textChar.equals(",") || textChar.equals("-")){
                checking1 = "";
            }else {
                checking1 = checking1 + textChar;

//comparison for checking == requiredWord
                if (checking1.equals(requiredWord)){
                    Log.d("MYLOG", "Found word :) - " + requiredWord);

//loop for search people names in text
                    for (int u = 0; u < text.length(); u++){
                        String textChar2 = text.substring(u, u+1);

//comparison to check if word is over
                        if (textChar2.equals(" ") || textChar2.equals("!") || textChar2.equals("?") ||
                                textChar2.equals(".") || textChar2.equals(",") || textChar2.equals("-")){
                            checking2 = "";
                        }else {
                            checking2 = checking2 + textChar2;

//comparison for checking == any item from String[] names
                            for (int y = 0; y < names.length; y++){
                                if (checking2.equals(names[y])){

                                    //Log.d("MYLOG","Found name!");
                                    //Log.d("MYLOG", names[y]);
                                    //foundNames.add(names[y]);

                                    foundNames.add(fullNames[y]);

                                }
                            }
                        }
                    }

//use break to stop search requiredWord again, if it was found once
                    break;
                }
            }


        }

        Log.d("MYLOG", "Names of people, which we found in text:");

        for (String item : foundNames){
            Log.d("MYLOG", item);
        }


    }
}