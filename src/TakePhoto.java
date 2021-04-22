public class TakePhoto implements PhotoClick,ProcessPhoto{
    @Override
    public void clickPhoto() {
System.out.println("photo is captured");
    }

    @Override
    public void photoProcess(CameraMode mode) {
        System.out.println("photo is processed based camera mode");
    }
}
