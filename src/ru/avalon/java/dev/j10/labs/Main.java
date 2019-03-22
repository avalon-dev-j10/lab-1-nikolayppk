package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.commons.Address;


public class Main {
public static void main (String arg[]){
 

        /*
         * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
         */

       Passport PassportIvanov = new Passport("Иван","Иванов", "Иванович");
       Address AddressIvanov = new Address("Спб", "Ленина", 6, 100);
      
       Passport PassportSmith = new Passport("John", "Edvard");
       PassportSmith.SecondName = "Smith";
       Address AddressSmith = new Address("London", "Green Street", 5, 2);
       
       Person ivanov = new Person(PassportIvanov, AddressIvanov);
       Person smith = new Person(PassportSmith, AddressSmith);
       
       String IvanovFullName = ivanov.getFullName();
       System.out.println(IvanovFullName);
       String IvanovAddress = ivanov.getAddress();
       System.out.println(IvanovAddress);
      
       String SmithFullName = smith.getFullName();
       System.out.println(SmithFullName);
       
       String SmithAddress = smith.getAddress();
       System.out.println(SmithAddress);
    
       
       
       
        
        
        

        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
