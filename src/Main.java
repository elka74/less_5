public class Main {
    public static void main(String[] args) {

        Employee empArray[] = new Employee[]{
                new Employee("Михеева Е.В.", "учитель", "mikheeva@1454.ru", "89152630934", 50000, 46),
                new Employee("Михеев И.В.", "монтажник", "mikheev@mail.ru", "89164088090", 30000, 51),
                new Employee("Мандрыгин А.А.", "программист", "denchick@mail.ru", "89152683044", 70000, 25),
                new Employee("Осипов А.А.", "техник", "osipov@yandex.ru", "89169863748", 45000, 32),
                new Employee("Шмальц О.П.", "уборщица", "ksyha@mail.ru", "89035869048", 15000, 47)};
        for (Employee employee : empArray) {
            employee.info();
        }
        System.out.println("Сотрудники старше сорока лет: \n");
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() > 40) {
                empArray[i].info();
            }
        }
    }
}
