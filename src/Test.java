import java.util.Scanner;

public class Test {

    static Shape shape;
    static Properties properties = new Properties();
    static Material material;

    public static void main (String []args){

        char chooseShape;
        Scanner input = new Scanner(System.in);

        boolean wrongAnswer = false;
        do {
            System.out.println("Please Select a shape");
            System.out.println("[c:Circle | r:Rectangle | s:Square]");
            chooseShape = input.next().charAt(0);

            if (chooseShape == ('c')) {
                shape = new Circle();
                System.out.println("Enter radius : ");
                double radius = input.nextDouble();
                shape.setLengths(radius);
                wrongAnswer = false;
            } else if (chooseShape == ('r')) {
                shape = new Rectangle();
                System.out.println("Enter width : ");
                double width = input.nextDouble();
                shape.setLengths(width);
                System.out.println("Enter height : ");
                double height = input.nextDouble();
                shape.setLengths(height);
                wrongAnswer = false;
            } else if (chooseShape == ('s')) {
                shape = new Square();
                System.out.println("Enter length : ");
                double length = input.nextDouble();
                shape.setLengths(length);
                wrongAnswer = false;
            } else {
                System.out.println("Please enter a valid char!");
                System.out.println();
                wrongAnswer = true;
            }
        }while(wrongAnswer);

        String chooseProp;
        boolean quit = true;

        do {
            System.out.println("Please select for");
            System.out.println("[i:Shape Info | l:Add light(int) | clr:Add color(String) | cnt:Add contrast(int) | q:quit]");
            chooseProp = input.next();

            if (chooseProp.equals("i")){
                System.out.println(shape.getShapeInfo());
                System.out.println();
            }
            else if (chooseProp.equals("l")){
                System.out.println("Enter light : ");
                int enterLight = input.nextInt();
                properties.setLight(enterLight);
                shape.setProperties(properties);
            }
            else if (chooseProp.equals("clr")){
                System.out.println("Enter color : ");
                String enterColor = input.next();
                properties.setColor(enterColor);
                shape.setProperties(properties);
            }
            else if (chooseProp.equals("cnt")){
                System.out.println("Enter contrast : ");
                int enterContrast = input.nextInt();
                properties.setContrast(enterContrast);
                shape.setProperties(properties);
            }
            else if (chooseProp.equals("q")){quit = false;}

        }while (quit);

        quit = true;
        String chooseMaterial;

        do {
            System.out.println("Please select the material of shape");
            System.out.println("[i:Shape info | cu:Copper | fe:Iron | au:Gold | q:quit]");
            chooseMaterial = input.next();

            if (chooseMaterial.equals("i")){
                System.out.println(shape.getShapeInfo());
                System.out.println();
            }
            else if (chooseMaterial.equals("cu")){
                material = new Copper();
                System.out.println("Mass for " + material.getName() + " " + shape.getName() + " = " + material.getDensity()*shape.getArea() );
            }
            else if (chooseMaterial.equals("fe")){
                material = new Iron();
                System.out.println("Mass for " + material.getName() + " " + shape.getName() + " = " + material.getDensity()*shape.getArea() );
            }
            else if (chooseMaterial.equals("au")){
                material = new Gold();
                System.out.println("Mass for " + material.getName() + " " + shape.getName() + " = " + material.getDensity()*shape.getArea() );
            }
            else if (chooseMaterial.equals("q")){quit = false;}
            else {
                System.out.println("Wrong Answer!!");}

        }while (quit);

    }

}
