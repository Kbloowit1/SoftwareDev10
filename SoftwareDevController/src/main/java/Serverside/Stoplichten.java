package Serverside;

import java.util.HashMap;

public class Stoplichten {
    private int A1;
    private int A2;
    private int A3;
    private int A4;
    private int AB1;
    private int AB2;
    private int B1;
    private int B2;
    private int B3;
    private int B4;
    private int B5;
    private int BB1;
    private int C1;
    private int C2;
    private int C3;
    private int D1;
    private int D2;
    private int D3;
    private int E1;
    private int EV1;
    private int EV2;
    private int EV3;
    private int EV4;
    private int FF1;
    private int FF2;
    private int FV1;
    private int FV2;
    private int FV3;
    private int FV4;
    private int GF1;
    private int GF2;
    private int GV1;
    private int GV2;
    private int GV3;
    private int GV4;

    public int getA1() {
        return A1;
    }

    public void setA1(int a1) {
        A1 = a1;
    }

    public int getA2() {
        return A2;
    }

    public void setA2(int a2) {
        A2 = a2;
    }

    public int getA3() {
        return A3;
    }

    public void setA3(int a3) {
        A3 = a3;
    }

    public int getA4() {
        return A4;
    }

    public void setA4(int a4) {
        A4 = a4;
    }

    public int getAB1() {
        return AB1;
    }

    public void setAB1(int AB1) {
        this.AB1 = AB1;
    }

    public int getAB2() {
        return AB2;
    }

    public void setAB2(int AB2) {
        this.AB2 = AB2;
    }

    public int getB1() {
        return B1;
    }

    public void setB1(int b1) {
        B1 = b1;
    }

    public int getB2() {
        return B2;
    }

    public void setB2(int b2) {
        B2 = b2;
    }

    public int getB3() {
        return B3;
    }

    public void setB3(int b3) {
        B3 = b3;
    }

    public int getB4() {
        return B4;
    }

    public void setB4(int b4) {
        B4 = b4;
    }

    public int getB5() {
        return B5;
    }

    public void setB5(int b5) {
        B5 = b5;
    }

    public int getBB1() {
        return BB1;
    }

    public void setBB1(int BB1) {
        this.BB1 = BB1;
    }

    public int getC1() {
        return C1;
    }

    public void setC1(int c1) {
        C1 = c1;
    }

    public int getC2() {
        return C2;
    }

    public void setC2(int c2) {
        C2 = c2;
    }

    public int getC3() {
        return C3;
    }

    public void setC3(int c3) {
        C3 = c3;
    }

    public int getD1() {
        return D1;
    }

    public void setD1(int d1) {
        D1 = d1;
    }

    public int getD2() {
        return D2;
    }

    public void setD2(int d2) {
        D2 = d2;
    }

    public int getD3() {
        return D3;
    }

    public void setD3(int d3) {
        D3 = d3;
    }

    public int getE1() {
        return E1;
    }

    public void setE1(int e1) {
        E1 = e1;
    }

    public int getEV1() {
        return EV1;
    }

    public void setEV1(int EV1) {
        this.EV1 = EV1;
    }

    public int getEV2() {
        return EV2;
    }

    public void setEV2(int EV2) {
        this.EV2 = EV2;
    }

    public int getEV3() {
        return EV3;
    }

    public void setEV3(int EV3) {
        this.EV3 = EV3;
    }

    public int getEV4() {
        return EV4;
    }

    public void setEV4(int EV4) {
        this.EV4 = EV4;
    }

    public int getFF1() {
        return FF1;
    }

    public void setFF1(int FF1) {
        this.FF1 = FF1;
    }

    public int getFF2() {
        return FF2;
    }

    public void setFF2(int FF2) {
        this.FF2 = FF2;
    }

    public int getFV1() {
        return FV1;
    }

    public void setFV1(int FV1) {
        this.FV1 = FV1;
    }

    public int getFV2() {
        return FV2;
    }

    public void setFV2(int FV2) {
        this.FV2 = FV2;
    }

    public int getFV3() {
        return FV3;
    }

    public void setFV3(int FV3) {
        this.FV3 = FV3;
    }

    public int getFV4() {
        return FV4;
    }

    public void setFV4(int FV4) {
        this.FV4 = FV4;
    }

    public int getGF1() {
        return GF1;
    }

    public void setGF1(int GF1) {
        this.GF1 = GF1;
    }

    public int getGF2() {
        return GF2;
    }

    public void setGF2(int GF2) {
        this.GF2 = GF2;
    }

    public int getGV1() {
        return GV1;
    }

    public void setGV1(int GV1) {
        this.GV1 = GV1;
    }

    public int getGV2() {
        return GV2;
    }

    public void setGV2(int GV2) {
        this.GV2 = GV2;
    }

    public int getGV3() {
        return GV3;
    }

    public void setGV3(int GV3) {
        this.GV3 = GV3;
    }

    public int getGV4() {
        return GV4;
    }

    public void setGV4(int GV4) {
        this.GV4 = GV4;
    }

    public HashMap<String, Integer> getMap(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A1", getA1());
        map.put("A2", getA2());
        map.put("A3", getA3());
        map.put("A4", getA4());
        map.put("AB1", getAB1());
        map.put("AB2", getAB2());
        map.put("B1", getB1());
        map.put("B2", getB2());
        map.put("B3", getB3());
        map.put("B4", getB4());
        map.put("B5", getB5());
        map.put("BB1", getBB1());
        map.put("C1", getC1());
        map.put("C2", getC2());
        map.put("C3", getC3());
        map.put("D1", getD1());
        map.put("D2", getD2());
        map.put("D3", getD3());
        map.put("E1", getE1());
        map.put("EV1", getEV1());
        map.put("EV2", getEV2());
        map.put("EV3", getEV3());
        map.put("EV4", getEV4());
        map.put("FF1", getFF1());
        map.put("FF2", getFF2());
        map.put("FV1", getFV1());
        map.put("FV2", getFV2());
        map.put("FV3", getFV3());
        map.put("FV4", getFV4());
        map.put("GF1", getGF1());
        map.put("GF2", getGF2());
        map.put("GV1", getGV1());
        map.put("GV2", getGV2());
        map.put("GV3", getGV3());
        map.put("GV4", getGV4());

        return map;
    }
}
