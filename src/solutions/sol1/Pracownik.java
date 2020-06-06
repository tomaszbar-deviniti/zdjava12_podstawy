package solutions.sol1;

public class Pracownik {

    //stan, pola klasy (ang. fields)
    private String name;
    private String pesel; // <- int/long
    private char sex; //<-  przedane metody
    private int age; //<- date urodzenia


    //przeciążaony konstruktor (ang.overload)
    public Pracownik(String name, String pesel){
        this(name, pesel, '\u0000', 0);
    }

    public Pracownik(String name, String pesel, char sex, int age) {
        boolean isPeselValid = checkPesel(pesel); //wstawić wartość domyślną gdy pesel nie poprawny
        this.name = name;
        this.pesel = pesel;
        this.sex = sex;
        this.age = age;
    }

    //gettery => akcesory,
    public String getName() {
        return name;
    }
    public String getPesel() {
        return pesel;
    }
    public char getSex() {
        return sex;
    }
    public int getAge() {
        return age;
    }

    //settery => mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWomen(){
        return this.sex == 'W';
    }

    private boolean checkPesel(String pesel){
        //algorytm do psrawdznia poprawności peselu
        //true || false
        return true;
    }

    public String workerInfo(){
        return "Pracownik {"+name+", "+pesel+", "+sex+", "+age+"}";
    }
}