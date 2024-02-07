package datastructure.arraytopic;

import java.util.Arrays;

public class ArrayTopic1 {

    public static void display(char[] number){
        number[6] = 'G';
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] +" ");
        }
    }

    public static void main(String[] args) {
        char []number = new char[10];
        number[0] = 'A';
        number[1] = 'B';
        number[2] = 'C';
        number[3] = 'D';
        number[4] = 'E';
        number[5] = 'F';
        number[6] = 'F';
        number[7] = 'H';
        number[8] = 'I';
        number[9] = 'J';

        display(number);
    }
}
