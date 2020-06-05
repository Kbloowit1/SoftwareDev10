# SoftwareDev10
Cool and Good

### Prerequisites
This needs to be downloaded before being able to run the simulation

```
Unity version 3.6 or higher
```

This is needed to run the controller

```
Java version 8 or higher
Maven version 3.6.3
```

### Running the application
Open IDE and open the correct folder to run the controller. Type the following in the terminal

```
mvn jetty:run
```

Open simulation in unity. Open the Connection.cs file and change this line of code

```
websocket = new WebSocket("ws://xxxxxxxxx/controller");
```

And change it to the following

```
websocket = new Websocket("ws://localhost:8080/controller");
```

Now click the run button in Unity. The application should now be running. 
