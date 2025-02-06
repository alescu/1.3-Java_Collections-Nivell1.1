public class Month {

    private String name;

    enum NomMes {
        GENER, FEBRER, MARÇ, ABRIL, MAIG, JUNY,
        JULIOL, AGOST, SETEMBRE, OCTUBRE, NOVEMBRE, DESEMBRE
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Month(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || (getClass() != o.getClass())) return false;
        Month man = (Month) o;
        return this.name.toLowerCase().equals(man.name.toLowerCase());
    }

    @Override
    public int hashCode() {
        return this.name.toLowerCase().hashCode();
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                '}';
    }

}


