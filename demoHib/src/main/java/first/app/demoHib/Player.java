package first.app.demoHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
//import javax.persistence.Table;


@Entity(name="india")

public class Player{
    @Id
    private int aid;
    @Column(name="player_name")
    private String Name;
    @Transient
    @Column(name="role")
    private String role;

    // Getters and Setters
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getrole() {
        return role;
    }

    public void setrole(String role) {
        this.role = role;
    }
}
