import java.awt.*;
import java.util.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

//63050147 Tharita Watanapa sec1
//63050166 Pilada Prasan sec2

class Assignment1_63050147_63050166 extends JPanel {

    public static void main(String[] args) {

        GraphicsSwing m = new GraphicsSwing();
        // create window
        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("Tiger & Tiwer");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        BufferedImage buffer = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = buffer.createGraphics();
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, 600, 600);

        // background
        // house------------------------------------------------------------------------------

        g2.setColor(new Color(0xCCCE83));
        int xPoly0[] = { 460, 600, 600 };
        int yPoly0[] = { 0, 0, 360 };
        Polygon poly0 = new Polygon(xPoly0, yPoly0, 3);
        g2.drawPolygon(poly0);
        buffer = floodFill(buffer, 570, 0, Color.WHITE, new Color(0xCCCE83));

        int xPoly01[] = { 460, 600, 442 };
        int yPoly01[] = { 0, 360, 385 };
        Polygon poly01 = new Polygon(xPoly01, yPoly01, 3);
        g2.drawPolygon(poly01);
        buffer = floodFill(buffer, 570, 300, Color.WHITE, new Color(0xCCCE83));

        // table------------------------------------------------------------------------------

        g2.setColor(new Color(0x875D2D));
        int xPoly02[] = { 442, 600, 600 };
        int yPoly02[] = { 385, 600, 360 };
        Polygon poly02 = new Polygon(xPoly02, yPoly02, 3);
        g2.drawPolygon(poly02);
        buffer = floodFill(buffer, 599, 580, Color.WHITE, new Color(0x875D2D));

        g2.setColor(new Color(0x875D2D));
        int xPoly021[] = { 442, 600, 442 };
        int yPoly021[] = { 385, 600, 600 };
        Polygon poly021 = new Polygon(xPoly021, yPoly021, 3);
        g2.drawPolygon(poly021);
        buffer = floodFill(buffer, 580, 599, Color.WHITE, new Color(0x875D2D));

        g2.setColor(new Color(0x875D2D));
        int xPoly022[] = { 442, 442, 0 };
        int yPoly022[] = { 396, 600, 600 };
        Polygon poly022 = new Polygon(xPoly022, yPoly022, 3);
        g2.drawPolygon(poly022);
        buffer = floodFill(buffer, 350, 599, Color.WHITE, new Color(0x875D2D));

        g2.setColor(new Color(0x875D2D));
        int xPoly023[] = { 442, 118, 175 };
        int yPoly023[] = { 396, 456, 520 };
        Polygon poly023 = new Polygon(xPoly023, yPoly023, 3);
        g2.drawPolygon(poly023);
        buffer = floodFill(buffer, 300, 450, Color.WHITE, new Color(0x875D2D));

        g2.setColor(new Color(0x875D2D));
        int xPoly024[] = { 145, 0, 175 };
        int yPoly024[] = { 485, 600, 520 };
        Polygon poly024 = new Polygon(xPoly024, yPoly024, 3);
        g2.drawPolygon(poly024);
        buffer = floodFill(buffer, 150, 500, Color.WHITE, new Color(0x875D2D));

        g2.setColor(new Color(0x875D2D));
        int xPoly025[] = { 145, 0, 0 };
        int yPoly025[] = { 485, 600, 520 };
        Polygon poly025 = new Polygon(xPoly025, yPoly025, 3);
        g2.drawPolygon(poly025);
        buffer = floodFill(buffer, 10, 570, Color.WHITE, new Color(0x875D2D));

        // things and paper
        // table------------------------------------------------------------------------------
        g2.setColor(new Color(0xFAE5D3));

        int xPoly3[] = { 290, 240, 355 };
        int yPoly3[] = { 425, 490, 424 };
        Polygon poly3 = new Polygon(xPoly3, yPoly3, 3);
        g2.drawPolygon(poly3);
        buffer = floodFill(buffer, 300, 430, new Color(0x875D2D), new Color(0xFAE5D3));

        // cream paper---------------------------------------------------------------
        g2.setColor(new Color(0xFAE5D3));

        int xPoly35[] = { 240, 215, 450 };
        int yPoly35[] = { 490, 530, 543 };
        Polygon poly35 = new Polygon(xPoly35, yPoly35, 3);
        g2.drawPolygon(poly35);
        buffer = floodFill(buffer, 250, 500, new Color(0x875D2D), new Color(0xFAE5D3));
        // white paper---------------------------------------------------------------
        g2.setColor(new Color(0xB5BAEC));
        int xPoly31[] = { 370, 240, 555 };
        int yPoly31[] = { 415, 490, 570 };
        Polygon poly31 = new Polygon(xPoly31, yPoly31, 3);
        g2.drawPolygon(poly31);
        buffer = floodFill(buffer, 350, 500, new Color(0x875D2D), new Color(0xB5BAEC));

        g2.setColor(new Color(0xB5BAEC));

