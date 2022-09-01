import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Task12();
        Task3();
    }

    public static void Task12(){


        // Lesson 1
        String firstName = "иван";
        String middleName = "иванович";
        String lastName = "иванов";
        String fullName = lastName + " " + firstName + " " + middleName + " ";
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        // Lesson 2
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + fullName.toUpperCase(Locale.ROOT));

    }

    public static void Task3(){
        // Lesson 3 использовал в отдельном тк в 1,2 задании ФИО отличаются от 3
        String firstName = "Cемен";
        String middleName = "Семенович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName + " ";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника — " + fullName);
    }

}