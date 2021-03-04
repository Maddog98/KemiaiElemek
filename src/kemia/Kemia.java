package kemia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kemia {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("felfedezesek.csv");
        List<String> sorok = Files.readAllLines(path);
        List<KemiaiElem> elemek = new ArrayList<>();

        for (int i = 1; i < sorok.size(); i++) {
            elemek.add(new KemiaiElem(sorok.get(i)));
        }

        System.out.println("Elemek száma: " + elemek.size());

        int darabOkor = 0;
        for (KemiaiElem kemiaiElem : elemek) {
            if (kemiaiElem.getEv().equals("Ókor")) {
                darabOkor++;
            }
        }

        System.out.println("az Ókorban felfedezett elemek száma:" + darabOkor);

        System.out.println("5. feladat");
        Scanner be = new Scanner(System.in);
        String vjel = "";
        boolean jo = false;
        do {
            System.out.println("Kérek egy vegyjelet!");
            vjel = be.next();
            
           // System.out.println(vjel);

     
    
        char first =vjel.charAt(0);
        char last = vjel.charAt(vjel.length()-1);
        //System.out.println(first+":"+last);
        String strFirst = "";
        String strLast = "";
            strFirst=String.valueOf(Character.toUpperCase(first));
            if (vjel.length()>1) {
            strLast=String.valueOf(Character.toLowerCase(last));
            }
            vjel=strFirst+strLast;
       // System.out.println(vjel);
            if (vjel.matches("[a-zA-Z]{2}")) {
                jo = true;
            }else if (vjel.matches("[a-zA-Z]{1}")) {
                jo = true;
            } 
               
        } while (jo == false);
       

    }

}
