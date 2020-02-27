package com.aho.exam1.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class SequenceService {

    // return an array of size 5 that contains the five first sequences
    public int[] getSequences(int seq){
        int [] seqs  = new int[6];
        seqs[0]=seq;
        for (int i = 1; i < 6; i++) {

            seqs[i]= seqs[i-1] + (seqs[i-1]/100) + (seqs[i-1]%100)/10 + (seqs[i-1]%100)%10;

        }
        for (int i = 1; i < 6; i++) {
            System.out.println(seqs[i]);
        }

        return seqs;
    }

    // return the first common sequence if exist
    // retun -1 if there is no common sequence
    public int commonPoint(int[] i, int[] j){
        for (int k = 1; k < 6; k++) {
            for (int l = 1; l < 6; l++) {
                if (i[k]==j[l]){
                    return i[k];
                }
            }
        }
        return -1;
    }
}
