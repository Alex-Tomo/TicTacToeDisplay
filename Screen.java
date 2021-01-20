import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Screen extends JPanel implements MouseListener {

    private boolean cellOne = false,
            cellTwo = false,
            cellThree = false,
            cellFour = false,
            cellFive = false,
            cellSix = false,
            cellSeven = false,
            cellEight = false,
            cellNine = false;
    private boolean cellOneX = false, cellTwoX = false, cellThreeX = false, cellFourX = false, cellFiveX = false,
                    cellSixX = false, cellSevenX = false, cellEightX = false, cellNineX = false;
    private boolean cellOneO = false, cellTwoO = false, cellThreeO = false, cellFourO = false, cellFiveO = false,
            cellSixO = false, cellSevenO = false, cellEightO = false, cellNineO = false;
    private int cellOneShape = 0,
            cellTwoShape = 0,
            cellThreeShape = 0,
            cellFourShape = 0,
            cellFiveShape = 0,
            cellSixShape = 0,
            cellSevenShape = 0,
            cellEightShape = 0,
            cellNineShape = 0;
    private int turns = 1;

    public Screen() {
        addMouseListener(this);
        String[] options = {"Yes", "No"};
        int playGame = JOptionPane.showInternalOptionDialog(null, "Welcome to Tic-Tac-Toe would you like to play?",
                "Tic-Tac-Toe", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if(playGame == 1) {
            System.exit(0);
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 600, 600);

        g.setColor(Color.WHITE);
        g.drawLine(200, 0, 200, 600);
        g.drawLine(400, 0, 400, 600);

        g.drawLine(0, 200, 600, 200);
        g.drawLine(0, 400, 600, 400);

        if (cellOne) {
            if (cellOneShape % 2 == 1 || cellOneShape == 1) {
                g.drawLine(25, 25, 175, 175);
                g.drawLine(175, 25, 25, 175);
            } else {
                g.drawOval(25, 25, 150, 150);
            }
        }
        if (cellTwo) {
            if (cellTwoShape % 2 == 1 || cellTwoShape == 1) {
                g.drawLine(225, 25, 375, 175);
                g.drawLine(375, 25, 225, 175);
            } else {
                g.drawOval(225, 25, 150, 150);
            }
        }
        if (cellThree) {
            if (cellThreeShape % 2 == 1 || cellThreeShape == 1) {
                g.drawLine(425, 25, 575, 175);
                g.drawLine(575, 25, 425, 175);
            } else {
                g.drawOval(425, 25, 150, 150);
            }
        }
        if (cellFour) {
            if (cellFourShape % 2 == 1 || cellFourShape == 1) {
                g.drawLine(25, 225, 175, 375);
                g.drawLine(175, 225, 25, 375);
            } else {
                g.drawOval(25, 225, 150, 150);
            }
        }
        if (cellFive) {
            if (cellFiveShape % 2 == 1 || cellFiveShape == 1) {
                g.drawLine(225, 225, 375, 375);
                g.drawLine(375, 225, 225, 375);
            } else {
                g.drawOval(225, 225, 150, 150);
            }
        }
        if (cellSix) {
            if (cellSixShape % 2 == 1 || cellSixShape == 1) {
                g.drawLine(425, 225, 575, 375);
                g.drawLine(575, 225, 425, 375);
            } else {
                g.drawOval(425, 225, 150, 150);
            }
        }
        if (cellSeven) {
            if (cellSevenShape % 2 == 1 || cellSevenShape == 1) {
                g.drawLine(25, 425, 175, 575);
                g.drawLine(175, 425, 25, 575);
            } else {
                g.drawOval(25, 425, 150, 150);
            }
        }
        if (cellEight) {
            if (cellEightShape % 2 == 1 || cellEightShape == 1) {
                g.drawLine(225, 425, 375, 575);
                g.drawLine(375, 425, 225, 575);
            } else {
                g.drawOval(225, 425, 150, 150);
            }
        }
        if (cellNine) {
            if (cellNineShape % 2 == 1 || cellNineShape == 1) {
                g.drawLine(425, 425, 575, 575);
                g.drawLine(575, 425, 425, 575);
            } else {
                g.drawOval(425, 425, 150, 150);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if ((e.getX() < 200) && (e.getY() < 200) && !cellOne) {
            cellOne = true;
            cellOneShape = turns;
            repaint();
            if(turns % 2 == 1) {
                cellOneX = true;
            } else {
                cellOneO = true;
            }
            checkWinner();
            turns++;
        }
        if ((e.getX() > 200) && (e.getX() < 400) && (e.getY() < 200) && !cellTwo) {
            cellTwo = true;
            cellTwoShape = turns;
            repaint();
            if(turns % 2 == 1) {
                cellTwoX = true;
            } else {
                cellTwoO = true;
            }
            checkWinner();
            turns++;
        }
        if ((e.getX() > 400) && (e.getY() < 200) && !cellThree) {
            cellThree = true;
            cellThreeShape = turns;
            repaint();
            if(turns % 2 == 1) {
                cellThreeX = true;
            } else {
                cellThreeO = true;
            }
            checkWinner();
            turns++;
        }
        if ((e.getX() < 200) && (e.getY() > 200) && (e.getY() < 400) && !cellFour) {
            cellFour = true;
            cellFourShape = turns;
            repaint();
            if(turns % 2 == 1) {
                cellFourX = true;
            } else {
                cellFourO = true;
            }
            checkWinner();
            turns++;
        }
        if ((e.getX() > 200) && (e.getX() < 400) && (e.getY() > 200) && (e.getY() < 400) && !cellFive) {
            cellFive = true;
            cellFiveShape = turns;
            repaint();
            if(turns % 2 == 1) {
                cellFiveX = true;
            } else {
                cellFiveO = true;
            }
            checkWinner();
            turns++;
        }
        if ((e.getX() > 400) && (e.getY() > 200) && (e.getY() < 400) && !cellSix) {
            cellSix = true;
            cellSixShape = turns;
            repaint();
            if(turns % 2 == 1) {
                cellSixX = true;
            } else {
                cellSixO = true;
            }
            checkWinner();
            turns++;
        }
        if ((e.getX() < 200) && (e.getY() > 400) && !cellSeven) {
            cellSeven = true;
            cellSevenShape = turns;
            repaint();
            if(turns % 2 == 1) {
                cellSevenX = true;
            } else {
                cellSevenO = true;
            }
            checkWinner();
            turns++;
        }
        if ((e.getX() > 200) && (e.getX() < 400) && (e.getY() > 400) && !cellEight) {
            cellEight = true;
            cellEightShape = turns;
            repaint();
            if(turns % 2 == 1) {
                cellEightX = true;
            } else {
                cellEightO = true;
            }
            checkWinner();
            turns++;
        }
        if ((e.getX() > 400) && (e.getY() > 400) && !cellNine) {
            cellNine = true;
            cellNineShape = turns;
            repaint();
            if(turns % 2 == 1) {
                cellNineX = true;
            } else {
                cellNineO = true;
            }
            checkWinner();
            turns++;
        }
    }

    private void checkWinner() {
        checkX();
        checkO();
        if(cellOne && cellTwo && cellThree && cellFour && cellFive &&
                cellSix && cellSeven && cellEight && cellNine) {
            String options[] = {"Yes", "No"};
            int playAgain = JOptionPane.showInternalOptionDialog(null, "Play Again?",
                    "Draw...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if(playAgain == 0) {
                cellOne = false; cellTwo = false; cellThree = false; cellFour = false; cellFive = false;
                cellSix = false; cellSeven = false; cellEight = false; cellNine = false;
                cellOneX = false; cellTwoX = false; cellThreeX = false; cellFourX = false; cellFiveX = false;
                cellSixX = false; cellSevenX = false; cellEightX = false; cellNineX = false;
                cellOneO = false; cellTwoO = false; cellThreeO = false; cellFourO = false; cellFiveO = false;
                cellSixO = false; cellSevenO = false; cellEightO = false; cellNineO = false;
                repaint();
            } else {
                System.exit(0);
            }
        }
    }

    private void checkX() {
        if((cellOneX && cellTwoX && cellThreeX) ||
                (cellFourX && cellFiveX && cellSixX) ||
                (cellSevenX && cellEightX && cellNineX) ||
                (cellOneX && cellFourX && cellSevenX) ||
                (cellTwoX && cellFiveX && cellEightX) ||
                (cellThreeX && cellSixX && cellNineX) ||
                (cellOneX && cellFiveX && cellNineX) ||
                (cellThreeX && cellFiveX && cellSevenX)) {
            String options[] = {"Yes", "No"};
            int playAgain = JOptionPane.showInternalOptionDialog(null, "Play Again?",
                    "X Won!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if(playAgain == 0) {
                cellOne = false; cellTwo = false; cellThree = false; cellFour = false; cellFive = false;
                cellSix = false; cellSeven = false; cellEight = false; cellNine = false;
                cellOneX = false; cellTwoX = false; cellThreeX = false; cellFourX = false; cellFiveX = false;
                cellSixX = false; cellSevenX = false; cellEightX = false; cellNineX = false;
                cellOneO = false; cellTwoO = false; cellThreeO = false; cellFourO = false; cellFiveO = false;
                cellSixO = false; cellSevenO = false; cellEightO = false; cellNineO = false;
                repaint();
            } else {
                System.exit(0);
            }
        }
    }

    private void checkO() {
        if((cellOneO && cellTwoO && cellThreeO) ||
                (cellFourO && cellFiveO && cellSixO) ||
                (cellSevenO && cellEightO && cellNineO) ||
                (cellOneO && cellFourO && cellSevenO) ||
                (cellTwoO && cellFiveO && cellEightO) ||
                (cellThreeO && cellSixO && cellNineO) ||
                (cellOneO && cellFiveO && cellNineO) ||
                (cellThreeO && cellFiveO && cellSevenO)) {
            String options[] = {"Yes", "No"};
            int playAgain = JOptionPane.showInternalOptionDialog(null, "Play Again?",
                    "O Won!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if(playAgain == 0) {
                cellOne = false; cellTwo = false; cellThree = false; cellFour = false; cellFive = false;
                cellSix = false; cellSeven = false; cellEight = false; cellNine = false;
                cellOneX = false; cellTwoX = false; cellThreeX = false; cellFourX = false; cellFiveX = false;
                cellSixX = false; cellSevenX = false; cellEightX = false; cellNineX = false;
                cellOneO = false; cellTwoO = false; cellThreeO = false; cellFourO = false; cellFiveO = false;
                cellSixO = false; cellSevenO = false; cellEightO = false; cellNineO = false;
                repaint();
            } else {
                System.exit(0);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) { }

}
