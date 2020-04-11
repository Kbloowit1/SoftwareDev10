using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class deployObject : MonoBehaviour
{
    public GameObject BB1prefab;
    public GameObject AB1prefab;
    public float respawnTime = 8.0f;

    // Start is called before the first frame update
    void Start()
    {
        StartCoroutine(BB1Call());
        StartCoroutine(AB1Call());
    }

    private void spawnObject(GameObject objectToSpawn)
    {
        GameObject spawnObject = Instantiate(objectToSpawn) as GameObject;
    }

    IEnumerator BB1Call()
    {
        while (true)
        {
            yield return new WaitForSeconds(respawnTime);
            spawnObject(BB1prefab);
            BB1Behaviour.stoplicht_start = BB1Behaviour.stoplicht_start - 0.055f;
        }
    }
    IEnumerator AB1Call()
    {
        while (true)
        {
            yield return new WaitForSeconds(respawnTime);
            spawnObject(AB1prefab);
            AB1Behaviour.stoplicht_start = AB1Behaviour.stoplicht_start - 0.045f;
        }
    }
}
