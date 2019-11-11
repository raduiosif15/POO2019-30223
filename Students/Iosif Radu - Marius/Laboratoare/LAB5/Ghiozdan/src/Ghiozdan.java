public class Ghiozdan {
    private Rechizite[] rechizite;
    private int nrRechizite;
    private int nrManuale;
    private int nrCaiete;

    public Ghiozdan() {
        this.rechizite = new Rechizite[100];
    }

    public int getNrRechizite() {
        return this.nrRechizite;
    }

    public int getNrManuale() {
        return this.nrManuale;
    }

    public int getNrCaiete() {
        return this.nrCaiete;
    }

    public void addCaiet(Caiete newCaiete) {
        rechizite[nrRechizite] = newCaiete;
        nrRechizite++;
        nrCaiete++;
    }

    public void addManual(Manual newManual) {
        rechizite[nrRechizite] = newManual;
        nrRechizite++;
        nrManuale++;
    }

    public void listItems() {
        for (int index = 0; index < nrRechizite; index++) {
            System.out.println(rechizite[index].getName());
        }
    }

    public void listCaiete() {
        Caiete auxCaiet = new Caiete("materie");
        for (int index = 0; index < nrRechizite; index++) {
            if (rechizite[index].getClass() == auxCaiet.getClass()) {
                System.out.println(((Caiete) rechizite[index]).getName());
            }
        }
    }

    public void listManuale() {
        Manual auxManual = new Manual("materie");
        for (int index = 0; index < nrRechizite; index++) {
            if (rechizite[index].getClass() == auxManual.getClass()) {
                System.out.println(((Manual) rechizite[index]).getName());
            }
        }
    }
}
