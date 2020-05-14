package solutions.configuration;

import com.sun.corba.se.spi.ior.ObjectKey;
import solutions.configuration.IRunnable;

import java.util.Collection;

public abstract class PrintArrayAbstractClass implements IRunnable {

    @Override
    public void print(){
        System.out.println();
    }

    public void print(Collection o){
        for(Object obj : o){
            System.out.print(obj+" ");
        }
    }
}
