/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;

public class SubjectSystem {
    String name="";
    Double Grade1, Grade2, Grade3, mean, minp1, minp2, target;
    int[] ponderacion;

    public Double getTarget() {
        return target;
    }

    public void setTarget(Double target) {
        this.target = target;
    }
  
    public int[] getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(int[] ponderacion) {
        this.ponderacion = ponderacion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrade1() {
        return Grade1;
    }

    public void setGrade1(Double Grade1) {
        this.Grade1 = Grade1;
    }

    public Double getGrade2() {
        return Grade2;
    }

    public void setGrade2(Double Grade2) {
        this.Grade2 = Grade2;
    }

    public Double getGrade3() {
        return Grade3;
    }

    public void setGrade3(Double Grade3) {
        this.Grade3 = Grade3;
    }

    public Double getMean() {
        return mean;
    }

    public void setMean(Double mean) {
        this.mean = mean;
    }

    public Double getMinp1() {
        return minp1;
    }

    public void setMinp1(Double minp1) {
        this.minp1 = minp1;
    }

    public Double getMinp2() {
        return minp2;
    }

    public void setMinp2(Double minp2) {
        this.minp2 = minp2;
    }
    public void assign_ponderacion(int ponderacion){
    int[] P1 = {20, 35, 45};
    int[] P2 = {15, 35, 50};
    int[] P3 = {33, 33, 34};
    if(ponderacion==1)
        this.setPonderacion(P1);
    if(ponderacion==2)
        this.setPonderacion(P2);
    if(ponderacion==3)
        this.setPonderacion(P3);
    }
    
    public void p1_calculator(){
       Double G1;
       G1=getGrade1()*ponderacion[0]/100;
       setMean((target-G1)*100/(ponderacion[1]+ponderacion[2]));
    }
    
    public void p2_calculator(){
       Double G1, G2;
       G1=getGrade1()*ponderacion[0]/100;
       G2=getGrade2()*ponderacion[1]/100;
       setMean((target-G2-G1)*100/ponderacion[2]);
    }
    
    public void p3_calculator(){
       Double G1, G2, G3;
       G1=getGrade1()*ponderacion[0];
       G2=getGrade2()*ponderacion[1];
       G3=getGrade3()*ponderacion[2];
       setMean((G1+G2+G3)/100);
    }
    
}
