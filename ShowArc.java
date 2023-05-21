import java.awt.*;

class Show extends Frame {
   public void paint(Graphics g) {
      g.setColor(Color.blue); // 設定繪圖顏色為藍色
      g.fillArc(20, 50, 150, 150, 30, 300); // 填滿圓弧

      g.setColor(Color.red); // 設定繪圖顏色為紅色

      for (int x = 120; x <= 360; x = x + 60) {
         g.fillOval(x, 100, 50, 50); // 繪出5個小圓
      }

      g.setColor(Color.BLACK); // 設定黑色
      g.fillOval(80, 60, 40, 40); // 繪出眼睛

      g.setColor(Color.GREEN); // 設定綠色
      g.fillOval(100, 80, 10, 10); // 繪出眼珠

   }
}

public class ShowArc {
   public static void main(String args[]) {
      Show frm = new Show();
      frm.setTitle("圓弧與圓");// 視窗標題
      frm.setSize(450, 300);// 視窗size
      frm.setLocation(300, 250);// 版面
      frm.setVisible(true);
   }
}