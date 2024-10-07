package ru.otus.java.basic.homework11;

import java.util.HashMap;
import java.util.Map;

import static ru.otus.java.basic.homework11.Position.*;

public class PersonDataBase {

     private Map<Long, Person> personDataBase = new HashMap<>();

     public Person findById(Long id) {
          System.out.println(personDataBase.get(id).getName());
          return personDataBase.get(id);
     }

     public void add(Person person) {
          personDataBase.put(person.getId(), person);
     }

     public boolean isManager(Person person) {
          if ((person.getPosition() == MANAGER) ||
                  (person.getPosition() == DIRECTOR) ||
                  (person.getPosition() == SENIOR_MANAGER) ||
                  (person.getPosition() == BRANCH_DIRECTOR)) {
               return true;
          } else {
               return false;
          }
     }

     public boolean isEmployee(Long id) {
          if ((personDataBase.get(id).getPosition() == DRIVER) ||
                  (personDataBase.get(id).getPosition() == ENGINEER) ||
                  (personDataBase.get(id).getPosition() == DEVELOPER) ||
                  (personDataBase.get(id).getPosition() == QA) ||
                  (personDataBase.get(id).getPosition() == JANITOR) ||
                  (personDataBase.get(id).getPosition() == PLUMBER) ||
                  (personDataBase.get(id).getPosition() == JUNIOR_DEVELOPER)) {
               return true;
          } else {
               return false;
          }
     }
}

