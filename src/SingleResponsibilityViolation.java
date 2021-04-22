public class SingleResponsibilityViolation implements ProcessPhoto,SavePhoto,PhotoClick{
/* violating Single responsibility principle because it is doing more than one thing
i.e. capturing photo and saving. */
    @Override
    public void clickPhoto() {
        System.out.println("photo is captured");
    }

    @Override
    public void photoProcess(CameraMode mode) {
        System.out.println("photo is processed based camera mode");

    }

    @Override
    public void save(TakePhoto photo) {
        System.out.println("photo is saved");

    }
}
