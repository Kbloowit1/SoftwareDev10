﻿using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class FF1 : MonoBehaviour
{
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        if (Connection.stoplichten.FF1 == "0")
        {
            GetComponent<Renderer>().material.SetColor("_Color", Color.red);
        }
        else if (Connection.stoplichten.FF1 == "1")
        {
            GetComponent<Renderer>().material.SetColor("_Color", Color.yellow);
        }
        else if (Connection.stoplichten.FF1 == "2")
        {
            GetComponent<Renderer>().material.SetColor("_Color", Color.green);
        }
    }
}