        int xPoly32[] = { 370, 580, 555 };
        int yPoly32[] = { 415, 510, 570 };
        Polygon poly32 = new Polygon(xPoly32, yPoly32, 3);
        g2.drawPolygon(poly32);
        buffer = floodFill(buffer, 545, 550, new Color(0x875D2D), new Color(0xB5BAEC));

        g2.setColor(new Color(0xB5BAEC));

        int xPoly33[] = { 370, 580, 600 };
        int yPoly33[] = { 415, 510, 465 };
        Polygon poly33 = new Polygon(xPoly33, yPoly33, 3);
        g2.drawPolygon(poly33);
        buffer = floodFill(buffer, 560, 490, new Color(0x875D2D), new Color(0xB5BAEC));

        g2.setColor(new Color(0xB5BAEC));

        int xPoly34[] = { 370, 580, 600 };
        int yPoly34[] = { 415, 510, 465 };
        Polygon poly34 = new Polygon(xPoly34, yPoly34, 3);
        g2.drawPolygon(poly34);
        buffer = floodFill(buffer, 560, 490, new Color(0x875D2D), new Color(0xB5BAEC));

        // cream paper---------------------------------------------------------------
        g2.setColor(new Color(0xF4D03F));

        int xPoly36[] = { 1, 150, 200 };
        int yPoly36[] = { 600, 540, 600 };
        Polygon poly36 = new Polygon(xPoly36, yPoly36, 3);
        g2.drawPolygon(poly36);
        buffer = floodFill(buffer, 50, 589, new Color(0x875D2D), new Color(0xF4D03F));

        // computer
        // base------------------------------------------------------------------------------
        g2.setColor(new Color(0x141A20));
        bresenhamLine(g2, 118, 456, 145, 485, 1);
        bresenhamLine(g2, 0, 477, 118, 456, 1);
        bresenhamLine(g2, 0, 520, 145, 485, 1);
        buffer = floodFill(buffer, 0, 510, Color.WHITE, new Color(0x141A20));

        // TIGER
        // bottom------------------------------------------------------------------------------
        g2.setColor(Color.BLACK);
        g2.setColor(new Color(0xCC6600));

        // behinded leg
        // 1------------------------------------------------------------------------------

        g2.setColor(new Color(0xE97D11));
        bezierCurve(g2, 200, 330, 205, 350, 210, 350, 200, 395, 4);
        bezierCurve(g2, 254, 320, 256, 330, 256, 326, 225, 395, 4);

        // front legs
        // 1------------------------------------------------------------------------------
        g2.setColor(new Color(0xE97D11));
        bezierCurve(g2, 342, 336, 355, 350, 343, 355, 362, 378, 4);
        bezierCurve(g2, 437, 280, 395, 345, 389, 325, 390, 378, 4);

        // front leg
        // small------------------------------------------------------------------------------
        g2.setColor(new Color(0xAD5700));
        bezierCurve(g2, 437, 280, 425, 345, 400, 325, 397, 378, 3);
        bresenhamLine(g2, 415, 325, 415, 320, 4);

        // behinded leg
        // leg
        // 2------------------------------------------------------------------------------

        bezierCurve(g2, 140, 307, 125, 290, 109, 375, 107, 370, 4);
        bresenhamLine(g2, 107, 382, 105, 400, 4);
        bresenhamLine(g2, 200, 335, 147, 343, 4);
        bresenhamLine(g2, 120, 380, 122, 400, 4);
        // point
        bresenhamLine(g2, 170, 320, 170, 325, 4);
        bresenhamLine(g2, 131, 320, 131, 320, 4);
        bresenhamLine(g2, 114, 390, 114, 390, 4);

        bresenhamLine(g2, 105, 400, 122, 400, 4);
        bresenhamLine(g2, 362, 378, 397, 378, 4);
        g2.setColor(new Color(0xE97D11));
        bresenhamLine(g2, 200, 395, 225, 395, 4);
        // CAT
        // mouth------------------------------------------------------------------------------
        g2.setColor(Color.WHITE);
        bresenhamLine(g2, 445, 268, 473, 280, 15);
        bresenhamLine(g2, 460, 275, 475, 285, 15);
        bresenhamLine(g2, 475, 285, 500, 245, 13);
        bresenhamLine(g2, 497, 270, 498, 272, 6);
        bresenhamLine(g2, 480, 286, 492, 276, 14);
        g2.setColor(Color.BLACK);

        // nose
        // cat------------------------------------------------------------------------------
        g2.setColor(Color.PINK);
        bresenhamLine(g2, 491, 289, 498, 286, 6);
        g2.setColor(Color.WHITE);
        bresenhamLine(g2, 496, 288, 498, 286, 2);

        // cat
        // head------------------------------------------------------------------------------
        g2.setColor(Color.BLACK);
        bresenhamLine(g2, 450, 180, 483, 194, 7);
        bresenhamLine(g2, 487, 196, 517, 215, 7);
        bresenhamLine(g2, 512, 215, 513, 250, 6);
        bresenhamLine(g2, 505, 250, 513, 250, 6);
        bresenhamLine(g2, 505, 247, 480, 271, 6);
        bresenhamLine(g2, 482, 271, 470, 266, 6);
        bresenhamLine(g2, 470, 266, 465, 273, 6);
        bresenhamLine(g2, 465, 273, 445, 260, 6);

