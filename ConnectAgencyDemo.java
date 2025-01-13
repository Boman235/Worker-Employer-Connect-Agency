package d4;

/**
 * Main class demonstrating the worker-employer-agency system.
 */
public class ConnectAgencyDemo {
    public static void main(String[] args) {
        // Worker operations
        Worker worker = new WorkerAdapter("Software Engineer");
        worker.viewJobDetails();
        worker.applyForJob("Employer1");

        // Employer operations
        Employer employer = new Employer("Employer1");
        employer.postJob("Software Engineer");
        employer.hireWorker("Samuel Debiso");

        // Admin operations
        Admin admin = new Admin();
        admin.addUser(new User(1, "Fedi Fekadu", "fedifekadu@gmail.com"));
        admin.addUser(new User(2, "Badhadha", "badhadha@gmail.com"));
        admin.manageUsers();

        // Additional job posting examples
        employer.postJob("Data Scientist Position");
        System.out.println("Posting job to database: Project Manager Position");
    }
}
