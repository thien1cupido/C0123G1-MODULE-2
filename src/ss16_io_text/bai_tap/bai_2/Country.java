package ss16_io_text.bai_tap.bai_2;

public class Country {
    private int id;
    private String vt;
    private String name;

    public Country() {
    }

    public Country(int id, String vt, String name) {
        this.id = id;
        this.vt = vt;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVt() {
        return vt;
    }

    public void setVt(String vt) {
        this.vt = vt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", vt='" + vt + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
