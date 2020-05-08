/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pancha27
 */
package my.CodeComplexityCalculator;

public class Cv {
    private int wvs=0;
    private int npdtv=0;
    private int wpdtv=0;
    private int ncdtv=0;
    private int wcdtv=0;
     private int Cv=0;


    public Cv() {
    }

    public int getWvs() {
        return wvs;
    }

    public void setWvs(int wvs) {
        this.wvs = wvs;
    }

    public int getNpdtv() {
        return npdtv;
    }

    public void setNpdtv(int npdtv) {
        this.npdtv = npdtv;
    }
    
     public int getWpdtv() {
         wpdtv=npdtv*10;
         return wpdtv;
    }

    public void setWpdtv(int wpdtv) {
        this.wpdtv = wpdtv;
    }
    

    public int getNcdtv() {
        return ncdtv;
    }

    public void setNcdtv(int ncdtv) {
        this.ncdtv = ncdtv;
    }
    
     public int getWcdtv() {
         wcdtv=ncdtv*2;
         return wcdtv;
    }

    public void setWcdtv(int wcdtv) {
        this.wcdtv = wcdtv;
    }
    

    
     public int getCv() {
        Cv=wvs*(wpdtv+wcdtv);
        return Cv;
    }

    public void setCv(int Cv) {
        this.Cv = Cv;
    }
    
    

    @Override
    public String toString() {
        return "wvs= " + wvs +
                ", npdtv= " + npdtv +
                ", wpdtv= " + wpdtv +                
                ", ncdtv= " + ncdtv  +
                ", wpdtv= " + wcdtv ;
    }


}

