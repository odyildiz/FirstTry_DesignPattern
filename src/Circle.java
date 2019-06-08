public class Circle implements Shape {

    private Material material;
    private Properties properties = new Properties();
    private double area;
    private Double length;

    public String getName(){
        return "Circle";
    }

    public void setLengths(double length){
        this.length = length;
    }

    public Double getLength(){
        if (length == null) return null;
        else return length;
    }
    public double getArea(){
        return length*length*3.14;
    }
    public void setMaterial(Material material){
        this.material = material;
        System.out.println(material.getSymbol());
        System.out.println("Mass for " + material.getName() + " Circle = " + material.getDensity()*area);
    }

    public void setProperties(Properties properties){
        this.properties = properties;
    }

    public String getShapeInfo(){
        return getName() + ": Radius=" + getLength() + " light=" + properties.getLight() + " color=" + properties.getColor() + " contrast=" + properties.getContrast();
    }

}
