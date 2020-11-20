import javax.swing.JFrame;

public class LeagueInvaders {
	static JFrame frame;
	static GamePanel gp;

	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;

	public static void main(String[] args) {
		GamePanel game = new GamePanel();
		LeagueInvaders a = new LeagueInvaders();
		LeagueInvaders.setup();
	}

	public LeagueInvaders() {
		frame = new JFrame();
		gp = new GamePanel();
	}

	static void setup() {
		frame.add(gp);
		frame.addKeyListener(gp);
		frame.setVisible(true);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
