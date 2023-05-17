/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      while(true)
     {
      Scanner scanner = new Scanner(System.in);
      Service s = new Service();
      
      
      {System.out.println("1.Dodaj studenta");
       System.out.println("2.Wyświetl liste studentów");
       System.out.println("0.Opuść program");
      int wybór = scanner.nextInt();
      switch(wybór)
        {
          case 1 :
        System.out.println("Wpisz Imię");
        String Imię = scanner.next();
        System.out.println("Wpisz Nazwisko");
        String Nazwisko = scanner.next();
        System.out.println("Wpisz Wiek");
        int Wiek = scanner.nextInt();
        System.out.println("Wpisz Dataurodzenia");
        String Dataurodzenia = scanner.next();
       
            
        s.addStudent(new Student(Imię,Nazwisko,Wiek,Dataurodzenia));
        break;
          case 0:
            System.exit(0);
          case 2 : 
            var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
        }
          default:
            break;
            
        }
      
        
         
      
      
      }
      }
    } catch (IOException e) {

    }
  }
}