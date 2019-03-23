package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person  {
    public Person(Passport passportData, Address registration){
        this.passportData = passportData;
        this.registration = registration;
    }
    Passport passportData;
    Address registration;
     
      
/*

}

    /*
     * TODO(Студент): Создайте класс Address.
     *
     * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
     *
     * 2. Создайте класс, видимый из пакета. Подумайте о том
     *    Какое имя должен иметь класс, если он объявленн в этом
     *    файле.
     *
     * 3. Подумайте над тем, какие переменные должены быть
     *    определены в классе.
     *
     * 4. Подумайте над тем, какие методы должны быть объявлены
     *    в классе.
     */

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {  
        if (passportData.getotchestvo() != null){
        String fullName = passportData.getsurname() + " " + passportData.getname() + " " + passportData.getotchestvo();
        return fullName;
        }
        else if (passportData.getSecondName() != null)  {
        String fullName = passportData.getname() + " " + passportData.getSecondName().substring(0, 1) + "." + " " + passportData.getsurname();
        return fullName;
        }
        else {
            String fullName = passportData.getsurname() + " " + passportData.getname();
            return fullName;
        }
       
    }
       
        
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
           
           
           

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
  public String getAddress() {
      String Reg = registration.getgorod() + ", " + registration.getulica() + " " + registration.getdom() + ", " + registration.getkvartira(); 
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
      return Reg;
}}