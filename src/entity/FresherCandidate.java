package entity;

public class FresherCandidate extends Candidate{
    private String graduationRank;

    public FresherCandidate(String firstName, String lastName, String phone, String email, String graduationRank) {
        super(firstName, lastName, phone, email);
        this.graduationRank = graduationRank;
    }

    public FresherCandidate() {
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }
    public static void inTieuDe() {
        Candidate.inTieuDe();
        System.out.printf("%20s\n", "rank");
    }

    @Override
    public String toString() {
        return super.toString()+"FresherCandidate{" +
                "graduationRank='" + graduationRank + '\'' +
                '}';
    }

    @Override
    public void inData() {
        super.inData();
        System.out.printf("%20s\n", graduationRank);
    }
}