        // head-fill------------------------------------------------------------------------------
        g2.setColor(Color.BLACK);
        bresenhamLine(g2, 452, 180, 446, 255, 17);
        bresenhamLine(g2, 459, 185, 455, 260, 10);
        bresenhamLine(g2, 469, 189, 465, 262, 10);
        bresenhamLine(g2, 479, 194, 465, 261, 10);
        bresenhamLine(g2, 489, 200, 470, 265, 10);
        bresenhamLine(g2, 499, 207, 480, 267, 14);
        bresenhamLine(g2, 509, 210, 490, 255, 10);
        bresenhamLine(g2, 509, 215, 506, 242, 10);
        bresenhamLine(g2, 510, 235, 513, 260, 2);

        // eye------------------------------------------------------------------------------
        g2.setColor(new Color(0xFFC110));
        bresenhamLine(g2, 470, 249, 478, 254, 15);
        bresenhamLine(g2, 469, 250, 469, 260, 2);
        g2.setColor(Color.BLACK);
        bresenhamLine(g2, 470, 248, 478, 254, 13);
        g2.setColor(Color.WHITE);
        bresenhamLine(g2, 476, 252, 477, 254, 5);
        g2.setColor(new Color(0xC8BEBB));
        bresenhamLine(g2, 473, 250, 473, 252, 2);
        // whiskers------------------------------------------------------------------------------
        g2.setColor(Color.DARK_GRAY);
        bezierCurve(g2, 474, 280, 474, 280, 450, 280, 450, 300, 2);
        bezierCurve(g2, 474, 280, 480, 280, 455, 285, 456, 300, 1);
        // ears------------------------------------------------------------------------------
        g2.setColor(Color.PINK);
        bezierCurve(g2, 465, 185, 490, 175, 500, 155, 495, 202, 2);
        buffer = floodFill(buffer, 492, 173, new Color(0xCCCE83), Color.PINK);
        g2.setColor(Color.BLACK);
        bezierCurve(g2, 465, 185, 473, 168, 500, 155, 495, 202, 5);
        bresenhamLine(g2, 465, 185, 495, 202, 2);
        g2.setColor(Color.BLACK);
        bezierCurve(g2, 500, 205, 550, 210, 565, 210, 518, 225, 2);
        // tiger
        // body-curve------------------------------------------------------------------------------
        g2.setColor(new Color(0xCC6600));
        bezierCurve(g2, 170, 240, 240, 98, 355, 270, 437, 180, 2);
        bezierCurve(g2, 170, 240, 165, 265, 180, 290, 200, 330, 2);
        bezierCurve(g2, 200, 330, 210, 145, 225, 300, 280, 347, 2);
        bezierCurve(g2, 280, 347, 290, 350, 290, 350, 340, 335, 2);
        bezierCurve(g2, 340, 335, 340, 300, 340, 280, 437, 210, 2);
        bresenhamLine(g2, 434, 180, 433, 210, 6);
        // fill tiger body
        buffer = floodFill(buffer, 250, 290, Color.WHITE, new Color(0xCC6600));
        // tiger
        // tail------------------------------------------------------------------------------
        g2.setColor(new Color(0xCC6600));
        bresenhamLine(g2, 212, 183, 210, 195, 6);
        g2.setColor(new Color(0xAD5700));
        bezierCurve(g2, 220, 183, 95, 210, 180, 290, 110, 373, 2);
        bezierCurve(g2, 210, 195, 140, 210, 195, 290, 130, 373, 1);

        bezierCurve(g2, 130, 373, 118, 394, 55, 375, 93, 346, 3);
        bezierCurve(g2, 110, 371, 100, 374, 83, 375, 100, 347, 3);

        bresenhamLine(g2, 93, 344, 94, 346, 5);
        // fill
        // tail------------------------------------------------------------------------------
        // bresenhamLine(g2, 160, 230, 160, 235, 6);
        buffer = floodFill(buffer, 160, 230, Color.WHITE, new Color(0xCC6600));

        // pattern
        // tail------------------------------------------------------------------------------
        g2.setColor(Color.BLACK);
        bezierCurve(g2, 174, 199, 166, 210, 165, 220, 168, 240, 4);
        bezierCurve(g2, 155, 214, 155, 255, 155, 240, 163, 270, 5);
        bezierCurve(g2, 146, 244, 146, 300, 155, 270, 160, 295, 5);
        bresenhamLine(g2, 142, 295, 155, 310, 7);
        bresenhamLine(g2, 135, 323, 160, 338, 8);
        bresenhamLine(g2, 125, 348, 131, 357, 10);
        bresenhamLine(g2, 108, 373, 110, 382, 2);
        // point
        bresenhamLine(g2, 105, 375, 104, 375, 2);
        buffer = floodFill(buffer, 103, 377, new Color(0xCC6600), Color.BLACK);
        // FRAME
        // COMPUTER----------------------------------------------------------------------------
        // frame com
        // y------------------------------------------------------------------------------
        bresenhamLine(g2, 447, 0, 432, 385, 1);
        bresenhamLine(g2, 460, 0, 442, 396, 1);
        bresenhamLine(g2, 458, 0, 441, 396, 4);
        // frame com
        // x------------------------------------------------------------------------------
        bresenhamLine(g2, 0, 458, 432, 385, 3);
        bresenhamLine(g2, 0, 477, 442, 396, 3);

