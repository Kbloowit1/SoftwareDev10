using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using Newtonsoft.Json;

using NativeWebSocket;

public class Connection : MonoBehaviour
{
  WebSocket websocket;
  CoolScript coolscript = new CoolScript();
  public static Stoplichten stoplichten = new Stoplichten();

    public Sprite sprite;
    // Start is called before the first frame update
  async void Start()
  {
    websocket = new WebSocket("ws://94db6876.ngrok.io/controller");
        //websocket = new WebSocket("ws://trafic.azurewebsites.net/simulation");

        GameObject go = new GameObject("Test");
        SpriteRenderer renderer = go.AddComponent<SpriteRenderer>();
        renderer.sprite = sprite;


        websocket.OnOpen += () =>
    {
      Debug.Log("Connection open!");
      Debug.Log(coolscript.verkeerJson);
    };

    websocket.OnError += (e) =>
    {
      Debug.Log("Error! " + e);
    };

    websocket.OnClose += (e) =>
    {
      Debug.Log("Connection closed!");
    };

    websocket.OnMessage += (bytes) =>
    {
        // Reading a plain text message
        Debug.Log(bytes);
        string message = System.Text.Encoding.UTF8.GetString(bytes);
        Debug.Log("String message: " + message);
        stoplichten = JsonConvert.DeserializeObject<Stoplichten>(message);
        Debug.Log("OnMessage! " + stoplichten.A1);
    };

    // Keep sending messages at every 0.3s
    InvokeRepeating("SendWebSocketMessage", 0.0f, 5.0f);

    await websocket.Connect();
  }

  // Update is called once per frame
  void Update()
  {
  }

  async void SendWebSocketMessage()
  {
    if (websocket.State == WebSocketState.Open)
    {
      // Sending plain text
      await websocket.SendText(coolscript.verkeerJson);
    }
  }

  private async void OnApplicationQuit()
  {
    await websocket.Close();
  }
}
