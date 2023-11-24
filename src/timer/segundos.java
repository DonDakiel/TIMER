package timer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class segundos extends Thread {

    static int i;

 
    static boolean sec , res;

    public segundos(boolean flag) {
        this.sec = flag;
        
    }

    @Override
    public void run() {

        for (int i = 0; i < 60; i++) {
            if(res){
            this.i=0;
            res=false;
            }
            if (sec) {
                Timer.setsec(i);
                this.i = i;
            } else {
                i=this.i;
            }            
            try {
                segundos.sleep(5);

            } catch (InterruptedException ex) {
                Logger.getLogger(segundos.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (i == 59 && sec) {

                i = 0;
                Minutos.flag = 1;

            }
            
        }

    }
}
