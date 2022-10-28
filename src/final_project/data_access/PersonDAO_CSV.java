package final_project.data_access;

import final_project.MyException;
import java1refresher.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.*;

public class PersonDAO_CSV implements MyDAO<Person> {
    private static final String FILE_NAME = "src/main/resources/csv_files/person.csv";
    private List<Person> list;
    private int next_id = 0;

    @Override
    public void readInData() throws MyException {
        try(Scanner scanner = new Scanner(new File(FILE_NAME))) {
            list = new ArrayList<Person>();
            String line = "";
            int lineCount = 1;
            String[] fields;
            int id;
            String firstName;
            String lastName;
            int height;
            double weight;
            LocalDate dateOfBirth;
            line = scanner.nextLine(); // reads in header row
            while(scanner.hasNextLine()) {
                lineCount++;
                line = scanner.nextLine();
                fields = line.split(",");
                id = Integer.parseInt(fields[0]);
                firstName = fields[1];
                lastName = fields[2];
                height = Integer.parseInt(fields[3]);
                weight = Double.parseDouble(fields[4]);
                dateOfBirth = LocalDate.parse(fields[5]);
                Person person = new Person();
                person.setId(id);
                person.setFirstName(firstName);
                person.setLastName(lastName);
                person.setHeightInInches(height);
                person.setWeightInPounds(weight);
                person.setDateOfBirth(dateOfBirth.atStartOfDay());
                list.add(person);
            }
            
        } catch(FileNotFoundException e) {
            throw new MyException("File '" + FILE_NAME + "' not found");
        }
    }

    @Override
    public void add(Person obj) throws MyException {
        obj.setId(++next_id);
        list.add(obj);
        System.out.println(list);
        saveToFile();
    }

    private void saveToFile() {

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
