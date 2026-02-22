class Result extends Student implements Sports {
    int sportsScore;

    Result(String name, int rollNo, int academicScore) {
        super(name, rollNo, academicScore);
    }

    public void setSportsScore(int score) {
        this.sportsScore = score;
    }

    public int getSportsScore() {
        return sportsScore;
    }

    void display() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Academic Score: " + academicScore);
        System.out.println("Sports Score: " + sportsScore);
        System.out.println("Total Score: " + (academicScore + sportsScore));
    }
}