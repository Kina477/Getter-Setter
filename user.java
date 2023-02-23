package FitnessTracker;

public class user {
    private String name;
    private String surname;
    private int day;
    private int month;
    private int yearOfBirth;
    private String email;
    private String phone;
    private Integer weight;
    private String bloodPressure;
    private int stepsToday;
    private int age;
    public user(String name, String surname, int day, int month, int yearOfBirth, String email, String phone, Integer weight, String bloodPressure, int stepsToday) {
        this.name = name;
        this.surname = surname;
        this.day = day;
        this.month = month;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phone = phone;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.stepsToday = stepsToday;
        this.age = 2020 - yearOfBirth;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getStepsToday() {
        return stepsToday;
    }

    public void setStepsToday(int stepsToday) {
        this.stepsToday = stepsToday;
    }

    public void printAccountInfo() {
        System.out.println("Account Information:");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Date of Birth: " + day + "/" + month + "/" + yearOfBirth);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Blood Pressure: " + bloodPressure);
        System.out.println("Steps Today: " + stepsToday);
        System.out.println("Age: " + age);
    }
}



