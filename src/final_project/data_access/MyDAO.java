package final_project.data_access;

import final_project.MyException;

public interface MyDAO<T> {
    void readInData() throws MyException;
    void add(T obj) throws MyException;
    T get(int id) throws MyException;
    void set(int id, T obj) throws MyException;
    T remove(int id) throws MyException;
    T remove(T obj) throws MyException;
}
