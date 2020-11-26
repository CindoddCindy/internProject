package ac.i.geekapp.Model;

public class data_user {
    private String nama;
    private String nohp;
    private String key;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public data_user(){

    }

    public data_user(String nama, String nohp){
        this.nama = nama;
        this.nohp = nohp;
    }
}

