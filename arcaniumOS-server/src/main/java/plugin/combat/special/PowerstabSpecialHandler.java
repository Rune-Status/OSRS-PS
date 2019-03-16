package plugin.combat.special;

import org.arcanium.game.node.entity.Entity;
import org.arcanium.game.node.entity.combat.BattleState;
import org.arcanium.game.node.entity.combat.CombatStyle;
import org.arcanium.game.node.entity.combat.InteractionType;
import org.arcanium.game.node.entity.combat.handlers.MeleeSwingHandler;
import org.arcanium.game.node.entity.impl.Animator;
import org.arcanium.game.node.entity.npc.NPC;
import org.arcanium.game.node.entity.player.Player;
import org.arcanium.game.world.map.RegionManager;
import org.arcanium.game.world.update.flag.context.Animation;
import org.arcanium.game.world.update.flag.context.Graphics;
import org.arcanium.plugin.Plugin;
import org.arcanium.tools.RandomFunction;

import java.util.List;

/**
 * Handles the Powerstab special attack.
 *
 * @author Emperor
 */
public final class PowerstabSpecialHandler extends MeleeSwingHandler implements Plugin<Object> {

    /**
     * The special energy required.
     */
    private static final int SPECIAL_ENERGY = 60;

    /**
     * The attack animation.
     */
    private static final Animation ANIMATION = new Animation(3157, Animator.Priority.HIGH);

    /**
     * The graphic.
     */
    private static final Graphics GRAPHIC = new Graphics(1225);

    @Override
    public Object fireEvent(String identifier, Object... args) {
        return null;
    }

    @Override
    public void impact(Entity entity, Entity victim, BattleState state) {
        if (state.getTargets() != null) {
            for (BattleState s : state.getTargets()) {
                if (s != null) {
                    s.getVictim().getImpactHandler().handleImpact(entity, s.getEstimatedHit(), CombatStyle.MELEE, s);
                }
            }
            return;
        }
        victim.getImpactHandler().handleImpact(entity, state.getEstimatedHit(), CombatStyle.MELEE, state);
    }

    @Override
    public Plugin<Object> newInstance(Object arg) throws Throwable {
        CombatStyle.MELEE.getSwingHandler().register(7158, this);
        return this;
    }

    @Override
    public int swing(Entity entity, Entity victim, BattleState state) {
        if (!((Player) entity).getSettings().drainSpecial(SPECIAL_ENERGY)) {
            return -1;
        }
        boolean multi = entity.getProperties().isMultiZone();
        if (!multi) {
            return super.swing(entity, victim, state);
        }
        @SuppressWarnings("rawtypes")
        List list = victim instanceof NPC ? RegionManager.getSurroundingNPCs(entity, 9, entity) : RegionManager.getSurroundingPlayers(entity, 9, entity);
        BattleState[] targets = new BattleState[list.size()];
        int count = 0;
        for (Object o : list) {
            Entity e = (Entity) o;
            if (CombatStyle.RANGE.getSwingHandler().canSwing(entity, e) != InteractionType.NO_INTERACT) {
                BattleState s = targets[count++] = new BattleState(entity, e);
                int hit = 0;
                if (isAccurateImpact(entity, e)) {
                    hit = RandomFunction.random(calculateHit(entity, e, 1.0));
                }
                s.setEstimatedHit(hit);
            }
        }
        state.setTargets(targets);
        return 1;
    }

    @Override
    public void visualize(Entity entity, Entity victim, BattleState state) {
        entity.visualize(ANIMATION, GRAPHIC);
    }

    @Override
    public void visualizeImpact(Entity entity, Entity victim, BattleState state) {
        if (state.getTargets() != null) {
            for (BattleState s : state.getTargets()) {
                if (s != null) {
                    s.getVictim().animate(victim.getProperties().getDefenceAnimation());
                }
            }
            return;
        }
        victim.animate(victim.getProperties().getDefenceAnimation());
    }
}
