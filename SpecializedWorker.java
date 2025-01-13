package d4;

public class SpecializedWorker implements AdvancedWorker {
    private String jobTitle;

    public SpecializedWorker(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public void viewDetailedJobs(String jobTitle) {
        System.out.println("Displaying detailed job listings for: " + jobTitle);
    }

    @Override
    public void applyToEmployer(String jobTitle, String employerName) {
        System.out.println("Applying to " + employerName + " for the position of: " + jobTitle);
    }
}
