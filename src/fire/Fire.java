/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fire;

import java.awt.image.BufferedImage;
import java.util.Random;

/**
 *
 * @author usuario
 */
public class Fire extends BufferedImage implements Runnable {

    private int[][] fireTemperature;

    //setRate();
    //setFlamePalette();
    //flameEvolve()
    //createCool();
    //createSpark();
    //temperatureEvolve();
    //createFlameImage();
    public Fire(int i, int i1, int i2) {
        super(i, i1, i2);
        this.fireTemperature = new int[500][500];
    }

    public void createSpark() {
        for (int i = 0; i < this.fireTemperature.length; i++) {
            //GENERAMOS UNA PROBABILIDAD DE QUE UN PIXEL INICE UNA CHISPA
            Random rnd = new Random();
            int aux = rnd.nextInt(100) + 1;

            if (aux <= 15) {
                //TEMPERATURA ARBITRARIA EN LA ULTIMA FILA DEL ARRAY
                this.fireTemperature[this.fireTemperature[0].length][i] = 255;
            }
        }
    }
    
    public void createCool() {
        for (int i = 0; i < this.fireTemperature.length; i++) {
            //GENERAMOS UNA PROBABILIDAD DE QUE SE APAGUE UN PIXEL
            Random rnd = new Random();
            int aux = rnd.nextInt(100) + 1;

            if (aux <= 15) {
                //TEMPERATURA 0 EN LA ULTIMA FILA DEL ARRAY
                this.fireTemperature[this.fireTemperature[0].length][i] = 0;
            }
        }
    }
    
    //ALGORITMO QUE HACE EVOLUCIONAR LAS TEMPERATURAS
    public void evolveTemperature() {
        int[][] array = this.fireTemperature;
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[0].length-1; j++) {
                if (j==0) {
                    array[i][j] = 0;
                } else if (i==0) {
                    array[i][j] = (array[i][j+1]+array[i+1][j+1])/2;
                } else if (i==array.length) {
                    array[i][j] = (array[i][j+1]+array[i-1][j+1])/2;
                } else {
                    array[i][j] = (array[i-1][j+1]+array[i][j+1]+array[i+1][j+1])/3;
                }
            }
        }
    }
    
//    public void setFlamePalette() {
//        for(int i=0; i<this.fireTemperature.length; i++){
//            for(int j=0; i<this.fireTemperature[0].length; j++) {
//                this.fireTemperature[i][j] = 
//            }
//        }
//    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
