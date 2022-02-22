package com.company;

public class MobilePhone  implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn=false;


    public MobilePhone(int myNumber){
        this.myNumber=myNumber;
    }


    @Override
    public void powerOn() {
        isOn=true;
        System.out.println("Mobile phone powered Up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now ringing"+phoneNumber+"on deskphone");
        }else{
            System.out.println("phone is switched off");
        }
    }

    @Override
    public void answer() {
       if(isRinging){
           System.out.println("Answering the mobile phone");
          isRinging=false;


       }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
     if(phoneNumber==myNumber){
         isRinging=true;
         System.out.println("melody Ring");
     }else{
         isRinging=false;
     }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}