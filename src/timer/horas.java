/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class horas extends Thread {

    static int flag;
    static boolean res;
    public horas(int flag, boolean res) {
        this.flag = flag;
        this.res = res;
    }

    @Override
    public void run() {
        int hor = 0;
        while (true) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(horas.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (flag == 1) {
                hor += 1;
                Timer.sethor(hor);
                //System.out.println("Incremento hor....");
                flag = 0;

            }
            if (hor == 59) {
                Timer.sethor(0);
                hor = 0;
            }
            if(res){
            hor=0;
            res=false;
            }
        }
    }
}
