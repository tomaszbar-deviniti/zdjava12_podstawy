package solutions.sol1;

//roziwązanie Marka
public class Firma {

    //pola klasy
    private String name;
    private Pracownik[] workers;

    private int lastWorkerIndex = 0;

    public Firma(String name) {
        this.name = name;
        this.workers = new Pracownik[100];
    }

    public void addWorker(Pracownik pracownik) {
        //1. nie pozwolić na dodanie 101 pracownika
        //2. "powiększyć" tablicę pracowników
        this.workers[lastWorkerIndex] = pracownik;
        lastWorkerIndex++;
    }

    public void removeWorker() {
        //a co w przypadku, gdy nie ma pracwoników???
        if (lastWorkerIndex > 0) {
            this.workers[lastWorkerIndex] = null;
            lastWorkerIndex--;
        }
    }

    private void makeWorkerArrayLonger() {
        //1. stworzyć nową większą tablicę
        //2. przepisać wartośći ze "starej tablicy do nowej"
        //3. przypisać nową tablicę do this.workers
    }

    public String firmInfo() {

        String workersString = "";
        for (int i = 0; i < lastWorkerIndex; i++) {
            workersString += this.workers[i].workerInfo() + "\n";
        }

        return "Firma {" + name + ", Workers:\n" + workersString + "}";
    }

    public static void main(String[] args) {
        Firma atlas = new Firma("Atlas");
        Pracownik pracownik1 = new Pracownik("Artur Walaszczyk", "90081700234", 'M', 30);
        Pracownik pracownik2 = new Pracownik("Zofia Kowalska", "80041200456", 'W', 40);
        atlas.addWorker(pracownik1);
        System.out.println(atlas.firmInfo());
        atlas.addWorker(pracownik2);
        System.out.println(atlas.firmInfo());
    }
}