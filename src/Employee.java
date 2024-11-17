class Employee {
    private int idNumber;
    private String phoneNumber;
    private String name;
    private int experience;

    public Employee(int idNumber, String phoneNumber, String name, int experience) {
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee{idNumber=" + idNumber + ", name='" + name + "', experience=" + experience + ", phoneNumber='" + phoneNumber + "'}";
    }
}