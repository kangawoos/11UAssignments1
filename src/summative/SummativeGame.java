package summative;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

/**
 *
 * @author wrigm7406
 */
public class SummativeGame extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "Cannon Chaos";
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;
    // YOUR GAME VARIABLES WOULD GO HERE  
    int playerDX = 0;
    int playerDY = 0;
    // create the player
    Rectangle player = new Rectangle(60, 150, 20, 20);
    // create a font for the words start and finish
    Font biggerFont = new Font("Comic Sans MS", Font.BOLD, 13);
    // create a font for the score
    Font scoreFont = new Font("Comic Sans MS", Font.BOLD, 42);
    // create a font for informing the user
    Font informFont = new Font("Comic Sans MS", Font.BOLD, 10);
    // create an array for the blocks
    Rectangle[] blocks = new Rectangle[21];
    // create booleans for the players actions
    boolean playerUp = false;
    boolean playerDown = false;
    boolean playerLeft = false;
    boolean playerRight = false;
    // set the size of the cannon
    int cannonSize = 20;
    // create the five cannons and set their starting points
    Rectangle cannon1 = new Rectangle(WIDTH / 2 - cannonSize / 2, HEIGHT / 2 - cannonSize / 2, cannonSize, cannonSize);
    Rectangle cannon2 = new Rectangle(WIDTH / 3 - cannonSize / 2, 220 - cannonSize / 2, cannonSize, cannonSize);
    Rectangle cannon3 = new Rectangle(450 - cannonSize / 2, 425 - cannonSize / 2, cannonSize, cannonSize);
    Rectangle cannon4 = new Rectangle(600 - cannonSize / 2, 100 - cannonSize / 2, cannonSize, cannonSize);
    Rectangle cannon5 = new Rectangle(200 - cannonSize / 2, 500 - cannonSize / 2, cannonSize, cannonSize);
    Rectangle cannon6 = new Rectangle(WIDTH / 2 - cannonSize / 2, HEIGHT / 2 - cannonSize / 2, cannonSize, cannonSize);
    Rectangle cannon7 = new Rectangle(600 - cannonSize / 2, 100 - cannonSize / 2, cannonSize, cannonSize);
    Rectangle cannon8 = new Rectangle(200 - cannonSize / 2, 500 - cannonSize / 2, cannonSize, cannonSize);
    // set the players speed
    int playerSpeed = 2;
    // set the players score to zero at the start
    int playerScore = 0;
    // set different cannon speeds for variety
    int cannon1Speed = 10;
    int cannon2Speed = 8;
    int cannon3Speed = 7;
    int cannon4Speed = 9;
    int cannon5Speed = 10;
    int cannon6Speed = 7;
    int cannon7Speed = 9;
    int cannon8Speed = 10;
    // cannon 1 travels to the right
    int cannon1XDirection = 1;
    // cannon 2 travels to the right
    int cannon2XDirection = 1;
    // cannon 3 travels to the left
    int cannon3XDirection = -1;
    // cannon 4 travels to the left
    int cannon4XDirection = -1;
    // cannon 5 travels to the right
    int cannon5XDirection = 1;
    
    int cannon6YDirection = 1;
    
    int cannon7YDirection = 1;
    
    int cannon8YDirection = 1;

    // GAME VARIABLES END HERE   
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public SummativeGame() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();

        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE               
        // create a black background
        g.setColor(Color.BLACK);
        // fill in the background
        g.fillRect(0, 0, WIDTH, HEIGHT);

        // draw the blocks
        g.setColor(Color.GREEN);
        for (int i = 0; i < blocks.length; i++) {
            g.fillRect(blocks[i].x, blocks[i].y, blocks[i].width, blocks[i].height);
        }

        // draw the player
        g.setColor(Color.RED);
        g.fillRect(player.x, player.y, player.width, player.height);

        // set the font colour
        g.setColor(Color.RED);
        // make the font larger
        g.setFont(biggerFont);
        // draw the start point letters
        g.drawString("Start", 55, 190);
        // draw the finish point letters
        g.drawString("Finish", 135, 20);

        // make the font the specific score font
        g.setFont(scoreFont);
        // add up score and place the score at the top middle of the screen
        g.drawString("" + playerScore, WIDTH / 2, 50);

        // set the font to the information font
        g.setFont(informFont);
        // tell the user the info (printed at the top middle of the screen)
        g.drawString("GET TO THE FINISH BEFORE 2000", 340, 13);

        // draw the first cannon
        g.setColor(Color.YELLOW);
        g.fillRect(cannon1.x, cannon1.y, cannon1.width, cannon1.height);

        // draw the second cannon
        g.setColor(Color.YELLOW);
        g.fillRect(cannon2.x, cannon2.y, cannon2.width, cannon2.height);

        // draw the third cannon
        g.setColor(Color.YELLOW);
        g.fillRect(cannon3.x, cannon3.y, cannon3.width, cannon3.height);

        // draw the four cannon
        g.setColor(Color.YELLOW);
        g.fillRect(cannon4.x, cannon4.y, cannon4.width, cannon4.height);

        // draw the five cannon
        g.setColor(Color.YELLOW);
        g.fillRect(cannon5.x, cannon5.y, cannon5.width, cannon5.height);

        // draw the first cannon
        g.setColor(Color.YELLOW);
        g.fillRect(cannon6.x, cannon6.y, cannon6.width, cannon6.height);
        
        // draw the first cannon
        g.setColor(Color.YELLOW);
        g.fillRect(cannon7.x, cannon7.y, cannon7.width, cannon7.height);
        
        // draw the first cannon
        g.setColor(Color.YELLOW);
        g.fillRect(cannon8.x, cannon8.y, cannon8.width, cannon8.height);
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
        // create and set up the 21 blocks using the array
        blocks[0] = new Rectangle(0, 450, 250, 15);
        blocks[1] = new Rectangle(250, 315, 15, 150);
        blocks[2] = new Rectangle(150, 550, 15, 150);
        blocks[3] = new Rectangle(165, 550, 140, 15);
        blocks[4] = new Rectangle(100, 0, 15, 100);
        blocks[5] = new Rectangle(0, 100, 160, 15);
        blocks[6] = new Rectangle(150, 100, 15, 275);
        blocks[7] = new Rectangle(150, 190, 275, 15);
        blocks[8] = new Rectangle(425, 100, 15, 300);
        blocks[9] = new Rectangle(260, 0, 15, 75);
        blocks[10] = new Rectangle(400, 500, 15, 120);
        blocks[11] = new Rectangle(350, 400, 200, 15);
        blocks[12] = new Rectangle(425, 100, 225, 15);
        blocks[13] = new Rectangle(735, 100, 225, 15);
        blocks[14] = new Rectangle(735, 0, 15, 100);
        blocks[15] = new Rectangle(500, 0, 15, 25);
        blocks[16] = new Rectangle(550, 300, 15, 200);
        blocks[17] = new Rectangle(550, 300, 175, 15);
        blocks[18] = new Rectangle(425, 190, 100, 15);
        blocks[19] = new Rectangle(600, 190, 300, 15);
        blocks[20] = new Rectangle(650, 425, 150, 15);
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;

        preSetup();

        // the main game loop section
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();

            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 

            // if the player hits the finish line, end the game
            if (player.x < 170 && player.y < 30) {
                break;
            }

            // move the first cannonball
            cannon1.x = cannon1.x + cannon1XDirection * cannon1Speed;

            // move the second cannonball
            cannon2.x = cannon2.x + cannon2XDirection * cannon2Speed;

            // move the third cannonball
            cannon3.x = cannon3.x + cannon3XDirection * cannon3Speed;

            // move the fourth cannonball
            cannon4.x = cannon4.x + cannon4XDirection * cannon4Speed;

            // move the fifth cannonball
            cannon5.x = cannon5.x + cannon5XDirection * cannon5Speed;
            
            // move the third cannonball
            cannon6.y = cannon6.y + cannon6YDirection * cannon6Speed;

            // move the fourth cannonball
            cannon7.y = cannon7.y + cannon7YDirection * cannon7Speed;

            // move the fifth cannonball
            cannon8.y = cannon8.y + cannon8YDirection * cannon8Speed;

            // move player and add score
            if (playerUp && player.y > 0) {
                playerScore = playerScore + 1;
                player.y = player.y - playerSpeed;
                // move player and add score
            } else if (playerDown && player.y + player.height < HEIGHT) {
                playerScore = playerScore + 1;
                player.y = player.y + playerSpeed;
                // move player and add score
            } else if (playerLeft && player.x > 0) {
                playerScore = playerScore + 1;
                player.x = player.x - playerSpeed;
                // move player and add score
            } else if (playerRight && player.x + player.width < WIDTH) {
                playerScore = playerScore + 1;
                player.x = player.x + playerSpeed;
            } else {
                // add score even if the player does not move
                playerDX = 0;
                playerScore = playerScore + 1;
            }

            // check for collisions with blocks
            for (int i = 0; i < blocks.length; i++) {
                if (player.intersects(blocks[i])) {
                    int cHeight = Math.min(blocks[i].y + blocks[i].height, player.y + player.height) - Math.max(blocks[i].y, player.y);
                    int cWidth = Math.min(blocks[i].x + blocks[i].width, player.x + player.width) - Math.max(blocks[i].x, player.x);
                    // determine the smaller one to fix
                    if (cWidth < cHeight) {
                        // fix width                        
                        if (player.x < blocks[i].x) {
                            player.x = player.x - cWidth;
                        } else {
                            player.x = player.x + cWidth;
                        }
                        // fix height
                    } else {
                        if (player.y < blocks[i].y) {
                            player.y = player.y - cHeight;
                        } else {
                            player.y = player.y + cHeight;
                        }
                    }
                }
            }

            // if the score goes over 2000, game over
            // (35 seconds to complete level)
            if (playerScore == 2001) {
                break;
            }

            // if the first cannon hits the player, end game
            if (cannon1.intersects(player)) {
                break;
            }

            // if the second cannon hits the player, end game
            if (cannon2.intersects(player)) {
                break;
            }

            // if the third cannon hits the player, end game 
            if (cannon3.intersects(player)) {
                break;
            }

            // if the fourth cannon hits the player, end game 
            if (cannon4.intersects(player)) {
                break;
            }

            // if the fifth cannon hits the player, end game 
            if (cannon5.intersects(player)) {
                break;
            }
                
                 // if the third cannon hits the player, end game 
            if (cannon6.intersects(player)) {
                break;
            }

            // if the fourth cannon hits the player, end game 
            if (cannon7.intersects(player)) {
                break;
            }

            // if the fifth cannon hits the player, end game 
            if (cannon8.intersects(player)) {
                break;
            }

            // if the cannon hits the right side of the screen, teleport back to the left side of the screen
            if (cannon1.x > WIDTH) {
                cannon1.x = 0;
            }

            // if the cannon hits the right side of the screen, teleport back to the left side of the screen
            if (cannon2.x > WIDTH) {
                cannon2.x = 0;
            }

            // if the cannon hits the left side of the screen, teleport back to the right side of the screen
            if (cannon3.x < 0) {
                cannon3.x = WIDTH;
            }

            // if the cannon hits the left side of the screen, teleport back to the right side of the screen
            if (cannon4.x < 0) {
                cannon4.x = WIDTH;
            }

            // if the cannon hits the right side of the screen, teleport back to the left side of the screen
            if (cannon5.x > WIDTH) {
                cannon5.x = 0;
            }
            
            // if the cannon hits the left side of the screen, teleport back to the right side of the screen
            if (cannon6.y > HEIGHT) {
                cannon6.y = 0;
            }

            // if the cannon hits the left side of the screen, teleport back to the right side of the screen
            if (cannon7.y > HEIGHT) {
                cannon7.y = 0;
            }

            // if the cannon hits the right side of the screen, teleport back to the left side of the screen
            if (cannon8.y > HEIGHT) {
                cannon8.y = 0;
            }

            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();

            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            };
        }
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {
        // if a mouse button has been pressed down

        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {
        // if a key has been pressed down

        @Override
        public void keyPressed(KeyEvent e) {
            // store the key being pressed
            int key = e.getKeyCode();
            // determine which key it is
            if (key == KeyEvent.VK_W) {
                playerUp = true;
                // determine which key it is
            } else if (key == KeyEvent.VK_S) {
                playerDown = true;
                // determine which key it is
            } else if (key == KeyEvent.VK_A) {
                playerLeft = true;
                // determine which key it is
            } else if (key == KeyEvent.VK_D) {
                playerRight = true;
            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            // store the key being pressed
            int key = e.getKeyCode();
            // determine which key it is
            if (key == KeyEvent.VK_W) {
                playerUp = false;
                // determine which key it is
            } else if (key == KeyEvent.VK_S) {
                playerDown = false;
                // determine which key it is
            } else if (key == KeyEvent.VK_A) {
                playerLeft = false;
                // determine which key it is
            } else if (key == KeyEvent.VK_D) {
                playerRight = false;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        SummativeGame game = new SummativeGame();

        // starts the game loop
        game.run();
    }
}
