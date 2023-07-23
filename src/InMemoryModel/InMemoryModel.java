package src.InMemoryModel;

import src.ModelElements.Camera;
import src.ModelElements.Flash;
import src.ModelElements.PoligonalModel;
import src.ModelElements.Scene;

public class InMemoryModel implements IModelChager, IModelChahgedObserver {
    public PoligonalModel Models;
    public Scene Scenes;
    public Flash Flashes;
    public Camera Cameras;
    private IModelChangeObserver changeObservers;

    

    public InMemoryModel(PoligonalModel models, Scene scenes, Flash flashes, Camera cameras, IModelChangeObserver changeObservers) {
        Models = models;
        Scenes = scenes;
        Flashes = flashes;
        Cameras = cameras;
        this.changeObservers = changeObservers;
    }

    public Scene GetScena(int num){

    }
    
    @Override
    public void NotifyChanger(IModelChanger sender) {
        
        
    }

    
}
