public class Student {


    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Student(final String name,final int age)throws IllegalArgumentException{
        if (0 > age || age > 65){
            throw new IllegalArgumentException("Wrong age passed.");
        }
        this.age = age;
        this.name = name;
    }

    public boolean isAdult(){
        return this.age>=18;
    }

    public int compareTo(Student other) {
        return this.age-other.getAge();
    }
}
