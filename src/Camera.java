public class Camera {
    public static void main(String args[]) {
        TakePhoto photo = new TakePhoto();
        photo.clickPhoto();
        CameraMode mode= new Potrait();
        photo.photoProcess(mode);
        SavePhoto savePhoto=new PhotoSave();
        savePhoto.save(photo);
    }
}