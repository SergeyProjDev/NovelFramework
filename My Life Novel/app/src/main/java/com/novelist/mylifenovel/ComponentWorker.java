package com.novelist.mylifenovel;

import android.database.Cursor;
import android.view.View;

class ComponentWorker {

    public void initComponents(GameActivity ga){
        ga.output = ga.findViewById(R.id.output);
        ga.says = ga.findViewById(R.id.says);
        ga.sprite1 = ga.findViewById(R.id.sprite1);
        ga.sprite2 = ga.findViewById(R.id.sprite2);
        ga.sprite3 = ga.findViewById(R.id.sprite3);
        ga.choiceSprite = ga.findViewById(R.id.choiceSprite);
        ga.choice1Sprite = ga.findViewById(R.id.choice1Sprite);
        ga.choice1Text = ga.findViewById(R.id.choice1Text);
        ga.choice2Sprite = ga.findViewById(R.id.choice2Sprite);
        ga.choice2Text = ga.findViewById(R.id.choice2Text);
        ga.backGr = ga.findViewById(R.id.back);
        ga.save = ga.findViewById(R.id.saveBtn);
        ga.toMenu = ga.findViewById(R.id.homeBtn);
        ga.settings = ga.findViewById(R.id.settingsBtn);
        ga.menuBackground = ga.findViewById(R.id.background);
        ga.hideUI = ga.findViewById(R.id.hideElements);
        ga.backShot = ga.findViewById(R.id.backShot);
        ga.burgerMenu = ga.findViewById(R.id.showOrHideAll);
    }


    public void putText(String str, GameActivity ga){
        ga.hideUI.setVisibility(View.VISIBLE);
        if ((str.charAt(0)) =='#') {
            ga.hideUI.setVisibility(View.INVISIBLE);

            ga.choiceSprite.setVisibility(View.VISIBLE);

            String first = str.substring(1, str.indexOf("/"));
            ga.choiceFirst = Integer.parseInt(first.substring(first.indexOf("(")+1,first.indexOf(")")));
            first = first.substring(first.indexOf(")")+1);

            String second = str.substring(str.indexOf("/")+1);
            ga.choiceSecond = Integer.parseInt(second.substring(second.indexOf("(")+1,second.indexOf(")")));
            second = second.substring(second.indexOf(")")+1);

            ga.choice1Text.setText(first);
            ga.choice2Text.setText(second);

            ga.choice1Sprite.setVisibility(View.VISIBLE);
            ga.choice2Sprite.setVisibility(View.VISIBLE);
            ga.choice1Text.setVisibility(View.VISIBLE);
            ga.choice2Text.setVisibility(View.VISIBLE);

            ga.backGr.setEnabled(false);
            return;
        }
        if ((str.charAt(0)) == '<') {
            int choice = Integer.parseInt(str.substring(str.indexOf("<") + 1, str.indexOf(">")));
            ga.applyQuery("select * from "+GameActivity.day+" where choice = " + choice + ";");

            str = str.substring(str.indexOf(">") + 1);
        }
        ga.output.setText(str);
    }

    public void putSays(String str, GameActivity ga){
        if (str == null) {
            ga.says.setText("");
            ga.says.setVisibility(View.INVISIBLE);
            return;
        }

        int id = Integer.parseInt(str);

        Cursor queryResult;
        queryResult =  ga.db.rawQuery("select * from characters where id ="+id+";", null);
        queryResult.move(1);

        String name = queryResult.getString(1);

        ga.says.setVisibility(View.VISIBLE);
        ga.says.setText(name);
    }

    public void putSprites(String str, GameActivity ga) {
        if (str == null) {
            ga.sprite1.setVisibility(View.INVISIBLE);
            ga.sprite2.setVisibility(View.INVISIBLE);
            ga.sprite3.setVisibility(View.INVISIBLE);
            return;
        }

        if (str.matches("[0-9]+")) { //one sprite
            ga.sprite1.setVisibility(View.VISIBLE);
            ga.sprite1.setBackgroundResource(parseHelper(str, ga));
        }

        if (str.matches("[0-9]+[ ][0-9]+")) { //two sprites
            ga.sprite1.setVisibility(View.VISIBLE);
            ga.sprite2.setVisibility(View.VISIBLE);

            ga.sprite1.setBackgroundResource(parseHelper(str, ga));
            str = str.substring(0, str.indexOf(" ")+1);
            ga.sprite2.setBackgroundResource(parseHelper(str, ga));
        }

        if (str.matches("[0-9]+[ ][0-9]+[ ][0-9]+")) { //three sprites
            ga.sprite1.setVisibility(View.VISIBLE);
            ga.sprite2.setVisibility(View.VISIBLE);
            ga.sprite3.setVisibility(View.VISIBLE);

            ga.sprite1.setBackgroundResource(parseHelper(str, ga));
            str = str.substring(0, str.indexOf(" ")+1);
            ga.sprite2.setBackgroundResource(parseHelper(str, ga));
            str = str.substring(0, str.indexOf(" ")+1);
            ga.sprite3.setBackgroundResource(parseHelper(str, ga));
        }
    }

    public void putBackgr(String str, GameActivity ga){
        Cursor queryResult;
        int id, imageResource_id;
        String image;

        id = Integer.parseInt(str);
        if (id != ga.bgFlag){ // don`t update bg
            ga.bgFlag = id;

            queryResult =  ga.db.rawQuery("select * from backgrounds where id ="+id+";", null);
            queryResult.move(1);
            image = queryResult.getString(1);
            imageResource_id  = ga.getResources().getIdentifier(image, "drawable", ga.getPackageName());

            ga.backGr.setBackgroundResource(imageResource_id);
        }
    }

    private int musicPlaying;
    public void putMusic(String str, GameActivity ga){
        int id = Integer.parseInt(str);

        if (id == musicPlaying) return;

        Cursor queryResult;

        queryResult =  ga.db.rawQuery("select * from music where id ="+id+";", null);
        queryResult.move(1);
        String res = queryResult.getString(1);
        int res_id  = ga.getResources().getIdentifier(res, "raw", ga.getPackageName());

        musicPlaying = id;

        MusicPlayer.startMusic(res_id, ga);
    }

    public void startPlayingMusic(GameActivity ga){
        Cursor queryResult =  ga.db.rawQuery("select * from music where id ="+musicPlaying+";", null);
        queryResult.move(1);
        String res = queryResult.getString(1);
        int res_id  = ga.getResources().getIdentifier(res, "raw", ga.getPackageName());
        MusicPlayer.startMusic(res_id, ga);
    }



    private int parseHelper(String str, GameActivity ga){
        Cursor queryResult;
        int id, imageResource_id;
        String image;

        try{
            id = Integer.parseInt(str.substring(0, str.indexOf(" ")));
        } catch (Exception ex){ id = Integer.parseInt(str);}

        queryResult =  ga.db.rawQuery("select * from sprites where id ="+id+";", null);
        queryResult.move(1);
        image = queryResult.getString(1);
        imageResource_id  = ga.getResources().getIdentifier(image, "drawable", ga.getPackageName());
        return imageResource_id;
    }
}