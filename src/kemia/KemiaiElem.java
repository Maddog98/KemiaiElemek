
package kemia;

public class KemiaiElem {
    private String ev;
    private String elem;
    private String vegyjel;
    private int rendszam;
    private String felfedezo;

    public KemiaiElem(String sor) {
        String [] s= sor.split(";");
        this.ev = s[0];
        this.elem = s[1];
        this.vegyjel = s[2];
        this.rendszam = Integer.parseInt(s[3]);
        this.felfedezo = s[4];
    }
    
    
    @Override
    public String toString() {
        return "KemiaiElem{" + "ev=" + ev + ", elem=" + elem + ", vegyjel=" + vegyjel + ", rendszam=" + rendszam + ", felfedezo=" + felfedezo + '}';
    }

    public String getEv() {
        return ev;
    }

    public String getElem() {
        return elem;
    }

    public String getVegyjel() {
        return vegyjel;
    }

    public int getRendszam() {
        return rendszam;
    }

    public String getFelfedezo() {
        return felfedezo;
    }

    
}
