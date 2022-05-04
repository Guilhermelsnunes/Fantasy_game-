import enemies.Enemy;
import enemies.Orc;
import magic.ISpell;
import magic.LighteningStrike;
import org.junit.Before;
import org.junit.Test;
import player.Wizard;
import protects.Dragon;
import protects.IDefend;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Enemy enemy;
    ISpell spell;
    IDefend defendMageCastOnEnemy;

    @Before
    public void before(){
        defendMageCastOnEnemy = new Dragon();
        spell = new LighteningStrike();
        enemy = new Orc(10);
        wizard = new Wizard("Merlin", 10, spell, defendMageCastOnEnemy);
    }

    @Test
    public void hasName(){
        assertEquals("Merlin", wizard.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(10, wizard.getHealthPoints());
    }

    @Test
    public void canCast(){
        wizard.cast(enemy);
        assertEquals(6, enemy.getHealthPoints());
    }

    @Test
    public void canDefendMageCastOnEnemy(){
        wizard.cast(enemy);
        wizard.setDefendMageCastOnEnemy(defendMageCastOnEnemy);
        wizard.defendMageCastOnEnemy(enemy);
        assertEquals(defendMageCastOnEnemy, wizard.getDefendMageCastOnEnemy());
    }
}