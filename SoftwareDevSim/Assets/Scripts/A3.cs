using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class A3 : MonoBehaviour
{
    // Start is called before the first frame update
    void Start()
    {

    }

    // Update is called once per frame
    void Update()
    {
        if (Connection.stoplichten.A3 == "0")
        {
            GetComponent<Renderer>().material.SetColor("_Color", Color.red);
        }
        else if (Connection.stoplichten.A3 == "1")
        {
            GetComponent<Renderer>().material.SetColor("_Color", Color.yellow);
        }
        else if (Connection.stoplichten.A3 == "2")
        {
            GetComponent<Renderer>().material.SetColor("_Color", Color.green);
        }
    }
}
