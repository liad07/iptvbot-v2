package com.company;

import java.util.Scanner;

public class Main {
    //crack apps iptv 2
    //הוראות הפעלה: פתח את הקובץ README המצורף ובחר ערוץ שבאלך והכנס לתוכנית

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);

        String link;
        String chanel;
        link="https://liad07.github.io/crack-apps.github.io/assets/iptv/iptv%20project/";



        System.out.println("please enter the chanel");

        chanel=read.nextLine();
        if (chanel.equals("ספורט1")||chanel.equals("ספורט 1")||chanel.equals("51")){
            String tempch;
            System.out.println("did you mean sport 1 ? yes/no כן/לא");
            tempch=read.next();
            tempch=tempch.toLowerCase();
            if (tempch.equals("yes")||(tempch.equals("כן"))){
                chanel="sport1";
            }
        }
        if (chanel.equals("ספורט2")||chanel.equals("ספורט 2")||chanel.equals("52")){
            String tempch;
            System.out.println("did you mean sport 2 ? yes/no כן/לא");
            tempch=read.next();
            tempch=tempch.toLowerCase();
            if (tempch.equals("yes")||(tempch.equals("כן"))){
                chanel="sport2";
            }
        }
        if (chanel.equals("ספורט3")||chanel.equals("ספורט 3")||chanel.equals("53")){
            String tempch;
            System.out.println("did you mean sport 3 ? yes/no כן/לא");
            tempch=read.next();
            tempch=tempch.toLowerCase();
            if (tempch.equals("yes")||(tempch.equals("כן"))){
                chanel="sport3";
            }
        }
        if (chanel.equals("ספורט4")||chanel.equals("ספורט 4")||chanel.equals("54")){
            String tempch;
            System.out.println("did you mean sport 4 ? yes/no כן/לא");
            tempch=read.next();
            tempch=tempch.toLowerCase();
            if (tempch.equals("yes")||(tempch.equals("כן"))){
                chanel="sport4";
            }
        }
        if (chanel.equals("ספורט5")||chanel.equals("ספורט 5")||chanel.equals("55")){
            String tempch;
            System.out.println("did you mean sport 5 ? yes/no כן/לא");
            tempch=read.next();
            tempch=tempch.toLowerCase();
            if (tempch.equals("yes")||(tempch.equals("כן"))){
                chanel="sport5";
            }
        }
        if (chanel.equals("ספורט5פלוס")||chanel.equals("ספורט 5 פלוס")||chanel.equals("56")){
            String tempch;
            System.out.println("did you mean sport 5 plus ? yes/no כן/לא");
            tempch=read.next();
            tempch=tempch.toLowerCase();
            if (tempch.equals("yes")||(tempch.equals("כן"))){
                chanel="sport5plus";
            }
        }
        if (chanel.equals("ספורט5גולד")||chanel.equals("ספורט 5 גולד")||chanel.equals("57")){
            String tempch;
            System.out.println("did you mean sport 5 gold ? yes/no כן/לא");
            tempch=read.next();
            tempch=tempch.toLowerCase();
            if (tempch.equals("yes")||(tempch.equals("כן"))){
                chanel="sport5gold";
            }
        }
        if (chanel.equals("ספורט5לייב")||chanel.equals("ספורט 5 לייב")||chanel.equals("58")){
            String tempch;
            System.out.println("did you mean sport 5 live ? yes/no כן/לא");
            tempch=read.next();
            tempch=tempch.toLowerCase();
            if (tempch.equals("yes")||(tempch.equals("כן"))){
                chanel="sport5live";
            }
        }
        if (chanel.equals("כאן11")||chanel.equals("כאן 11")||chanel.equals("11")){
            String tempch;
            System.out.println("did you mean kan11 live ? yes/no כן/לא");
            tempch=read.next();
            tempch=tempch.toLowerCase();
            if (tempch.equals("yes")||(tempch.equals("כן"))){
                chanel="kan11";
            }
        }
        if (chanel.equals("קשת12")||chanel.equals("קשת 12")||chanel.equals("12")){
            String tempch;
            System.out.println("did you mean keshet12 ? yes/no כן/לא");
            tempch=read.next();
            tempch=tempch.toLowerCase();
            if (tempch.equals("yes")||(tempch.equals("כן"))){
                chanel="keshet12";
            }
        }
        if (chanel.equals("רשת13")||chanel.equals("רשת 13")||chanel.equals("13")){
            String tempch;
            System.out.println("did you mean reshet13 live ? yes/no כן/לא");
            tempch=read.next();
            tempch=tempch.toLowerCase();
            if (tempch.equals("yes")||(tempch.equals("כן"))){
                chanel="reshet13";
            }
        }
        if (chanel.equals("עכשיו14")||chanel.equals("עכשיו 14")||chanel.equals("14")){
            String tempch;
            System.out.println("did you mean now-14 ? yes/no כן/לא");
            tempch=read.next();
            tempch=tempch.toLowerCase();
            if (tempch.equals("yes")||(tempch.equals("כן"))){
                chanel="now-14";
            }
        }
        String str3="";
        if (chanel.equals("reshet13") ||chanel.equals("keshet12")||chanel.equals("now-14")||chanel.equals("kan-11")) {
            str3="news category";
            System.out.println(str3);
            System.out.println("the link is: "+(link+chanel.toLowerCase()));
        }
        if (chanel.equals("sport1")||chanel.equals("sport2")|| chanel.equals("sport3")||chanel.equals("sport4")||chanel.equals("sport5")||chanel.equals("sport5live")|| chanel.equals("sport5plus")||chanel.equals("sport5gold")){
            str3= "sport category";
            System.out.println(str3);
            System.out.println("the link is: "+(link+chanel.toLowerCase()));
        }

     if (str3.equals("sport category") || str3.equals("news category")){
    }
     else
     {
         System.out.println("the link is not found");

     }
  }
}

