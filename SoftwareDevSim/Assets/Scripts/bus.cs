using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class bus : MonoBehaviour
{
    private Rigidbody2D rb;

    void Start()
    {
        rb = this.GetComponent<Rigidbody2D>();
        rb.velocity = new Vector2(-50, 0);
    }

    void Update()
    {
        if(transform.position.x < 60)
        {
            Destroy(this.gameObject);
        }
    }
}
