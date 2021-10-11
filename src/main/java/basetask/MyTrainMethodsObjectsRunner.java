package basetask;

public class MyTrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();
        trainMethodsObjects.processMouse(new Mouse("Irina", 60));
        trainMethodsObjects.processSouce(new Souce("грибной", "коричневый"));
        trainMethodsObjects.processBee(new Bee("оса", 32));
        trainMethodsObjects.processObstacle(new Obstacle("большая лужа", "необычное"));
        trainMethodsObjects.processPineapple(new Pineapple("красный испанский", 833.23F));
    }
}
