package FitnessTracker;


public class main {
    public static void main(String[] args) {

        user user1 = new user("Іван", "Петров", 1, 1, 1996, "ivan@gmail.com", "123456789", 75, "120/80", 5000);
        user user2 = new user("Марія", "Іванова", 6, 1985, 1993, "maria@gmail.com", "987654321", 60, "110/70", 10000);
        user user3 = new user("Олексій", "Сидоров", 3, 2000, 1987, "olexii@gmail.com", "555555555", 80, "130/90", 3000);
        user user4 = new user("Олена", "Коваль", 4, 1995, 1989, "olena@gmail.com", "111111111", 65, "120/80", 8000);
        user user5 = new user("Андрій", "Гринь", 11, 1988, 1990, "andrii@gmail.com", "222222222", 90, "140/100", 2000);


        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
        user4.printAccountInfo();
        user5.printAccountInfo();

        user1.setSurname("Сидоров");
        user1.setWeight(80);


        user3.setSurname("Іванов");
        user3.setWeight(75);
        user3.setBloodPressure("120/80");
       

        user1.printAccountInfo();
        user3.printAccountInfo();

    }
}



