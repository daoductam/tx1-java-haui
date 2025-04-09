package controller;

import entity.Candidate;

import java.util.List;

public interface CandidateController {
    void nhap();

    void inData();

    void findByName(String name) ;

    Candidate findByEmail(String email) ;


    void deleteByEmail(String email);
}
