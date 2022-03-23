import javax.swing.*;
import java.awt.*;

public class Vizatuese extends JPanel {
    int m = 50;
    int n;
    String[][] d;
    public Vizatuese(int n,String [][] d)
    {
        this.d = d;
        this.n = n ;
        JFrame a = new JFrame();
        a.setSize(m*n+70,m*n+70);
        a.getContentPane().add(this);
        a.setVisible(true);
        a.setTitle("N Queens");
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void vizatoMbretreshat(Graphics g)
    {
        Image image = new ImageIcon(this.getClass().getResource("Queen1.png")).getImage();
        int x = 20;
        int y = 20;
        for (int i = 0; i < n; i++) {
            x=20;
            for (int j = 0; j <n ; j++) {
                if (d[i][j] == "Q")
                    g.drawImage(image,x,y,this);
                x+=m;
            }
            y+=m;
        }

    }
    public void vizatoTabelen(Graphics g)
    {
        for (int i = 0; i < 2 ; i++) {
            int x_pos = 20;
            int y_pos = 20;
            for(int j =0; j<n+1;j++)
            {
                int x = x_pos;
                int y = y_pos;
                if (j%2==0)
                {
                    g.setColor(new Color(110, 67, 2));
                }
                else
                {
                    //g.setColor(new Color(191, 170, 138 ));
                }
                if (i==0)
                for(int k = 0 ; k < n;k++)
                {
                    if (j==n)
                    {
                        continue;
                    }
                    if (g.getColor().equals(new Color(110, 67, 2)))
                    {
                        //Color c = g.getColor();
                        g.setColor(new Color(191, 170, 138 ));
                        g.fillRect(x,y,m,m);
                        //g.setColor(c);
                    }
                    else
                    {
                        //Color c = g.getColor();
                        g.setColor(new Color(110, 67, 2));
                        g.fillRect(x,y,m,m);
                        //g.setColor(c);
                    }
                    x+=m;
                    //if (g.getColor().equals())
                }
                g.setColor(Color.BLACK);
                if (i==0)
                {
                    g.drawLine(x_pos ,y_pos,x_pos +n*m,y_pos);
                    y_pos += m;
                }
                else
                {
                    g.drawLine(x_pos ,y_pos,x_pos ,y_pos+n*m);
                    x_pos += m;
                }
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(new Color(28, 14, 3));
        g.fillRect(0,0,1000,1000);
        g.setColor(Color.BLACK);
        vizatoTabelen(g);
        vizatoMbretreshat(g);
    }

}