        // Fill COLOR
        // tiger leg-------------------------------------------------------

        buffer = floodFill(buffer, 415, 320, Color.WHITE, new Color(0xAD5700));
        buffer = floodFill(buffer, 220, 350, Color.WHITE, new Color(0xE97D11));
        buffer = floodFill(buffer, 390, 306, Color.WHITE, new Color(0xE97D11));
        buffer = floodFill(buffer, 170, 320, Color.WHITE, new Color(0xAD5700));
        buffer = floodFill(buffer, 131, 320, Color.WHITE, new Color(0xAD5700));
        buffer = floodFill(buffer, 114, 390, Color.WHITE, new Color(0xAD5700));

        // ears-------------------------------------------------------

        buffer = floodFill(buffer, 540, 211, new Color(0xCCCE83), Color.BLACK);

        // pattern body-------------------------------------------------------
        g2.setColor(Color.BLACK);
        bezierCurve(g2, 212, 235, 210, 245, 210, 250, 215, 270, 3);
        bezierCurve(g2, 214, 230, 210, 245, 210, 250, 217, 275, 2);

        bezierCurve(g2, 220, 245, 230, 260, 230, 250, 260, 329, 3);

        bezierCurve(g2, 274, 265, 255, 280, 260, 280, 264, 329, 3);
        bezierCurve(g2, 272, 260, 265, 280, 260, 280, 264, 329, 2);

        bezierCurve(g2, 344, 265, 335, 280, 340, 280, 330, 330, 4);
        bezierCurve(g2, 350, 208, 320, 280, 340, 280, 330, 330, 2);

        bezierCurve(g2, 360, 255, 345, 280, 347, 280, 343, 330, 4);
        bezierCurve(g2, 364, 250, 345, 280, 347, 280, 343, 330, 3);
        // pattern tummy
        g2.setColor(Color.BLACK);
        bezierCurve(g2, 274, 320, 290, 270, 300, 300, 274, 320, 3);
        bresenhamLine(g2, 293, 288, 288, 296, 4);
        bresenhamLine(g2, 292, 284, 283, 294, 4);
        // fill color tummy-------------------------------------------------------
        buffer = floodFill(buffer, 284, 308, new Color(0xCC6600), Color.BLACK);

        bezierCurve(g2, 275, 342, 310, 290, 290, 310, 290, 348, 3);
        // bresenhamLine(g2, 280, 335, 280, 335, 6);
        buffer = floodFill(buffer, 282, 335, new Color(0xCC6600), Color.BLACK);

        bezierCurve(g2, 300, 346, 320, 290, 310, 310, 310, 343, 3);
        // bresenhamLine(g2, 305, 337, 305, 335, 6);
        buffer = floodFill(buffer, 305, 337, new Color(0xCC6600), Color.BLACK);

        // pattern back-------------------------------------------------------
        bezierCurve(g2, 232, 183, 230, 190, 231, 220, 240, 235, 3);
        bezierCurve(g2, 240, 183, 233, 190, 234, 220, 240, 235, 3);

        bezierCurve(g2, 252, 183, 260, 190, 265, 220, 250, 235, 3);
        bezierCurve(g2, 258, 183, 263, 190, 266, 200, 255, 230, 3);

        bezierCurve(g2, 285, 185, 274, 190, 273, 220, 266, 240, 4);
        bezierCurve(g2, 285, 185, 274, 190, 273, 220, 262, 260, 2);

        bezierCurve(g2, 290, 195, 295, 190, 280, 220, 275, 240, 4);
        bezierCurve(g2, 290, 195, 295, 190, 280, 220, 275, 245, 2);

        bezierCurve(g2, 300, 195, 305, 190, 296, 220, 294, 220, 3);
        bezierCurve(g2, 305, 195, 305, 190, 296, 220, 294, 220, 3);

        bezierCurve(g2, 310, 202, 305, 210, 303, 220, 294, 250, 3);

        bezierCurve(g2, 340, 202, 330, 210, 335, 220, 315, 280, 3);
        bezierCurve(g2, 345, 204, 330, 210, 335, 220, 315, 280, 3);

        bezierCurve(g2, 365, 207, 365, 210, 365, 220, 352, 250, 3);

        bezierCurve(g2, 395, 205, 370, 240, 385, 250, 375, 270, 3);
        bezierCurve(g2, 395, 205, 370, 240, 385, 250, 375, 275, 2);

        bezierCurve(g2, 405, 203, 405, 205, 406, 213, 400, 220, 3);

