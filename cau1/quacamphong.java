
package cau1;


public class quacamphong extends quacam {
    public String xuatten(){
        return this.ten="quacamphong";
    }
    public double giaban(){
        super.setGiaban(20.000);
        return this.getCannang()*this.getGiaban();
    }
}
