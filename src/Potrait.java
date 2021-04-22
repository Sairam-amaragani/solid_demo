public class Potrait implements CameraMode{

    @Override
    public void cameraMode() {
System.out.println("Potrait mode is on");
blurBlackground();
    }
    public void blurBlackground(){
        System.out.println("Background is blured");
    }
}
