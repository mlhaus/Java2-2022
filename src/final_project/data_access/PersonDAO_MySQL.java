package final_project.data_access;

import final_project.MyException;
import java1refresher.Person;

import java.util.*;

public class PersonDAO_MySQL implements MyDAO<Person> {
    private List<Person> list;

    @Override
    public void readInData() throws MyException {

    }

    @Override
    public void add(Person obj) throws MyException {

    }

    @Override
    public Person get(int id) throws MyException {
        return null;
    }

    @Override
    public void set(int id, Person obj) throws MyException {

    }

    @Override
    public Person remove(int id) throws MyException {
        return null;
    }

    @Override
    public Person remove(Person obj) throws MyException {
        return null;
    }
}
