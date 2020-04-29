package Controller;

import Serverside.Stoplichten;

import java.util.HashMap;

public class StoplichtenSetter {
Heuristics heuristics = new Heuristics();

    public Stoplichten SetLights(Verkeer verkeer){
       return heuristics.algo(verkeer.getMap());


    }

    public Stoplichten SetOrange(Stoplichten stoplichten) throws InterruptedException {
        HashMap<String, Integer> status = stoplichten.getMap();



        for (String i: status.keySet())
        {
            switch (i) {
                case "A1": {
                    if (stoplichten.getA1() == 2)
                        stoplichten.setA1(1);
                    break;
                }
                case "A2": {
                    if (stoplichten.getA2() == 2)
                        stoplichten.setA2(1);
                    break;

                }
                case "A3": {
                    if (stoplichten.getA3() == 2)
                        stoplichten.setA3(1);
                    break;
                }
                case "A4": {
                    if (stoplichten.getA4() == 2)
                        stoplichten.setA4(1);
                    break;

                }
                case "AB1": {
                    if (stoplichten.getAB1() == 2)
                        stoplichten.setAB1(1);
                    break;

                }
                case "AB2": {
                    if (stoplichten.getAB2() == 2)
                        stoplichten.setAB2(1);
                    break;

                }
                case "B1": {
                    if (stoplichten.getB1() == 2)
                        stoplichten.setB1(1);
                    break;
                }
                case "B2": {
                    if (stoplichten.getB2() == 2)
                        stoplichten.setB2(1);
                    break;
                }
                case "B3": {
                    if (stoplichten.getB3() == 2)
                        stoplichten.setB3(1);
                    break;
                }
                case "B4": {
                    if (stoplichten.getB4() == 2)
                        stoplichten.setB4(1);
                    break;
                }
                case "B5": {
                    if (stoplichten.getB5() == 2)
                        stoplichten.setB5(1);
                    break;
                }
                case "BB1": {
                    if (stoplichten.getBB1() == 2)
                        stoplichten.setBB1(1);
                    break;
                }
                case "C1": {
                    if (stoplichten.getC1() == 2)
                        stoplichten.setC1(1);
                    break;
                }
                case "C2": {
                    if (stoplichten.getC2() == 2)
                        stoplichten.setC2(1);
                    break;
                }
                case "C3": {
                    if (stoplichten.getC3() == 2)
                        stoplichten.setC3(1);
                    break;
                }
                case "D1": {
                    if (stoplichten.getD1() == 2)
                        stoplichten.setD1(1);
                    break;
                }
                case "D2": {
                    if (stoplichten.getD2() == 2)
                        stoplichten.setD2(1);
                    break;
                }
                case "D3": {
                    if (stoplichten.getD3() == 2)
                        stoplichten.setD3(1);
                    break;
                }
                case "E1": {
                    if (stoplichten.getE1() == 2)
                        stoplichten.setE1(1);
                    break;
                }
                case "EV1": {
                    if (stoplichten.getEV1() == 2)
                        stoplichten.setEV1(1);
                    break;
                }
                case "EV2": {
                    if (stoplichten.getEV2() == 2)
                        stoplichten.setEV2(1);
                    break;
                }
                case "EV3": {
                    if (stoplichten.getEV3() == 2)
                        stoplichten.setEV3(1);
                    break;
                }
                case "EV4": {
                    if (stoplichten.getEV4() == 2)
                        stoplichten.setEV4(1);
                    break;
                }
                case "FF1": {
                    if (stoplichten.getFF1() == 2)
                        stoplichten.setFF1(1);
                    break;
                }
                case "FF2": {
                    if (stoplichten.getFF2() == 2)
                        stoplichten.setFF2(1);
                    break;
                }
                case "FV1": {
                    if (stoplichten.getFV1() == 2)
                        stoplichten.setFV1(1);
                    break;
                }
                case "FV2": {
                    if (stoplichten.getFV2() == 2)
                        stoplichten.setFV2(1);
                    break;
                }
                case "FV3": {
                    if (stoplichten.getFV3() == 2)
                        stoplichten.setFV3(1);
                    break;
                }
                case "FV4": {
                    if (stoplichten.getFV4() == 2)
                        stoplichten.setFV4(1);
                    break;
                }
                case "GF1": {
                    if (stoplichten.getGF1() == 2)
                        stoplichten.setGF1(1);
                    break;
                }
                case "GF2": {
                    if (stoplichten.getGF2() == 2)
                        stoplichten.setGF2(1);
                    break;
                }
                case "GV1": {
                    if (stoplichten.getGV1() == 2)
                        stoplichten.setGV1(1);
                    break;
                }
                case "GV2": {
                    if (stoplichten.getGV2() == 2)
                        stoplichten.setGV2(1);
                    break;
                }
                case "GV3": {
                    if (stoplichten.getGV3() == 2)
                        stoplichten.setGV3(1);
                    break;
                }
                case "GV4": {
                    if (stoplichten.getGV4() == 2)
                        stoplichten.setGV4(1);
                    break;
                }
            }
        }
        return stoplichten;
    }

