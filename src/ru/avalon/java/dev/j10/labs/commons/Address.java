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
     public Address(String gorod, String ulica, int dom, int kv){
         this.gorod = gorod;
         this.ulica = ulica;
         this.dom = dom;
         kvartira = kv;
     }
      public String getgorod(){
     return gorod;
   }
   public String getulica(){
     return ulica;
   }
   public int getdom(){
           return dom;
   }
   public int getkvartira(){
     return kvartira;
   }
     private String gorod;
     private String ulica;
     private int dom;
     private int kvartira;
    
    
 }