        bezierCurve(g2, 423, 192, 414, 205, 425, 206, 418, 210, 3);
        // pattern bottom-------------------------------------------------------
        bezierCurve(g2, 190, 207, 193, 230, 170, 237, 186, 277, 3);
        bezierCurve(g2, 194, 205, 194, 230, 174, 238, 187, 283, 2);

        bezierCurve(g2, 200, 206, 203, 230, 190, 237, 195, 277, 3);

        bezierCurve(g2, 220, 186, 223, 200, 223, 215, 217, 220, 3);
        bezierCurve(g2, 218, 186, 223, 200, 223, 215, 217, 220, 3);

        // pattern front leg 1
        // white collar-------------------------------------------------------
        g2.setColor(new Color(0xFCE3C2));
        bezierCurve(g2, 433, 220, 435, 252, 390, 377, 393, 338, 5);
        buffer = floodFill(buffer, 430, 280, new Color(0xE97D11), new Color(0xFCE3C2));
        // black-------------------------------------------------------
        g2.setColor(Color.BLACK);
        bezierCurve(g2, 393, 290, 390, 300, 390, 313, 393, 338, 3);
        bezierCurve(g2, 396, 285, 390, 300, 390, 313, 393, 338, 2);

        bezierCurve(g2, 406, 250, 409, 300, 408, 313, 403, 330, 3);
        bezierCurve(g2, 406, 285, 409, 300, 408, 313, 403, 330, 2);

        bezierCurve(g2, 425, 215, 429, 300, 418, 305, 420, 308, 4);
        bezierCurve(g2, 426, 200, 429, 300, 418, 305, 420, 308, 2);

        bezierCurve(g2, 435, 182, 429, 300, 438, 305, 440, 275, 4);

        bresenhamLine(g2, 394, 355, 397, 355, 6);

        // pattern behind leg 1-------------------------------------------------------
        bezierCurve(g2, 215, 287, 215, 290, 216, 310, 252, 330, 4);
        bezierCurve(g2, 215, 290, 215, 290, 216, 310, 251, 334, 4);

        bezierCurve(g2, 215, 320, 222, 318, 205, 320, 250, 342, 4);
        bezierCurve(g2, 200, 320, 222, 318, 205, 320, 250, 342, 3);

        bezierCurve(g2, 212, 353, 222, 355, 205, 360, 241, 365, 4);
        bezierCurve(g2, 211, 352, 222, 354, 205, 360, 240, 362, 3);

        bezierCurve(g2, 212, 353, 222, 355, 205, 360, 241, 365, 4);

        bezierCurve(g2, 212, 370, 222, 375, 205, 370, 230, 375, 3);

        bezierCurve(g2, 202, 380, 222, 390, 215, 385, 219, 390, 3);

        // pattern behind leg 2-------------------------------------------------------
        bezierCurve(g2, 165, 280, 166, 300, 165, 310, 190, 335, 5);

        // tab
        // bar------------------------------------------------------------------------------
        g2.setColor(new Color(0x4B545C));
        bresenhamLine(g2, 0, 445, 432, 370, 1);
        bresenhamLine(g2, 0, 458, 432, 385, 1);
        bresenhamLine(g2, 0, 458, 0, 445, 1);
        bresenhamLine(g2, 432, 370, 432, 385, 1);
        buffer = floodFill(buffer, 1, 446, Color.WHITE, new Color(0x4B545C));
        buffer = floodFill(buffer, 1, 446, Color.WHITE, new Color(0x4B545C));

        // g2.setColor(Color.RED);
        // plot(g2, 396, 376, 5);
        buffer = floodFill(buffer, 396, 377, new Color(0xAD5700), new Color(0x4B545C));

        // fill color
        // frame xy-------------------------------------------------
        buffer = floodFill(buffer, 440, 380, Color.WHITE, new Color(0x141A20));

        // tile
        g2.setColor(new Color(0x7DBA3F));
        bresenhamLine(g2, 0, 300, 125, 305, 6);
        bresenhamLine(g2, 428, 330, 428, 330, 6);

        buffer = floodFill(buffer, 6, 310, Color.WHITE, new Color(0x7DBA3F));
        buffer = floodFill(buffer, 428, 330, Color.WHITE, new Color(0x7DBA3F));

        // sky
        g2.setColor(new Color(0x95E0F3));
        buffer = floodFill(buffer, 177, 223, Color.WHITE, new Color(0x95E0F3));
        buffer = floodFill(buffer, 0, 140, Color.WHITE, new Color(0x95E0F3));
        // grass
        g2.setColor(new Color(0x2F6715));
        bresenhamLine(g2, 0, 445, 10, 443, 1);
        bezierCurve(g2, 0, 445, 1, 400, 5, 370, 30, 340, 1);
        bezierCurve(g2, 10, 443, 5, 400, 7, 370, 30, 340, 1);

        bresenhamLine(g2, 10, 443, 20, 441, 1);
        bezierCurve(g2, 10, 443, 2, 400, 10, 370, 35, 360, 1);
        bezierCurve(g2, 20, 441, 5, 400, 15, 370, 35, 360, 1);

