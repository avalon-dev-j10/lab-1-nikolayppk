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
public class Person {
    public Person(Passport PassportData, Address Registration){
        this.PassportData = PassportData;
        this.Registration = Registration;
    }
    Passport PassportData;
    Address Registration;
     
      
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
        if (PassportData.Otchestvo != null){
        String FullName = PassportData.Surname + " " + PassportData.Name + " " + PassportData.Otchestvo;
        return FullName;
        }
        else if (PassportData.SecondName != null)  {
        String FullName = PassportData.Name + " " + PassportData.SecondName.substring(0, 1) + "." + " " + PassportData.Surname;
        return FullName;
        }
        else {
            String FullName = PassportData.Surname + " " + PassportData.Name;
            return FullName;
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
      String Reg = Registration.Gorod + ", " + Registration.Ulica + " " + Registration.Dom + ", " + Registration.Kvartira; 
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
      return Reg;
}
}