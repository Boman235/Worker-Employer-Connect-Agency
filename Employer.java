package d4;

public class Employer {
    private String employerName;

    public Employer(String employerName) {
        this.employerName = employerName;
    }

    public void postJob(String jobTitle) {
        System.out.println("Employer " + employerName + " has posted a job: " + jobTitle);
    }

    public void hireWorker(String workerName) {
        System.out.println("Employer " + employerName + " hired worker: " + workerName);
    }
}
