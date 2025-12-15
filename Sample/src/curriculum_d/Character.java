package curriculum_d;

public class Character {
	private String name;
	private int hp;
	private int at;
	private int sp;

	public Character(String name, int hp, int at, int sp) {
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getAt() {
		return at;
	}

	public int getSp() {
		return sp;
	}

	public boolean isAlive() {
		return hp > 0;
	}

	public void attack(Character opponent) {
		opponent.hp -= this.at;
		if (opponent.hp < 0)
			opponent.hp = 0;
		System.out.println(this.name + "の攻撃！ " + opponent.name + "は" + this.at + "ダメージを受けた！");
	}

	@Override
	public String toString() {
		return name + " (HP:" + hp + ", AT:" + at + ", SP:" + sp + ")";
	}
}