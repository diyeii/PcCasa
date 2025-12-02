package ejerciciosPojos.instituto;

import java.util.Arrays;
import java.util.Objects;

public class HighSchool {
    private String name;
    private Student[] studentsArray;

    public HighSchool(String name, Student[] studentsArray) {
        this.name = name;
        this.studentsArray = studentsArray;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudentsArray() {
        return studentsArray;
    }

    public void setStudentsArray(Student[] studentsArray) {
        this.studentsArray = studentsArray;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        HighSchool that = (HighSchool) o;
        return Objects.equals(name, that.name) && Objects.deepEquals(studentsArray, that.studentsArray);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(studentsArray));
    }
}