        bresenhamLine(g2, 20, 441, 30, 440, 1);
        bezierCurve(g2, 20, 441, 17, 430, 30, 390, 50, 380, 1);
        bezierCurve(g2, 30, 440, 20, 430, 35, 390, 50, 380, 1);

        bresenhamLine(g2, 50, 437, 60, 435, 1);
        bezierCurve(g2, 50, 437, 30, 430, 20, 390, 20, 380, 1);
        bezierCurve(g2, 60, 435, 40, 430, 20, 390, 20, 380, 1);

        bresenhamLine(g2, 70, 434, 80, 432, 1);
        bezierCurve(g2, 70, 434, 72, 400, 80, 370, 100, 340, 1);
        bezierCurve(g2, 80, 432, 75, 400, 90, 370, 100, 340, 1);

        bresenhamLine(g2, 60, 434, 70, 432, 1);
        bezierCurve(g2, 60, 434, 55, 400, 40, 370, 60, 320, 1);
        bezierCurve(g2, 70, 432, 65, 400, 40, 370, 60, 320, 1);

        bresenhamLine(g2, 60, 433, 70, 432, 1);
        bezierCurve(g2, 60, 433, 55, 400, 40, 370, 60, 320, 1);
        bezierCurve(g2, 70, 432, 65, 400, 40, 370, 60, 320, 1);

        bresenhamLine(g2, 80, 431, 90, 430, 1);
        bezierCurve(g2, 80, 431, 55, 400, 40, 370, 80, 350, 1);
        bezierCurve(g2, 90, 430, 65, 400, 40, 370, 80, 350, 1);

        bresenhamLine(g2, 90, 429, 100, 428, 1);
        bezierCurve(g2, 90, 429, 80, 400, 90, 370, 80, 350, 1);
        bezierCurve(g2, 100, 428, 85, 400, 95, 370, 80, 350, 1);

        bresenhamLine(g2, 100, 427, 110, 426, 1);
        bezierCurve(g2, 100, 427, 90, 400, 100, 370, 110, 360, 1);
        bezierCurve(g2, 110, 426, 95, 400, 105, 370, 110, 360, 1);

        // grass 3

        bresenhamLine(g2, 110, 425, 120, 424, 1);
        bezierCurve(g2, 110, 425, 100, 400, 110, 370, 120, 370, 1);
        bezierCurve(g2, 120, 424, 105, 400, 115, 370, 120, 370, 1);

        bresenhamLine(g2, 120, 423, 130, 422, 1);
        bezierCurve(g2, 120, 423, 110, 400, 115, 370, 130, 380, 1);
        bezierCurve(g2, 130, 422, 115, 400, 115, 370, 130, 380, 1);

        bresenhamLine(g2, 130, 421, 140, 420, 1);
        bezierCurve(g2, 130, 421, 115, 400, 120, 370, 140, 380, 1);
        bezierCurve(g2, 140, 420, 120, 400, 125, 370, 140, 380, 1);

        ////
        bresenhamLine(g2, 155, 418, 160, 417, 1);
        bezierCurve(g2, 150, 418, 149, 410, 135, 390, 150, 380, 1);
        bezierCurve(g2, 160, 417, 155, 410, 140, 390, 150, 380, 1);

        bresenhamLine(g2, 150, 418, 160, 417, 1);
        bezierCurve(g2, 160, 418, 160, 410, 145, 390, 170, 360, 1);
        bezierCurve(g2, 167, 417, 165, 410, 150, 390, 170, 360, 1);

        bresenhamLine(g2, 167, 415, 178, 414, 1);
        bezierCurve(g2, 167, 415, 170, 410, 160, 390, 165, 350, 1);
        bezierCurve(g2, 178, 414, 175, 410, 165, 390, 165, 350, 1);

        bresenhamLine(g2, 178, 413, 190, 412, 1);
        bezierCurve(g2, 178, 413, 180, 410, 170, 390, 180, 370, 1);
        bezierCurve(g2, 190, 412, 185, 410, 175, 390, 180, 370, 1);

        bresenhamLine(g2, 190, 412, 200, 411, 1);
        bezierCurve(g2, 190, 412, 188, 410, 180, 390, 185, 360, 1);
        bezierCurve(g2, 200, 411, 192, 410, 185, 390, 185, 360, 1);

        bresenhamLine(g2, 210, 409, 215, 408, 1);
        bezierCurve(g2, 210, 409, 200, 410, 203, 390, 215, 370, 1);
        bezierCurve(g2, 215, 408, 215, 410, 205, 390, 215, 370, 1);

        bresenhamLine(g2, 215, 407, 225, 406, 1);
        bezierCurve(g2, 215, 407, 210, 410, 220, 390, 230, 350, 1);
        bezierCurve(g2, 225, 406, 215, 410, 225, 390, 230, 350, 1);

        bresenhamLine(g2, 225, 405, 240, 404, 1);
        bezierCurve(g2, 225, 405, 220, 410, 225, 390, 250, 370, 1);
        bezierCurve(g2, 240, 404, 235, 410, 240, 390, 250, 370, 1);

