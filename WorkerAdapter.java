package d4;

public class WorkerAdapter implements Worker {
    AdvancedWorker advancedWorker;

    public WorkerAdapter(String jobTitle) {
        this.advancedWorker = new SpecializedWorker(jobTitle);
    }

    @Override
    public void viewJobDetails() {
        advancedWorker.viewDetailedJobs("Software Engineer");
    }

    @Override
    public void applyForJob(String employerName) {
        advancedWorker.applyToEmployer("Software Engineer", employerName);
    }
}
