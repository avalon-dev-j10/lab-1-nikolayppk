package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
 public class Passport  {
   public Passport(String name, String surname, String otchestvo){
       this.name = name;
       this.surname = surname;
       this.otchestvo = otchestvo; 
    } 
   public Passport(String name, String surname){
       this.name = name;
       this.surname = surname;
  }
   public String setSecondname(String secondName){
       this.secondName = secondName;
     return secondName;  
   }
   public String getname(){
     return secondName;
   }
   public String getotchestvo(){
            return otchestvo;
   }
   public String getsurname(){
            return surname;
   }
    public String getSecondName(){
            return secondName;
    }
 private int number;
 private String name;
 private String surname;
 private String otchestvo;
 private String secondName;
 private int birthday;
 private int dataVedachy;
 private String kemVydan;


}



    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
