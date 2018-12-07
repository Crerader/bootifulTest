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
        this.num = (int) (Math.random()*100);
        System.out.println(this.num);
    }

    /**
     * @return random number generated
     */
    public int currentBase() {
        if(this.num == 0){
            this.baseNum();
        }
        return this.num;
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