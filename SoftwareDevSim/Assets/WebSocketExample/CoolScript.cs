using System.Collections;
using System.Collections.Generic;
using Newtonsoft.Json;

public class CoolScript {
  static Verkeer verkeer = new Verkeer();

  public string verkeerJson = JsonConvert.SerializeObject(verkeer, Formatting.Indented);



}
