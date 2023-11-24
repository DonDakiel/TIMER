package timer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Minutos extends Thread {

    static int flag;
    static boolean res;
    public Minutos(int flag, boolean res) {
        this.flag = flag;
        this.res = res;
    }

    @Override
    public void run() {
        int min = 0;
        

        while(true) {
            
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Minutos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (flag == 1) {
                min += 1;
                Timer.setmin(min);
                flag = 0;
            }
            if (min == 59) {
                horas.flag = 1;
                
                Timer.setmin(0);
                min=0;
                
            }
            if(res){
            min=0;
            res=false;
            }
        }
    }
}
