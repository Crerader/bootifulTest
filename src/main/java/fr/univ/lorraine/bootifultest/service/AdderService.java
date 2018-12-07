package fr.univ.lorraine.bootifultest.service;

import org.springframework.stereotype.Service;

@Service
public class AdderService {

    //Random number
    private int num;

    /**
     * generate a random number
     */
    public void baseNum() {
        this.num = (int )Math.random()*100;
    }

    /**
     * @return random number generated
     */
    public int currentBase() {
        if(this.num == 0){
            this.baseNum();
        }
        return num;
    }

    /**
     * Add number
     * @param adder
     * @return result
     */
    public int add(int adder) {
        if(this.num == 0){
            this.baseNum();
        }
        return this.num + adder;
    }

    /**
     * Accumulate 
     * @param adder
     * @return
     */
    public int accumulate(int adder) {
        if(this.num == 0){
            this.baseNum();
        }
        return this.num += adder;
    }
}