    public Stoplichten SetRed(Stoplichten stoplichten)
    {
        HashMap<String, Integer> status = stoplichten.getMap();

        for (String i: status.keySet())
        {
            switch (i) {
                case "A1": {
                    if (stoplichten.getA1() == 1)
                        stoplichten.setA1(0);
                    break;
                }
                case "A2": {
                    if (stoplichten.getA2() == 1)
                        stoplichten.setA2(0);
                    break;

                }
                case "A3": {
                    if (stoplichten.getA3() == 1)
                        stoplichten.setA3(0);
                    break;
                }
                case "A4": {
                    if (stoplichten.getA4() == 1)
                        stoplichten.setA4(0);
                    break;

                }
                case "AB1": {
                    if (stoplichten.getAB1() == 1)
                        stoplichten.setAB1(0);
                    break;

                }
                case "AB2": {
                    if (stoplichten.getAB2() == 1)
                        stoplichten.setAB2(0);
                    break;

                }
                case "B1": {
                    if (stoplichten.getB1() == 1)
                        stoplichten.setB1(0);
                    break;
                }
                case "B2": {
                    if (stoplichten.getB2() == 1)
                        stoplichten.setB2(0);
                    break;
                }
                case "B3": {
                    if (stoplichten.getB3() == 1)
                        stoplichten.setB3(0);
                    break;
                }
                case "B4": {
                    if (stoplichten.getB4() == 1)
                        stoplichten.setB4(0);
                    break;
                }
                case "B5": {
                    if (stoplichten.getB5() == 1)
                        stoplichten.setB5(0);
                    break;
                }
                case "BB1": {
                    if (stoplichten.getBB1() == 1)
                        stoplichten.setBB1(0);
                    break;
                }
                case "C1": {
                    if (stoplichten.getC1() == 1)
                        stoplichten.setC1(0);
                    break;
                }
                case "C2": {
                    if (stoplichten.getC2() == 1)
                        stoplichten.setC2(0);
                    break;
                }
                case "C3": {
                    if (stoplichten.getC3() == 1)
                        stoplichten.setC3(0);
                    break;
                }
                case "D1": {
                    if (stoplichten.getD1() == 1)
                        stoplichten.setD1(0);
                    break;
                }
                case "D2": {
                    if (stoplichten.getD2() == 1)
                        stoplichten.setD2(0);
                    break;
                }
                case "D3": {
                    if (stoplichten.getD3() == 1)
                        stoplichten.setD3(0);
                    break;
                }
                case "E1": {
                    if (stoplichten.getE1() == 1)
                        stoplichten.setE1(0);
                    break;
                }
                case "EV1": {
                    if (stoplichten.getEV1() == 1)
                        stoplichten.setEV1(0);
                    break;
                }
                case "EV2": {
                    if (stoplichten.getEV2() == 1)
                        stoplichten.setEV2(0);
                    break;
                }
                case "EV3": {
                    if (stoplichten.getEV3() == 1)
                        stoplichten.setEV3(0);
                    break;
                }
                case "EV4": {
                    if (stoplichten.getEV4() == 1)
                        stoplichten.setEV4(0);
                    break;
                }
                case "FF1": {
                    if (stoplichten.getFF1() == 1)
                        stoplichten.setFF1(0);
                    break;
                }
                case "FF2": {
                    if (stoplichten.getFF2() == 1)
                        stoplichten.setFF2(0);
                    break;
                }
                case "FV1": {
                    if (stoplichten.getFV1() == 1)
                        stoplichten.setFV1(0);
                    break;
                }
                case "FV2": {
                    if (stoplichten.getFV2() == 1)
                        stoplichten.setFV2(0);
                    break;
                }
                case "FV3": {
                    if (stoplichten.getFV3() == 1)
                        stoplichten.setFV3(0);
                    break;
                }
                case "FV4": {
                    if (stoplichten.getFV4() == 1)
                        stoplichten.setFV4(0);
                    break;
                }
                case "GF1": {
                    if (stoplichten.getGF1() == 1)
                        stoplichten.setGF1(0);
                    break;
                }
                case "GF2": {
                    if (stoplichten.getGF2() == 1)
                        stoplichten.setGF2(0);
                    break;
                }
                case "GV1": {
                    if (stoplichten.getGV1() == 1)
                        stoplichten.setGV1(0);
                    break;
                }
                case "GV2": {
                    if (stoplichten.getGV2() == 1)
                        stoplichten.setGV2(0);
                    break;
                }
                case "GV3": {
                    if (stoplichten.getGV3() == 1)
                        stoplichten.setGV3(0);
                    break;
                }
                case "GV4": {
                    if (stoplichten.getGV4() == 1)
                        stoplichten.setGV4(0);
                    break;
                }
            }
        }
        return stoplichten;
    }

    public String gettext() throws InterruptedException {
        Thread.sleep(4000);
        return("Ok");
    }





}
