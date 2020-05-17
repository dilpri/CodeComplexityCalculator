package my.CodeComplexityCalculator;

import java.io.BufferedReader;
import java.io.FileReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pancha27
 */
public class Cs {
    private int nKW = 0;
    private int wKW = 0;
    private int nId = 0;
    private int wId = 0;
    private int nOp = 0;
    private int wOp = 0;
    private int nNv = 0;
    private int wNv = 0;
    private int nSl = 0;
    private int wSl = 0;
    private int Cs = 0;
    Object f;
    
    
    //public Cs(int wes1) {
    // this.wKW=wes1;
    //}
    
      public int Cs() {
      return Cs;
    }


    public int getnKW() {
        return nKW;
    }
    
    public void setnKW(int nKW) {
        this.nKW = nKW;
    }
    
     public int getwKW() {
      // SizeComplexity obj=new SizeComplexity();
       // int s1=obj.Cs();
          wKW=nKW *1;
          return wKW;
    }

    public void setwKW(int wKW) {
        this.wKW = wKW;
    }

    public int getnId() {
        return nId;
    }

    public void setnId(int nId) {
        this.nId = nId;
    }

    public int getwId() {
        wId=nId*1 ;
        return wId;
    }

    public void setwId(int wId) {
        this.wId = wId;
    }

    
    public int getnOp() {
        return nOp;
    }

    public void setnOp(int nOp) {
        this.nOp = nOp;
    }
    
   public int getwOp() {
        wOp=nOp*1 ;
        return wOp;
    }

    public void setwOp(int wOp) {
        this.wOp = wOp;
    }


    public int getnNv() {
        return nNv;
    }

    public void setnNv(int nNv) {
        this.nNv = nNv;
    }
    
      public int getwNv() {
        wNv=nNv*1 ;
        return wNv;
    }

    public void setwNv(int wNv) {
        this.wNv = wNv;
    }

    public int getnSl() {
        return nSl;
    }

    public void setnSl(int nSl) {
        this.nSl = nSl;
    }
    public int getwSl() {
        wSl=nSl*1 ;
        return wSl;
    }

    public void setwSl(int wSl) {
        this.wSl = wSl;
    }
    
   public int getCs() {
        Cs=1;
        return Cs;
    }

    public void setCs(int Cs) {
        this.Cs = Cs;
    }
    
    @Override
    public String toString() {
        return "nKW= " + nKW +
                ",wKW=" + wKW +
                ",nId= " + nId +
                ",wId=" + wId +
                ", nOp= " + nOp +
                ", wOp=" + wOp +
                ", nNv= " + nNv +
                ", wNv=" + wNv +
                ", nSl= " + nSl +
                ", wSl=" + wSl +
                ", Cs=" + Cs;
    }

   
   
    

    

    
}

