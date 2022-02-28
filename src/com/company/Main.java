package com.company;

public class Main {

    public char[] alphabet = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Æ', 'Ø', 'Å'};
    public int[] numberCiphers = new int[30];

    public void cipherTest() {
        char soughtLetter = 'P';
        int soughtNumber = 7;

        System.out.println("The cipher of " + soughtLetter + " is: " + letter2number(soughtLetter));
        System.out.println("The alphabetical of " + soughtNumber + " is: " + number2letter(soughtNumber));

        System.out.println();
        System.out.println("Please enter next letter or cipher"); //Scanner osv.

    }

    public int letter2number(char soughtLetter) {
        int position = -1;
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == soughtLetter) {
                position = i;
                break;
            }
        }
        return position;
    }

    public char number2letter(int soughtNumber) {
        char revertedOutput = '*';
        for (int i = 0; i < numberCiphers.length; i++) {
            numberCiphers[i] = i;
            if (numberCiphers[i] == soughtNumber) {
                revertedOutput = (alphabet[i]);
                break;
            }
        }
        return revertedOutput;
    }

    public static void main(String[] args) {
        Main getMe = new Main();
        getMe.cipherTest();
    }
}
