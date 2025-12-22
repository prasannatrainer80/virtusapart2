package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bonus")
public class Bonus {
    @Id
    private String id;
    private int empno;
    private double bonus;
    private String bonustype;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getBonustype() {
        return bonustype;
    }

    public void setBonustype(String bonustype) {
        this.bonustype = bonustype;
    }

    @Override
    public String toString() {
        return "Bonus{" +
                "id='" + id + '\'' +
                ", empno=" + empno +
                ", bonus=" + bonus +
                ", bonustype='" + bonustype + '\'' +
                '}';
    }

    public Bonus() {}
    public Bonus(String id, int empno, double bonus, String bonustype) {
        this.id = id;
        this.empno = empno;
        this.bonus = bonus;
        this.bonustype = bonustype;
    }
}
