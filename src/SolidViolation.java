//violating interface segregation
public interface SolidViolation {
    public void clickPhoto();
    public void photoProcess(NormalMode mode);//violating dependency inversion
    public void save();
}
