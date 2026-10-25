

interface Device{
    default void start(){
        System.out.println("Device Started");
    }
}

interface Camera extends Device{
    default void start(){
        System.out.println("Camera Started");
    }
}

interface Alarm extends Device{
    default void start(){
        System.out.println("Alarm Started");
    }
}

class SmartSecuritySystem implements Alarm, Camera{
    @Override
    public void start(){
        Camera.super.start();
        Alarm.super.start();
        System.out.println("Security system ready");
    }
}

public class Main{
    public static void main(String[] args){
        SmartSecuritySystem s3= new SmartSecuritySystem();
        s3.start();
    }
}