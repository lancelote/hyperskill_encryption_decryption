package stage5.hw1;

class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            this.firstName = "";
        } else {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            this.lastName = "";
        } else {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        if (firstName.equals("") && lastName.equals("")) {
            return "Unknown";
        } else if (firstName.equals("")) {
            return lastName;
        } else if (lastName.equals("")) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }
}
