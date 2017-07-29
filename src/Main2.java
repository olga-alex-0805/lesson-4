/**
 * Created by AZ$E on 29.07.2017.
 */
public class Main2 {
    public static void main(String[] args) {
        Numbers(5);
        System.out.println();
        drawRectangle(3,2);
        System.out.println();
        drawRectangle(2);
        System.out.println();
        drawRectangle(3);
        System.out.println();
        System.out.println(minFunction(1, 2));
        System.out.println();
        System.out.println(getMax(1, 2));
        System.out.println();
        NumbersRec(5);
        System.out.println();
        drawRectangleRec(3,2);

    }


    // Задание 1


    public static void Numbers(int x){
        if (x < 1);
        for(int i = 1; i <= x; i++ )
            System.out.print(i + " ");
        System.out.println();
    }


    // Задание 2

    public static void drawRectangle (int width, int height) {
        if (width < 1 || height < 1);
        while (height-- > 0) {
            for(int i = 1; i <= width; i++)
                System.out.print("+");
            System.out.println();
        }
    }


    // Задание 3

    public static void drawRectangle (int width) {
        if (width < 1);
        int height = width;
        while (height-- > 0) {
            for(int i = 1; i <= width; i++)
                System.out.print("+");
            System.out.println();

        }
    }




    // Задание 4
    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
    }

    public static float minFunction(float n1, float n2) {
        float min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
    }



    public static int getMax (int a, int b) {
        return (a > b) ? a : b;
    }

   


    // Задание 5

    public static void NumbersRec(int x){
        if (x < 1);
        if (x == 1) {
            System.out.print(x + " ");
        } else {
            NumbersRec(x - 1);
            System.out.print(x + " ");
        }
    }


    // Задание 6

    public static void  drawRectangleRec (int width, int height) {
        if (width < 1 || height < 1);
        if(height == 1){
            if(width == 1) {
                System.out.print("+");
            } else {
                drawRectangleRec(width-1, height);
                System.out.print("+");
            }
        } else {
            drawRectangleRec (width, height - 1);
            System.out.println();
            drawRectangleRec (width, 1);
        }

    }
}
