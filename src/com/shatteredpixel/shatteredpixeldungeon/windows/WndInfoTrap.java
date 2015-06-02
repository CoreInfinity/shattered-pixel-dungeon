package com.shatteredpixel.shatteredpixeldungeon.windows;

import com.shatteredpixel.shatteredpixeldungeon.levels.traps.Trap;
import com.shatteredpixel.shatteredpixeldungeon.sprites.TrapSprite;

public class WndInfoTrap extends WndTitledMessage {

	public WndInfoTrap(Trap trap) {

		super(new TrapSprite( trap.image ), trap.name, trap.desc());

	}

}
