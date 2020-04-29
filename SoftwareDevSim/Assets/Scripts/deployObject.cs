using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class deployObject : MonoBehaviour
{
    public GameObject A1prefab;
    public GameObject A2prefab;
    public GameObject A3prefab;
    public GameObject A4prefab;

    public GameObject BB1prefab;
    public GameObject B1prefab;
    public GameObject B2prefab;
    public GameObject B3prefab;
    public GameObject B4prefab;

    public GameObject C1prefab;
    public GameObject C2prefab;
    public GameObject C3prefab;

    public GameObject D1prefab;
    public GameObject D2prefab;

    public GameObject AB2prefab;
    public GameObject AB1prefab;

    void Start()
    {
        StartCoroutine(B1Call());
        StartCoroutine(B2Call());
        StartCoroutine(B3Call());
        StartCoroutine(B4Call());
        StartCoroutine(BB1Call());

        StartCoroutine(C1Call());
        StartCoroutine(C2Call());
        StartCoroutine(C3Call());

        StartCoroutine(D1Call());
        StartCoroutine(D2Call());

        StartCoroutine(AB2Call());
        StartCoroutine(AB1Call());
        StartCoroutine(A1Call());
        StartCoroutine(A2Call());
        StartCoroutine(A3Call());
        StartCoroutine(A4Call());
    }

    private void spawnObject(GameObject objectToSpawn)
    {
        GameObject spawnObject = Instantiate(objectToSpawn) as GameObject;
    }
    IEnumerator A1Call()
    {
        while (A1Behaviour.stoplicht_start > 0.2f)
        {
            yield return new WaitForSeconds(8.0f);
            spawnObject(A1prefab);
            A1Behaviour.stoplicht_start = A1Behaviour.stoplicht_start - 0.045f;
        }
    }
    IEnumerator A2Call()
    {
        while (A2Behaviour.stoplicht_start > 0.15f)
        {
            yield return new WaitForSeconds(8.0f);
            spawnObject(A2prefab);
            A2Behaviour.stoplicht_start = A2Behaviour.stoplicht_start - 0.038f;
        }
    }
    IEnumerator A3Call()
    {
        while (A3Behaviour.stoplicht_start > 0.15f)
        {
            yield return new WaitForSeconds(8.0f);
            spawnObject(A3prefab);
            A3Behaviour.stoplicht_start = A3Behaviour.stoplicht_start - 0.038f;
        }
    }
    IEnumerator A4Call()
    {
        while (A4Behaviour.stoplicht_start > 0.15f)
        {
            yield return new WaitForSeconds(8.0f);
            spawnObject(A4prefab);
            A4Behaviour.stoplicht_start = A4Behaviour.stoplicht_start - 0.051f;
        }
    }
    IEnumerator B1Call()
    {
        while (B1Behaviour.stoplicht_start > 0.2f)
        {
            yield return new WaitForSeconds(8.0f);
            spawnObject(B1prefab);
            B1Behaviour.stoplicht_start = B1Behaviour.stoplicht_start - 0.047f;
        }
    }
    IEnumerator B2Call()
    {
        while (B2Behaviour.stoplicht_start > 0.2f)
        {
            yield return new WaitForSeconds(8.0f);
            spawnObject(B2prefab);
            B2Behaviour.stoplicht_start = B2Behaviour.stoplicht_start - 0.036f;
        }
    }
    IEnumerator B3Call()
    {
        while (B3Behaviour.stoplicht_start > 0.2f)
        {
            yield return new WaitForSeconds(8.0f);
            spawnObject(B3prefab);
            B3Behaviour.stoplicht_start = B3Behaviour.stoplicht_start - 0.037f;
        }
    }
    IEnumerator B4Call()
    {
        while (B4Behaviour.stoplicht_start > 0.2f)
        {
            yield return new WaitForSeconds(8.0f);
            spawnObject(B4prefab);
            B4Behaviour.stoplicht_start = B4Behaviour.stoplicht_start - 0.037f;
        }
    }
    IEnumerator BB1Call()
    {
        while (BB1Behaviour.stoplicht_start > 0.35f)
        {
                yield return new WaitForSeconds(8.0f);
                spawnObject(BB1prefab);
                BB1Behaviour.stoplicht_start = BB1Behaviour.stoplicht_start - 0.055f;
        }
    }
    IEnumerator C1Call()
    {
        while (C1Behaviour.stoplicht_start > 0.15f)
        {
            yield return new WaitForSeconds(8.0f);
            spawnObject(C1prefab);
            C1Behaviour.stoplicht_start = C1Behaviour.stoplicht_start - 0.047f;
        }
    }
    IEnumerator C2Call()
    {
        while (C2Behaviour.stoplicht_start > 0.18f)
        {
            yield return new WaitForSeconds(8.0f);
            spawnObject(C2prefab);
            C2Behaviour.stoplicht_start = C2Behaviour.stoplicht_start - 0.047f;
        }
    }
    IEnumerator C3Call()
    {
        while (C3Behaviour.stoplicht_start > 0.18f)
        {
            yield return new WaitForSeconds(8.0f);
            spawnObject(C3prefab);
            C3Behaviour.stoplicht_start = C3Behaviour.stoplicht_start - 0.047f;
        }
    }
    IEnumerator D1Call()
    {
        while (D1Behaviour.stoplicht_start > 0.15f)
        {
            yield return new WaitForSeconds(8.0f);
            spawnObject(D1prefab);
            D1Behaviour.stoplicht_start = D1Behaviour.stoplicht_start - 0.037f;
        }
    }
    IEnumerator D2Call()
    {
        while (D2Behaviour.stoplicht_start > 0.15f)
        {
            yield return new WaitForSeconds(8.0f);
            spawnObject(D2prefab);
            D2Behaviour.stoplicht_start = D2Behaviour.stoplicht_start - 0.043f;
        }
    }
    IEnumerator AB2Call()
    {
        while (AB2Behaviour.stoplicht_start > 0.20f)
        {
                yield return new WaitForSeconds(6.0f);
                spawnObject(AB2prefab);
                AB1Behaviour.stoplicht_start = AB1Behaviour.stoplicht_start - 0.085f;
                AB2Behaviour.stoplicht_start = AB2Behaviour.stoplicht_start - 0.085f;
        }
    }
    IEnumerator AB1Call()
    {
        while (AB1Behaviour.stoplicht_start > 0.20f)
        {
                yield return new WaitForSeconds(8.0f);
                spawnObject(AB1prefab);
                AB1Behaviour.stoplicht_start = AB1Behaviour.stoplicht_start - 0.085f;
                AB2Behaviour.stoplicht_start = AB2Behaviour.stoplicht_start - 0.085f;
        }
    }
}
