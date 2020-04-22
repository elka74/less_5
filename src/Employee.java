public class Employee {
    private String name;
    private String position;
    private String mail;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String mail, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.printf("Сотрудник -  %s\n должность - %s\n эл.почта -  %s\n телефон -   %s\n зарплата -  %d рублей\n возраст -   %d лет \n\n ", name, position, mail, phone, salary, age);
    }


    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    /**
     * метод позволяет изменить заработную плату сотрудника
     * заработная плата не может быть меньше нуля
     */

    public void setSalary(int salary) {
        if (salary < 0) {
            System.out.println("Зарплата не может быть меньше нуля");
        } else {
            this.salary = salary;
        }
    }

    /**
     * Метод позволяет изменить возраст сотрудника
     * Возраст сотрудника не может быть меньше или равен нулю
     */

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Возраст не может быть меньше нуля");
        } else {
            this.age = age;
        }
    }

    /**
     * Метод позволяет изменять номер телефона
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

}
