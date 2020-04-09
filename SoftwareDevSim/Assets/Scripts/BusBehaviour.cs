using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class BusBehaviour : MonoBehaviour
{
    public Vector3 target;
    public float speed;
    private Vector3 position;
    // Use this for initialization
    void Start()
    {
        target = new Vector3(118, 373, 0);
        position = gameObject.transform.position;
        speed = 25.0f;
    }

    // Update is called once per frame
    void Update()
    {
        if (Connection.stoplichten.A3 == "2")
        {
            float step = speed * Time.deltaTime;
            transform.position = Vector3.MoveTowards(transform.position, target, step);
            if (transform.position == target)
            {
                Debug.Log("Arrived");
            };
        }
    }
}
