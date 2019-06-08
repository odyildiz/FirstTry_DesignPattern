public class Rectangle implements Shape {

    private Material material;
    private Properties properties = new Properties();
    private double area;
    private Double length1;
    private Double length2;

    public String getName(){
        return "Rectangle";
    }

    public void setLengths(double length){
       if (length1 == null){
            length1 = length;
       }
       else length2 = length;
    }
    public double getArea(){
        return length1*length2;
    }

    public void setMaterial(Material material){
        this.material = material;
        System.out.println(material.getSymbol());
        System.out.println("Mass for " + material.getName() + " Rectangle = " + material.getDensity()*area);
    }

    public void setProperties(Properties properties){
        this.properties = properties;
    }

    public String getShapeInfo(){
        return getName() + ": Length1=" + length1 + " Length2=" + length2 + " light=" + properties.getLight() + " color=" + properties.getColor() + " contrast=" + properties.getContrast();
    }

}
