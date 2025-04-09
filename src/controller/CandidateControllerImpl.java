package controller;

import entity.Candidate;
import entity.ExperienceCandidate;
import entity.FresherCandidate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateControllerImpl implements CandidateController{
    private static Scanner sc = new Scanner(System.in);
    private List<Candidate> candidates = new ArrayList<>();
    static int tuychon;;
    @Override
    public void nhap() {

        System.out.println("Nhap\n\t1.Fresher\n2.Experience");
        sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Nhap Last Name: ");
        String lastName = sc.nextLine();
        System.out.println("Nhap phone: ");
        String phone = sc.nextLine();
        System.out.println("Nhap email: ");
        String email = sc.nextLine();
        if (tuychon==2) {
            System.out.println("Nhap Exp In Year: ");
            int expIntYear = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhap pro skill: ");
            String proSkill = sc.nextLine();
            candidates.add(new ExperienceCandidate(firstName, lastName,phone
            ,email,expIntYear,proSkill));
        }

        if (tuychon==1) {
            System.out.println("Nhap Graduation Rank: ");
            String graduationRank = sc.nextLine();
            candidates.add(new FresherCandidate(firstName, lastName,phone,
                    email,graduationRank));
        }
    }

    public CandidateControllerImpl(List<Candidate> candidates) {
        this.candidates = candidates;
    }

    @Override
    public void inData() {
        System.out.println("Danh sach Candidate: ");
        System.out.println("Danh sach fresher candidate: ");
        FresherCandidate.inTieuDe();
        for (Candidate c : candidates) {
            if (c instanceof FresherCandidate) {
                c.inData();
            }

        }
        System.out.println("Danh sach Experence candidate: ");
        ExperienceCandidate.inTieuDe();
        for (Candidate c : candidates) {
            if (c instanceof ExperienceCandidate) {
                c.inData();
            }
        }

    }

    @Override
    public void findByName(String name) {
        for (Candidate c : candidates) {
            if (c.getLastName().equals(name)) {
                System.out.println(c);
            }
        }
    }

    @Override
    public Candidate findByEmail(String email) {
        for (Candidate c : candidates) {
            if (c.getEmail().equals(email)) {
                return c;
            }
        }
        System.out.println("Ko tim thay");
        return null;
    }

    @Override
    public void deleteByEmail(String email) {
        Candidate candidate = findByEmail(email);
        candidates.remove(candidate);

    }


}
