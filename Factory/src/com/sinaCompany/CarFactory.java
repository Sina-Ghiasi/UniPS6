package com.sinaCompany;

public class CarFactory {

    public static Car getCar(int carModel) {
        if(carModel==0){
            return null;
        }
        else if(carModel==1){
            return new BMW();
        }
        else if(carModel==2){
            return new Benz();
        }
        else if(carModel==3){
            return  new Ferary();
        }
        else if(carModel==4){
            return new Porsche();
        }
        return null;
    }
}