        bresenhamLine(g2, 280, 396, 290, 395, 1);
        bezierCurve(g2, 280, 396, 260, 370, 270, 370, 270, 360, 1);
        bezierCurve(g2, 290, 395, 265, 370, 275, 370, 270, 360, 1);

        bresenhamLine(g2, 290, 394, 300, 393, 1);
        bezierCurve(g2, 290, 394, 280, 370, 275, 370, 280, 355, 1);
        bezierCurve(g2, 300, 393, 285, 370, 280, 370, 280, 355, 1);

        bresenhamLine(g2, 300, 394, 307, 393, 1);
        bezierCurve(g2, 300, 394, 290, 370, 295, 370, 295, 360, 1);
        bezierCurve(g2, 307, 393, 295, 370, 300, 370, 295, 360, 1);

        bresenhamLine(g2, 310, 392, 320, 391, 1);
        bezierCurve(g2, 310, 392, 315, 370, 315, 370, 305, 360, 1);
        bezierCurve(g2, 320, 391, 325, 370, 320, 370, 305, 360, 1);

        // fill -glass point
        g2.setColor(Color.BLUE);

        // fill grass
        buffer = floodFill(buffer, 5, 440, new Color(0x7DBA3F), new Color(0x2F6715));
        buffer = floodFill(buffer, 11, 423, new Color(0x7DBA3F), new Color(0x69A34F));
        buffer = floodFill(buffer, 23, 423, new Color(0x7DBA3F), new Color(0x2F6715));
        buffer = floodFill(buffer, 39, 423, new Color(0x7DBA3F), new Color(0x69A34F));
        buffer = floodFill(buffer, 63, 423, new Color(0x7DBA3F), new Color(0x2F6715));

        buffer = floodFill(buffer, 71, 424, new Color(0x7DBA3F), new Color(0x2F6715));
        buffer = floodFill(buffer, 76, 400, new Color(0x7DBA3F), new Color(0x2F6715));

        buffer = floodFill(buffer, 81, 424, new Color(0x7DBA3F), new Color(0x69A34F));
        buffer = floodFill(buffer, 75, 420, new Color(0x7DBA3F), new Color(0x69A34F));
        buffer = floodFill(buffer, 67, 409, new Color(0x7DBA3F), new Color(0x69A34F));

        buffer = floodFill(buffer, 88, 400, new Color(0x7DBA3F), new Color(0x2F6715));

        buffer = floodFill(buffer, 98, 400, new Color(0x7DBA3F), new Color(0x2F6715));

        // 3
        buffer = floodFill(buffer, 110, 415, new Color(0x7DBA3F), new Color(0x2F6715));
        buffer = floodFill(buffer, 120, 415, new Color(0x7DBA3F), new Color(0x2F6715));
        buffer = floodFill(buffer, 130, 415, new Color(0x7DBA3F), new Color(0x69A34F));

        // 5
        buffer = floodFill(buffer, 146, 400, new Color(0x7DBA3F), new Color(0x69A34F));
        buffer = floodFill(buffer, 157, 400, new Color(0x7DBA3F), new Color(0x2F6715));
        buffer = floodFill(buffer, 168, 400, new Color(0x7DBA3F), new Color(0x69A34F));
        buffer = floodFill(buffer, 180, 400, new Color(0x7DBA3F), new Color(0x2F6715));
        buffer = floodFill(buffer, 190, 405, new Color(0x7DBA3F), new Color(0x69A34F));

        //
        buffer = floodFill(buffer, 207, 402, new Color(0x7DBA3F), new Color(0x2F6715));
        buffer = floodFill(buffer, 215, 402, new Color(0x7DBA3F), new Color(0x2F6715));
        buffer = floodFill(buffer, 232, 399, new Color(0x7DBA3F), new Color(0x69A34F));
        //
        buffer = floodFill(buffer, 280, 389, new Color(0x7DBA3F), new Color(0x2F6715));
        buffer = floodFill(buffer, 292, 389, new Color(0x7DBA3F), new Color(0x69A34F));
        buffer = floodFill(buffer, 300, 389, new Color(0x7DBA3F), new Color(0x2F6715));
        buffer = floodFill(buffer, 315, 385, new Color(0x7DBA3F), new Color(0x69A34F));

        // flower
        g2.setColor(new Color(0x8132B0));
        plot(g2, 80, 395, 5);
        plot(g2, 90, 395, 5);
        plot(g2, 80, 385, 5);
        plot(g2, 90, 385, 5);
        g2.setColor(new Color(0x1A2DAB));
        plot(g2, 85, 390, 5);

        g2.setColor(new Color(0x47D7DF));
        plot(g2, 125, 397, 7);
        plot(g2, 115, 397, 7);
        plot(g2, 125, 387, 7);
        plot(g2, 115, 387, 7);
        g2.setColor(new Color(0xDF475E));
        plot(g2, 120, 392, 7);

        g2.setColor(new Color(0xD4EC1F));
        plot(g2, 105, 405, 7);
        plot(g2, 95, 405, 7);

