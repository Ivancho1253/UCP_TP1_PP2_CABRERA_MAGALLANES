package com.example;

public class Clock {

    public int tic;

    public Clock(){
        
    }

    public int getTic() {
       return tic;
    }

    public void setTic(int tic) {
        this.tic = tic;
    }
    
    public void tic() {
       setTic(getTic() + 1);
    }


}