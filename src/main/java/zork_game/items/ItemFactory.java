package zork_game.items;

public class ItemFactory {

    public Weapons makeWeapon(String name, int addedAttackPower){
        return new Weapons(name, addedAttackPower);
    }

    public Sword makeSword(){
        return new Sword();
    }

    public Axe makeAxe(){
        return new Axe();
    }

    public Pistol makePistol() { return new Pistol(); }
}