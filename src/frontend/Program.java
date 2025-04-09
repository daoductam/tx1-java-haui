package frontend;

import controller.CandidateController;
import controller.CandidateControllerImpl;
import entity.Candidate;
import entity.ExperienceCandidate;
import entity.FresherCandidate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static final List<Candidate> list = new ArrayList<>();
    static CandidateController candidateControllerImpl = new CandidateControllerImpl(list);
    public static void main(String[] args) {
        fakeData();

        candidateControllerImpl.inData();
        candidateControllerImpl.findByName("Tam");
        candidateControllerImpl.deleteByEmail("c@gmail.com");
        candidateControllerImpl.inData();
    }

    public static void fakeData() {

        FresherCandidate a = new FresherCandidate("a","a","0825159401","a@gmail.com",
                "Kha");
        FresherCandidate a1 = new FresherCandidate("b","b","0825159401","b@gmail.com",
                "Kha");
        ExperienceCandidate b = new ExperienceCandidate("c","c","0825159401","c@gmail.com",
                4,"hehe");
        ExperienceCandidate b2 = new ExperienceCandidate("d","d","0825159401","d@gmail.com",
                5,"heheh");
        list.add(a);
        list.add(a1);
        list.add(b);
        list.add(b2);

    }
}
