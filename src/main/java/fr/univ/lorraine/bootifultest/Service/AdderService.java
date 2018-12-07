package fr.univ.lorraine.bootifultest.Service;

import org.springframework.stereotype.Service;

    @Service
    public class AdderService {
        private int num;
        public void baseNum() {
        }
        public int currentBase() { return num;
        }
        public int add(int adder) { return this.num + adder;
        }
        public int accumulate(int adder) { return this.num += adder;
        } }

