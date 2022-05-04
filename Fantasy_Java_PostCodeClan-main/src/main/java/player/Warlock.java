package player;

import magic.ISpell;
import protects.IDefend;

public class Warlock extends Mage{

    public Warlock(String name, int healthPoints, ISpell spell, IDefend defend) {
        super(name, healthPoints, spell, defend);
    }

}