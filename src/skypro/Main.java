package skypro;

public class Main {
    public static void main(String[] args) {


        //задача 1
        String fistName="Ivan";
        String middleName="Ivanovich";
        String lastName= "Ivanov";
        String fullName="Ivanov Ivan Ivanovich";
        System.out.println("“ФИО сотрудника-"+fullName+middleName+lastName);


                      //задача2
        String fullNam="Ivanov Ivan Ivanovich";
        String fullName1 = fullNam.toUpperCase();
        System.out.println(fullName1);


                     //задача3
        String fullName3="Иванов Семён Семёнович";
        fullName3 = fullName3.replace("ё", "е");
        System.out.println(fullName3);
    }

}
