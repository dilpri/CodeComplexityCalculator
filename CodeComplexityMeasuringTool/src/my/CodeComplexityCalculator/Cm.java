package my.CodeComplexityCalculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pancha27
 */

public class Cm {
    private int wmrt;
    private int npdtp;
    private int wpdtp;
    private int ncdtp;
    private int wcdtp;
    private int Cm;

    public Cm() {
    }

    public int getWmrt() {
        return wmrt;
    }

    public void setWmrt(int wmrt) {
        this.wmrt = wmrt;
    }

    public int getNpdtp() {
        return npdtp;
    }

    public void setNpdtp(int npdtp) {
        this.npdtp = npdtp;
    }
    
    public int getwpdtp() {
        wpdtp= npdtp*1;
        return wpdtp;
    }

    public void setwpdtp(int wpdtp) {
        this.wpdtp = wpdtp;
    }
    

    public int getNcdtp() {
        return ncdtp;
    }

    public void setNcdtp(int ncdtp) {
        this.ncdtp = ncdtp;
    }
    
    
    
    public int getWcdtp() {
        wcdtp= ncdtp*1;
        return wcdtp;
    }

    public void setWcdtp(int wcdtp) {
        this.wcdtp = wcdtp;
    }
    
     public int getCm() {
        Cm=wmrt+(wpdtp+wcdtp);
        return Cm;
    }

    public void setCm(int Cm) {
        this.Cm = Cm;
    }

    @Override
    public String toString() {
        return "wmrt =" + wmrt +
                ", npdtp =" + npdtp +
                ", wpdtp =" + wpdtp +
                ", ncdtp =" + ncdtp +
                 ", wcdtp =" + wcdtp +
                ",Cm= " + Cm;
    }

    
}

