/*Q5: Write a program that given a String representation of DNA sequence and returns
* its transcribed RNA sequence.*/

import java.util.*;

public class DNAtoRNA {
    static void RNAConvert(String a){
        //Constraint - all characters in DNA sequence are A, C, G, T
        if (a.contains("A") || a.contains("C") || a.contains("G") || a.contains("T")){
            System.out.println("Valid DNA Sequence");
        } else {
            System.out.println("Not Valid DNA Sequence");
        }
        //Set Queues for DNA and RNA
        Deque<String> DNA = new LinkedList<>(); //O(1)
        Deque<String> RNA = new LinkedList<>(); //O(1)
        //looping through Queue to find letters to swap
        DNA.add(a); //O(1)
        System.out.println("DNA Sequence: " + DNA); //O(1)
        for (int i = 0; i < a.length(); i++){ //O(n)
            String check = DNA.peek(); //O(1)
            if (check.charAt(i) == 'T'){
                RNA.add(check = String.valueOf('U')); //O(1)
            } else {
                RNA.add(check); //O(1)
            }
        }
        System.out.println("Transcribed RNA Sequence: "+ RNA);
    }
    /*if(check.charAt(i) == 'A' || check.charAt(i) == 'C' || check.charAt(i) == 'G'){
        RNA.add(check);
    }*/

    public static void main(String[] args){
        RNAConvert("AGCTGGGAAACGTAGGCCTA");
        RNAConvert("TTTTTTTTTTGGCGCG");
        RNAConvert("CTTTGGGACTAGTAACCCATTTCGGCT");
        RNAConvert("FBJHKLIOP");
    }
}


/*If invalid DNA sequence is passed as an argument, return -1
* Collections.swap wouldn't work in switching the T for U in the sequence
* because it only swaps values within the Queue by index value.*/