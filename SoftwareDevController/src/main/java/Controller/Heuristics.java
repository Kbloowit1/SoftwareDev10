package Controller;

import org.graalvm.compiler.core.LIRGenerationPhase;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

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
        lightmap.put("AB2", new String[]{"A4","AB1", "B1", "D2", "GF1", "GF2"});
        lightmap.put("B1", new String[] {"A2", "A3", "A4", "C1", "C2", "C3", "D1", "D2", "E1", "EV1", "EV2", "EV3", "EV4"});
        lightmap.put("B2", new String[]{"A1", "C1", "C2", "D1", "D2", "D3", "E1", "EV1", "EV2", "EV3", "GF1", "GF2", "GV2", "GV4"});
        lightmap.put("B3", new String[]{"A1", "C1", "C2", "D1", "D2", "D3", "E1", "EV1", "EV2", "EV3", "GF1", "GF2", "GV2", "GV4"});
        lightmap.put("B4", new String[]{"A1", "B5", "BB1", "C2", "E1", "EV1", "EV2", "EV3", "FF1", "FF2", "FV4"});
        lightmap.put("B5", new String[]{"A1", "B4", "C2"});
        lightmap.put("BB1", new String[]{"A1", "B4", "C2", "D1", "D2", "D3", "E1", "EV1", "EV2", "EV3", "GF1", "GF2", "GV2", "GV4" });
        lightmap.put("C1", new String[]{"A1", "A2", "A3", "B1", "B2", "B3", "D1", "D2", "D3", "GF1", "GF2", "GV2", "GV4"});
        lightmap.put("C2", new String[]{"A1", "A2", "A3", "A4", "B1", "B2", "B3", "B4", "B5", "D1", "FF1", "FF2", "FV4"});
        lightmap.put("C3", new String[]{"A2", "A3", "D1", "E1", "EV2", "EV4"});
        lightmap.put("D1", new String[]{"A1", "A2", "A3", "B1", "B2", "B3", "C2", "C3", "E1", "EV2", "EV4", "FF1", "FF2", "FV1", "FV3"});
        lightmap.put("D2", new String[]{"A1", "A2", "A3", "A4", "B1", "B2", "B3", "C1", "FF1", "FF2", "FV1", "FV3"});
        lightmap.put("D3", new String[]{"B2", "B3", "C1", "GF1", "GF2", "GV2", "GV4"});
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








}
