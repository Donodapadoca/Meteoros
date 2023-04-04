import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int xmax = 0, xmin = 0, ymax = 0, ymin = 0;

        int i = 0;
        int t = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("digite o tamanho da propriedade: ");

        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;

        while (((x1 = sc.nextInt()) != 0) && ((y1 = sc.nextInt()) != 0) && ((x2 = sc.nextInt()) != 0)
                && ((y2 = sc.nextInt()) != 0)) {

            if (x1 > 0 && y1 > 0 && x2 > 0 && y2 > 0) {
                System.out.println("Propriedade localizada no primeiro quadrante \n");
                if (x1 > x2) {
                    xmax = x1;
                    xmin = x2;
                } else {
                    xmax = x2;
                    xmin = x1;

                }
                if (y1 > y2) {
                    ymax = y1;
                    ymin = y2;
                } else {
                    ymax = y2;
                    ymin = y1;
                }

                break;
            }

            else if (x1 < 0 && y1 > 0 && x2 < 0 && y2 > 0) {
                System.out.println("Propriedade localizada no segundo quadrante\n");
                if (x1 > x2) {
                    xmax = x1;
                    xmin = x2;
                } else {
                    xmax = x2;
                    xmin = x1;

                }
                if (y1 > y2) {
                    ymax = y1;
                    ymin = y2;
                } else {
                    ymax = y2;
                    ymin = y1;
                }
                break;
            }

            else if (x1 < 0 && y1 < 0 && x2 < 0 && y2 < 0) {
                System.out.println("Propriedade localizada no terceiro quadrante\n");
                if (x1 > x2) {
                    xmax = x1;
                    xmin = x2;
                } else {
                    xmax = x2;
                    xmin = x1;

                }
                if (y1 > y2) {
                    ymax = y1;
                    ymin = y2;
                } else {
                    ymax = y2;
                    ymin = y1;
                }
                break;
            }

            else if (x1 > 0 && y1 < 0 && x2 > 0 && y2 < 0) {
                System.out.println("Propriedade localizada no quarto quadrante\n");
                if (x1 > x2) {
                    xmax = x1;
                    xmin = x2;
                } else {
                    xmax = x2;
                    xmin = x1;

                }
                if (y1 > y2) {
                    ymax = y1;
                    ymin = y2;
                } else {
                    ymax = y2;
                    ymin = y1;
                }
                break;
            }

            else {
                System.out.println("Propriedade localizada em mais de um quadrante, rode o programa novamente");
                return;

            }

        }

        // int n = 0;

        System.out.println("Digite a quantidade de meteoritos que deseja pesquisar:   ");
        int m = sc.nextInt();

        while (m > 0) {

            System.out.println("Digite a coordenada: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            m--;

            if (x >= xmin && x <= xmax && y >= ymin && y <= ymax) {
                
                i++;
            }else

            t++;
            
        }
        System.out.printf("Aproximadamente " + i + " meteoritos cairam dentro da propriedade");
        System.out.printf("\nAproximadamente " + t + " meteoritos cairam fora da propriedade");

    }

}