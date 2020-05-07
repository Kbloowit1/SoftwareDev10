package Controller;

import Serverside.Stoplichten;
import java.util.HashMap;


public class Heuristics {
    // Lightmap, heeft het stoplicht om op groen te zetten als key en alles wat dan op rood moet als values
    HashMap<String, String[]> lightmap = new HashMap<String, String[]>();

    public Heuristics(){
        //Gemotorizeerd verkeer
        lightmap.put("A1", new String[]{"B2", "B3", "B4", "B5", "BB1", "C1", "C2", "D1", "D2", "FF1", "FF2", "FV4", "GF1", "GF2",});
        lightmap.put("A2", new String[]{"B1","C1","C2", "C3", "D1", "D2", "E1", "EV2", "EV4", "GF1", "GF2", "GV1", "GV3"});
        lightmap.put("A3", new String[]{"B1","C1","C2", "C3", "D1", "D2", "E1", "EV2", "EV4", "GF1", "GF2", "GV1", "GV3"});
        lightmap.put("A4", new String[]{"AB1", "AB2", "B1", "D2", "GF1", "GF2"});
        lightmap.put("AB1", new String[]{"A2","A3","A4", "B1", "C1", "C2", "C3", "D1", "D2", "EV2", "EV4", "GF1", "GF2", "GV1", "GV3"});
        lightmap.put("AB2", new String[]{"A4","AB1", "B1", "D2", "GF1", "GF2", "GV1", "GV3"});
        lightmap.put("B1", new String[] {"A2", "A3", "A4", "C1", "C2", "C3", "D1", "D2", "E1", "EV1", "EV2", "EV3", "EV4"});
        lightmap.put("B2", new String[]{"A1", "C1", "C2", "D1", "D2", "D3", "E1", "EV1", "EV2", "EV3", "GF1", "GF2", "GV2", "GV4"});
        lightmap.put("B3", new String[]{"A1", "C1", "C2", "D1", "D2", "D3", "E1", "EV1", "EV2", "EV3", "GF1", "GF2", "GV2", "GV4"});
        lightmap.put("B4", new String[]{"A1", "B5", "BB1", "C2", "E1", "EV1", "EV2", "EV3", "FF1", "FF2","FV2","FV4"});
        lightmap.put("B5", new String[]{"A1", "B4", "C2"});
        lightmap.put("BB1", new String[]{"A1", "B4", "C2", "D1", "D2", "D3", "E1", "EV1", "EV2", "EV3", "GF1", "GF2", "GV2", "GV4" });
        lightmap.put("C1", new String[]{"A1", "A2", "A3", "B1", "B2", "B3", "D1", "D2", "D3", "GF1", "GF2", "GV2", "GV4"});
        lightmap.put("C2", new String[]{"A1", "A2", "A3", "A4", "B1", "B2", "B3", "B4", "B5", "D1", "FF1", "FF2", "FV4"});
        lightmap.put("C3", new String[]{"A2", "A3", "D1", "E1", "EV2", "EV4"});
        lightmap.put("D1", new String[]{"A1", "A2", "A3", "B1", "B2", "B3", "C2", "C3", "E1", "EV2", "EV4", "FF1", "FF2", "FV1", "FV3"});
        lightmap.put("D2", new String[]{"A1", "A2", "A3", "A4", "B1", "B2", "B3", "C1", "FF1", "FF2", "FV1", "FV3"});
        lightmap.put("D3", new String[]{"B2", "B3", "C1", "GF1", "GF2", "GV2", "GV4", "FF1", "FF2", "FV1", "FV3"});
        lightmap.put("E1", new String[]{"A2", "A3", "C3", "D1"});
        //Voet en fiets verkeer
        lightmap.put("EV1", new String[]{"B1", "B2", "B3", "B4", "BB1"});
        lightmap.put("EV2", new String[]{"A2", "A3", "AB1", "C3", "D1"});
        lightmap.put("EV3", new String[]{"B1", "B2", "B3", "B4", "BB1"});
        lightmap.put("EV4", new String[]{"A2", "A3", "AB1", "C3", "D1"});
        lightmap.put("FF1", new String[]{"A1", "B4", "C2", "D1", "D2", "D3"});
        lightmap.put("FF2", new String[]{"A1", "B4", "C2", "D1", "D2", "D3"});
        lightmap.put("FV1", new String[]{"D1", "D2", "D3"});
        lightmap.put("FV2", new String[]{"A1", "B4", "C2"});
        lightmap.put("FV3", new String[]{"D1", "D2", "D3"});
        lightmap.put("FV4", new String[]{"A1", "B4", "C2"});
        lightmap.put("GF1", new String[]{"A1", "A2", "A3", "A4", "AB1", "AB2", "B2", "B3", "C1", "D3"});
        lightmap.put("GF2", new String[]{"A1", "A2", "A3", "A4", "AB1", "AB2", "B2", "B3", "C1", "D3"});
        lightmap.put("GV1", new String[]{"A1", "A2", "A3", "A4", "AB1", "AB2"});
        lightmap.put("GV2", new String[]{"B2", "B3", "C1", "D3"});
        lightmap.put("GV3", new String[]{"A1", "A2", "A3", "A4", "AB1", "AB2"});
        lightmap.put("GV4", new String[]{"B2", "B3", "C1", "D3"});

    }

