using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using PathCreation;

public class bus : MonoBehaviour
{
    public PathCreator pathCreator;
    public Vector3 target;
    public float speed = 70;
    float distanceTravelled;
    private Vector3 position;
    public EndOfPathInstruction end = EndOfPathInstruction.Stop;
    public static float stoplicht_end = 0.34f;
    public static float stoplicht_start = 0.27f;

    void Start()
    {
        target = new Vector3(422, 271, -11);
    }
    void Update()
    {
        distanceTravelled += speed * Time.deltaTime;
        transform.position = pathCreator.path.GetPointAtDistance(distanceTravelled, end);
        transform.rotation = pathCreator.path.GetRotationAtDistance(distanceTravelled);
        if (Connection.stoplichten.BB1 == "0")
        {
            if ((transform.position.x >= pathCreator.path.GetPointAtTime(stoplicht_start).x && transform.position.x <= pathCreator.path.GetPointAtTime(stoplicht_end).x) || (transform.position.y >= pathCreator.path.GetPointAtTime(stoplicht_start).y && transform.position.y <= pathCreator.path.GetPointAtTime(stoplicht_end).y))
            {
                speed = 0;
            }
        }
        else
        {
            speed = 70;
            stoplicht_start = 0.27f;
        }

        if ((transform.position.x >= pathCreator.path.GetPointAtTime(0.99f).x) && (transform.position.y >= pathCreator.path.GetPointAtTime(0.99f).y))
        {
            Destroy(gameObject);
        }
    }
}
