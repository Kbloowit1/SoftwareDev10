using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class deployObject : MonoBehaviour
{
    public GameObject prefab;
    public float respawnTime = 1.0f;

    // Start is called before the first frame update
    void Start()
    {
        StartCoroutine(busCall());
    }

    private void spawnObject()
    {
        GameObject a = Instantiate(prefab) as GameObject;
        a.transform.position = new Vector3(880, 376, -11);
    }

    IEnumerator busCall()
    {
        while (true)
        {
            yield return new WaitForSeconds(respawnTime);
            spawnObject();
            bus.stoplicht_start = bus.stoplicht_start - 0.07f;
            if(bus.stoplicht_start <= 0.10f)
            {
                Connection.stoplichten.BB1 = "2";
            }
        }
    }
}
