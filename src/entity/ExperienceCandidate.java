package entity;

public class ExperienceCandidate extends Candidate{
    private int expInYear;
    private String proSkill;

    public ExperienceCandidate(String firstName, String lastName, String phone, String email, int expInYear, String proSkill) {
        super(firstName, lastName, phone, email);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public ExperienceCandidate() {
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return super.toString()+"ExperienceCandidate{" +
                "expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                '}';
    }

    public static void inTieuDe() {
        Candidate.inTieuDe();
        System.out.printf("%10s%20s\n","exp","pro skill");
    }

    @Override
    public void inData() {

        super.inData();
        System.out.printf("%10d%20s\n",expInYear,proSkill);
    }
}
