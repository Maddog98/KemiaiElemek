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
        //Varga Balázs

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
            char first = vjel.charAt(0);
            char last = vjel.charAt(vjel.length() - 1);
            //System.out.println(first+":"+last);
            String strFirst = "";
            String strLast = "";
            strFirst = String.valueOf(Character.toUpperCase(first));
            if (vjel.length() > 1) {
                strLast = String.valueOf(Character.toLowerCase(last));
            }
            vjel = strFirst + strLast;
            // System.out.println(vjel);
            if (vjel.matches("[a-zA-Z]{2}")) {
                jo = true;
            } else if (vjel.matches("[a-zA-Z]{1}")) {
                jo = true;
            }
        } while (jo == false);
        //6. feladat
        boolean megvan = false;
        int index = 0;
        while (megvan == false && index < elemek.size()) {
            if (vjel.equals(elemek.get(index).getVegyjel())) {
                megvan = true;
                System.out.println(elemek.get(index).getElem());
                System.out.println(elemek.get(index).getEv());
            }
            index++;
        }
        if (megvan == false) {
            System.out.println("Nincs ilyen elem!");
        }
        
        System.out.print("7. feladat: ");
        int max=0;
        for (int i=10;i<elemek.size();i++) {
            if((Integer.parseInt(elemek.get(i).getEv())-(Integer.parseInt(elemek.get(i-1).getEv())))>max){
                max=Integer.parseInt(elemek.get(i).getEv())-(Integer.parseInt(elemek.get(i-1).getEv()));
            }
        }
        System.out.println(max+" év volt a leghosszabb időszak 2 elem felfedezése között.");

    }

}
