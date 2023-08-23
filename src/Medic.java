public class Medic extends Hero  {
    private int healtPoints=10;
    @Override
    public String applySuperAbility() {
        return "медик применил способность healPoint";
    }
    public void increaseExperience(){
        healtPoints+=0.1;
        System.out.println("Medic увеличил здоровия 10%");
    }

}