public class Square implements Shape {

    private Material material;
    private Properties properties = new Properties();
    private double area;
    private double length;

    public String getName(){
        return "Square";
    }

    public void setLengths(double length){
        this.length = length;
    }
    public double getArea(){
        return length*length;
    }

    public void setMaterial(Material material){
        this.material = material;
        System.out.println(material.getSymbol());
        System.out.println("Mass for " + material.getName() + " Square = " + material.getDensity()*area);
    }

    public void setProperties(Properties properties){
        this.properties = properties;
    }

    public String getShapeInfo(){
        return getName() + ": Length=" + length + " light=" + properties.getLight() + " color=" + properties.getColor() + " contrast=" + properties.getContrast();
    }

}
