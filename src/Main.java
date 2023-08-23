
class Main{
    public static void main(String[] args) {
        Hero[] heroes={new Magic(),new Warior(),new Medic()};
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].applySuperAbility());
            if(heroes[i] instanceof Medic){
                ((Medic) heroes[i]).increaseExperience();
            }
        }

    }
}