        plot(g2, 105, 395, 7);
        plot(g2, 95, 395, 7);
        g2.setColor(new Color(0xDB1642));
        plot(g2, 100, 400, 7);

        g2.setColor(new Color(0xD4EC1F));
        plot(g2, 20, 405, 5);
        plot(g2, 30, 405, 5);

        plot(g2, 20, 395, 5);
        plot(g2, 30, 395, 5);
        g2.setColor(new Color(0xDB1642));
        plot(g2, 25, 400, 5);

        g2.setColor(new Color(0xD4EC1F));
        plot(g2, 20, 405, 6);
        plot(g2, 30, 405, 6);

        plot(g2, 20, 395, 6);
        plot(g2, 30, 395, 6);
        g2.setColor(new Color(0xDB1642));
        plot(g2, 25, 400, 6);

        g2.setColor(new Color(0xDDDF47));
        plot(g2, 45, 383, 4);
        g2.setColor(new Color(0x32B098));
        plot(g2, 5, 400, 5);

        g2.setColor(new Color(0xD4EC1F));
        plot(g2, 180, 380, 6);
        plot(g2, 190, 380, 6);

        plot(g2, 180, 390, 6);
        plot(g2, 190, 390, 6);
        g2.setColor(new Color(0xDB1642));
        plot(g2, 185, 385, 6);

        g2.setColor(new Color(0x480244));
        plot(g2, 210, 400, 7);
        plot(g2, 200, 400, 7);

        plot(g2, 210, 390, 7);
        plot(g2, 200, 390, 7);
        g2.setColor(new Color(0xDB1642));
        plot(g2, 205, 395, 7);

        g2.setColor(new Color(0x3240B0));
        plot(g2, 230, 390, 7);
        plot(g2, 220, 390, 7);

        plot(g2, 230, 380, 7);
        plot(g2, 220, 380, 7);
        g2.setColor(new Color(0xDB1642));
        plot(g2, 225, 385, 7);

        plot(g2, 154, 380, 4);
        g2.setColor(new Color(0x810EAC));
        plot(g2, 167, 400, 4);
        g.drawImage(buffer, 0, 0, null);

    }

    private void plot(Graphics g, int x, int y, int size) {
        g.fillRect(x, y, size, size);
    }

    public BufferedImage floodFill(BufferedImage m, int x, int y, Color targetColor, Color replacementColor) {
        Graphics2D g2 = m.createGraphics();

        Queue<Point> q = new LinkedList<Point>();

        g2.setColor(replacementColor);
        plot(g2, x, y, 1);
        q.add(new Point(x, y));

        while (!q.isEmpty()) {

            Point p = q.poll();

            // south
            if (p.y < 600 && new Color(m.getRGB(p.x, p.y + 1)).equals(targetColor)) {
                g2.setColor(replacementColor);
                plot(g2, p.x, p.y + 1, 1);
                q.add(new Point(p.x, p.y + 1));
            }
            // north
            if (p.y > 0 && new Color(m.getRGB(p.x, p.y - 1)).equals(targetColor)) {
                g2.setColor(replacementColor);
                plot(g2, p.x, p.y - 1, 1);
                q.add(new Point(p.x, p.y - 1));
            }
            // east
            if (p.x < 600 && new Color(m.getRGB(p.x + 1, p.y)).equals(targetColor)) {
                g2.setColor(replacementColor);
                plot(g2, p.x + 1, p.y, 1);
                q.add(new Point(p.x + 1, p.y));
            }
            // west
            if (p.x > 0 && new Color(m.getRGB(p.x - 1, p.y)).equals(targetColor)) {
                g2.setColor(replacementColor);
                plot(g2, p.x - 1, p.y, 1);
                q.add(new Point(p.x - 1, p.y));
            }
        }
        return m;
    }

    public void bezierCurve(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int size) {
        for (int i = 0; i <= 1000; i++) {
            double t = i / 1000.0;

            int x = (int) (Math.pow((1 - t), 3) * x1 +
                    3 * t * Math.pow((1 - t), 2) * x2 +
                    3 * t * t * (1 - t) * x3 +
                    t * t * t * x4);

            int y = (int) (Math.pow((1 - t), 3) * y1 +
                    3 * t * Math.pow((1 - t), 2) * y2 +
                    3 * t * t * (1 - t) * y3 +
                    t * t * t * y4);
            plot(g, x, y, size);
        }
    }

    // bresenham general-case

    public void bresenhamLine(Graphics g, int x1, int y1, int x2, int y2, int size) {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;
        boolean isSwap = false;
        int D;
        if (dy > dx) {
            // swap
            int temp = dx;
            dx = dy;
            dy = temp;
            isSwap = true;
        }
        D = 2 * dy - dx;

        int x = x1;
        int y = y1;

        for (int i = 1; i <= dx; i++) {
            plot(g, x, y, size);

            if (D >= 0) {
                if (isSwap)
                    x += sx;
                else
                    y += sy;
                D -= 2 * dx;
            }

            if (isSwap) {
                y += sy;
            } else
                x += sx;
            D += 2 * dy;

        }

    }

}