    public Stoplichten algo(HashMap<String, Integer> verkeermap){
        Stoplichten stoplichten = new Stoplichten();

        for(String i : verkeermap.keySet())
        {

            switch (i){
                case "A1":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getA1() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setA1(2);
                        }
                    }
                    break;
                }
                case "A2":
                {
                    System.out.println(i + ": " +  verkeermap.get(i));
                    if (verkeermap.get(i) > 0 && stoplichten.getA2() == 0) {
                        System.out.println("This makes no sense");
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            System.out.println("What");
                            stoplichten.setA2(2);
                        }
                    }
                    break;
                }
                case "A3":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getA3() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setA3(2);
                        }
                    }
                    break;
                }
                case "A4":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getA4() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setA4(2);
                        }
                    }
                    break;
                }
                case "AB1":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getAB1() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setAB1(2);
                        }
                    }
                    break;
                }
                case "AB2":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getAB2() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setAB2(2);
                        }
                    }
                    break;
                }
                case "B1":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getB1() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setB1(2);
                        }
                    }
                    break;
                }
                case "B2":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getB2() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setB2(2);
                        }
                    }
                    break;
                }
                case "B3":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getB3() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setB3(2);
                        }
                    }
                    break;
                }
                case "B4":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getB4() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setB4(2);
                        }
                    }
                    break;
                }
                case "B5":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getB5() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setB5(2);
                        }
                    }
                    break;
                }
                case "BB1":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getBB1() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setBB1(2);
                        }
                    }
                    break;
                }
                case "C1":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getC1() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setC1(2);
                        }
                    }
                    break;
                }
                case "C2":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getC2() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setC2(2);
                        }
                    }
                    break;
                }
                case "C3":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getC3() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setC3(2);
                        }
                    }
                    break;
                }
                case "D1":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getD1() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setD1(2);
                        }
                    }
                    break;
                }
                case "D2":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getD2() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setD2(2);
                        }
                    }
                    break;
                }
                case "D3":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getD3() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setD3(2);
                        }
                    }
                    break;
                }
                case "E1":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getE1() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setE1(2);
                        }
                    }
                    break;
                }
                case "EV1":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getEV1() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setEV1(2);
                        }
                    }
                    break;
                }
                case "EV2":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getEV2() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setEV2(2);
                        }
                    }
                    break;
                }
                case "EV3":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getEV3() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setEV3(2);
                        }
                    }
                    break;
                }
                case "EV4":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getEV4() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setEV4(2);
                        }
                    }
                    break;
                }
                case "FF1":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getFF1() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setFF1(2);
                        }
                    }
                    break;
                }
                case "FF2":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getFF2() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setFF2(2);
                        }
                    }
                    break;
                }
                case "FV1":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getFV1() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setFV1(2);
                        }
                    }
                    break;
                }
                case "FV2":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getFV2() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setFV2(2);
                        }
                    }
                    break;
                }
                case "FV3":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getFV3() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setFV3(2);
                        }
                    }
                    break;
                }
                case "FV4":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getFV4() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setFV4(2);
                        }
                    }
                    break;
                }
                case "GF1":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getGF1() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setGF1(2);
                        }
                    }
                    break;
                }
                case "GF2":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getGF2() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setGF2(2);
                        }
                    }
                    break;
                }
                case "GV1":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getGV1() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setGV1(2);
                        }
                    }
                    break;
                }
                case "GV2":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getGV2() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setGV2(2);
                        }
                    }
                    break;
                }
                case "GV3":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getGV3() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setGV3(2);
                        }
                    }
                    break;
                }
                case "GV4":
                {
                    if (verkeermap.get(i) > 0 && stoplichten.getGV4() == 0) {
                        if (checkconflictzones(lightmap.get(i), stoplichten)) {
                            stoplichten.setGV4(2);
                        }
                    }
                    break;
                }
            }

        }

        return stoplichten;
    }

    public boolean checkconflictzones(String[] conflictzones, Stoplichten stoplichten){
        for (String i : conflictzones)
        {
            switch (i){
                case "A1":
                {
                    if(stoplichten.getA1() != 0)
                        return false;
                    break;
                }
                case "A2":
                {
                    if(stoplichten.getA2() != 0)
                        return false;
                    break;
                }
                case "A3":
                {
                    if(stoplichten.getA3() != 0)
                        return false;
                    break;
                }
                case "A4":
                {
                    if(stoplichten.getA4() != 0)
                        return false;
                    break;
                }
                case "AB1":
                {
                    if(stoplichten.getAB1() != 0)
                        return false;
                    break;
                }
                case "AB2":
                {
                    if(stoplichten.getAB2() != 0)
                        return false;
                    break;
                }
                case "B1":
                {
                    if(stoplichten.getB1() != 0)
                        return false;
                    break;
                }
                case "B2":
                {
                    if(stoplichten.getB2() != 0)
                        return false;
                    break;
                }
                case "B3":
                {
                    if(stoplichten.getB3() != 0)
                        return false;
                    break;
                }
                case "B4":
                {
                    if(stoplichten.getB4() != 0)
                        return false;
                    break;
                }
                case "B5":
                {
                    if(stoplichten.getB5() != 0)
                        return false;
                    break;
                }
                case "BB1":
                {
                    if(stoplichten.getBB1() != 0)
                        return false;
                    break;
                }
                case "C1":
                {
                    if(stoplichten.getC1() != 0)
                        return false;
                    break;
                }
                case "C2":
                {
                    if(stoplichten.getC2() != 0)
                        return false;
                    break;
                }
                case "C3":
                {
                    if(stoplichten.getC3() != 0)
                        return false;
                    break;
                }
                case "D1":
                {
                    if(stoplichten.getD1() != 0)
                        return false;
                    break;
                }
                case "D2":
                {
                    if(stoplichten.getD2() != 0)
                        return false;
                    break;
                }
                case "D3":
                {
                    if(stoplichten.getD3() != 0)
                        return false;
                    break;
                }
                case "E1":
                {
                    if(stoplichten.getE1() != 0)
                        return false;
                    break;
                }
                case "EV1":
                {
                    if(stoplichten.getEV1() != 0)
                        return false;
                    break;
                }
                case "EV2":
                {
                    if(stoplichten.getEV2() != 0)
                        return false;
                    break;
                }
                case "EV3":
                {
                    if(stoplichten.getEV3() != 0)
                        return false;
                    break;
                }
                case "EV4":
                {
                    if(stoplichten.getEV4() != 0)
                        return false;
                    break;
                }
                case "FF1":
                {
                    if(stoplichten.getFF1() != 0)
                        return false;
                    break;
                }
                case "FF2":
                {
                    if(stoplichten.getFF2() != 0)
                        return false;
                    break;
                }
                case "FV1":
                {
                    if(stoplichten.getFV1() != 0)
                        return false;
                    break;
                }
                case "FV2":
                {
                    if(stoplichten.getFV2() != 0)
                        return false;
                    break;
                }
                case "FV3":
                {
                    if(stoplichten.getFV3() != 0)
                        return false;
                    break;
                }
                case "FV4":
                {
                    if(stoplichten.getFV4() != 0)
                        return false;
                    break;
                }
                case "GF1":
                {
                    if(stoplichten.getGF1() != 0)
                        return false;
                    break;
                }
                case "GF2":
                {
                    if(stoplichten.getGF2() != 0)
                        return false;
                    break;
                }
                case "GV1":
                {
                    if(stoplichten.getGV1() != 0)
                        return false;
                    break;
                }
                case "GV2":
                {
                    if(stoplichten.getGV2() != 0)
                        return false;
                    break;
                }
                case "GV3":
                {
                    if(stoplichten.getGV3() != 0)
                        return false;
                    break;
                }
                case "GV4":
                {
                    if(stoplichten.getGV4() != 0)
                        return false;
                    break;
                }
            }
        }

      return true;
    }











}
