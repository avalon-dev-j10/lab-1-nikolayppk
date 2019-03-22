package ru.avalon.java.dev.j10.labs.commons;
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
 public class Address {
     public Address(String Gorod, String Ulica, int Dom, int Kv){
         this.Gorod = Gorod;
         this.Ulica = Ulica;
         this.Dom = Dom;
         Kvartira = Kv;
     }
     
    public String Gorod;
    public String Ulica;
    public int Dom;
    public int Kvartira;
    
    
 }