using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using PathCreation;

public class C1Behaviour : MonoBehaviour
{
    public PathCreator pathCreator;
    public float speed = 70;
    float distanceTravelled;
    public EndOfPathInstruction end = EndOfPathInstruction.Stop;
    public static float stoplicht_end = 0.25f;
    public static float stoplicht_start = 0.215f;
    public static float path_despawn_start = 0.97f;
    public static float path_despawn_end = 0.99f;

    void Update()
    {
        distanceTravelled += speed * Time.deltaTime;
        transform.position = pathCreator.path.GetPointAtDistance(distanceTravelled, end);
        transform.rotation = pathCreator.path.GetRotationAtDistance(distanceTravelled);
        if (Connection.stoplichten.C1 == "0")
        {
            if ((transform.position.y <= pathCreator.path.GetPointAtTime(stoplicht_start).y && transform.position.y >= pathCreator.path.GetPointAtTime(stoplicht_end).y))
            {
                speed = 0;
            }
        }
        else
        {
            speed = 70;
            stoplicht_start = 0.25f;
        }

        if ((transform.position.x >= pathCreator.path.GetPointAtTime(path_despawn_start).x && transform.position.x <= pathCreator.path.GetPointAtTime(path_despawn_end).x) || (transform.position.y >= pathCreator.path.GetPointAtTime(path_despawn_start).y && transform.position.y <= pathCreator.path.GetPointAtTime(path_despawn_end).y))
        {
            Destroy(gameObject);
        }
    }
}
