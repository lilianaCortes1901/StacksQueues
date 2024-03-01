/*Q6: the genetic information in the RNA
sequence about a protein sequence to the ribosomes, the protein synthesis factories in the cell. It is coded
so that every three nucleotides(codon) correspond to one amino acid
*  */

import java.util.LinkedList;
import java.util.Queue;

public class RNAtoProteins {
    static void validTest(String s){
        //Constraint - all characters in DNA sequence are A, C, G, U
        if (s.contains("A") || s.contains("C") || s.contains("G") || s.contains("U")){
            System.out.println("Valid RNA Sequence");
            System.out.println("RNA Sequence: " + s);
        } else {
            System.out.println("Not Valid RNA Sequence");
        }
    }

    static void ProteinConvert(String s){
        Queue<String> Protein = new LinkedList<>();
        for (int i=0; i < s.length(); i++){
            if (s.contains("ATG") && s.contains("TGA") && s.length()%3 == 0){
                Protein.add(s);
                System.out.println("This is a valid protein.");
            } else if (s.contains("UAA") || s.contains("UAG") || s.contains("UGA")){
                Protein.add(".");
            }
        }
        System.out.println(Protein);
    }



    public static void main(String[] args){
        validTest("AGCUGGGAAACGUAGGCCUA");
        ProteinConvert("AGCUGGGAAACGUAGGCCUA");
    }
}
