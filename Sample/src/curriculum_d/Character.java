package curriculum_d;

class Character {
		String name;
		int hp;
		int at;
		int sp;
	
	
	Character(String name,int hp,int at,int sp){
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}
	
	public void status()  {
        System.out.println("名前: " + name);
        System.out.println("HP: " + hp);
        System.out.println("AT: " + at);
        System.out.println("SP: " + sp);
        System.out.println("-------------------");
    }
	
}