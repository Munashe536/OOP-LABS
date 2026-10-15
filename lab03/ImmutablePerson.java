import java.time.LocalDate;


public final class ImmutablePerson {

    private final String name;
    private final LocalDate dateOfBirth;

    public ImmutablePerson(String name, LocalDate dateOfBirth) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name required");
        }
        if (dateOfBirth == null || dateOfBirth.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Date of birth must be in the past");
        }
        this.name = name.trim();
        this.dateOfBirth = dateOfBirth;
    }

    public String getName()          { return name; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }

    
    public ImmutablePerson withName(String newName) {
        return new ImmutablePerson(newName, dateOfBirth);
    }

    @Override
    public String toString() {
        return name + " (born " + dateOfBirth + ")";
    }
}
