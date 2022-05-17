/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

/**
 *
 * @author user
 */
public class Hitung {
    public int gaji;
    public int kerja;
    public int thr;
   
   public int thr(){
          double thr = 0;
        
        if (kerja >= 12) {
            thr=gaji;
        }else
            if (kerja <12) {
            thr=(gaji/12)*kerja;
        }
        return (int) thr;
        
        
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public int getKerja() {
        return kerja;
        
    }

    public void setKerja(int kerja) {
        this.kerja = kerja;
    }
    
    public int getThr(){
       return thr;
    }
    public void setThr(int thr) {
        this.thr = thr;
        
    }

    }